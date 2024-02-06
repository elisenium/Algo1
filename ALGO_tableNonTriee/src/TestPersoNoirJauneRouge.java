
public class TestPersoNoirJauneRouge {
	
	public static void main(String [] args){
		
		NoirJauneRouge njr = new NoirJauneRouge();
		njr.ajouter("nico", 'r');
		njr.ajouter("rene", 'r');
		njr.ajouter("noel", 'r');
		njr.ajouter("lola", 'n');
		njr.ajouter("astrid", 'j');
		njr.ajouter("mathilda", 'n');
		njr.ajouter("laura", 'j');
		njr.supprimer("nico");
		System.out.println(njr);
	}
}
