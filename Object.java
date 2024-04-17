
class calculator{
    int a;
    public int add(int num1, int num2){
        int r=num1 + num2;
        return r;
    }
}

public class Object {
    public static void main(String[] args) {
    
        int a=1;
        int b=2;
        calculator calc = new calculator();
      int result=  calc.add(a,b);
      System.out.println(result);

    }
}
