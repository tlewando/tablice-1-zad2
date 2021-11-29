import java.io.*;
import java.util.*;

public class Main {

   public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      for ( int i = 0; i < rozmiar; i++ ) {
         System.out.println("Podaj liczbe: ");
         tablica[i] = Integer.parseInt(in.readLine());
      }
   }

   public static void wypisz_tablice(int[] tablica, int rozmiar) {
      for ( int i = 0; i < rozmiar; i++ )
         System.out.println("tablica["+i+"] = "+tablica[i]);
   }
   public static void wylosuj_tablice(int[] tablica, int rozmiar){
      Random rand = new Random();
      for (int i=0; i < rozmiar; i++)
         tablica[i]= rand.nextInt(50);
   }
   public static void dopisz_tablice(int[] tablica, int rozmiar) throws IOException {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("podaj pierwszy element tablicy: ");
     tablica[0]=Integer.parseInt(in.readLine());
     //tablica[0]=1;
      for(int i=1 ; i<rozmiar; i++)
         tablica[i]=(tablica[i-1]+1);
           //tablica[i]=(tablica[i-1]*2);
   }
   public static void main(String[] args) {
      try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int r;
         System.out.println("Podaj rozmiar: ");
         r = Integer.parseInt(in.readLine());
         int[] t = new int[r];
        // wczytaj_tablice(t, r);
        // wylosuj_tablice(t, r);
         dopisz_tablice(t, r);
         
         System.out.println("tablica sklada sie z nastepujacych kolejnych liczb:");
         wypisz_tablice(t, r);
         
      } catch(IOException e) {
      }
   }
}

/*
 * Cwiczenia:
 * 1. Zamiast wczytywac elementy tablicy, wylosuj je z przedzialu 
 * od 0 do 100, a nastepnie  do wartosci podanej przez uzytkownika.
 * 2. Zamiast wczytywac elementy tablicy, wypelnij ja kolejnymi 
 * liczbami calkowitymi, kolejnymi potegami dwojki itp.
 */
 
