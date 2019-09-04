package by.htp.part02.block9.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> sentence;

	public Sentence() {
		sentence = new ArrayList<Word>();
	}

	public Sentence(Word... word) {
		this.sentence = new ArrayList<Word>();
		for (Word w : word) {
			sentence.add(w);
		}
	}

	public Sentence(List<Word> sentence) {
		this.setSentence(sentence);
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public void addWord(Word... word) {
		for (Word w : word) {
			sentence.add(w);
		}
	}
}
