package com.inter.fileconverterdemos;

public class PdfConverter implements FileConverter {

	@Override
	public void convertFile(String filename) {
	   System.out.println("Converting to PDF format");

	}

}
