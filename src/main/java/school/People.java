package school;

import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList;

    public People() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person) { personList.add(person); }

    public Person findById(long id) {
        for (Person p : personList) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void remove(Person person) { personList.remove(person); }

    public void remove(long id) {
        for (Person p : personList) {
            if (p.getId() == id) personList.remove(p);
        }
    }

    public int getCount() { return  personList.size(); }

    public Person[] getArray() {
        Person[] people = new Person[personList.size()];
        return personList.toArray(people);
    }

    public void removeAll() { personList.removeAll(personList); }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }
}
