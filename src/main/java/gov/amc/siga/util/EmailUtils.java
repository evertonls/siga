package gov.amc.siga.util;

public class EmailUtils {

	public static String putMask(String email) {
		int charsBeforeArroba = email.indexOf('@');
		StringBuilder resultado = new StringBuilder(email);

		for (int i = 1; i <= charsBeforeArroba / 2; i++) {
			resultado.setCharAt(i, '*');
		}

		return resultado.toString();
	}
}