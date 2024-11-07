package duplicate;
public class OverridingBYInheritance{
    public static void main(String[] args) {
        Animal CAT = new Dog();
        CAT.sound();
        CAT.eat();
         
        Animal DOG = new Cat();
        DOG.sound();
        DOG.eat();
    }
}
class Animal{
    public void sound(){
        System.out.println("The animal makes a sound");
    }
    public void eat(){
        System.out.println("all animal eat food");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Barks Dog");
    }
    public void eat(){
        System.out.println("Dog eats Dog food");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meows Cat");
    }
    public void eat(){
        System.out.println("Cat eats Fish");
    }
}
