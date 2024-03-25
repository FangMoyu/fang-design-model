package Bridge;

public class Test {
    public static void main(String[] args) {
        DisplayImpl String1 = new StringDisplayImpl();
        DisplayImpl String2 = new StringDisplayImpl();
        Display display = new Display(String1);
        CountDisplay display1 = new CountDisplay(String2);
        display.display();
        System.out.println("分割线----------------");
        display1.MultiDisplay(10);
    }
}
