package gov.amc.siga.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

@Configuration
@EnableWebSecurity
@ComponentScan
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private UserDetailsService users;

	@Autowired
	public SecurityConfiguration(UserDetailsService users) {
		this.users = users;

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(users).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

				http.csrf().disable()
				.requiresChannel().antMatchers("/**").requiresSecure()
				.and().headers().addHeaderWriter(new StaticHeadersWriter("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate"))
				.frameOptions().disable()
				.xssProtection().disable()
				.and()
				.authorizeRequests()
				.antMatchers("/admin/**")
				.hasRole("ADMIN").antMatchers("/subadmin/**").hasAnyRole("ADMIN", "SUBADMIN")
				.antMatchers("/login/**").permitAll()
				.antMatchers("/css/**", "/imagens/**", "/js/**", "/fontes/**", "/docs/**").permitAll()
				.antMatchers("/javax.faces.resource/**").permitAll()
				.antMatchers("usuarios/**")
				.hasAnyRole("ADMIN", "SUBADMIN", "USUARIO").antMatchers("usuarios/cadastro/**")
				.hasAnyRole("ADMIN", "SUBADMIN").anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/login/login.xhtml").usernameParameter("usuario").passwordParameter("senha")
				.defaultSuccessUrl("/usuarios/cadastrar-projeto.xhtml").failureUrl("/login/login.xhtml?error=true")
				.and().logout().invalidateHttpSession(true).deleteCookies("JSESSIONID")
				.logoutSuccessUrl("/login/login.xhtml").and().exceptionHandling()
				.accessDeniedPage("/login/acessonegado.xhtml");

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}