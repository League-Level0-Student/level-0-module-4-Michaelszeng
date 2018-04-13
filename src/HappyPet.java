import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static int happinessLevel = 100;
static String pet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
pet = JOptionPane.showInputDialog("What pet you want?");
JOptionPane.showMessageDialog(null, "Your pet's happiness is currently at 100");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			// 5. Use user input to call the appropriate method created in step 4.
for (int i=0; i<9999; i++) {
	int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "Activity", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "walk", "give food", "pet" }, null);
if (task==0) {
	walk();
}
if (task==1) {
	give_food();
}
if (task==2) {
	pet();
}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel<-1000) {
	JOptionPane.showMessageDialog(null, "Congratulations! Your "+pet+" got so sad you lost the game!");
	break;
}
	}
	}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static private void walk() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" enjoys walking and feels unhappy");
		happinessLevel=happinessLevel-100;
		JOptionPane.showMessageDialog(null, "You pet's happiness is "+happinessLevel);
		
}
	static private void give_food() {
		JOptionPane.showMessageDialog(null, "Your "+pet+ " eats the food and is very sad");
		happinessLevel=happinessLevel-103;
		JOptionPane.showMessageDialog(null, "You pet's happiness is "+happinessLevel);
	}
	static private void pet() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" enjoys the petting and becomes depressed");
		happinessLevel=happinessLevel-341;
		JOptionPane.showMessageDialog(null, "You pet's happiness is "+happinessLevel);
	}
}
