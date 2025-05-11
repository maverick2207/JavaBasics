package data_structure_basics.time_complexity;

public class MultiNumberEquationON3 {

    public static void main(String[] args) {
// 3x+9y+8z = 79
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                for (int z = 0; z <= 10; z++) {
                    if (3 * x + 9 * y + 8 * z == 79)
                        System.out.println(x + ", " + y + ", " + z);
                }
            }
        }

    }
}
