package ex2;

public class LivretA extends CompteBancaire {
	
	private final static int DECOUVERT_LIVRET = 0;

	/** tauxRemuneration : taux de rÃ©munÃ©ration dans le cas d'un livret A */
	private double tauxRemuneration;
	
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, DECOUVERT_LIVRET);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/**
	 * Applique la rémunération annuelle
	 */
	public void appliquerRemuAnnuelle(){
		this.setSolde(getSolde() + getSolde()*getTauxRemuneration()/100);
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
