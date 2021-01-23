import java.util.*;
import java.util.function.Predicate;
import java.lang.reflect.*;

/**
 * Created by natna on 10/30/2018.
 */
public class ClassWithItems<T> {

/*
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ClassWithItems<Integer> cwi = new ClassWithItems<Integer>(integers);
        cwi.WriteTheNumberOfItemsThatSatisfyTheFilterToTheConsole(j -> j > 7);

    }

    public T[] Items;


    public ClassWithItems(Iterable<T> items) {

        int size = 0;
        if (items instanceof Collection) {
            size = ((Collection<T>) items).size();
        }
        Items = (T[]) Array.newInstance(getClass(), size);
        setItems(Items);
        // Store the items in the property Items
    }

    public void WriteTheNumberOfItemsThatSatisfyTheFilterToTheConsole(Predicate <T> condition) {
        // Find out how many items that satisfy (pass) the filter and write the number to the console
        int count = 0;
        for (T item : Items) {
            if (condition.test(item)) {
                count++;
            }
        }
        System.out.println("Number of items that satisfy the condition is:" + count);

    }


    public T[] getItems() {

        return items;
    }

    private void setItems(T[] item) {

        items = item;
    }*/
}


