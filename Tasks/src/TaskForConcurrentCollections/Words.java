package TaskForConcurrentCollections;

import java.util.Map;

public class Words {
    private Map<String, Long> words;

    public Words(Map<String, Long> words) {
        this.words = words;
    }

    public Map<String, Long> getWords() {
        return this.words;
    }

    public void setWords(Map<String, Long> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Words{" +
                this.words +
                '}';
    }

    public synchronized void addWord(String word) {
        this.words.compute(word, (key, value) -> value == null ? 1 : ++value);
    }
}
