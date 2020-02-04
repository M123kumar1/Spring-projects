package com.i18n.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class I18NTest {
	public static void main(String[] args) {
		FileReader reader;
		try {

			reader = new FileReader("D:\\1 Sriman Sir WorkSpace\\Spring WorkSpace\\I18NTest2\\src\\my feelings.txt");
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.print(line);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * try { int c=0; FileInputStream fis=new
		 * FileInputStream("D:\\1 Sriman Sir WorkSpace\\Spring WorkSpace\\I18NTest2\\src\\my feelings.txt"
		 * ); while(fis.read()!=-1) { c=fis.read(); System.out.print((char)c); } } catch
		 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */

	}
}
