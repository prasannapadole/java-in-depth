package com.semanticsquare.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferingCharacterStream {
	static StringBuilder text = new StringBuilder();

	public static void main(String[] args) {
		readingFromTextFile();
//		readingFromCommandLine();
		System.out.println(text);
	}

	private static void readingFromCommandLine() {
		try(BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in, "UTF-8"))){
			String input;
			while((input = in.readLine()) != null) {
				text.append(input).append("\n");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	private static void readingFromTextFile() {
		try(BufferedReader in = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("ToLearn.txt"), "UTF-8"));
				BufferedWriter out = new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("ToLearn2.txt"), "UTF-8"))){
			String line;
			while((line = in.readLine()) != null) {
				text.append(line).append("\n");
			}
			out.write(text.toString());
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}
