import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Driver {
    public static final int MIN = 0;
    public static final int MAX = 10;
    private Scanner sc;
    private int selection;

    public Driver(Scanner sc) {
        this.sc = sc.useDelimiter("\n");
    }

    public void run() {
        do {
            System.out.println("PHAN CONG HUY - FX16513");
            System.out.println("Linear Search: ");
            System.out.println("Enter the number of elements in array (1 to 10): ");
            selection = sc.nextInt();
            if (!isValid(selection)) {
                System.out.println("Only type number from 1 to 10. Try again.");
            }
        } while (!isValid(selection));

        System.out.println("Enter search value: ");
        int value = sc.nextInt();


        int[] arr = new int[selection];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(MIN, MAX);

        }

        System.out.println("The array: " + Arrays.toString(arr));
        int index = linearSearch(arr, value);
        if (index != -1) {
            System.out.println("Found " + value + " at index: " + index);
        } else {
            System.out.println("Cannot found " + value + " .");
        }
    }

    public int linearSearch(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public boolean isValid(int selection) {
        for (int i = 1; i < 11; i++) {
            if (selection == i) {
                return true;
            }
        }
        return false;
    }

    public void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

}
