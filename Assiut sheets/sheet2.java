//=========================================
//problem : B. Even Numbers
//=========================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = n; i >= 2 ; i--) {
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
        even(n);
    }
    public static void even(int n){
        int i = n;
        if(n>=2){
            if(i%2==0){
                System.out.println(i);
            }
            even(n-1);
        }

    }

}
//=========================================
//problem : e.
//=========================================
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N ; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[N-1]);
    }
}

//=========================================
//problem : h.prime number
//=========================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x == 1) {
            System.out.println("No");
            return;
        }

        boolean isprime = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//=========================================
//problem : I. Palindrome
//=========================================
//            HINTS
// TO REVERSE INTEGER NUMBER WE HAVE TWO CHOICE :
// CHOICE 1
int num = sc.nextInt();       
String reversedStr = new StringBuilder(String.valueOf(num)).reverse().toString(); // تحويل العدد إلى نص وعكسه
int reversedNum = Integer.parseInt(reversedStr); // تحويله مرة أخرى إلى عدد صحيح
// CHOICE 2
int num = sc.nextInt();
int reversed=0;
while(num != 0 ){
    int digit = num %10;
    reversedNum = reversedNum * 10 + digit;
    num/=10;
}
 // problem solution

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num; // MUST
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println(reversedNum);
        if (originalNum == reversedNum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
//=========================================
//problem : lucky number   
//=========================================
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean isLuckyFound = false; // Flag to check if we found any lucky number

        for (int i = a; i <= b; i++) {
            String str = String.valueOf(i);  // Convert number to string
            boolean islucky = true; // Assume number is lucky initially

            for (int j = 0; j < str.length(); j++) {
                char digit = str.charAt(j);
                if (!(digit == '7' || digit == '4')) {
                    islucky = false;  // If there's a digit other than 4 or 7, it's not lucky
                    break;  // No need to check further digits, break the loop
                }
            }

            if (islucky) {
                isLuckyFound = true;  // We found at least one lucky number
                System.out.print(i + " ");  // Print the lucky number
            }
        }

        if (!isLuckyFound) {
            System.out.println("-1");  // If no lucky numbers found
        }
    }
}



