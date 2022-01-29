package employeestuff;

public class BoardMember extends Employee{
    public BoardMember(String name, Integer age, Character gender) {
        super(name, age, gender);
    }

    @Override
    public Integer computeSalary(Integer baseSalary, Integer days) {
        return baseSalary + (days*35) + (this.age*100);
    }
}
