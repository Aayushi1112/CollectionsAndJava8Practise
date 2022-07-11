import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FunctionalInter2
{
    public static void main(String args[])
    {
        List<Integer> numbs=new ArrayList<>();
        numbs.add(1);
        numbs.add(2);
        List number = Arrays.asList(2,3,4,5);
        List square = numbs.stream().map(x->x*x).collect(Collectors.toList());
        List<String > names=new ArrayList<>();
        names.add("Reflection");
        names.add("Collection");
        names.add("Stream");
        List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        List<Integer> numbs1=new ArrayList<>();
        numbs1.add(1);
        numbs1.add(2);
        int even = numbs1.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
         }
}