package com.mw.tools;
//
// KaneIsDead - 2016
//
//
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class FileRecherche {
	public static File folder = new File("N:/Tomcat/webapps/mwdev3");
	static String temp = "";

	public static void main(String[] args) {
		// Affiche la Liste des Dossiers
		listFilesDossiers(folder);
	}

	public static void listFilesDossiers(final File folder) {
		File folderw = new File("N:/Tomcat/webapps/mwdev3");
		File[] listOfFiles = folderw.listFiles();
		File fileOut = new File("N:/Tomcat/webapps/mwdev3/prog-list.txt");
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(fileOut);

			PrintStream ps = new PrintStream(fos);

			for (int i = 0; i < listOfFiles.length; i++) {
				if (listOfFiles[i].isFile()) {
					System.out.println("Fichier " + listOfFiles[i].getName());


					Scanner in = null;
					try {

						in = new Scanner(listOfFiles[i]);
						while(in.hasNext())
						{
							String line=in.nextLine();
							if(line.contains("Manager.refresh")) {
								//System.setOut(ps);
								//System.out.println(line);
								ps.print(line + "\n");
							}
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			ps.close();
			fos.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
