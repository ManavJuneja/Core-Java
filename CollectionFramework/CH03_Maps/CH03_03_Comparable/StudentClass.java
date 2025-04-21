package CollectionFramework.CH03_Maps.CH03_03_Comparable;

public class StudentClass implements Comparable<StudentClass>{
    private String name;
    private double gpa;

    public StudentClass(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(StudentClass o) {
        return Double.compare(o.getGpa(),this.getGpa());
    }
}
