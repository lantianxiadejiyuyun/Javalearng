
public class Main {
    public static void main(String[] args) {
        String Name = "Hello, World!";

        for (int i = 0; i < Name.length(); i++) {
            System.out.println(Name.charAt(i));
        }

        functionPrint("Hello, World！");
        String data =  returnData("ReturnData");

        System.out.println(data);
    }

    // 打印方法 关键字
    // public static void 方法名 (传入值) 需要加入需要传入的类型 类似 TypeScript
    public static void functionPrint(String name) {

        System.out.println(name);
    }

    // 处理返回
    // public static 返回值类型 方法名 （输入数据类型 传入值）
    public static String returnData (String name) {

        return name;
    }
}