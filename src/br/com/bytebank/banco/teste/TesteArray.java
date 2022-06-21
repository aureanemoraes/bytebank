package br.com.bytebank.banco.teste;

public class TesteArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		for(int i=0 ; i < array.length ; i++) {
			array[i] = i*i;
		}
		
		for(int i=0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}

	}

}
