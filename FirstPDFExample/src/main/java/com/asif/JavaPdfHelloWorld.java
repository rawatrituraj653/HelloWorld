package com.asif;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class JavaPdfHelloWorld {

	private static String USER_PASSWORD= "asifraza";
	private static String OWNER_PASSWORD="asifraza";
	
	  public static void main(String[] args) throws Exception, IOException {
		
		  Document document = new Document();
		  try
		  {
			  PdfWriter writer = PdfWriter.getInstance(document,
					  new FileOutputStream("C:\\Users\\Asif\\Desktop\\RealtimeProject\\asif.pdf"));
			 writer.setEncryption(USER_PASSWORD.getBytes(), OWNER_PASSWORD.getBytes(),
					 PdfWriter.ALLOW_MODIFY_CONTENTS,PdfWriter.ENCRYPTION_AES_128
					  );
			  
			  
			  
			  document.open();
			  document.add(new Paragraph("My name is asif raza"
			  		+ " I am a java developer. I have two years experience on java development. I have hands on experience on "
			  		+ "spring, springboot, microservices, webservice." + "I have used putty, winscp, splunk for log monitoring tool"
			  		 +" I have used Maven and gradle as a build tool. Git and svn as a source code reposetry. "));
			  
			  //adding the image 
			 Image image = Image.getInstance("C:\\Users\\Asif\\Desktop\\asif.jpeg"); 
			  //Fixiting the position of the image 
			// image.setAbsolutePosition(100f, 200f);
			 
			 //scaling the height and the width of the image
			 
			 image.scaleAbsolute(200,200);
			 document.add(image);
			  
			 document.close();
			 writer.close();
			  
		  }
		  catch(DocumentException e)
		  {
			  e.printStackTrace(); 
		  }
		  catch(FileNotFoundException e)
		  {
			  e.printStackTrace();
		  }
		  System.out.println("pdf generated successfully");
	}
}
