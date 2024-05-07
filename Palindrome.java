import java.util.Scanner;

public class Palindrome {
    void pal(int n){
        int rev=0;
        int real=n;
        while(n>0){
            int rem = n%10;
             rev=rev*10+rem;
            n=n/10;
        }
        if(rev==real){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum=0;
        while (n>0){
            int rem = n%10;
            sum=sum+rem;
            n=n/10;
        }
        Palindrome p = new Palindrome();
        System.out.println(sum);
        p.pal(sum);
    }
}
