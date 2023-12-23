import java.util.Scanner;
public class operaters{
    public static void main(String args[]){
        while(true){
            Scanner input1=new Scanner(System.in);
            System.out.print ("Enter no 1");
            int a=input1.nextInt();

            Scanner input2=new Scanner(System.in);
            System.out.print ("Enter no 1");
            int b=input2.nextInt();

            Scanner input3=new Scanner(System.in);
            System.out.print ("Enter no 1");
            String c=input3.next();


            switch (c) {
                case "+":System.out.println(("a+b = ")+(a+b));  
                    break;
                case "-":System.out.println(("a-b = ")+(a-b));  
                    break;
                case "/":System.out.println(("a/b = ")+(a/b));  
                    break;
                case "*":System.out.println(("a*b = ")+(a*b));  
                    break;
                default:System.out.println("invalid");
                    break;
            }

            Scanner input4=new Scanner(System.in);
            System.out.print("Do you want to repeat    ");
            String d=input4.next();
            if(d.equals("Y")){
                continue;
            }
            else{
                break;
            }
            
        }
        System.out.println("exit.");
        
    }

    
}
