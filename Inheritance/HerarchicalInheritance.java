public class singleHaiInheritance {
    public static void main(String[] args) {
        Ronaldo obj = new Ronaldo();
        Khali obj1 = new Khali();

        System.out.println("Age of  Base class \t\t: " + obj.getDanny());
        System.out.println("Name of  Derived class \t: " + obj.getRonaldo());

        System.out.println("Age of  Base class \t\t: " + obj1.getDanny());
        System.out.println("height of  Derived class : " + obj1.getKhali());

    }
}
class Danny{
    public int getDanny(){
        return 38;
    }
}
class Ronaldo extends Danny{
    public String getRonaldo(){
        return "First Name = Khushant";
    }

}
class Khali extends Danny{
    public float getKhali(){
        return 6.3f;
    }

}

