package co.simplon.poleEmploi.patrimoine.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

import co.simplon.poleEmploi.patrimoine.modele.Monument;

public class MonumentJpaDao  implements MonumentDao{

	public Monument getMonumentById(Long id){
		
		
		// WHEN
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("BasePatrimoine");
		EntityManager em = emf.createEntityManager();
		Monument monu = em.find(Monument.class, id);
		
	 if (monu==null) {throw new EntityNotFoundException("il n'y a pas de Monument avec l'id "+
	 id+" dans la base");	 }

		// THEN
	return monu;
	
		
	}

	@Override
	public void persit(Monument edifice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commit(Monument edifice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
