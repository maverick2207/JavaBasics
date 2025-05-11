package data_structure_basics.time_complexity;

public class MultiNumberEquationON2 {
    // 3x+9y+8z = 79

    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 20; y++) {
                int z = (79 - 3 * x - 9 * y) / 8;

                if (3 * x + 9 * y + 8 * z == 79 && z >= 0) {
                    System.out.println(x + ", " + y + ", " + z);
                }
            }
        }
    }
}
