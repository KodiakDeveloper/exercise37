package loops;

import javax.swing.JOptionPane;

public class Ex37 {

	public static void main(String[] args) {

		int userInput, count = 0, count1 = 1;
		;

		userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input value: "));

		if (userInput <= 0) {

			JOptionPane.showMessageDialog(null, "The numbers must be greater than zero!!");
		}

		else {

			System.out.println("Fibonacci Sequence: ");

			for (int i = 0; i <= userInput; i++) {

				System.out.print(count + " ");

				int next = count + count1;

				count = count1;

				count1 = next;

			}

		}

	}

}
