import java.util.Scanner;


public class calc {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double num1 =sc.nextDouble();
        char operator = sc.next().charAt(0);
        double num2 = sc.nextDouble();
        double result = 0.0;
        
        switch(operator){
            case'+':
                result = num1 +num2;
                System.out.println(result);
                break;
       
            case'-':
                result = num1 - num2;
                System.out.println(result);
                break;
       
            case'*':
                result = num1 * num2;
                System.out.println(result);
                break;
        
            case'/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
    
}
