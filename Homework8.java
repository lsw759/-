import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("myId", "myPass");
        users.put("myId2", "myPass2");
        users.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!users.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim();

            if (users.get(id).equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }

            System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
        }

        sc.close();
    }
}