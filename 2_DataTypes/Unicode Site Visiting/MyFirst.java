import java.util.*;
import java.lang.*;

class MyFirst{

    public static void main(String[] args){

//        char ch = 0x03C8;
//        System.out.println(ch);

        // Devanagari
        for(char x=0x0900; x<=0x097F; x++)
            System.out.print(x + " ");

        System.out.println();

        for(char x=0x0C80; x<=0x0CEF; x++)
            System.out.print(x + " ");
    }
}