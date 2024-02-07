import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter output = new PrintWriter("temp.txt");

        output.printf("amount is %f %e\r\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
        output.printf("%6b\r\n", (1>2));
        output.printf("%6s\r\n", "Java");
        output.close();
    }
}
