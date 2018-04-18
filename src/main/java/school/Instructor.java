package school;

public class Instructor extends Person implements Teacher {
    public Instructor(String name) {
        super(name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (int i = 0; i < learners.length; i++) learners[i].learn(numberOfHours);
    }

    @Override
    public String toString() {
        return "Instructor{} " + super.toString();
    }
}
