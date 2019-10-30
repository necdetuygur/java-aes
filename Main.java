import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.print("Password: ");
        Scanner scan = new Scanner(System.in);
        String key = scan.next();

        System.out.print("Text: ");
        Scanner scan2 = new Scanner(System.in);
        String text = scan2.next();

        String enc = AES.encrypt(text, key);
        String dec = AES.decrypt(text, key);

        System.out.println(enc);
        System.out.println(dec);
    }
}
