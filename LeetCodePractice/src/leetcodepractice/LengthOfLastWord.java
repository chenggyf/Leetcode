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
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int length;
        if (s.contains(" ") && !s.endsWith(" ")) {
            length = s.substring(s.lastIndexOf(" ") + 1).length();
        } else {
            if (s.trim().isEmpty()) {
                length = 0;
            } else {
                if (s.endsWith(" ")) {
                    if (s.trim().contains(" ")) {
                        length = s.trim().substring(s.trim().lastIndexOf(" ") + 1).length();
                    } else {
                        length = s.trim().length();
                    }
                } else {
                    length = s.length();
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(lengthOfLastWord("b a "));
    }
}
