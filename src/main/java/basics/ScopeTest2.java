package basics;

public class ScopeTest2 {

    public static void main(String[] args) {
        //int [] arr = new int[10_000_000];


        int val;
        {
           int[] arr = new int[10_000_000];
           val = arr[10_000];


        }

        System.out.println(val);



        byte a = 10;    // 00800010
        byte b = 25;    // 00811001 +
                        // = 00801000

        System.out.println(a & b);
        //System.out.println(a && b); // && nur mit boolischen werten


//        if(10 + 15 > 10 & 25 - 17 < 8) {
//
//        }
//
//        if(10 + 15 > 10 && 25 - 17 < 8) {
//
//        }

    }

    private static int getValue() {
        int[] arr = new int[10_000_000];
        return arr[10_000];

    }
}
