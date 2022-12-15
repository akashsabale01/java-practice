public class Main {
    public static void main(String[] args) {

        // all content of args is String only if you pass int then it take it as String

        for(String ele: args){
            System.out.println(ele);
        }

//        for(int i=0; i< args.length; i++){
//            System.out.println(args[i]);
//        }
    }
}

/*

--- OUTPUT---

\Command Line Arguments\src>javac Main.java

\Command Line Arguments\src>java Main My name is akash
My
name
is
akash

























* */