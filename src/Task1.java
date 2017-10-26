import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("hello");
        stringList.add("hello");
        stringList.add("co tam?");
        stringList.add("ok");
        System.out.println(hasDoubles(stringList));
    }

    public static boolean hasDoubles(List<String> list){
        Set<String> hashSet = new HashSet<>(list);
        return list.size() < hashSet.size();
    }
}
