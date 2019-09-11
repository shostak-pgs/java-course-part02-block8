package by.htp.part02.block9.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Word word1 = new Word("У");
		Word word2 = new Word("лукоморья");
		Word word3 = new Word("дуб ");
		Word word4 = new Word("зеленый");
		Word word5 = new Word(".");
		Word word6 = new Word("Златая");
		Word word7 = new Word("цепь");
		Word word8 = new Word("на");
		Word word9 = new Word("дубе");
		Word word10 = new Word("том");
		Word word11 = new Word(".");

		Sentence sentence1 = new Sentence(word1, word2, word3, word4, word5);

		Sentence sentence2 = new Sentence(word6, word7, word8, word9, word10, word11);

		Text text1 = new Text("У лукоморья.", new ArrayList(Arrays.asList(new Sentence[] {sentence1, sentence2})));

		System.out.println(text1.getTitle());
		displayText(text1);

		Word word12 = new Word("И");
		Word word13 = new Word("днем");
		Word word14 = new Word("и");
		Word word15 = new Word("ночью");

		Sentence sentence3 = new Sentence(word12, word13, word14, word15);
		List<Sentence> sen1 = new ArrayList<>();
		sen1.add(sentence3);
		text1.addText(sen1);

		displayText(text1);
	}

	static void displayText(Text text) {

		for (Sentence s : text.getText()) {
			for (Word w : s.getSentence()) {
				System.out.print(w.getWord() + " ");
			}
		}
		System.out.println();
	}
}
