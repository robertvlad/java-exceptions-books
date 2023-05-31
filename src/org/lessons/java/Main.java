package org.lessons.java;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi inserire?");
		int nrLibri = Integer.parseInt(sc.nextLine());
		
		Libro[] books = new Libro[nrLibri];
		
		int it = 0;
		
		while (it < nrLibri) {
			
			try {
				
				System.out.println("Definire titolo");
				String titolo = sc.nextLine();
				
				System.out.println("Definire numero di pagine");
				int nrPagine = Integer.parseInt(sc.nextLine());
				
				System.out.println("Definire autore");
				String autore = sc.nextLine();
				
				System.out.println("Definire editore");
				String editore = sc.nextLine();
				
				Libro l = new Libro(titolo, nrPagine, autore, editore);
				
				books[it] = l;
				
				it++;
				
				System.out.println("\n------------------------------------------------\n");
				
			} catch (Exception e) {
				
				System.err.println("Errore nella creazione del libro: " + e.getMessage());
			}
		}
		
		FileWriter newFile = null;
		
		try {
			
			newFile = new FileWriter("C:\\Users\\vladr\\Desktop\\books.txt");
			
			for (int i = 0; i < books.length; i++) {
				
				newFile.write(books[i] + "\n");
			}
			
			newFile.close();
			
		} catch (Exception e) {
			
			System.err.println("Erroe: " + e.getMessage());
		}
		
		try {
			
			File myFile = new File("C:\\Users\\vladr\\Desktop\\books.txt");
			
			Scanner reader = new Scanner(myFile);
			
			while (reader.hasNextLine()) {
				
				String data = reader.nextLine();
				System.out.println(data);
			}
			
			reader.close();
		} catch (Exception e) {
			
			System.err.println("Errore: " + e.getMessage());
		}
		
		sc.close();
	}	
}
