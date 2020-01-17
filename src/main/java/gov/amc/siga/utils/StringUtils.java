package gov.amc.siga.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {

	public static String toCamelCase(final String text) {
	    if (text == null)
	        return null;

	    final StringBuilder textCamel = new StringBuilder(text.length());

	    for (final String word : text.split(" ")) {
	        if (!word.isEmpty()) {
	            textCamel.append(Character.toUpperCase(word.charAt(0)));
	            textCamel.append(word.substring(1).toLowerCase());
	        }
	        if (!(textCamel.length() == text.length()))
	            textCamel.append(" ");
	    }

	    return textCamel.toString();
	}
	
	/* remove os acentos das palavras */
	public static String removeDiacriticals(String s) {

	    String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
	    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	    return pattern.matcher(temp).replaceAll("");
	  }
}
