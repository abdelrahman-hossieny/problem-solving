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

//=========================================
//problem : R. Sequence of Numbers and Sum ❌❌❌❌❌  
//=========================================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Check termination condition before processing
            if (a <= 0 || b <= 0) {
                break;
            }

            int sum = 0;
            for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("sum =" + sum); // Use println to move to next line
        }
    }
}
//=========================================
//problem : X. Convert To Decimal 2                                         ❌❌❌❌❌              ❌❌❌❌❌               ❌❌❌❌❌  
//=========================================
// solution(1):

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();

            String binary = Integer.toBinaryString(N);
            int countOnes = 0;
            for (char c : binary.toCharArray()) {
                if (c == '1') {
                    countOnes++;
                }
            }

            String onesBinary = "1".repeat(countOnes);

            int result = Integer.parseInt(onesBinary, 2);
            System.out.println(result);
        }
    }
}

//============================================
// solution(2):

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt(); 
        
        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            
            String binary = Integer.toBinaryString(N);
            
            int count = 0;
            for (int j = 0; j < binary.length(); j++) {
                if (binary.charAt(j) == '1') {
                    count++;
                }
            }
            
            int result = 0;
            for (int k = 0; k < count; k++) {
                result = result * 2 + 1;
            }
            
            System.out.println(result); 
        }
    }
}
