import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		String tall = showInputDialog("Tall");
		int n =  parseInt(tall);
		int x = 1;
		int talln = n;
				
		if(n > 0) {
			while (n>1) {
			   x *= n;
			   n--;
			}
			System.out.println(talln + "! = " + x);
		}
		else {
			System.out.println("Ugyldig tall");
		}
	}
}