package controller;

import java.util.Scanner;

import model.Empregado;
import util.ListaEncadeada;

public class CtrlPrograma {

	public static void main(String[] args) {
		// Estamos declarando três variáveis (e1,e2,e3) que são "Ponteiros para um objeto Empregado"
		Empregado e1 = new Empregado(987,"Claudia");
		Empregado e2 = new Empregado(321,"Maria");
		Empregado e3 = new Empregado(123,"Alessandro");
		Empregado e4 = new Empregado(345,"Zebra");
		Empregado e5 = new Empregado(456,"Lauro");
		Empregado e6 = new Empregado(135,"Nissan");
		Empregado e7 = new Empregado(897,"Vaso");
		Empregado e8 = new Empregado(809,"Pedro");
		Empregado e9 = new Empregado(788,"Italo");
	
		// Estamos declarando uma variável listaEmpregado que é 
		// "ponteiro para um objeto ListaEncadeada<Empregado>". Repare que, 
		// por ser uma classe 'generics', eu já informo que o objeto ListaEncadeada
		// só poderá guardar objetos Empregado. 

		// Estamos declarando a variável "teclado" (ponteiro para Scanner) e estamos instanciando um objeto Scanner 
//		Scanner teclado = new Scanner(System.in);		
		// Loop para leitura de Empregado e armazenamento na pilha 
//		while(true) {			
//			System.out.println("Entre com a matrícula do Empregado: ");
//			// Eu prefiro usar "Integer.parseInt(teclado.nextLine())" ao invés de "teclado.nextInt()"
//			int m = Integer.parseInt(teclado.nextLine());
//			System.out.println("Entre com o nome do Empregado: ");
//			String n = teclado.nextLine();
//			
//			// Instanciando um novo objeto Empregado
//			Empregado novo = new Empregado(m,n);
//			// Colocando o novo objeto no MeuArrayDinamico.
//			listaEmpregados.add(novo);
//
//			// Loop para listar os empregados 			
//			System.out.println("Listando os Empregados");
//			System.out.println("======================"); 
//			for(int pos = 0; pos < listaEmpregados.getNumElementos(); pos++) {
//				Empregado umEmp = listaEmpregados.get(pos);
//				System.out.println( umEmp.getMatr() + " " + umEmp.getNome()  );
//			}
//		}
		
		ListaEncadeada<Empregado> listaEmpregados = new ListaEncadeada<Empregado>();
		
//		model.Empregado@39ba5a14 -> Claudia 
//		model.Empregado@57829d67 -> Maria
//		model.Empregado@19dfb72a -> Alessandro
//		model.Empregado@17c68925 -> Zebra
		
		listaEmpregados.add(e1); // Claudia 0 
		listaEmpregados.add(e2); // Maria 1 
		listaEmpregados.add(e3); // Alessandro 2 
		listaEmpregados.add(e4); // Zebra 3
		
		System.out.println("Tamanho da lista:" + listaEmpregados.getNumElementos());
		
//		System.out.println(listaEmpregados.getNumElementos());
//		System.out.println(listaEmpregados.get(2).getNome());
//		System.out.println(listaEmpregados.get(3).getNome());
		
		listaEmpregados.sorta();
		
		for (int i=0;i<4;i++)
			System.out.println("Posicao:%d Pessoa:%s".formatted(listaEmpregados.indexOf(listaEmpregados.get(i)), listaEmpregados.get(i).getNome() ));
			
//		System.out.println("Ultima pessoa da lista:" + listaEmpregados.ultimo.elemento.getNome());
		
		
		
	}
}