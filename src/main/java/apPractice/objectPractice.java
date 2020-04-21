package apPractice;

import java.util.ArrayList;

public class objectPractice {
    static String openDel = "(";

    public static void main(String[] args) {
        //reference vs value
        int var = 9;
        System.out.println(var);// primitive type varibale is just value

        int[] arr = {1,2,3,4};
        increase0ne(arr);
        System.out.println(arr[0]); // hashcode, memory address, reference

        Student stu = new Student(12,"Tom");
        System.out.println(stu); //name of referenced type object is a memory address, reference

      /*  int [] arr = {1,2,3,4,5,6}; // -> {2,3,4,5,6,7}
        for(int item : arr){
            item ++;
        }

        for(int item : arr){
            System.out.println(item);
        }
        //for each loop is passing by value instead of reference*/
    }
    public static void increase0ne(int[] array){
        array[0]++;
    }

}


