
import CaesarCipher.CaesarCipher;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt for message

        System.out.print("Enter a message to be encrypted or decrypted: ");
        String message = scanner.nextLine();

        //prompt for key
        System.out.print("Enter an integer key value for encryption or decryption: ");
        int key = scanner.nextInt();

        //prompt for encryption or decryption
        System.out.print("Enter 'E' to encrypt or 'D' to decrypt: ");
        char choice = scanner.next().charAt(0);


        CaesarCipher cipher = new CaesarCipher(key);
        String result;
        if (choice == 'E'|| choice == 'e') {
            result = cipher.encrypt(message);
        } else if (choice == 'D'|| choice == 'd') {
            result = cipher.decrypt(message);
        } else {
            System.out.println("Invalid choice!");
            return;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}

