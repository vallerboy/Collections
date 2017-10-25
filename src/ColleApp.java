import java.util.*;

public class ColleApp {
    public static void main(String[] args) {
        List<String> stringArrayList = new LinkedList<>();

        stringArrayList.add("Wszystko ok");
        stringArrayList.add("Co dobrego?");
        stringArrayList.remove("test");
        stringArrayList.add(1, "hello!");


        HashSet<String> set = new HashSet<>();

        set.add("d");
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("a");
        set.add("@");
        set.add("zimie");
        System.out.println(set);


        Random random = new Random();
        /// lotto
        Set<Integer> set1 = new HashSet<>();
        while (set1.size() != 6){
            set1.add(random.nextInt(49) + 1);
        }
        System.out.println(set1.toString());

        //zuza
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i <= 14; i++){
            set2.add(random.nextInt(100)%37);
        }
        System.out.println(set2);

    }


}
