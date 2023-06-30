import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main {

  static void printArrayList(ArrayList<Integer> arr, int noOfElements) {
    System.out.print("Array = ");

    for (int j = 0; j < noOfElements; j++) {
      int element = arr.get(j);

      System.out.print(element + " ");
    }

    System.out.println();
  }

  public static void Swap(int i, int j, ArrayList<Integer> arr) {
    int temp = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, temp);
  }

  public static void reverseArray(ArrayList<Integer> arr, int m) {
    for (int i = m + 1, j = arr.size() - 1; i < j; i++, j--) {
      // Swapping inside function
      // int temp = arr.get(i);
      // arr.set(i, arr.get(j));
      // arr.set(j, temp);

      // Swap(i, j, arr);

      Collections.swap(arr, i, j);
    }
  }

  // Method 2
  public static void reverseArray2(ArrayList<Integer> arr, int m) {

    ArrayList<Integer> ans = new ArrayList<>();

    int n = arr.size();

    for (int i = 0; i <= m; i++) {
      ans.add(arr.get(i));
    }

    for (int j = n - 1; j > m; j--) {
      ans.add(arr.get(j));
    }

    for (int i = 0; i < n; i++) {
      arr.set(i, ans.get(i));
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int T;
    System.out.print("Enter no of Testcases = ");
    T = scn.nextInt();

    System.out.println();

    for (int i = 0; i < T; i++) {
      int noOfElements, revFromPos;
      System.out.print(
          "Enter no of elements & postion from which you want to reverse array = ");
      noOfElements = scn.nextInt();
      revFromPos = scn.nextInt();

      System.out.println();

      ArrayList<Integer> arr = new ArrayList<>(noOfElements);

      System.out.print("Enter elements of array = ");
      for (int j = 0; j < noOfElements; j++) {
        int element = scn.nextInt();

        // arr.set(j, element);
        arr.add(element);
      }

      System.out.println();

      System.out.println("Array before Reverse by " + revFromPos + " position");
      printArrayList(arr, noOfElements);

      reverseArray(arr, revFromPos);
      // reverseArray2(arr, revFromPos);

      System.out.println("Array after Reverse by " + revFromPos + " position");
      printArrayList(arr, noOfElements);
    }

    scn.close();
  }
}
/*
 * https://www.codingninjas.com/studio/problems/reverse-the-array_1262298?
 * topList=love-babbar-dsa-sheet-problems
 */
