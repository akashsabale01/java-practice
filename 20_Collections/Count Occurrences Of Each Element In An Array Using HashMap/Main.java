import java.util.*;

class Main {
    public static void main(String[] args) {
      ArrayList<Integer> arr1 = new ArrayList<Integer>(List.of(1,2,2,2,2,3,3,3,4,4,5,5,5,5));
      
    //   ArrayList<Integer> arr2 = new ArrayList<Integer>();
      
      HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
      
      // Adding Array Elements in Hashmap
      for(int ele: arr1){
          if(elementCountMap.containsKey(ele)){
            // if key is present already
            elementCountMap.put(ele, elementCountMap.get(ele)+1);
          }
          else{
             // if key is not present 
             elementCountMap.put(ele, 1);
          }
      }
    
       System.out.println("array = "+ arr1);

       System.out.println("elementCountMap contains :");
       for(int key: elementCountMap.keySet()){
        System.out.println(key +" : " +elementCountMap.get(key));
       }
       
    }
}

// https://javaconceptoftheday.com/count-occurrences-of-each-element-in-an-array/