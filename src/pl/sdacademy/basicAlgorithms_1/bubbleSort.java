package pl.sdacademy.basicAlgorithms_1;

import java.util.Arrays;
import java.util.Random;

public class bubbleSort {

    public static void main(String[] args) {
        generateAndSortTab();

    }

    public static void generateAndSortTab() {
        Random generator = new Random();
        int temp1 = 0;
        int temp2 = 0;
        int[] tab = new int[6];
        for (int i = 0; i < tab.length-1; i++) {
            tab[i] = generator.nextInt(10);
        }
        System.out.println("Nieposortowana tablica: ");
        System.out.println(Arrays.toString(tab));
        System.out.println();
        for (int i = 0; i < tab.length-1; i++) {
            if (tab[i + 1] > tab[i]) {
                tab[i] = temp1;
                tab[i+1] = temp2;
                tab[i] = tab[i+1];
                temp1 = tab[i];
                temp2 = tab[i+2];
            }
        }
        System.out.println("Posortowana tablica: ");
        System.out.println(Arrays.toString(tab));
    }
}

// Dokończyć (poprawić).
// Zrobić insertion sort.
// Popracować na ArrayList<> - algorytmy sortujące listy.
// Stworzyć dodatkowe klasy na kolejne zadania.
// Zrobić ruletkę.
// Zrobić wyświetlanie figur forami w konsoli.