public class WordPair implements Comparable<WordPair> {

	private String englishWord;
	private String finnishhWord;

	public WordPair(String english, String finnish) {

		englishWord = english;
		finnishhWord = finnish;

	}

	public String getEnglishWord() {
		return englishWord;

	}

	public String getFinnishWord() {
		return finnishhWord;

	}

	public int compareTo(WordPair anotherWordPair) {

		return englishWord.compareTo(anotherWordPair.englishWord);
	}

}