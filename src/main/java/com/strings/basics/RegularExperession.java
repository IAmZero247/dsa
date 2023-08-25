package com.strings.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExperession {
    /**
     * Regular Expressions
     * ~~~~~~~~~~~~~~~~~~~
     * a group of strings according to particular pattern or format is called as regular expression.
     *
     * steps to prepare re objects:
     * ----------------------------
     * 1) import java.util.regex.*;
     * 2) Pattern object ---> format of data
     * 3) Matcher object ---> target string or input
     *
     * predefined character classes:
     * -----------------------------
     * \\s 			space char
     * \\S 			except space char
     * \\d 			digits
     * \\D 			except digits
     * \\w 			word char a-z or A-Z or 0-9
     * \\W 			except word char
     *
     * userdefined character classes:
     * ------------------------------
     * [abc] 			either 'a' or 'b' or 'c'
     * [^abc] 			except either 'a' or 'b' or 'c'
     * [0-9]			all digits from 0 to 9
     * [^0-9]			except digits from 0 to 9
     * [a-z]			all lower case alpha
     * [^a-z]			except lower case alpha
     * [A-Z]			all upper case alpha
     * [^A-Z]			except upper case alpha
     * [a-zA-Z]			all lower & upper case
     * [^a-zA-Z]		except lower & upper case
     * [a-zA-Z0-9]		all alpha numeric char
     * [^a-zA-Z0-9]		except alpha numberic har
     *
     *
     *
     * Quantifiers:
     * ------------
     * a 			exactly one a
     * a+			one or more a's
     * a*			zero or more a's
     * a? 			zero or one a
     * a{m}		exaclty m num of a's
     * a{m,n}	exactly min m number of a's and max n number of a's
     */
    public static void main(String[] args) {
        //predefinedTestMethod();
        /**
         * INPUT -> \\W
         * start:3 end:4 Group:$
         * start:7 end:8 Group:#
         * start:11 end:12 Group:^
         * start:15 end:16 Group:*
         * start:17 end:18 Group:
         * start:20 end:21 Group:&
         * start:22 end:23 Group:
         * start:23 end:24 Group:
         * 8
         */
        //userdefinedTestMethod();
        /**
         * start:4 end:5 Group:1
         * start:5 end:6 Group:2
         * start:6 end:7 Group:3
         * start:12 end:13 Group:4
         * start:13 end:14 Group:5
         * start:14 end:15 Group:6
         * 6
         */

        qualifierTestMethod();
        /**
         *start:5 end:8 Group:aaa
         *start:9 end:13 Group:aaaa
         *start:14 end:19 Group:aaaaa
         *3
         */
    }
    public static void predefinedTestMethod() {
        String inputS1 = "abc$123#ijk^456*p Qr&w  XYyyyz";
        //abc$123#ijk^456*p Qr&w  XYyyyz"
        //0  3   7   11   16  20  24   29
        Pattern P = Pattern.compile("\\W");
        Matcher M = P.matcher(inputS1);
        int count = 0;
        while(M.find())
        {
            System.out.println("start:"+M.start()+" end:"+M.end()+" Group:"+M.group());
            count++;
        }
        System.out.println(count);
    }

    public static void userdefinedTestMethod() {
        String inputS1 = "abc$123#ijk^456*p Qr&w  XYyyyz";
        //abc$123#ijk^456*p Qr&w  XYyyyz"
        //0  3   7   11   16  20  24   29
        Pattern P = Pattern.compile("[0-9]");
        Matcher M = P.matcher(inputS1);
        int count = 0;
        while(M.find())
        {
            System.out.println("start:"+M.start()+" end:"+M.end()+" Group:"+M.group());
            count++;
        }
        System.out.println(count);
    }

    public static void qualifierTestMethod() {
        Pattern P = Pattern.compile("a{3,6}");
        Matcher M = P.matcher("abaabaaabaaaabaaaaab");
        int count = 0;
        while(M.find())
        {
            System.out.println("start:"+M.start()+" end:"+M.end()+" Group:"+M.group());
            count++;
        }
        System.out.println(count);
    }
}
