package javaapplication1;

import java.util.ArrayList;
import java.util.Random;

public class JavaApplication1 {

    public static void main(String[] args) {

    }
    
    private static void fillList(CircleList list){
        Random r = new Random();
        for(int i = 0; i< 100; i++){
            list.add(r.nextInt(100));
        }
    }
    
    
}
