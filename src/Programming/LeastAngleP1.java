package Programming;

import java.util.Scanner;

public class LeastAngleP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr = sc.nextInt();
        int min =sc.nextInt();

        double mangle = min*6;
        double hangle = hr * 30 + min * 0.5;

        double angle = hangle - mangle;

        if(angle < 0) angle = angle *-1;
        else if(angle > 180) angle = 360 - angle;

        System.out.println("Least angle between them is : "+angle);
    }
}

