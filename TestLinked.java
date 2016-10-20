import java.util.*;
public class TestLinkedList{
    public static void main(String[] args){
        LinkedList<Integer> il = new LinkedList<>();//il=null
        il.add(5);//il =>5
        il.add(19);//il=>5=>19
        il.add(26);
        il.add(1,35);
        System.out.println(il);
        System.out.println(il.remove());
        System.out.println(il);
    }

}