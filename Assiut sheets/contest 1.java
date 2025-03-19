// ===========================================
// problem:  Winter Sale
// ===========================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double pafter = sc.nextDouble();

        double pbefore = (pafter) /(1-(x/100));
        System.out.printf("%.2f%n", pbefore);
    }
}
// ===========================================
// problem:  Memo and Momo
// ===========================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if(a % k == 0 && b % k == 0){
            System.out.println("Both");
        }else if(a % k == 0){
            System.out.println("Memo");
        }else if(b % k ==0){
            System.out.println("Momo");
        }else {
            System.out.println("No One");
        }
    }
}
// ===========================================
// problem:  Next Alphabet
// ===========================================
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int ascii = (int) a;
        int next=0;
        if(ascii == 122){
            next= 97;
            System.out.println((char) next);
        }else {
            next= a+1;
            System.out.println((char) next);
        }

    }
}
// ===========================================
// problem:  Ali Baba and Puzzles
// ==========================================
