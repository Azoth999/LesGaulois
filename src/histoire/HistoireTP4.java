package histoire;
import personnages.*;

public class HistoireTP4 {
	
public static void main(String[] args) {
	
	Gaulois prof = new Gaulois ("Prof", 5, "kombucha", 54);
	prof.acheter("une boisson", 12);
	prof.boire();
	prof.acheter("un jeu", 2);
	prof.acheter("un kimono", 50);
}

}
