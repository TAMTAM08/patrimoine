package co.simplon.poleEmploi.patrimoine.dao;

import co.simplon.poleEmploi.patrimoine.modele.Visite;

public interface VisiteDao extends AutoCloseable {
	public Visite getMonumentById(Long id);
	public void persit (Visite edifice);
	public void commit (Visite edifice);
	public void close();

	
}
