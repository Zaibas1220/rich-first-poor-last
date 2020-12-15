public class Person implements Comparable<Person> {
    private String name;
    private int salary;

    public Person (String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person: " + this.name +
                ". Salary: " + this.salary +
                "\n";
    }

    @Override
    public int compareTo(Person person) {
        return this.salary - person.getSalary();
    }
}
