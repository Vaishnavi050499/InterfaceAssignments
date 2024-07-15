package com.inter.fileconverterdemos;

import java.util.Scanner;

public class UserMain {

	private static final String String = null;

	public static void main(String[] args) {
	FileConverter file;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the file name to get converted");
	String input = sc.nextLine();
	
    String extension = getFileExtension(input);
    
    if(extension.equalsIgnoreCase("Pdf"))
    {
    	file=new PdfConverter();
    	file.convertFile(extension);
	}
    else if (extension.equalsIgnoreCase("txt"))
    {
    	file=new DocumentConverter();
    	file.convertFile(extension);
	}else if (extension.equalsIgnoreCase("img"))
    {
    	file=new ImageConverter();
    	file.convertFile(extension);
	}
	}
    public static String getFileExtension(String input)
	
    {
    	int index=input.lastIndexOf('.');
    	if(index!=-1 && index < input.length()-1)
    	{
    		return input.substring(index+1);
    }
    	return null;
    }
	

	}

	


