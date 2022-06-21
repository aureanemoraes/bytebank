package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		String string = "Alura";
		System.out.println(string);
		
		String lowerString = string.toLowerCase();
		System.out.println(lowerString);
		
		String upperString = string.toUpperCase();
		System.out.println(upperString);
		
		String replacedString = string.replace("ra", "RA");
		System.out.println(replacedString);
		
		int indexOfString = string.indexOf('u');
		System.out.println(indexOfString);
		
		char charOfString = string.charAt(4);
		System.out.println(charOfString);
		
		int stringLength = string.length();
		System.out.println(stringLength);
		
		boolean stringIsEmpty = string.isEmpty();
		System.out.println(stringIsEmpty);
		
		boolean stringTestContainCamelCase = string.contains("alu");
		System.out.println(stringTestContainCamelCase);
		
		boolean stringTestContainCamelCase2 = string.contains("Alu");
		System.out.println(stringTestContainCamelCase2);
	}
	
	
}
