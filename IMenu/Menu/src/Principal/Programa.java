package Principal;

import Principal.model.*;
import Principal.view.*;

public class Programa {
	
	public static void main(String[] args) {
		
		//Banco.gerarDadosTemporarios();
		//TelaDeLogin.mostrar();
		BbModel banco = new BbModel();
		
		Menu menu = new Menu(banco);
		menu.mostrarMenu();
		
		BbModel.BbModel();
		
		Livros livro = new Livros(0, null, 0);
		livro.listarLivros();
		
//		Banco.carregarArquivos();
//		TelaDeLogin.mostrar();
//		Banco.gravarArquivos();
	}
}
