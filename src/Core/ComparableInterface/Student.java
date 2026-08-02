package Core.ComparableInterface;

public class Student implements Comparable<Student>{
    private String name;
    private Integer percent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    Student(String name, Integer percent) {
        this.name = name;
        this.percent = percent;
    }


    @Override
    public int compareTo(Student o) {
        return this.percent.compareTo(o.getPercent());
    }

    public static void main(String[] args) {
        Student s1 = new Student("A",98);
        Student s2 = new Student("B",99);

        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s1 ));
    }
}
