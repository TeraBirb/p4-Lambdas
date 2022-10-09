import java.util.ArrayList;
import java.util.Random;

public class Tester {

    public static void main(String[] args) {

        // initializing stuff
        Random rng = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(rng.nextInt(1, 1001));
        }

        // FILTER TESTS
        // filter implementation
        Predicate filter = (int li) -> (li > 500);  // remove all elements < 500
        System.out.println("Filter to remove all elements less than 500");

        // nondestructiveFilter test1
        System.out.println("list before nondestructiveFilter: " + list);
        System.out.println("temp list after nondestructiveFilter: " + ArrayListProcessor.nondestructiveFilter(list, filter));
        System.out.println("list after nondestructiveFilter: " + list);

        // destructiveFilter test1
        System.out.println("list before destructiveFilter: " + list);
        ArrayListProcessor.destructiveFilter(list, filter);
        System.out.println("list after destructiveFilter: " + list);
        System.out.println("----------");

        // reset arraylist of 10 random elements (1-1000)
        for (int i = 0; i < 10; i++) {
            list.add(rng.nextInt(1, 1001));
        }

        // filter implementation
        filter = (int li) -> (li % 2 != 0);  // remove all even elements
        System.out.println("Filter to remove all even elements");

        // nondestructiveFilter test2
        System.out.println("list before nondestructiveFilter: " + list);
        System.out.println("temp list after nondestructiveFilter: " + ArrayListProcessor.nondestructiveFilter(list, filter));
        System.out.println("list after nondestructiveFilter: " + list);

        // destructiveFilter test2
        System.out.println("list before destructiveFilter: " + list);
        ArrayListProcessor.destructiveFilter(list, filter);
        System.out.println("list after destructiveFilter: " + list);
        System.out.println("----------");

        // FUNCTIONAPPLYER TESTS
        // function implementation
        Function func = (int i) -> (i * 2); // multiply each element by 2
        System.out.println("Function to multiply each element by 2");

        // nondestructiveFunctionApplyer test1
        System.out.println("list before nondestructiveFunctionApplyer: " + list);
        System.out.println("temp list after nondestructiveFunctionApplyer: " + ArrayListProcessor.nondestructiveFunctionApplyer(list, func));
        System.out.println("list after nondestructiveFunctionApplyer: " + list);

        // destructiveFunctionApplyer test1
        System.out.println("list before destructiveFunctionApplyer: " + list);
        ArrayListProcessor.destructiveFunctionApplyer(list, func);
        System.out.println("list after destructiveFunctionApplyer: " + list);
        System.out.println("----------");

        // reset arraylist of 10 random elements (1-1000)
        for (int i = 0; i < 10; i++) {
            list.add(rng.nextInt(1, 1001));
        }

        // function implementation
        func = (int i) -> (i + 1); // increment each element
        System.out.println("Function to increment each element");

        // nondestructiveFunctionApplyer test2
        System.out.println("list before nondestructiveFunctionApplyer: " + list);
        System.out.println("temp list after nondestructiveFunctionApplyer: " + ArrayListProcessor.nondestructiveFunctionApplyer(list, func));
        System.out.println("list after nondestructiveFunctionApplyer: " + list);

        // destructiveFunctionApplyer test2
        System.out.println("list before destructiveFunctionApplyer: " + list);
        ArrayListProcessor.destructiveFunctionApplyer(list, func);
        System.out.println("list after destructiveFunctionApplyer: " + list);
        System.out.println("----------");


    }

}
