package school;

public class Person {
    static long idCounter = 0;

    private final long id;
    private String name;

    public Person(String name) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
    }

    public long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
