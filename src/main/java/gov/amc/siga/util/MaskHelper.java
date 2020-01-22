package gov.amc.siga.util;

public class MaskHelper {
	
	public final static String removeCpfMask(String cpf) {
		String result;
		result = cpf.replaceAll("[.\\-]", "");
		return result;
	}
	
	public final static String removeCnpjMask(String cnpj) {
		String result;
		result = cnpj.replaceAll("[.\\-\\/]", "");
		return result;
	}
	
	public final static String removeTelefoneMask(String telefone) {
		String result;
		result = telefone.replaceAll("[\\(\\)\\-]", "");
		return result;
	}

	public final static String removeCepMask(String telefone) {
		String result;
		result = telefone.replaceAll("[\\-]", "");
		return result;
	}
}