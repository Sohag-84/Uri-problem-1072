
import java.util.Scanner;

public class Uri_1072 {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int count=0;
   int c =0;
   int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>=10 && arr[i]<=20){
                count++;
               
            }else{
                c++;
            }  
        }
        if(count>0){
            System.out.println(count+" in"); 
        } if(c>0){
            System.out.println(c+" out");
        }
}
}
