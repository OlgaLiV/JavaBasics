package com.syntax.class26;

public abstract class File {
	public abstract void open();

	public void edit() {
		System.out.println("To edit file click right button on the mouse and browse \"edit\"");
	}

	public void close() {
		System.out.println("To close file push on right croos in the corner");
	}
}

class JavaFile extends File {
	public void open() {
		System.out.println("To open .java file we need notepad++ or sublime text");
	}
}

class WordFile extends File {
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be inslalled");
	}
}

class PdfFile extends File {
	public void open() {
		System.out.println("To open .pdf file we need Acrobat Reader to be inslalled");
	}
}
