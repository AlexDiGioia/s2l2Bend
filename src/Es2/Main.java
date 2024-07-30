package Es2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli quanti numeri casuali:");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        randomNumbers = generateRandom(n);
        System.out.println("Num generati: " + randomNumbers);
        ArrayList<Integer> randomNumbersReversed = new ArrayList<Integer>();
        randomNumbersReversed = reverse(randomNumbers);
        System.out.println("Num generati e invertiti: " + randomNumbersReversed);

        evenOrOdd(randomNumbers, true);
        evenOrOdd(randomNumbers, false);
    }

    public static ArrayList<Integer> generateRandom(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            numbers.add((int) (Math.random() * 101));
        }
        return numbers;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList = list;
        for (int i = list.size(); i > 0; i--) {
            newList.add(list.get(i - 1));
        }
        return newList;
    }

    public static void evenOrOdd(ArrayList<Integer> list, boolean bool) {
        if (bool) {
            System.out.println("Numeri pari:");
            for (int numero : list) {
                if (numero % 2 == 0) {
                    System.out.println(numero);
                }
            }
        } else {
            System.out.println("Numeri dispari:");
            for (int numero : list) {
                if (numero % 2 != 0) {
                    System.out.println(numero);
                }
            }
        }
    }
}
