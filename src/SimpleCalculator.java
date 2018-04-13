

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String num1 = JOptionPane.showInputDialog("Give me a number");
int num1_2 = Integer.parseInt(num1);
String num2 = JOptionPane.showInputDialog("Give me a different number");
int num2_2 = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Add, Subtract, Multiply or Divide?", "Operation", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Divide", "Multiply", "Subtract", "Add" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==0) {
	div(num1_2, num2_2);
}
if (operation==1) {
	mult(num1_2, num2_2);
}
if (operation==2) {
	sub(num1_2, num2_2);
}
if (operation==3) {
	add(num1_2, num2_2);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num3, int num4) {
		int add = num3 + num4;
		JOptionPane.showMessageDialog(null, "The result of the addition operation of your two numbers is:" +add);
		}
	static void sub(int num3, int num4) {
		int sub = num3 - num4;
		JOptionPane.showMessageDialog(null, "The result of the subtraction operation of your two numbers is:" +sub);
		}
	static void mult(int num3, int num4) {
		int mult = num3 * num4;
		JOptionPane.showMessageDialog(null, "The result of the multiplication operation of your two numbers is:" +mult);
		}
	static void div(int num3, int num4) {
		int div = num3 / num4;
		JOptionPane.showMessageDialog(null, "The result of the division operation of your two numbers is:" +div);
		}
	// 4. Create similar methods for subtraction, multiplication and division.
}