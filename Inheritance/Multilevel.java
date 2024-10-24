public class Multilevel {
    public static void main(String[] args) {
        Khali obj1 = new Khali();

        System.out.println("using class of child we can access base and super Parent class ");
        System.out.println("Value of Super Parent class \t\t: " + obj1.getDanny());
        System.out.println("Value of Parent class \t: " + obj1.getRonaldo());
        System.out.println("Value of Base class : " + obj1.getKhali());

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
class Khali extends Ronaldo{
    public float getKhali(){
        return 6.3f;
    }

}

