import java.util.Arrays;
import java.util.Random;

public class Main {
    int[] numbers;
    String[] words;

    // Array Erstellung & Initialisierung:
    public void initiateArrays() {
        numbers = new int[10];
        words = new String[5];
    }

    // Elemente Hinzufügen (Schreiben):
    public boolean addSpecificElement(int index, int value) {
        if (index >= 0 && index < numbers.length) {
            numbers[index] = value;
            return true;
        } else {
            System.out.println("Fehler: Ungültiger Index " + index + " zum Hinzufügen von Elementen.");
            return false;
        }
    }

    public void fillWithRandomNumber(int min, int max) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(min, max);
        }
    }

    // Elemente Lesen:
    public int getElement(int index) {
        if (index >= 0 && index < numbers.length) {
            return numbers[index];
        } else {
            System.out.println("Fehler: Ungültiger Index " + index + " beim Lesen des Elements.");
            return -1;
        }
    }

    // Elemente Suchen:
    public int searchElement(int targetValue) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    // Elemente Löschen (Logisch):
    public boolean deleteElement(int targetIndex) {
        if (!(targetIndex < 0 || targetIndex >= numbers.length)) {


            for (int i = targetIndex; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }

            numbers[numbers.length - 1] = 0;

            System.out.println("Element an Index " + targetIndex + " gelöscht.");
            return true;
        } else {
            System.out.println("Ungültiger Index zum Löschen.");
            return false;
        }
    }

    // Array Modifizieren:
    public boolean modifyElement(int index, int newValue) {
        if (index >= 0 && index < numbers.length) {
            numbers[index] = newValue;
            return true;
        } else {
            System.out.println("Fehler: Ungültiger Index " + index + " für die Modifikation des Elements.");
            return false;
        }
    }

    // Array Umkehren:
    public void reverseArray() {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }

    // Minimum/Maximum finden:
    public void findMinMax() {
        int compareMax = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > compareMax) {
                compareMax = number;
            }
        }

        int compareMin = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < compareMin) {
                compareMin = number;
            }
        }

        System.out.println("MAX: " + compareMax);
        System.out.println("MIN: " + compareMin);
    }

    // Array Kopieren (Shallow Copy):
    public int[] copyArray() {
        int[] newNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }
        return newNumbers;
    }

    // Häufigkeit zählen?
    public void countFrequencies(int maxValuePossible) {
        int[] countArr = new int[maxValuePossible + 1];
        for (int number : numbers) {
            if (number >= 0 && number <= maxValuePossible) {
                countArr[number]++;
            } else {
                System.out.println("Warnung: Wert " + number + " liegt außerhalb des Zählbereichs.");
            }
        }

        System.out.println("Häufigkeiten:");
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 0) { // Nur Zahlen ausgeben, die vorkamen
                System.out.println("Wert " + i + ": " + countArr[i] + " Mal");
            }
        }
    }


    public static void main(String[] args) {
        Main main = new Main();

        main.initiateArrays();
        System.out.println(main.addSpecificElement(1, 1));
        main.fillWithRandomNumber(1, 100);
        System.out.println(main.getElement(1));
        System.out.println(main.searchElement(3));
        System.out.println(main.deleteElement(1));
        System.out.println(main.modifyElement(1, 3));
        main.reverseArray();
        main.findMinMax();
        System.out.println(Arrays.toString(main.copyArray()));
        main.countFrequencies(50);
    }
}