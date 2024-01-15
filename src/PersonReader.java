import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class PersonReader {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File document = chooser.getSelectedFile();
            try {
                Scanner input = new Scanner(document);
                System.out.println("ID#\tFirstname\tLastname\tTitle\tYOB");
                System.out.println("===========================================");
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    String[] information = line.split(",");
                    if (information.length >= 2) {
                        System.out.printf("%s\t%s\t%s\t%s\t%s\n", information[0], information[1], information[2], information[3], information[4]);

                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}