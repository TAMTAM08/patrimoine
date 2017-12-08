package co.simplon.poleEmploi.patrimoine.dao;

import co.simplon.poleEmploi.patrimoine.modele.Monument;

public interface MonumentDao  extends AutoCloseable{
public Monument getMonumentById(Long id);
public void persit (Monument edifice);
public void commit (Monument edifice);
public void close();


}
