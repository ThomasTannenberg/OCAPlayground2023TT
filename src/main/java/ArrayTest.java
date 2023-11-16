import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr1 = new int[10]; // leeres Array, Größe muss angegeben werden
        int[] arr2 = {1, 2, 3, 4, 5}; // nur bei gleichzeitger Deklaration und Initialisierung
        // arr2 = {1, 2, 3, 4, 5}; // geht nicht

        arr2 = new int[]{1, 2, 3, 4, 5}; // Bei Neuzuweisung diese Schreibweise verwenden

        // arr2 = new int[5]{1, 2, 3, 4, 5}; // geht nicht

        String[] arr3 = {"Hallo", "Welt"};
        Object[] arr4;

        System.out.println(arr2);

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println(Arrays.toString(arr2));

        for(int inhalt : arr2) {
            System.out.println(inhalt);
        }

        arr2[3] = 10;
        Arrays.stream(arr2).forEach(System.out::println);

        try {
            System.out.println(arr2[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler: " + e.getMessage());
        }


        int a3[];
        //int[] a3;


        //int[] a1, a2; // a1 und a2 sind Arrays
        //int a1[], a2; // a1 ist Array, a2 ist int
        int[] a1[], a2; // a1 ist 2D array, a1 ist 1D array

        int[][] a4 = new int[10][4];
        int[][] a5 = new int[10][10];
        int[][] a6 = new int[10][];

        int[][] a7 = new int[5][5];
        /*
        [
        0: [0, 0, 0, 0, 0],
        1: [0, 0, 0, 0, 0],
        2: [0, 0, 0, 0, 0],
        3: [0, 0, 0, 0, 0],
        4: [0, 0, 0, 0, 0]
         */

        int[][] a8 = new int[5][];
        a8[2] = new int[5];
        a8[3] = new int[2];
        /*
        [
        0: null,
        1: [0, 0],
        2: [0, 0, 0, 0, 0],
        3: null,
        4: null
         */

        for (int[] row : a8) {
            if (row == null) {
                System.out.println("null");
                continue;
            }
            for (int col: row) {
                System.out.print(col + ", ");
            }
            System.out.println(" ");
        }

        int[] zahlen = new int[100];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = (int) (Math.random() * 100) + 1;
        }

        // 1, 5, 3, 2, 4, 2, 1
        // 1, 1, 2, 2,      3, 4, 5
        // Binärsuche funktioniert nur auf sortierten Mengen

        Arrays.sort(zahlen); // Array ist sortiert
        int erg = Arrays.binarySearch(zahlen, 95);
        System.out.println(erg);







    }
}
