import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Reverse3637 {
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
        
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                System.out.print(nums.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
