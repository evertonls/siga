/**
 * by Berkson.soares funções em geral
 */

PrimeFaces.locales['pt'] = {
	closeText : 'Fechar',
	prevText : 'Anterior',
	nextText : 'Próximo',
	/* currentText: 'Começo', */
	monthNames : [ 'Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho',
			'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro' ],
	monthNamesShort : [ 'Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago',
			'Set', 'Out', 'Nov', 'Dez' ],
	dayNames : [ 'Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta',
			'Sábado' ],
	dayNamesShort : [ 'Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sáb' ],
	dayNamesMin : [ 'D', 'S', 'T', 'Q', 'Q', 'S', 'S' ],
	weekHeader : 'Semana',
	firstDay : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Só Horas',
	timeText : 'Tempo',
	hourText : 'Hora',
	minuteText : 'Minuto',
	secondText : 'Segundo',
	currentText : 'Data Atual',
	ampm : false,
	month : 'Mês',
	week : 'Semana',
	day : 'Dia',
	allDayText : 'Todo Dia'
};


function maiuscula() {
	this.value = this.value.toUpperCase();
}

function semcolar() {
	this.bind('paste', function(e) {
		e.preventDefault();
	});
}

function minuscula() {
	this.value = this.value.toLowerCase();
}
/*
 * fonte:
 * https://pt.stackoverflow.com/questions/108374/m%C3%A1scara-num%C3%A9rica-para-campo-de-data-em-javascript
 */
function mascaraData() {
	let pass = this.value;
	let expr = /[0123456789]/;

	for (let i = 0; i < pass.length; i++) {
		// charAt -> retorna o caractere posicionado no índice especificado
		let lchar = this.value.charAt(i);
		let nchar = this.value.charAt(i + 1);

		if (i == 0) {
			// search -> retorna um valor inteiro, indicando a posição do inicio
			// da primeira
			// ocorrência de expReg dentro de instStr. Se nenhuma ocorrencia for
			// encontrada o método retornara -1
			// instStr.search(expReg). Se o caractere for maior que 3 o valor
			// també é apagdo.
			// o mês só possui 31 dias no máximo
			if ((lchar.search(expr) != 0) || (lchar > 3)) {
				this.value = "";
			}

		}

		if (i == 1) {
			// Se o próximo caractere for o segundo
			if (lchar.search(expr) != 0) {
				// substring(indice1,indice2)
				// indice1, indice2 -> será usado para delimitar a string
				// Seleciona os dois primeiros caracteres e atribui ao valor do
				// campo
				let tst1 = this.value.substring(0, (i));
				this.value = tst1;
				continue;
			}
			// se o próximo caractere (.charAt(2)) não for uma / e não for vazio
			if ((nchar != '/') && (nchar != '')) {
				let tst1 = this.value.substring(0, (i) + 1); // tst1 recebe
																// os dois
																// primeiros
																// caracteres de
																// input
				let tst2;
				if (nchar.search(expr) != 0) // se o (.charAt(2)) não for um
												// número
					tst2 = this.value.substring(i + 2, pass.length); // tst2
																		// recebe
																		// a
																		// substring
																		// do
																		// próximo
																		// caractere
																		// até o
																		// final
				else
					tst2 = this.value.substring(i + 1, pass.length); // tst2
																		// recebe
																		// a
																		// substring
																		// incluindo
																		// o
																		// (.charAt(2))
																		// até o
																		// final

				this.value = tst1 + '/' + tst2; // insere a barra na posição
												// (.charAt(2)) e depois o
												// restante da substring
			}
			// resolvido até o terceiro caractere ex: 23/1..
		}

		if (i == 4) {
			// se o caractere (.charAt(4)) não for um número
			if (lchar.search(expr) != 0) {
				let tst1 = this.value.substring(0, (i)); // adiciona até o
															// (.charAt(3)) a
															// variável tst1
				this.value = tst1; // atribui ao campo
				continue;
			}

			if ((nchar != '/') && (nchar != '')) {
				let tst1 = this.value.substring(0, (i) + 1);
				let tst2;
				if (nchar.search(expr) != 0)
					tst2 = this.value.substring(i + 2, pass.length);
				else
					tst2 = this.value.substring(i + 1, pass.length);

				this.value = tst1 + '/' + tst2;
			}
		}
		// resolvido até o (.charAt(5)) ex: 23/01/..
		// se o caractere (.charAt) for 6 ou mais
		if (i >= 6) {
			// se não for um número
			if (lchar.search(expr) != 0) {
				let tst1 = this.value.substring(0, (i)); // adiciona até o
															// (.charAt(5)) a
															// variável tst1
				this.value = tst1; // atribui ao campo
			}
		}
	}
	// se o comprimento for maior que 10
	if (pass.length > 10)
		this.value = this.value.substring(0, 10); // atribui ao campo os
													// carcteres da posição 0 a
													// 9
	return true;
}

/* Variável com Função global que dita o comportamento da máscara de telefone*/

var telMaskBehavior = function(val) {
		return val.replace(/\D/g, '').length === 11 ? '(00)00000-0000' : '(00)0000-00009';
	},
		opcoes = {
			onKeyPress: function(val, e, field, options) {
				field.mask(comportamento.apply({}, arguments), options);
			}
		};
		
function onlyNumbers() {
	if(/[^\d]+$/.test(this.value)){
		this.value = "";	
	}
}