import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner lineScanner = new Scanner(System.in);
        List<List<Integer>> nums = new ArrayList<>();

        while (lineScanner.hasNextLine()) {
            String line = lineScanner.nextLine();
            Scanner intScanner = new Scanner(line);
            List<Integer> row = new ArrayList<>();

            while (intScanner.hasNextInt()) {
                row.add(intScanner.nextInt());
            }

            nums.add(row);
            intScanner.close();
        }

        lineScanner.close();

        for (int i = nums.size() - 1; i >= 0; i--) {
            for (int j = nums.get(i).size() - 1; j >= 0; j--) {
                System.out.print(nums.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
