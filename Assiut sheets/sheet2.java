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
