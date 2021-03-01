
public class dmvSimulator {
	public static void main(String[] args)
	{
		System.out.println("Welcome to the DMV!");
		int number = (int) (Math.random() * 100);
		System.out.println("Your number is " + number + ", wait until you are called.");
		
		for(int i = number + 1; i <= 100; i++)
		{
			System.out.println(i);
		}
		
		for(int i = 1; i < number; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("You don't have the required paperwork. Have an awful day. You wasted my time and everybody elses.");
		System.out.println("Exitting the program...");
	}
}
