package co.simplon.poleEmploi.patrimoine;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.simplon.poleEmploi.patrimoine.modele.*;

import org.junit.Test;

import co.simplon.poleEmploi.patrimoine.modele.Ville;

public class MonumentsTest {

	@Test
	public void Test_recherche_notre_dame()
	{
	// GIVEN
			Long  idrecherch =7L;
			
			// WHEN
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("BasePatrimoine");
			EntityManager em = emf.createEntityManager();
			Monument monu = em.find(Monument.class, idrecherch);
			

			// THEN
		
			assertEquals(idrecherch, monu.getId());
			assertEquals("Notre-Dame",monu.getName());
			assertEquals(3285,monu.getCitiesId());
			//assertEquals("Sainte-Foi", monu.getVille().getNom());
			

		
	}}