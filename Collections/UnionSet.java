import java.util.HashSet;
import java.util.Set;

public class UnionSet {
    public static void main(String[] args) {
        // Set 1
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        // Set 2
        Set<String> set2 = new HashSet<>();
        set2.add("cherry");
        // Creating union set
        Set<String> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        System.out.println("Union Set: " + unionSet);
        // Checking whether all elements of set1 are present in unionSet
        boolean result = unionSet.containsAll(set1);
        System.out.println("Are all elements of Set 1 present in Union Set? " + result);
    }
}
