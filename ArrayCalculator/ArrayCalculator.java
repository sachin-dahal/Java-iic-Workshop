import java.util.Scanner;

public class ArrayCalculator
{ 
    static Scanner sc = new Scanner(System.in); 
   public void even(int arrayLength){
       
       int arr1[] = new int[arrayLength];
       
       System.out.println("Enter the value for array: ");
       
       for(int i=0; i< arrayLength; i++){
        
           arr1[i] = sc.nextInt();
           
       }
       
       System.out.println("The even numbers are");
       
       for(int i=0; i< arrayLength; i++){
           
           if(arr1[i]%2==0){
               
               System.out.println(arr1[i]+"");
            }
        }
    }
          
    public static void main(String[] args){
        
        System.out.println("Enter the size of an array: ");
        int arrayLength = sc.nextInt();
        
        ArrayCalculator calculateEven = new ArrayCalculator();
        
        calculateEven.even(arrayLength);
        
    
    }
    
    
}
