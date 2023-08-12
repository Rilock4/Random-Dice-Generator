
public class Dice {

	public static void main(String[] args) {
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		
		int total = dice1 + dice2;
		
		System.out.println("The first dice roll is " +dice1);
		System.out.println("The second dice roll is " +dice2);
		System.out.println("Your total dice roll is " +total);
		
	} // main closing brace

} // class closing brace
