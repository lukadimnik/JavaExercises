import java.util.Comparator;

public class WordPair_FinnishWordComparator implements Comparator<WordPair> {

	public int compare(WordPair a, WordPair b) {
		return a.getFinnishWord().compareTo(b.getFinnishWord());
	}
}