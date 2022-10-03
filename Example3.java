package ForEachLoop;

import java.util.ArrayList;

//traversing the collection elements
public class Example3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("name");
        list.add("city");
        list.add("state");
        list.add("country");

        for(String s:list){
            System.out.println(s);
        }
    }
}
