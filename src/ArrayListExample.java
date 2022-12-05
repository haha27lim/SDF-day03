import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        System.out.println("Array List Demo");

        //Create an Array List object
        ArrayList<String> mylist = new ArrayList<String>();

        //Add items to it
        mylist.add("apples");
        mylist.add("orange");

        // Loop over and print the items
        for (String item: mylist) {
            System.out.println("item -> " + item);
        }
        
        //Remove "apples" from this list
        mylist.remove("apples");

        //Print the no. of item inside the list
        int count = mylist.size();
        System.out.println(count);
    }
}