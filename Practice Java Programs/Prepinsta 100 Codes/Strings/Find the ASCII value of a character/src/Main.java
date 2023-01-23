public class Main {

    static int getAscii(char ch){

        return (int)ch;
    }

    public static void main(String[] args) {

        char ch1 = 'a', ch2= '7', ch3='A', ch4='!';

        System.out.println(getAscii(ch1));
        System.out.println(getAscii(ch2));
        System.out.println(getAscii(ch3));
        System.out.println(getAscii(ch4));
    }
}