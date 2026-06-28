import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            char op = in.next().trim().charAt(0);
            if(op =='+' || op=='-' || op=='*' || op=='/' || op == '%'){
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+'){
                    ans = num1+num2;
                }
                if (op== '-'){
                    ans = num1 - num2;
                }
                if (op== '*'){
                    ans = num1 * num2;
                }
                if (op== '/'){
                    ans = num1 / num2;
                }
                if (op== '%'){
                    ans = num1 % num2;
                }else if  (op == 'x' || op =='X'){
                    break;
                }else{
                    System.out.println("invalid operation");
                }
            }
            System.out.println(ans);
        }
    }
    
}
