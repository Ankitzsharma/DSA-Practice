package ArrayList;
import java.util.ArrayList;
public class arrList {
    public static void main(String[] args){
        // Creating an ArrayList of integers
        // and adding elements to it
        ArrayList<Integer> arList=new ArrayList<>();
        for(int i=0;i<=10;i++){
            arList.add(i);

        }
        System.out.println("ArrayList Is : "+arList);

        // Getting the size of the ArrayList
        System.out.println("Size Of Array List IS: "+arList.size());

        // Accessing elements in the ArrayList
        System.out.println("Index ELement Is: "+arList.get(8));

        // Removing an element from the ArrayList
        arList.remove(4);
        System.out.println("arrayList After Removing Element: "+arList);

        // Checking if an element exists in the ArrayList
        if(arList.contains(7)){
            System.out.println("7 Contains in array List");
        }else{
            System.out.println("7 Does not Contains in array List");
        }

        //setting a value at a specific index
        arList.set(4,100);
        System.out.println("ArrayList After Insertng New Value At Index 4: "+arList);

        // Iterating through the ArrayList using a for-each loop
        
        System.out.println("Iterating through ArrayList with for-each loop:");
        for(int num: arList){
            System.out.print(num +" ");
        }

        // Iterating through the ArrayList using a traditional for loop
        System.out.println("Iterating Through ArrayList WIth Traditional For Loop ");
        for(int i=0;i<arList.size();i++){
            System.out.print(arList.get(i)+" ");
        }

        // Clearing the ArrayList

        // arList.clear();
        System.out.println("ArrayList After Clearing: "+arList);

        // Checking if the ArrayList is empty
        if(arList.isEmpty()){
            System.out.println("ArrayList Is Empty");
        }else{
            System.out.println("ArrayList Is Not Empty");
        }

        // Converting the ArrayList to an array
        Integer[] arr= arList.toArray(new Integer[0]);
        System.out.println("ArrayList Converted To Array: ");
        for(int num: arr){
            System.out.print(num+" ");
        }


        // Finding the index of an element in the ArrayList
        int index=arList.indexOf(7);
        if(index != -1){
            System.out.println("Index of 7 in ArrayList:"+index);
        }else{
            System.out.println("7 Not Found in ArrayList");
        }

        // Sorting the ArrayList
        arList.sort(null);
        System.out.println("ArrayList After Soritng: "+arList);

        // Reversing the ArrayList
        ArrayList<Integer> reverseArList=new ArrayList<>();
        for(int i=arList.size()-1; i>=0; i--){
            reverseArList.add(arList.get(i));
        }
        System.out.println("Reversed ArrayList:"+reverseArList);



        // Checking if the ArrayList is equal to another ArrayList
        ArrayList<Integer> anotherArList= new ArrayList<>();
        for(int i=0;i<anotherArList.size();i++){
            anotherArList.add(i);
        }
        if(arList.equals(anotherArList)){
            System.out.println("ArrayList is equal to Another ArrayList");
        }else{
            System.out.println("ArrayLists Are Not Equal");
        }

        // Finding the maximum and minimum elements in the ArrayList
        int max= arList.get(0);
        int min= arList.get(0);
        for(int i=0; i<arList.size(); i++){
            if(arList.get(i) >max){
                max=arList.get(i);
            }else{
                min=arList.get(i);
            }
        }
        System.out.println("ArrayList Max ELem: "+max);

        System.out.println("ArrayList Min Elem: "+min);


        // Finding the sum of all elements in the ArrayList
        int sum=0;
        for(int i=0;i<arList.size();i++){
            sum+=arList.get(i);
        }
        System.out.println("Sum Of All Elements In ArrayList: "+sum);


        // Finding the average of all elements in the ArrayList
        int average=sum/arList.size();
        System.out.println("Average Of all Elems In ArrayList: "+ average);

        // Finding the median of the ArrayList
        arList.sort(null); // Ensure the list is sorted
        double median;
        if (arList.size() % 2 == 0) {
            median = (arList.get(arList.size() / 2 - 1) + arList.get(arList.size() / 2)) / 2.0;
        } else {
            median = arList.get(arList.size() / 2);
        }
        System.out.println("Median Of ArrayList: " + median);

        // Finding the mode of the ArrayList

        // int mode =arList.get(0);
        int maxCount=0;
        for(int i=0;i<arList.size();i++){
            int count=0;
            for(int j=0;j<arList.size();j++){
                if(arList.get(i)==arList.get(j)){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount=count;
                // mode=arList.get(i);
            }
        }
        System.out.println("mode is :"+ maxCount);


        // Finding the range of the ArrayList
        int range = max - min;  
        System.out.println("Range Of ArrayList: " + range);


        // Finding the frequency of a specific element in the ArrayList
        int elemToFind=5;
        int freq=0;
        for(int i=0;i<arList.size();i++){
            if(arList.get(i)==elemToFind){
                freq++;
            }
        }
        System.out.println("Frequency of ELemnt "+ elemToFind+ " in ArrayList:"+freq);

        

        

    }
}
