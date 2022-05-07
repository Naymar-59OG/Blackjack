import java.util.Scanner;

public class TestProject1 {

	public static void main(String[] args) {
		/*System.out.println("hello cheick");
		String name;
		name = "cheick";
		int len = name.length();
		System.out.println(len);
		System.out.println(name);
		System.out.println(System.out.getClass());
		System.out.println(System.in.getClass());
		System.out.println(System.err.getClass());
		System.err.println("xxxx");*/
		@SuppressWarnings("resource")
		Scanner inputReader = new Scanner(System.in); // systeme pour pour permettre à l'i
		System.out.println("entre votre prenom: ");
		String nom = inputReader.nextLine();
		String i = " ";
		System.out.println("hello: " + nom);
		while ( i.isBlank()){
			
			i = inputReader.nextLine();
		} 
		
		// TODO Auto-generated method stub

	}

}
