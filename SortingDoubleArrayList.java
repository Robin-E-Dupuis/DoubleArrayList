
import java.util.ArrayList;

/**
 *
 * @author Robin Dupuis
 */
public class SortingDoubleArrayList {

    public static void sort(ArrayList<Double> list, boolean asc) {
         if (asc == true) {
            for (int i = 0; i < list.size() - 1; ++i) {
                for (int j = i + 1; j < list.size(); ++j) {
                    if (list.get(i) > list.get(j)) {
                       Double temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);

                    }
                }
            }
        } else {
            for (int i = 0; i < list.size() - 1; ++i) {
                for (int j = i + 1; j < list.size(); ++j) {
                    if (list.get(i) < list.get(j)) {
                        Double temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);

                    }
                }
            }
        }
    }

    public static void shuffle(ArrayList<Double> list) {
           for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) ((Math.random() * list.size()));
            double temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Double>numbers = new ArrayList<>();
        numbers.add(20.5);
        numbers.add(0.5);
        numbers.add(2.5);
        numbers.add(10.75);
        numbers.add(0.56);
        numbers.add(3.165);
        numbers.add(4.78563);
        
        sort(numbers,true);
        System.out.println("List sorted in ascending order");
        System.out.println(numbers);
        System.out.println("List sorted in decsending order");
        sort(numbers,false);
        System.out.println(numbers);
        System.out.println("Shuffled arrayList");
        shuffle(numbers);
        System.out.println(numbers);
        
        
    }
}
