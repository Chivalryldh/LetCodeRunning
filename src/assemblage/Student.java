package assemblage;
/**
* @author liudaohao
* @version 创建时间：2017年3月12日 下午1:27:34
*/
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student() {
        super();
    }
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        int num1 = this.getAge()-o.getAge();
        int num2 = num1==0?this.getName().compareTo(o.getName()):num1;
        return num2;
    }
}