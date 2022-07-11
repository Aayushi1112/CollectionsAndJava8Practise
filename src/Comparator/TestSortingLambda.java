package Comparator;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class TestSortingLambda {
    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 110));
        result.add(new Developer("iris", new BigDecimal("170000"), 155));

        return result;

    }


    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
         //from java8 onwards a new feature is added to the list to sort the data hence we need not use collections.sort anymore

       listDevs.sort(new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        //corresponding lambda expression
        listDevs.sort(( o1, o2)->o1.getAge()-o2.getAge());
        listDevs.forEach((developer)->System.out.println(developer));
        listDevs.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
        listDevs.sort((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));

listDevs.removeIf(o->o.getAge()>90);
//listDevs.stream().map(o->o.getName()+o.getAge());

        Map<Integer, String> result1 = listDevs.stream().collect(
                Collectors.toMap(Developer::getAge,Developer::getName));
        List<String> collect =listDevs.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collect); //[mkyong, jack, lawrence]

        // result1.forEach(m,s->System.out.println(m.toString()));
        System.out.println("After Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

    }


}