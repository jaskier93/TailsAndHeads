package tailsandheads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    private static int random() {
        Random random = new Random();

        //losowanie z zakresu <0,2) czyli 0,1
        return random.nextInt(2) + 0;
    }


    private static void task() {
        System.out.println("Witaj w grze: \"Orzeł czy Reszka?\" \nW tej grze orzeł będzie miał wartość 1, natomiast reszka będzie miała wartość 0. \n ");
        System.out.println("Podaj liczbę z zakresu od 1 do 100 ");
        int counter = scanner.nextInt();

        while (counter <= 0 || counter >= 100) {
            System.out.println("Podałeś liczbę spoza zakresu, podaj liczbę między 1, a 100!");
            counter = scanner.nextInt();
        }
        List<Integer> list2 = listOfRandoms(counter);
        System.out.println("Lista wyników: "+list2);
        System.out.println("Orzeł wypadł "+score(list2)+" razy");
        System.out.println("Reszka wypadła "+(list2.size()-score(list2))+" razy");
    }


    private static List<Integer> listOfRandoms(int counter) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            list.add(random());
        }
        return list;
    }

    private static int score(List<Integer> list3) {
        int numberOfTails = 0;
        for (int i = 0; i < list3.size(); i++) {
            if (list3.get(i) == 1) {
                numberOfTails++;
            }
        }
        return numberOfTails;
    }

    public static void main(String[] args) {
        task();

    }
}