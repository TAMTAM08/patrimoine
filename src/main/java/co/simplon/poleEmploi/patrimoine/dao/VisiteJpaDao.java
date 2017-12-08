package co.simplon.poleEmploi.patrimoine.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

import co.simplon.poleEmploi.patrimoine.modele.Monument;
import co.simplon.poleEmploi.patrimoine.modele.Visite;

public class VisiteJpaDao implements VisiteDao{
public Visite getVisiteById(Long id){
		
		
		// WHEN
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Basevisite");
		EntityManager em = emf.createEntityManager();
		Visite visi = em.find(Visite.class, id);
		
	 if (visi==null) {throw new EntityNotFoundException("il n'y a pas eu de viste "+
	 id+" dans la base");	 }

		// THEN
	return visi;
	
		
	}

@Override
public Visite getMonumentById(Long id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void persit(Visite edifice) {
	// TODO Auto-generated method stub
	
}

@Override
public void commit(Visite edifice) {
	// TODO Auto-generated method stub
	
}

@Override
public void close() {
	// TODO Auto-generated method stub
	
}


}
