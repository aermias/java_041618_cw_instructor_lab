package school;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Amanuel");
        Person claude = new Person("Claude");
        Person isaiah = new Person("Isaiah");
        Person dwayne = new Person("Dwayne");
        Person zamir = new Person("Zamir");
        Person jojo = new Person("Jojo");
        Person jermaine = new Person("Jermaine");

        People javaClass = new People();

        javaClass.add(me);
        javaClass.add(claude);
        javaClass.add(isaiah);
        javaClass.add(dwayne);
        javaClass.add(zamir);
        javaClass.add(jojo);
        javaClass.add(jermaine);

        javaClass.remove(claude);

        System.out.println(javaClass.findById(1));
    }
}
