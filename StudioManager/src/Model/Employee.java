package Model;

public class Employee extends Object{
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private String workPosition;
    private int salary;
    private int sumOfOrder;

    public Employee(int id, String name, String address, int phoneNumber, String workPosition, int salary, int sumOfOrder) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.workPosition = workPosition;
        this.salary = salary;
        this.sumOfOrder = sumOfOrder;
    }

    public int getSumOfOrder() {
        return sumOfOrder;
    }

    public void setSumOfOrder(int sumOfOrder) {
        this.sumOfOrder = sumOfOrder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
