import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO1 {

	public static void main(String[] args) {
				
		String inntekt = showInputDialog("Bruttoinntekt");
		int inntekttall=  parseInt(inntekt);
		
		if(inntekttall >= 2000000) {
			System.out.println("Din trinnskatt er " + inntekttall * 0.174 + " kroner.");
		}
		else if(inntekttall >= 969000) {
			System.out.println("Din trinnskatt er " + inntekttall * 0.164 + " kroner.");
		}
		else if(inntekttall >= 643800) {
			System.out.println("Din trinnskatt er " + inntekttall * 0.134 
			+ " kroner med mindre du er bosatt i Troms og Finnmark. I det tilfellet er trinnskatten din " 
			+ inntekttall * 0.114 + " kroner.");
		}
		else if(inntekttall >= 267900) {
			System.out.println("Din trinnskatt er " + inntekttall * 0.04 + " kroner.");
		}
		else if(inntekttall >= 190350) {
			System.out.println("Din trinnskatt er " + inntekttall * 0.017 + " kroner.");
		}
		else {
			System.out.println("Du har ingen skatt");
		}
	}
}