/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author gunasegarran
 */

public class IPValidationRegex {

        private static Pattern IpPattern;
        private static Matcher IpMatcher;
        
        private static final String IpRegex = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.)(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.)(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.)(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})";
        
        public static void main (String [] args){
            System.out.print("Enter your IP Address: ");
            Scanner scanner = new Scanner(System.in);
            String ip = scanner.nextLine();
            IpPattern = Pattern.compile(IpRegex);
            System.out.println(ip +" "+ validateIp(ip));
        }
        
        public static String validateIp (final String ip){
            IpMatcher = IpPattern.matcher(ip);
            if(IpMatcher.matches()){
                return "This is a valid IP Address.";
            }else{
            return "This is an invalid IP Address.";
            }
        }
        
}
