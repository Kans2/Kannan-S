import java.util.*;



class Calculator{

    double a ;
    double b ;
    String operation;

    public Calculator(double a , double b ,String operation){
        this.a = a;
        this.b = b;
        this.operation= operation;
    }

    public  double add(){  //dont need to pass parameters here as we have already initialized them .
          
        double sum = a + b;
        return sum;
    }

     public  double sub(){
          
        double sum = a -  b;
        return sum;
    }

     public double  mul(){
          
        double sum = a * b;
        return sum;
    }

     public  double div(){
        double sum = a / b;
        return sum;
    }



}


public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number" );
        double a = sc.nextLong();
        System.out.println("Enter 2nd number");
        double b = sc.nextLong();
        System.out.println("Enter the type of Operation : Please follow this names - 1. Add 2.Sub 3.Mul 4.Div");
        String operation = sc.next();


        Calculator calc = new Calculator(a,b,operation);


        if("Add".equals(operation)){
            System.out.println(calc.add());
        }else if("Sub".equals(operation)){
            System.out.println(calc.sub());
        }else if ("Mul".equals(operation)){
            System.out.println(calc.mul());
        }else if("Div".equals(operation)){
            System.out.println(calc.div());
        }else{
            System.out.println("Please enter a valid operation type given names which you want");
        }

    }
}

