import java.util.*;

public class Dupplicate {
    public static void main(String args[]) {
        Set s = new HashSet();
        for (int i=0; i<args.length; i++)
            if (!s.add(args[i]))
                System.out.println("Dupplicat: "+args[i]);
        System.out.println(s.size()+" cuvinte distincte: "+s);
    }
}