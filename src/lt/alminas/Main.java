package lt.alminas;

import lt.alminas.filereader.ReaderOfFiles;
import lt.alminas.model.Card;

import java.io.IOException;
import java.util.Scanner;


/**
 * The IBAN number checker. Program implements an application that
 * IBAN number check from input and from file.
 *
 * @author  Rimvydas
 */

public class Main {

    private static Scanner sc = new Scanner(System.in);

    /**
     * This is the main method which makes use of ibanNumberCheck, filereader method.
     * @param args Unused.
     * @return Nothing.
     * @exception IOException On input error.
     * @see IOException
     */
    public static void main(String[] args) throws IOException {

        boolean quit = false;
        Card card = new Card();
        ReaderOfFiles readerOfFiles = new ReaderOfFiles();

        while(!quit) {
            printMenu();
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Quit");
                    quit = true;
                    sc.close();
                    break;
                case 1:
                    System.out.println("Please enter IBAN ");
                    String input = sc.next();
                    boolean ibanChecker=card.ibanNumberCheck(input);
                    System.out.println("Valid - "+ ibanChecker + "\n");
                    break;
                case 2:
                    readerOfFiles.fileSaving();
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Default case \n");
                    break;
            }
        }
    }

    /**
     *  Displays Menu to the screen.
     */
    private static void printMenu() {
        System.out.println("Available actions");
        System.out.println("0. Quit");
        System.out.println("1. IBAN Checker");
        System.out.println("2. IBAN Checker from File");

    }
}
