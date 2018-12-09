import static java.util.stream.Collectors.toList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester {
  public static void main(String[] args) {
    Java8Tester java8Tester = new Java8Tester();
    Java8Tester tester = new Java8Tester();
    MathOperation addition = (a, b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;
    MathOperation multiplication = (int a, int b) -> {return a * b;};
    GreetingService greetingService = (x) -> System.out.println(x);
    System.out.println(java8Tester.operate(10, 5, addition));
    greetingService.sayMessage("Hello");


    String[] atp = {"Rafael Nadal", "Novak Djokovic",
        "Stanislas Wawrinka",
        "David Ferrer","Roger Federer",
        "Andy Murray","Tomas Berdych",
        "Juan Martin Del Potro"};
    List<String> players =  Arrays.asList(atp);
    players.forEach(player -> System.out.print(player + ","));
    players.forEach(System.out::print);
    Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));


    List<Person> javaProgrammers = new ArrayList<Person>() {
      {
        add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
        add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
        add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
        add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
        add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
        add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
        add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
        add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
        add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
        add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
      }
    };

    List<Person> phpProgrammers = new ArrayList<Person>() {
      {
        add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
        add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
        add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
        add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
        add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
        add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
        add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
        add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
        add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
        add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
      }
    };
    System.out.println();

    phpProgrammers.stream().filter(e -> e.getSalary() > 1400).forEach(e -> System.out.printf("%s, %s", e.getFirstName(), e.getLastName()));
    System.out.println();
    List<Person> sortedList = phpProgrammers.stream().sorted((p1, p2) -> (p1.getSalary() - p2.getSalary())).collect(toList());
    sortedList.forEach(p1 -> System.out.println(p1.getFirstName()));
    Person per1 = phpProgrammers.stream().min((p1, p2) -> (p1.getSalary() - p2.getSalary())).get();
    System.out.println(per1.getFirstName());

    String test1 = phpProgrammers.stream().map(Person::getFirstName).collect(Collectors.joining(";"));
    System.out.println(test1);
    int totalMoney = javaProgrammers.parallelStream().mapToInt(p1 -> p1.getSalary()).sum();
    System.out.println(totalMoney);

  }
  interface MathOperation {
    int operation(int a, int b);
  }
  interface GreetingService {
    void sayMessage(String message);
  }
  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }

}
