package Comparator;

import java.math.BigDecimal;

public class DeveloperExtra {
    String name;
    BigDecimal salary;
    int age;

    String extra;
    public DeveloperExtra() {

    }

    public DeveloperExtra(String name, BigDecimal salary, int age, String extra) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.extra = extra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "DeveloperExtra{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", extra='" + extra + '\'' +
                '}';
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }
}
