package exercise2_Person;

public class ProgramTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Trung", "12 Trần Hưng Đạo"
                        ,"java",2012, 200),
                new Student("Yến", "321 Phùng Hưng"
                        ,"php",2013,150),
                new Student("Thảo", "32 Pháp Vân"
                        ,"JS",2013,100)
        };

        Staff[] staff = {
                new Staff("Sơn", "45 Nguyễn Văn Cừ", "THPT Đoàn Thị Điểm", 150),
                new Staff("Tùng", "15 Trần Duy Hưng", "THPT Đoàn Thị Điểm", 150),
                new Staff("Vân", "77 Văn Phú", "THPT Đoàn Thị Điểm", 150),
        };

        System.out.println(students[0].toString());
        System.out.println(staff[0].toString());
    }
}
