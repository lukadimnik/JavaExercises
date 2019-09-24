
public class ObjectsWordPairProgram {

	public static void main(String[] args) {
		WordPair WordPair1 = new WordPair("class", "luokka");
		WordPair WordPair2 = new WordPair("object", "olio");
		WordPair WordPair3 = new WordPair("variable", "muuttuja");

		System.out.println(WordPair1.getEnglishWord() + " = " + WordPair1.getFinnishWord());
		System.out.println(WordPair2.getEnglishWord() + " = " + WordPair2.getFinnishWord());
		System.out.println(WordPair3.getEnglishWord() + " = " + WordPair3.getFinnishWord());

	}

}