package exe01;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Matheus","MPasti");
        Forum f1 = new Forum(2,"GitHub", "https://github.com/MPasti");
        f1.addMessage(1, "Boa noite", p1);
        System.out.println(f1.toString());
    }
}