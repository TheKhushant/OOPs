public class singleInheritance {
    public static void main(String[] args) {
        Miya obj = new Miya();
        System.out.println("age of Base class : " + obj.Age);
        System.out.println("Name of  Derived class : " + obj.Name);
    }
}
class Danny{
    int Age = 38;
}
class Miya extends Danny{
    String Name= "Sharma";
}

