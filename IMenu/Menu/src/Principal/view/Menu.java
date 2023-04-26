package Principal.view;

	import java.util.ArrayList;
	import java.util.Scanner;

import Principal.model.*;
//import Principal.model.Livro;
	
public class Menu {
	    private BbModel model;
	    private Scanner scanner;

	    public Menu(BbModel model) {
	        this.model = model;
	        scanner = new Scanner(System.in);
	    }

	    public void mostrarMenu() {
	        System.out.println("Bem-vindo à Biblioteca!");
	        while (true) {
	            System.out.println("Selecione uma opção:");
	            System.out.println("1. Mostrar catálogo de livros");
	            System.out.println("2. Adicionar um livro");
	            System.out.println("3. Remover um livro");
	            System.out.println("4. Sair");

	            int opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    listarLivros();
	                    break;
	                case 2:
	                    adicionarLivro();
	                    break;
	                case 3:
	                    removerLivro();
	                    break;
	                case 4:
	                    return;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        }
	    }

	    private void removerLivro() {
			// TODO Auto-generated method stub
			
		}

		public void listarLivros() {
	        ArrayList<Livros> livros = model.getLivros();

	        System.out.println("Catálogo de livros:");
	        for (int i = 0; i < livros.size(); i++) {
	            Livros livro = livros.get(i);
	            System.out.printf("%d. %s, %s\n", i+1, livro.getTitulo(), livro.getAutor());
	        }
	    }

	    public void adicionarLivro() {
	        System.out.println("Adicionar um livro:");
	        scanner.nextLine(); // Consumir nova linha após a entrada de inteiro
	        System.out.print("Título: ");
	        String titulo = scanner.nextLine();
	        System.out.print("Autor");
	
}
}
