import javax.swing.*;

public class JFrame {

	public static void main(String[] args) {

		 String num = JOptionPane.showInputDialog("Enter a number: ");
		 int number = Integer.parseInt(num);

		 if(number <0){
		 	}
		 		else {
		 if ((number/2)*2 == number) {
			JOptionPane.showMessageDialog(null, "The " + number + "is EVEN");
		 }

		else{
		 	JOptionPane.showMessageDialog(null, "The " + number + "is ODD");
		 	}		
		}
	}
}