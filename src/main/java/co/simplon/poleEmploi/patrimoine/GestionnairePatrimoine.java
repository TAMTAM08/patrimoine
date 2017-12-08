package co.simplon.poleEmploi.patrimoine;
import co.simplon.poleEmploi.patrimoine.modele.*;
import co.simplon.poleEmploi.patrimoine.dao.MonumentJpaDao;


public class GestionnairePatrimoine {

	public static void main(String[] args) {

		MonumentJpaDao recherchemonu = new MonumentJpaDao();
		Monument trouve= recherchemonu.getMonumentById(107L);
		System.out.println(trouve.getName()+ "dans la ville" + trouve.getCitiesId()); 

	}

}
