package Builder;

public class Test {
    public static void main(String[] args) {
        TxtBuilder builder = new TxtBuilder();
        Director director = new Director(builder);
        director.construct();
        String result = builder.getResult();
        System.out.println(result);
    }
}
