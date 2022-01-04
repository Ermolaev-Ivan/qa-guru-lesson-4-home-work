public class Main {

    public static void main(String[] args){
        Parrot kesha = new Parrot();
        Parrot asya = new Parrot();

        kesha.name = "Кеша";
        kesha.age = 6;
        kesha.gender = true;

        asya.name = "Ася";
        asya.age = 5;
        asya.gender = false;

        kesha.getAge();
        kesha.getName();
        kesha.say("Ася хорошая");
        kesha.getGender();

        asya.getAge();
        asya.getName();
        asya.say("Кеша умный");
        asya.getGender();
    }
}
