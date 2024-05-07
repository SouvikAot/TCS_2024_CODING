import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int du=n;
        int var=n;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        while(du>0){
           int rem=du%10;
         double power=Math.pow(rem,count);
            sum+=power;
            du=du/10;
        }
        if(sum==var){
            System.out.println("Amstrong");
        }
        else {
            System.out.println("Not Amstrong");
        }
    }
}
