package it.dstech.gestione;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import it.dstech.modelli.Utenti;



public class Controller {

	

		private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("emf");
		private static EntityManager em = emf.createEntityManager();

		public void close() {
			em.close();
		}

		public void salvaUtente(String nome, String cognome, long numero) {
			Utenti utente = new Utenti();

			utente.setNome(nome);
			utente.setCognome(cognome);
			utente.setNumero(numero);

			em.getTransaction().begin();
			em.persist(utente);
			em.getTransaction().commit();
			
		}

			public List<Utenti> stampaListaUtenti() {
				TypedQuery<Utenti> query = em.createQuery("select u from Utente u", Utenti.class);
				return query.getResultList();
			}

		}
		
		
		
		
}
