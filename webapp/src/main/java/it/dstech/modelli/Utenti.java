package it.dstech.modelli;

public class Utenti {
	
	private String nome;
    private String cognome;
    private long numero;
    
    public Utenti() {
    }
    
    public Utenti (String nome, String cognome, long numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
      }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
 

}
