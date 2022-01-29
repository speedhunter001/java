package employeestuff;

public class Worker extends Employee {
    public Worker(String name, Integer age, Character gender) {
        super(name, age, gender);
    }

    @Override
    public Integer computeSalary(Integer baseSalary, Integer days) {
        return baseSalary + (days*45) + (this.age*50);
    }
}
