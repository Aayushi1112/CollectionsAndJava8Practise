package java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String args[]){

        Stream<String> stream1 = Stream.generate(() -> {return "abc";});
        Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
       // stream2.forEach(System.out::println);
       // System.out.println("********************8");
        //stream2.forEach(System.out::println);
        LongStream is = Arrays.stream(new long[]{1,2,3,4});
        IntStream is2 = "abc".chars();
        is.forEach(System.out::println);
        is2.forEach(System.out::println);

        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> s.toUpperCase()
        ).collect(Collectors.toList()));


        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
      //  List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    //    System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]

        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
       // namesOriginalList.forEach(System.out::println);
//flat the stream from List<String> to String stream
        Stream<String> flatStream = namesOriginalList
                .flatMap(strList -> strList.stream());


        flatStream.forEach(System.out::println);


        List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        wordLengths.forEach(System.out::println);




    }

}
