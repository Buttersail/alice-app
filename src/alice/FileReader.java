package alice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    File file = new File("alice.txt");
    Scanner scan;

    public String readFile() throws FileNotFoundException {
        StringBuilder result = new StringBuilder();

        scan = new Scanner(file);

        while (scan.hasNextLine()) {
            result.append(scan.nextLine().toLowerCase());
            result.append(" ");
        }

        return result.toString().replaceAll(" {2,}", " ");

    }


}
