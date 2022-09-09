import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		for(int x = 1; x <= 10;) {
		
		String poeng = showInputDialog("Poeng");
		int poengtall=  parseInt(poeng);
		
		if(poengtall >=90 && poengtall <=100) {
			System.out.println("Karakter A");
		}
		else if(poengtall >=80 && poengtall <90) {
			System.out.println("Karakter B");
		}
		else if(poengtall >=60 && poengtall <80) {
			System.out.println("Karakter C");
		}
		else if(poengtall >=50 && poengtall <60) {
			System.out.println("Karakter D");
		}
		else if(poengtall >=40 && poengtall <50) {
			System.out.println("Karakter E");
		}
		else if(poengtall >=0 && poengtall <40) {
			System.out.println("Karakter F");
		}
		else {
			System.out.println("Ugyldig poengsum");
		}
		
		if (poengtall >= 0 && poengtall <= 100) {
			x++;
		}
		}
	}
}