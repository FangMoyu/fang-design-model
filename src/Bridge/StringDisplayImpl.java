package Bridge;

public class StringDisplayImpl extends DisplayImpl{
    @Override
    public void rawOpen() {
        System.out.println("打开");
    }

    @Override
    public void rawPrint() {
        System.out.println("输出一行文字····");
    }

    @Override
    public void rawClose() {
        System.out.println("关闭");
    }
}
