package employeestuff;

abstract public class Employee {
    protected String name;
    protected  Integer age;
    protected Character gender;

    public Employee(String name, Integer age, Character gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Settters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Character getGender() {
        return gender;
    }


    abstract public Integer computeSalary(Integer baseSalary, Integer days);
}
