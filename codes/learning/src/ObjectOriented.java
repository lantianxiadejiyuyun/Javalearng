public class ObjectOriented {

    public static void main(String[] args) {
        HeroList hero = new HeroList();
        hero.saveName("我是用户");
        hero.saveAge(20);
        hero.saveMap("这是地址存储");

        System.out.println(hero.getName() + " " + hero.getAge() + " " + hero.getMap());


        HeroList hero2 = new HeroList();
        hero2.saveName("这是第二个用户");
        hero2.saveAge(67);
        hero2.saveMap("山东省潍坊市奎文区华安东方明珠");
        System.out.println(hero2.getName() + " " + hero2.getAge() + " " + hero2.getMap());


        HeroList hero3 = new HeroList();
        hero3.saveName("这是第三个用户");
        hero3.saveAge(54);
        hero3.saveMap("山东省潍坊市奎文区华安东方明珠");
        System.out.println(hero3.getName() + " " + hero3.getAge() + " " + hero3.getMap());

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


    // 保存信息
    public void saveName(String name) {
        this.name = name;
    }

    public void saveAge(int age) {
        this.age = age;
    }

    public void saveMap(String map) {
        this.map = map;
    }
}