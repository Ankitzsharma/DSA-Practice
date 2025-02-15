package Functions;

public class Funbasic {
    static void fun1(){
        System.out.println("Function inside Fun1 Function\n");
    
    }
    static void fun2(){
        System.out.println("Function Inside Fun2 Function");
    }

    public static void main(String []args){
        System.out.println("Function Inside Main\n" );
        fun1();
        fun2();
    }
}
