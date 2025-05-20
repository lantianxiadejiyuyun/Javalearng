public class ObjectOriented {

    public static void main(String[] args) {
        HeroList hero = new HeroList();
        hero.saveName("这是第三个用户");
        hero.saveAge(54);
        hero.saveMap("山东省潍坊市奎文区华安东方明珠");
        hero.print();

        String printData =  hero.getPrintName("山本！","我日你仙人！");
        int numberData =  hero.getPrintName(1,114513);

        System.out.println(printData);
        System.out.println(numberData);
    }
}
// 定义类对象
class HeroList {
    private String name;
    private int age;
    private String map;

    // 获取信息
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getMap(){
        return map;
    }


    // 保存信息 方法使用
    public void saveName(String name) {
        this.name = name;
    }

    public void saveAge(int age) {
        this.age = age;
    }

    public void saveMap(String map) {
        this.map = map;
    }

    public void print() {
        System.out.println("当前地址:" + this.map);
    }

    // 方法重载
    public String getPrintName(String a, String b) {

        String printName = "";
        printName += a;
        printName += b;
        return printName;
    }

    public int getPrintName(int a, int b) {

        int printName = 0;
        printName = a + b;
        return printName;
    }
}