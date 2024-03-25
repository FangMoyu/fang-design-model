package Adapter;

public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }


    @Override
    public void PrintStrong() {
        banner.showWithAster();
    }

    @Override
    public void PrintWeak() {
        banner.showWithParen();
    }
}
