public class encapsulation {
    public static void main(String[] args) {
        Shizuka obj = new Shizuka();

        System.out.println("name (before assigning value from main : )"+obj.getName());
        obj.setName("Khushat");
        System.out.println("name (After assigning value from main : )"+obj.getName());

    }
}
class Shizuka{
    private String Name = "Gunu";
    String getName(){
        return Name;
    }
    void setName(String Name){
        this.Name = Name;
    }
}
