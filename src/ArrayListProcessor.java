import java.lang.reflect.Array;
import java.util.ArrayList;

public final class ArrayListProcessor {

    public static ArrayList<Integer> destructiveFilter(ArrayList<Integer> a, Predicate p) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : a) {
            if (p.test(i)) {
                temp.add(i);
            }
        }

        // destructive part
        a.clear();
        a.addAll(temp);

        return a;

    }

    public static ArrayList<Integer> nondestructiveFilter(ArrayList<Integer> a, Predicate p) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : a) {
            if (p.test(i)) {
                temp.add(i);
            }
        }

        return temp;

    }

    public static ArrayList<Integer> nondestructiveFunctionApplyer(ArrayList<Integer> a, Function p) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : a) {
            temp.add(p.apply(i));
        }

        return temp;

    }

    public static ArrayList<Integer> destructiveFunctionApplyer(ArrayList<Integer> a, Function p) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : a) {
            temp.add(p.apply(i));
        }

        // destructive part
        a.clear();
        a.addAll(temp);

        return a;

    }

}
