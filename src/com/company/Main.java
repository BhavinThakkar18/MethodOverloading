package com.company;

public class Main {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet<0 || inches<0 || inches>12)
        {
            return -1;
        }

        double ans=(feet*12d);
        ans+=inches;
        ans*=2.54d;
        System.out.println(feet+" ft, "+inches+" inches="+ans+" cms");
        return ans;
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches<0)
        {
            return -1;
        }
        double temp= (inches%12d);
        double feet= inches/12d;
        return(calcFeetAndInchesToCentimeters(feet,temp));

    }
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(12)+"cm");
        System.out.println(calcFeetAndInchesToCentimeters(6,0)+"cm");
        System.out.println(calcFeetAndInchesToCentimeters(6,-5)+"cm");
        System.out.println(calcFeetAndInchesToCentimeters(6,13)+"cm");
        System.out.println(calcFeetAndInchesToCentimeters(7,5)+"cm");
    }
}
