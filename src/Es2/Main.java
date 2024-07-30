package Es2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Scegli quanti numeri casuali:");
            n = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Errore: inserisci un numero intero valido.");
            return;
        }

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        randomNumbers = generateRandom(n);

        System.out.println("Num generati: " + randomNumbers);

        ArrayList<Integer> randomNumbersReversed = new ArrayList<>();
        try {
            randomNumbersReversed = reverse(randomNumbers);
            System.out.println("Num generati e invertiti: " + randomNumbersReversed);
        } catch (Exception e) {
            System.out.println("Errore nell'inversione della lista: " + e.getMessage());
        }

        evenOrOdd(randomNumbers, true);
        evenOrOdd(randomNumbers, false);
    }

    public static ArrayList<Integer> generateRandom(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add((int) (Math.random() * 101));
        }
        return numbers;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>(list);
        try {
            for (int i = list.size(); i > 0; i--) {
                newList.add(list.get(i - 1));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Errore: accesso all'indice fuori dai limiti. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Errore sconosciuto durante l'inversione: " + e.getMessage());
        }
        return newList;
    }

    public static void evenOrOdd(ArrayList<Integer> list, boolean even) {
        if (even) {
            System.out.println("Numeri pari:");
        } else {
            System.out.println("Numeri dispari:");
        }
        try {
            for (int numero : list) {
                if (even && numero % 2 == 0) {
                    System.out.println(numero);
                } else if (!even && numero % 2 != 0) {
                    System.out.println(numero);
                }
            }
        } catch (Exception e) {
            System.out.println("Errore durante la stampa dei numeri: " + e.getMessage());
        }
    }
}
