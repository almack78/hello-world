public class HelloWorld{

     public static void main(String []args){
        double a, b, answer;
        a = 0.07;
        b = 25.99;
        answer = a * b;
        System.out.println("The sales tax is: " + answer);
        answer = a * b + b;
        System.out.println(answer);
     }
}
