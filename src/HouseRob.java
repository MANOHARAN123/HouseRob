import java.util.Scanner;

public class HouseRob {
    public static int rob(int A[])
    {
        int sumOdd=0;
        int sumEven=0;
        int n= A.length;
        for(int i=0;i<n;i+=2){
            sumEven+=A[i];

        }for(int i=1;i<n;i+=2){
        sumOdd+=A[i];}
        if(sumOdd>sumEven) {
            return sumOdd;
        }

        return sumEven;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();

        }
        System.out.println(HouseRob.rob(A));
    }

}