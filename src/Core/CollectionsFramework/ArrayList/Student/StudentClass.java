package Core.CollectionsFramework.ArrayList.Student;

public class StudentClass {
    private String name;
    private Integer id;
    private Double percent;

    public StudentClass(String name, Integer id, Double percent) {
        this.name = name;
        this.id = id;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "[ Name : "+this.name+" ,id : "+this.id+" ,Percent : "+this.percent+"]";
    }
}
