import java.io.FileWriter;
import java.io.IOException;

public class program_05 {

    public static void main(String[] args) {

        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        try {
            FileWriter fw = new FileWriter("log.txt");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                for (int k = 0; k < arr.length; k++) {
                    fw.write(arr[k] + " ");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}