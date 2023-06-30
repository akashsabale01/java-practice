import java.util.*;

public class Main {

    // static boolean find(ArrayList<Integer> arr, int ele){

    // for(int i=0; i<arr.size(); i++){
    // if(arr.get(i) == ele)
    // return true;
    // }

    // return false;
    // }

    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {

        // Method 1 - Brute Force

        // ArrayList<Integer> common = new ArrayList<Integer>();

        // for(int i=0; i<sz; i++){
        // int ele = arr1.get(i);

        // if(find(arr2, ele) == true){
        // common.add(ele);
        // }
        // }

        // ArrayList<Integer> ans = new ArrayList<Integer>(2);

        // int noOfCommonEle = common.size() ;
        // int noOfDistinctEle = n + m - noOfCommonEle;

        // ans.add(noOfCommonEle);
        // ans.add(noOfDistinctEle);

        // return ans;

        // Method 2 - Using Pointers, same as merge 2 sorted arrays

        // ArrayList<Integer> distinctEle = new ArrayList<Integer>();
        // ArrayList<Integer> commonEle = new ArrayList<Integer>();

        // Collections.sort(arr1);
        // Collections.sort(arr2);

        // int i=0, j=0;

        // while(i<n && j<m){
        // if(arr1.get(i) < arr2.get(j)){
        // distinctEle.add(arr1.get(i));
        // i++;
        // }
        // else if(arr1.get(i) > arr2.get(j)){
        // distinctEle.add(arr2.get(j));
        // j++;
        // }
        // else{
        // // elements are common
        // distinctEle.add(arr1.get(i));
        // commonEle.add(arr1.get(i));
        // i++;
        // j++;
        // }
        // }

        // // add remaining ele
        // while(i<n){
        // distinctEle.add(arr1.get(i));
        // i++;
        // }

        // while(j<m){
        // distinctEle.add(arr2.get(j));
        // j++;
        // }

        // ArrayList<Integer> ans = new ArrayList<Integer>(2);

        // int noOfCommonEle = commonEle.size() ;
        // int noOfDistinctEle = distinctEle.size();

        // ans.add(noOfCommonEle);
        // ans.add(noOfDistinctEle);

        // return ans;

        // Method 3 - default binarySearch() method for finding if array contains given
        // element

        // Collections.sort(arr1);
        // Collections.sort(arr2);

        // int noOfCommonEle = 0;

        // for(int i=0; i<n; i++){
        // int ele = arr1.get(i);

        // if(Collections.binarySearch(arr2, ele) >=0){
        // noOfCommonEle++;
        // }

        // }

        // ArrayList<Integer> ans = new ArrayList<Integer>(2);

        // int noOfDistinctEle = n + m - noOfCommonEle;

        // ans.add(noOfCommonEle);
        // ans.add(noOfDistinctEle);

        // return ans;

        // Method 4 - Using HashMap

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        int noOfCommonEle = 0;

        for (int i = 0; i < n; i++) {
            hmap.put(arr1.get(i), 1);
        }

        for (int j = 0; j < m; j++) {
            if (hmap.containsKey(arr2.get(j))) {
                noOfCommonEle++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<Integer>(2);

        int noOfDistinctEle = n + m - noOfCommonEle;

        ans.add(noOfCommonEle);
        ans.add(noOfDistinctEle);

        return ans;

    }

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);

        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);

        int n = arr1.size();
        int m = arr2.size();

        ArrayList<Integer> res = findSimilarity(arr1, arr2, n, m);

        for (int ele : res)
            System.out.print(ele + " ");

    }
}

/**
 * 
 * https://www.codingninjas.com/studio/problems/find-similarities-between-two-arrays_1229070?topList=love-babbar-dsa-sheet-problems&leftPanelTab=0
 * 
 * "you-have-been-given-two-arrays-list-arr1-and-arr2-consisting-of-n-and-m-integers-respectively-your-task-is-to-return-the-number-of-elements-common-to-arr1-and-arr2-and-the-number-of-elements-in-the-union-of-arr1-and-arr2"
 * You have been given two arrays/list ‘ARR1’ and ‘ARR2’ consisting of ‘N’ and
 * ‘M’
 * integers respectively. Your task is to return the number of elements common
 * to ‘ARR1’ and ‘ARR2’ and the number of elements in the union of ‘ARR1’ and
 * ‘ARR2’.
 * 
 * 
 * 
 */