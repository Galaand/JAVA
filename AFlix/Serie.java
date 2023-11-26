import java.util.ArrayList;

public class Serie {
    private String nome;
	private int temporada;
	private int nEpisodios;
	private ArrayList<String> generos;
	public String status;
	
	public Serie(String n){
		this.nome = n;
		generos = new ArrayList<String>();
	}
	public Serie(){
		
	}

	public String getNome() {
		return nome;
	}

	public int getTemporada() {
		return temporada;
	}

	public int getnEpisodios() {
		return nEpisodios;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public void setnEpisodios(int nEpisodios) {
		this.nEpisodios = nEpisodios;
	}


	public void adicionaGenero(String gen){
		generos.add(gen);
	}
	
	public ArrayList<String> getGeneros() {
		return generos;
	}

	public String setStatus(String s) {
		return status;
	}
	public String getStatus() {
		return status;
	}
	
	public void verificaGeneros(){
		for (int x=0; x<generos.size(); x++){
			System.out.println("[ " + x + " ] " + generos.get(x));
		}
	}
	
	public String toString() {
		return nome;
	}
	
	
}
