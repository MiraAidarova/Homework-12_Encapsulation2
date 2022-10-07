public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.getSpecies();
        fish.getName();
        fish.getFood();
        fish.getAction();
        fish.getHabitat();
        System.out.println("Morskoi");
        System.out.println("Окунь");
        System.out.println("Креветки");
        System.out.println("плаваеть");
        System.out.println("Озеро");
        fish.getSea();

        Parrot parrot = new Parrot();
        parrot.setName("Karudo");
        parrot.setAge("2 years old");
        parrot.setSpecies("Saying");
        System.out.print("Имя: " + parrot.getName()+",возрост: "+parrot.getAge()+",виды: " +parrot.getSpecies());
        System.out.println();

        Cat cat = new Cat();
        cat.setName("Alisa");
        cat.setAge("1 year old");
        cat.setKind("Abyssinian");
        System.out.print("Имя: "+cat.getName()+",возрост: "+cat.getAge()+",парода: "+cat.getKind());
        System.out.println();
        Dog dog = new Dog();
        dog.setName("Домик");
        dog.setAge("3 years old");
    }

}