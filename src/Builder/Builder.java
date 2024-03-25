package Builder;

/**
 * 抽象建造者
 * 定义了一系列部件构造方法
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] item);
    public abstract void close();
}
