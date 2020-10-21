import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("один");
        states.add("три");
        states.add("четыре");
        states.add("пять");
        states.add(1, "ноль");
        System.out.print("\n");
        System.out.println(states.get(1));
        states.set(1, "два");

        System.out.print("\n\n\n");

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        System.out.print("\n\n\n");

        if(states.contains("один")){

            System.out.println("Список содержит чисто один");
        }
        System.out.print("\n\n\n");
        // удалим несколько объектов
        states.remove("пять");
        states.remove(0);
        for(String state : states){

            System.out.println(state);
        }

        System.out.print("\n\n\n");

        ArrayList<String> states2 = new ArrayList(states.subList(2,3));
        states2.addAll(states.subList(2,3));
        for(String state : states){

            System.out.println(state);
        }
        System.out.print("\n\n\n");
        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }
}