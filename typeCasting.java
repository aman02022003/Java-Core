public class typeCasting {
    
    public static void main(String[] args) {
    //Widening Casting
        int a = 9;
    double b = a; // Automatic casting: int to double

    System.out.println(a);      // Outputs 9
    System.out.println(b);   // Outputs 9.0
     
    //Narrowing Casting
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9

    }
}
