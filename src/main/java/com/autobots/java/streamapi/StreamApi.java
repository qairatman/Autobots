import com.autobots.java.streamapi.Employee;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public static void main(String[] args) {
    List<String> names = List.of("Anna", "Bob", "Alex", "Bella", "Andrew");

//       for (String name:names){
//         if (name.startsWith("A"))
//                System.out.println(name.toUpperCase());
    //  }

//       List<String> result= names.stream()
//               .filter(name -> name.startsWith("A"))
//               .map(String::toUpperCase)
//               .sorted()
//                       .collect(Collectors.toList());
//
//        System.out.println(result);


//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
//        int r1 = 0;
//        for (int num : numbers) {
//            r1 += num;
//        }
//        System.out.println(r1);

    //запрашиваем сумму всех чисел
//        int totalSum = numbers.stream()
//                .mapToInt(num -> num)
//                .sum();
//        System.out.println(totalSum);
//
//        //запрашиваем сколько всего элементов
//        int totalElemennts = (int) numbers.stream()
//                .count();
//        System.out.println(totalElemennts);
//
//        //запрашиваем самое минимальное число
//        numbers.stream()
//                .min(Integer::compareTo)
//                .ifPresent(System.out::println);//двоеточие

    List<String> list = List.of("one", "two", "three", "Hello", "four", "five");
//запрашиваем слово больше трех букв (three)
    list.stream()
            .filter(s -> s.length() > 3)
            .findFirst()
            .ifPresent(System.out::println);


List<Employee> employees = List.of(
        new Employee(1, "Alice", 28, 3000, "IT"),
        new Employee(2, "Bob", 35, 4000, "HR"),
        new Employee(3, "Charlie", 40, 5000, "Finance"),
        new Employee(4, "David", 25, 3500, "Marketing"),
        new Employee(5, "Frank", 45, 6000, "HR"),
        new Employee(6, "Grace", 32, 4100, "IT"),
        new Employee(7, "Henry", 32, 3900, "Marketing"),
        new Employee(8, "Isabel", 38, 4500, "IT"),
        new Employee(9, "Jack", 27, 3600, "HR"),
        new Employee(1, "Eva", 30, 4200, "IT")

);
List<Employee> itEmpioyees = employees.stream()
        .filter(s -> s.getDepardment().equals("IT"))
        .collect(Collectors.toList());


    System.out.println(itEmpioyees);
List<Employee> itEmpioyees2=new ArrayList<>();













}