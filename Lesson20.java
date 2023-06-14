public class Lesson20 {
    public static void main(String[] args) {
        People people1 = new People();


    }

}
class People {

    private String name;
    private int age;


    public People(){
        this.name = "Какое-то nаme";
        this.age = 0;


    }
    public People(String name){
        this.name = name;

    }
     People(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Привет из 3 конструктора");

    }
    public void setName(String name ){this.name = name;}
    public void setAge(int age){this.age = age;}


}
