package Core.NestesClasses.ExComparableAndComparator.Student;

public class Student implements Comparable<Student>{

    private Integer id;
    private String name;
    private Double percent;
    private Integer age;

    Student(Integer id, String name, Double percent, Integer age) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return this.id.compareTo(s.getId());
    }

    @Override
    public String toString() {
        return "Student [id : "+id+" ,Name : "+name+" ,Percent : "+percent+" ,Age: "+age+" ]";
    }
}
