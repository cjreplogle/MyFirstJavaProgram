import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		int cj1 = 1, cj2 = 1, cj3, i;
		float cj4;
		int precision = 20;
		// This says hello world, very complicated I know. 8/16/2021 babys first steps.
		System.out.println("Hello World");
		System.out.println("The quick brown fox jumped over the lazy dog.");
		// Java compiler runs math logic until it encounters a string, which it then treats integers like text.
		System.out.println(cj1 + cj2 + "math_logic");
		System.out.println("math_logic" + cj1 + cj2);
		// Print test using parentheses using escape sequences
		System.out.println("\"Computers in the future may weight");
		System.out.println("no more than 1.5 tons.\"");
		System.out.println(" - Popular Mechanics, 1949");
		
		System.out.println("   /\\");
		System.out.println("  /  \\");
		System.out.println(" /    \\");
		System.out.println(" |    |");
		System.out.println(" |    |");
		System.out.println(" -----");
		
		//fibonacci sequence
		for (i = 1; i < precision; i++) {
			cj3 = cj1 + cj2;
			cj1 = cj2;
			cj2 = cj3;
			System.out.println(cj3);
			}
		}
}
