package exercise2_Person;

public class Student extends Person {
    private String program = "java";
    private int year = 2012;
    private double free = 200;

    public Student(String name, String address, String program, int year, double free) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.free = free;
    }

    public Student(){}

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFree() {
        return free;
    }

    public void setFree(double free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return " Đối tượng sinh viên đã được tạo từ lớp cha "+super.toString();
    }
}
