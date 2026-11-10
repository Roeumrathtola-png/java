package Sec2;

public class Ass2 {
    public static void main(String[] args) {
        int a=10;
        char name='p';
        var number= 20.50f;// The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.that release in 2018
        boolean userbying= false;
        double afy =12;

        //to check the type of variable we can use getClass().getSimpleName() method to get the name of the class of the object.
        //but for primitive data types we need to cast it to Object first before calling getClass() method.



        System.out.println(a+" "+name+" "+((Object)number).getClass().getSimpleName()+" "+userbying+" "+afy);




    }
}
