package Comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestLambdaFunctionsMap {
    public static void main(String[] args) {
        List<Developer> developrs = new ArrayList<Developer>();
        developrs.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        developrs.add(new Developer("alvin", new BigDecimal("80000"), 20));
        developrs.add(new Developer("jason", new BigDecimal("100000"), 10));
        developrs.add(new Developer("iris", new BigDecimal("170000"), 55));
//1.Without using java8
        List<DeveloperExtra> developerextra = new ArrayList<>();

        for (Developer dev : developrs) {

            DeveloperExtra obj = new DeveloperExtra();
            obj.setName(dev.getName());
            obj.setAge(dev.getAge());
            if ("mkyong".equals(dev.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }

            developerextra.add(obj);
        }
        developerextra.stream().forEach(System.out::println);

//2.Using java8
        List<DeveloperExtra> devs=developrs.stream().map(dev->
        {DeveloperExtra obj = new DeveloperExtra();
            obj.setName(dev.getName());
            obj.setAge(dev.getAge());
            if ("mkyong".equals(dev.getName())) {
                obj.setExtra("this field is for mkyong only!");
            }
            return obj;})
                .collect(Collectors.toList());

}}