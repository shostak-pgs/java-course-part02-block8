package by.htp.part02.block9.ex1;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null) {
				return false;
			}
		} else if (!sentence.equals(other.sentence)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}

}
