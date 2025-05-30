import java.util.stream.Stream;
public class ArrayDemo2 {
    public static void main(String[] args) {

        String[] names = {"Edward", "Gavriel", "Christabel", "Princeton", "Myron"};

        System.out.println("==========Approach-1==========");
        for(int i = 0; i < names.length; i ++){
            System.out.println(names[i]);

        }

        System.out.println("==========Approach-2==========");
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("==========Approach-3==========");
        Stream.of(names).forEach(name -> System.out.println(name));

        System.out.println("==========Reverse Order==========");
        for(int i = names.length - 1; i >= 0; i --){
            System.out.println(names[i]);
        }
    }
}
