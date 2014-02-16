/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodepractice;

/**
 *
 * @author Cheng Guo
 */
public class ReverseInteger {

    /**
     * @param x
     * @return 
     */
    public static int reverse(int x) {
        String xx = Integer.toString(x);
        String reverse;
        if (x == 0) {
            reverse = "0";
        } else {
            if (x > 0) {
                reverse = new StringBuffer(xx).reverse().toString();
            } else {
                reverse = "-"  + new StringBuffer(xx.substring(1)).reverse().toString();
            }
        }
        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(reverse(1000000003));
    }
}
