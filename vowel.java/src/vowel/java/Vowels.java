package vowel.java;
	import java.util.Arrays;
	import java.util.List;
	import java.util.function.Function;

	public class Vowels{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Character> list =Arrays.asList('a','e','i','o','u');
			Function<Character,Boolean> isvowel=c->list.contains(c);
			System.out.println(isvowel.apply('a')+" "+'a');
			System.out.println(isvowel.apply('b')+" "+'b');
			

		}
}
