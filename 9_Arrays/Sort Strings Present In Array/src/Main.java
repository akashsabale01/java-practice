import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"java", "cpp", "python", "ruby", "php", "go", "ada", "basic", "javascript"};

        Arrays.sort(arr);

        System.out.print("\nArr = ");
        for(String str: arr)
            System.out.print(str + " ");

        System.out.println();
    }
}