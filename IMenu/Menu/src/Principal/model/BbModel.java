package Principal.model;

	import java.util.ArrayList;

	public class BbModel {
	    private ArrayList<Livros> livros;

	    public BbModel() {
	        livros = new ArrayList<Livros>();
	        // Adicione alguns livros de exemplo
	        livros.add(new Livros("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "9788595083667"));
	        livros.add(new Livros("O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", "9788595083735"));
	        livros.add(new Livros("1984", "George Orwell", "9788535908193"));
	        livros.add(new Livros("Cem Anos de Solidão", "Gabriel García Márquez", "9788535913180"));
	    }

	    public ArrayList<Livros> getLivros() {
	        return livros;
	    }

	    public void adicionarLivro(Livros livro) {
	        livros.add(livro);
	    }

	    public void removerLivro(int indice) {
	        livros.remove(indice);
	    }

		public static void BbModel() {
			// TODO Auto-generated method stub
			
		}
	}
	
