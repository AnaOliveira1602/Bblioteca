package Principal.model;

	import java.util.*;

	public class Livros {
		
		    private Map<Integer, Livros> acervo;
		    
		    public Livros(int id, String titulo, int quantidade) {
		        acervo = new HashMap<>();
		    }
		    
		    public Livros(String string, String titulo, String string2) {
				
			}

			public void adicionarLivro(int id, String titulo, int quantidade) {
		        Livros livro = new Livros(id, titulo, quantidade);
		        acervo.put(id, livro);
		    }
		    
		    public boolean emprestarLivro(int id) {
		        Livros livro = acervo.get(id);
		        if (livro != null && livro.isDisponivel()) {
		            livro.emprestar();
		            return true;
		        }
		        return false;
		    }
		    
		    private void emprestar() {
				
				
			}

			private boolean isDisponivel() {
				
				return false;
			}

			public boolean devolverLivro(int id) {
		        Livros livro = acervo.get(id);
		        if (livro != null) {
		            livro.devolver();
		            return true;
		        }
		        return false;
		    }
		    
		    private void devolver() {
				
				
			}

			public boolean reservarLivro(int id, String nomeUsuario) {
		        Livros livro = acervo.get(id);
		        if (livro != null && !livro.isDisponivel()) {
		            livro.adicionarFila(nomeUsuario);
		            return true;
		        }
		        return false;
		    }
		    
		    private void adicionarFila(String nomeUsuario) {
				
				
			}

			public boolean cancelarReserva(int id, String nomeUsuario) {
		        Livros livro = acervo.get(id);
		        if (livro != null) {
		            livro.removerFila(nomeUsuario);
		            return true;
		        }
		        return false;
		    }
		    
		    private void removerFila(String nomeUsuario) {
				
				
			}

			public void listarLivros() {
		        for (Livros livros : acervo.values()) {
		            System.out.println(livros.toString());
		        }
		    }
		    
		    private class Livro {
		        private int id;
		        private String Autor;
		        private String titulo;
		        private int quantidade;
		        private boolean disponivel;
		        private Queue<String> filaEspera;
		        
		        public Livro(int id, String titulo, int quantidade) {
		            this.id = id;
		            this.titulo = titulo;
		            this.quantidade = quantidade;
		            this.disponivel = true;
		            filaEspera = new LinkedList<>();
		        }
		        
		        public int getId() {
		            return id;
		        }
		        
		        	public String getAutor() {
			            return Autor;
		        }
		        
		        public String getTitulo() {
		            return titulo;
		        }
		        
		        public int getQuantidade() {
		            return quantidade;
		        }
		        
		        public boolean isDisponivel() {
		            return disponivel;
		        }
		        
		        public void emprestar() {
		            quantidade--;
		            if (quantidade == 0) {
		                disponivel = false;
		            }
		        }
		        
		        public void devolver() {
		            quantidade++;
		            if (quantidade > 0) {
		                disponivel = true;
		            }
		            if (!filaEspera.isEmpty()) {
		                String proximoUsuario = filaEspera.poll();
		                System.out.println("Livro " + titulo + " disponível. Emprestado para " + proximoUsuario);
		            }
		        }
		        
		        public void adicionarFila(String nomeUsuario) {
		            filaEspera.offer(nomeUsuario);
		        }
		        
		        public void removerFila(String nomeUsuario) {
		            filaEspera.remove(nomeUsuario);
		        }
		        
		        public String toString() {
		            return "Livro #" + id + " - " + titulo + " - Quantidade: " + quantidade + " - Disponível: " + disponivel + " - Fila de Espera: " + filaEspera.toString();
		        }
		    }

			public Object getAutor() {
				
				return null;
			}

			

			public Object getTitulo() {
				
				return null;
			}
		}

