package com;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OcrExample {

	public static void main(String[] args) {
		
		File imageFile = new File("C:\\Users\\USER\\Downloads\\Bot1Images\\bot");
		
		File[] images = imageFile.listFiles();
		
		for (File file:images){
			
			ITesseract instance = new Tesseract();
			
			try {
				String result = instance.doOCR(file);
				System.out.println(file.getName()+"\n"+result);
				System.out.println("------------------------------------------------");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
