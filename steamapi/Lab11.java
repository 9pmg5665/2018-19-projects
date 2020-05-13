package lab11;

import java.util.stream.Stream;
public class Lab11
{
  static Stream<Integer> sequence;
    
 public static void main(String[] args)
 {
 sequence = Stream.iterate(1, n -> n+2);
 sequence.limit(10).skip(3).forEach(System.out::println);
 
 System.out.println();
 sequence = Stream.iterate(1, n -> n+2);
 sequence.skip(10).limit(3).forEach(System.out::println);
 }
}
