package com.inter.fileconverterdemos;

public class DocumentConverter implements FileConverter {

	@Override
	public void convertFile(String filename) {
	   System.out.println("Converting to txt format");

	}

}
