public class Parrot {
    String name;
    int age;
    boolean gender;

    public void getGender() {
        if (gender) System.out.println(name + " - мальчик");
        else System.out.println(name + " - девочка");
    }

    public void getName() {
        System.out.println("Попугая зовут - " + name);
    }

    public void getAge() {
        System.out.println("Попугаю " + name +  " " + age + " лет");
    }

    public void say(String str){
        System.out.println(name + " говорит - " + str);
    }
}
