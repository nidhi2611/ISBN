import java.util.Scanner;

public class Book {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("N/A");
        } else {
            sc.nextLine().trim();
            BookSystem[] s = new BookSystem[n];
            for (int i = 0; i < n; i++) {
                String name = sc.nextLine().trim();
                String a = sc.nextLine().trim();
                String isbn = sc.nextLine().trim();
                s[i] = new BookSystem(name, a, isbn);
            }

            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
        sc.close();
    }
}
}
