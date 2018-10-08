package exercise2_Person;

public class Person {
    private String name = "Perter";
    private String address = "Homeless";

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {

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

    @Override
    public String toString(){
        return "Đối tượng người được tạo với tên là "
                +getName()+" và địa chỉ là "
                +getAddress();
    }
}
