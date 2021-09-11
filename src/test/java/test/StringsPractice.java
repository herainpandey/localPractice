package test;

import org.testng.annotations.Test;

public class StringsPractice {

    /**
     * ABCDCBA - Yes
     * ABBA Yes
     * GEEKS No
     */

    @Test
    public static void palinDrom(){

        String text = "ABCDCBA";
        char[] ch = text.toCharArray();
        int i=0;
        int size= ch.length-1;
        boolean flag=true;
        while(i<size){
            if(ch[i]!=ch[size]){
                flag=false;
                break;
            }
            i++;
            size--;
        }
        if(flag) {
            System.out.println("Yes");
            System.out.println("this is new add");

        }else {
            System.out.println("No");
        }

        }
    }
