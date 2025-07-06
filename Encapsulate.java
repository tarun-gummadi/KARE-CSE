
public class Encapsulate {

    public static void main(String[] args) {
        encap en = new encap();
        int age = 26;
        String name = "K.Tejeswar Reddy";
        en.getName();
    }
}

class encap {

    public int age;
    public String name;

    public void SetName(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void getName() {
        System.out.println(name + " " + age);
    }
}
