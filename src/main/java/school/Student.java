package school;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(String name) {
        super(name);
        this.totalStudyTime = 0;
    }

    public void learn(double numberOfHours) { this.totalStudyTime += numberOfHours; }

    public double getTotalStudyTime() { return this.totalStudyTime; }

    @Override
    public String toString() {
        return "Student{" +
                "totalStudyTime=" + totalStudyTime +
                "} " + super.toString();
    }
}
