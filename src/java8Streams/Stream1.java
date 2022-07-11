package java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String args[]){

        //1. first obtain a stream from an existing array:
          Employy[] arrayEmp={
                new Employy("Ram",23),
                new Employy("Rajat",89),
                new Employy("sharat",67)
        };
          Stream.of(arrayEmp);

          //2.Stream from a list
        List<Employy> empList= Arrays.asList(arrayEmp);
        empList.stream();

        //3.we can create a stream from individual objects using Stream.of():
        Stream.of(arrayEmp[0],arrayEmp[1]);
        List numbers=Arrays.asList(2,3,4,6);
        List<Integer> a=new ArrayList<>(numbers);

      a.stream().reduce(0,(ans,i)->ans+i);



        //4.Using stream builder
        Stream.Builder<Employy> empStreamBuilder = Stream.builder();

        empStreamBuilder.accept(arrayEmp[0]);
        empStreamBuilder.accept(arrayEmp[1]);
        empStreamBuilder.accept(arrayEmp[2]);

        Stream<Employy> empStream = empStreamBuilder.build();


        List numbers1=Arrays.asList(1,2,3,4);
        List<Integer> number=new ArrayList(numbers1);
        int sum = number.stream().reduce(0, Integer::sum);
        System.out.println("sum:"+sum);
        Optional<Integer> max = number.stream().reduce(Integer::max);
        System.out.println(max.get());


    }

}
