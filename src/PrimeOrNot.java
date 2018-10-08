import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Give me a number and I'll tell you if its prime or not");
	int Num = Integer.parseInt(num);
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
			if(num.equals(Num%i==0));{
				JOptionPane.showMessageDialog(null, "It's not a prime number");
				break;
			}
			
		}
	}}
