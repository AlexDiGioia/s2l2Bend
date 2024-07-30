package Es1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        try {
            System.out.print("Inserisci il numero di parole: ");
            n = scanner.nextInt();
            scanner.nextLine();

            if (n <= 0) {
                throw new IllegalArgumentException("Il numero di parole deve essere positivo.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Errore: Inserisci un numero intero valido.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Errore inaspettato: " + e.getMessage());
            return;
        }

        HashSet<String> paroleDistinte = new HashSet<String>();
        HashSet<String> paroleDuplicate = new HashSet<String>();

        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Inserisci una parola: ");
                String parola = scanner.nextLine();

                // Verifica se la parola è duplicata o distinta
                if (!paroleDistinte.add(parola)) {
                    paroleDuplicate.add(parola);
                }
            }
        } catch (Exception e) {
            System.out.println("Errore durante l'inserimento delle parole: " + e.getMessage());
            return;
        }

        try {
            System.out.println("Parole duplicate: " + paroleDuplicate);
            System.out.println("Numero di parole distinte: " + paroleDistinte.size());
            System.out.println("Elenco delle parole distinte: " + paroleDistinte);
        } catch (Exception e) {
            System.out.println("Errore durante la stampa dei risultati: " + e.getMessage());
        } finally {

            scanner.close();
        }
    }
}
