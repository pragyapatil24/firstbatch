import java.util.ArrayList;
import java.util.List;

public class Wrapper {
    public static void main (String[]args){
        int a=5;
        Integer aobj= Integer.valueOf(a) ;
        System.out.println(aobj );
        List <Integer> list = new ArrayList<Integer>() ;
        list.add( aobj  ) ;
        list.add (7);
        list.add(8);
        System.out.println(list);

    }

}
