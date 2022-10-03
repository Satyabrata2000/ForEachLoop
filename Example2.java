package ForEachLoop;

public class Example2 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int total = 0;
        for(int i:arr){
            total = total+i;
        }
        System.out.println(total);
    }
}
