/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author gunasegarran
 */

public class TimeMeasuringTools {

    public static void main(String[] args) throws InterruptedException {

        long lStartTime = System.nanoTime();
        
        System.out.print("Enter the milliseconds: ");
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
  
        calculation(sec);
        
        long lEndTime = System.nanoTime();
        long output = lEndTime - lStartTime;
        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
    }

    private static void calculation(final int sec) throws InterruptedException {
        TimeUnit.SECONDS.sleep(sec);
    }
}