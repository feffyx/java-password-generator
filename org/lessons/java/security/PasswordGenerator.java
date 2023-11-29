package org.lessons.java.security;

import java.util.Scanner;
public class PasswordGenerator {

    public static void main(String[] args) {
        // Variabili
        String nome, cognome, colorePreferito;
        int giornoNascita, meseNascita, annoNascita;

        // input utente
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        nome = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        cognome = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        colorePreferito = scanner.nextLine();

        System.out.print("Inserisci il giorno di nascita: ");
        giornoNascita = scanner.nextInt();

        System.out.print("Inserisci il mese di nascita (in cifre): ");
        meseNascita = scanner.nextInt();

        System.out.print("Inserisci l'anno di nascita: ");
        annoNascita = scanner.nextInt();

        // Somma data di nascita
        int sommaNascita = giornoNascita + meseNascita + annoNascita;

        // Password Generata
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaNascita;
        System.out.println("La tua password è: " + password);
    }
}