package cum;
import javax.swing.JOptionPane;
public class Debugging {

	public static void main(String[] args) {
		 int b, h, d;
		    String btext, htext, dtext;

		    // les inn h�yde, bredde, dybde
		    htext = JOptionPane.showInputDialog("Angi h�yde:");
		    btext = JOptionPane.showInputDialog("Angi bredde:");
		    dtext = JOptionPane.showInputDialog("Angi dybde:");

		    // konverter fra tekst til heltal

		    h = Integer.parseInt(htext);
		    b = Integer.parseInt(btext);
		    d = Integer.parseInt(htext);

		    int volum = b * h * d;

		    String respons =
		        "Volum [" + htext + "," + btext + "," + dtext + "] = " + volum;

		        JOptionPane.showMessageDialog(null, respons);

	}

}
