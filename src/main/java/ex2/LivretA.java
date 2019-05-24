package ex2;

public class LivretA extends CompteBancaire {
	
	private final static int DECOUVERT_LIVRET = 0;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, DECOUVERT_LIVRET);
		this.tauxRemuneration = tauxRemuneration;
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
