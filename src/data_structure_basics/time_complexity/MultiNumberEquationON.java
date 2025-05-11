package data_structure_basics.time_complexity;

public class MultiNumberEquationON {
    public static void main(String[] args) {
        // 3x+9y+8z = 79
        int y = 0;
        int z = 0;
        for (int x = 0; x <= 79 / 3; x++) {
            int r = (79 - 3 * x - 8 * z);
            y = r / 9;
            System.out.println("y: " + y);
            z = (79 - (3 * x + 9 * y)) / 8;

            if (z >= 0 && 3 * x + 9 * y + 8 * z == 79) {
                System.out.println(x + ", " + y + ", " + z);
            }
            
        }
    }
}
