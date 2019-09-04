package by.htp.part02.block9.Ex1;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста. 
 */
public class Text {
	private String title;
	private List<Sentence> text;

	public Text(String title, List<Sentence> text) {
		this.setTitle(title);
		this.setText(text);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public void addText(List<Sentence> text) {
		for (Sentence s : text) {
			this.text.add(s);
		}
	}
}
