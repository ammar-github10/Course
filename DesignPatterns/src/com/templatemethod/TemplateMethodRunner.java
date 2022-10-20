package com.templatemethod;

public class TemplateMethodRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelFile ef=new ExcelFile();
		ef.readProcessandSave();
		
		TextFile tf=new TextFile();
		tf.readProcessandSave();
		

	}

}
