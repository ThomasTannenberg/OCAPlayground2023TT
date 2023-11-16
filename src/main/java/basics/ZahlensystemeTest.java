package basics;

public class ZahlensystemeTest {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("int i = 10 [dezimalzahl] " + i);

        i = 010;
        System.out.println("int i = 010 [oktalzahl] " + i);

        i = 0x12;
        System.out.println("int i = 0x10 [hexadezimalzahl] " + i);

        i = 0b11;
        System.out.println("int i = 0b10 [binärzahl] " + i);

        int j = 100;
        Integer k = j; // Autoboxing von primitiv zu Integer
        j = k; // Unboxing von Integer zu primitiv

        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toBinaryString(i));

        long l = 1_000_000L;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        float f = 10.0F; // bei float literalen muss IMMER ein F angehängt werden

        int erg1 = 2 / 3;
        System.out.println(erg1);

        double erg2 = 2/3;
        System.out.println(erg2);
        erg2 = 2/3D;
        System.out.println(erg2);

        erg2 = 2D /3.0 * 1.5;
        System.out.println(erg2);

        String a = Character.toString('\127');
        System.out.println(a);

    }
}
