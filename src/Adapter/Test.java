package Adapter;

public class Test {
    public static void main(String[] args) {
        Print banner = new PrintBanner("Hello World");
        banner.PrintStrong();
        banner.PrintWeak();
    }
}
