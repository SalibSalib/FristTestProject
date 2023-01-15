package PracticeVariables;

import java.sql.SQLOutput;

public class MultiplyVariable {
    public static void main(String[] args) {
        double x=10.5;
        double y=10.5;
        double a=x+y;
        double b=x-y;
        double c=x*y;
        double d=x/y;
        String Box1="The Addition of 2 "+ x + " and " + y + " equal to " + a + "";
        String Box2="The Subtraction of 2 "+ x + " and " + y + " equal to " + b + "";
        String Box3="The Multiplication of 2 "+ x + " and " + y + " equal to " + c + "";
        String Box4="The Division of 2 "+ x + " and " + y + " equal to " + d + "";
        System.out.println(Box1);
        System.out.println(Box2);
        System.out.println(Box3);
    }
}
