package com.homework_to_lesson_6;

/**
 * Homework:6
 * 8/27/2020 
 * @author Reshitko Ruslan
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {

		try {
			PrintStream ps1 = new PrintStream(new FileOutputStream("file1.txt"));
			ps1.println("Honda was the first Japanese automobile manufacturer"
					+ " to release a dedicated luxury brand, Acura, in 1986. ");
			PrintStream ps2 = new PrintStream(new FileOutputStream("file2.txt"));
			ps2.println("Aside from their core automobile and motorcycle businesses,"
					+ " Honda also manufactures garden equipment, marine engines,"
					+ " personal watercraft and power generators, and other products.");

			// �?апи�?ать программу, «�?клеивающую» �?ти файлы, то е�?ть вначале
			// идет тек�?т из первого файла, потом тек�?т из второго.

			InputStream in = new FileInputStream("file1.txt");
			byte[] buffer = new byte[1 << 20];
			OutputStream os = new FileOutputStream(new File("file3.txt"), true);
			int count;
			while ((count = in.read(buffer)) != -1) {
				os.write(buffer, 0, count);
				os.flush();
			}
			in.close();

			in = new FileInputStream("file2.txt");
			while ((count = in.read(buffer)) != -1) {
				os.write(buffer, 0, count);
				os.flush();
			}
			in.close();
			os.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

}
