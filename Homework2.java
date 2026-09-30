import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phone;

    Student(int studentId, String name, String major, long phone) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    int getStudentId() { return studentId; }
    String getName() { return name; }
    String getMajor() { return major; }
    long getPhone() { return phone; }

    void setStudentId(int studentId) { this.studentId = studentId; }
    void setName(String name) { this.name = name; }
    void setMajor(String major) { this.major = major; }
    void setPhone(long phone) { this.phone = phone; }

    String getFormattedPhone() {
        String p = "0" + Long.toString(phone);
        if (p.length() == 11) {
            return p.substring(0, 3) + "-" + p.substring(3, 7) + "-" + p.substring(7);
        } else if (p.length() == 10) {
            return p.substring(0, 3) + "-" + p.substring(3, 6) + "-" + p.substring(6);
        }
        return p;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        final int COUNT = 3;
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[COUNT];

        for (int i = 0; i < COUNT; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String line = sc.nextLine().trim();
            String[] tokens = line.split("\\s+");

            int id = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            String major = tokens[2];
            long phone = Long.parseLong(tokens[3]);

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < COUNT; i++) {
            Student s = students[i];
            System.out.println((i + 1) + "번째 학생: " + s.getStudentId() + " "
                    + s.getName() + " " + s.getMajor() + " " + s.getFormattedPhone());
        }

        sc.close();
    }
}