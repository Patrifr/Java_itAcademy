package SPRINT1.TASCA_3.N1.Exercici2_Integer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<Integer>();
        List<Integer> reverseList = new ArrayList<Integer>();

        integerList1.add(10);
        integerList1.add(20);
        integerList1.add(40);
        integerList1.add(60);

        ListIterator<Integer> integerListIterator = integerList1.listIterator();

        while(integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }
        while(integerListIterator.hasPrevious()){
            reverseList.add(integerListIterator.previous());
        }
        for(Integer integer : reverseList){
            System.out.println(integer);
        }
    }
}
