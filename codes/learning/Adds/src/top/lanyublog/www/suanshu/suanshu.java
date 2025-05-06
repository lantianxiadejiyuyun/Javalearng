package top.lanyublog.www.suanshu;

public class suanshu {

    public static void main(String[] args) {
    }

    public static String suanshu() {
        String sc = "abc";

        for (int i = 0; i < sc.length(); i++) {
            char item = sc.charAt(i);
            System.out.println(item);
        }

        return "dawdawdwd";
    }

    public static void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println(suanshu());
        }
    }
}

