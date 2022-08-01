import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Lop2d lop1 = new Lop2d(2,3);
        System.out.println(lop1);
        Lop3d lop3 = new Lop3d(lop1.getX(), lop1.getY(), 4);
        System.out.println(lop3);
        System.out.println(Arrays.toString(lop3.getXYZ()));
        lop3.toString();

    }
}
