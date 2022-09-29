package com.educaciencia.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

/**************************************
 * ******* EDUCACIENCIA FASTCODE ******
 * ******* MANIPULANDO LISTAS *********
 * *******     29/09/2022     *********
 **************************************/

public class Main {

	public static void main(String[] args) {		
		limpaListaRemoveAll();
	}
	
	/* limpando lista utilizando RemoveAll*/
	public static void limpaListaRemoveAll() {
		System.out.println("----------- EDUCACIENCIA FASTCODE - ARRAYLIST ------------------");
		ArrayList<String> listaNome = new ArrayList<>();
		listaNome.add("EducaCiencia FastCode"); // posicao 0 na Lista
		listaNome.add("CobraDev"); // posicao 1 na lista
		System.out.println("Lista Atual: " + Arrays.toString(listaNome.toArray()));
		System.out.println(" *****  removendo dados da lista ******");
		listaNome.removeAll(listaNome); // removendo dados da Lista
		System.out.println("Lista Atualizada: " + Arrays.toString(listaNome.toArray()));
	}

}
