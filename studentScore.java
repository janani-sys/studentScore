import java.util.Scanner;
public class studentScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter the elements");
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are");
        for(int i = 0; i<size; i++)
        {
            System.out.print(arr[i]+" ");  
        }
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum+=arr[i];
        }
        System.out.println("The sum is:"+ sum);
        int number = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>number){
                number = arr[i];
            }
        }
        System.out.println("The highest element is: "+ number);
    }
}
