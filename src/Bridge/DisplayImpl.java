package Bridge;

//这里不继承Display，
// 这样防止继承带来的强关联。而使用委托，可以减少这个关联。因为继承只能单继承，以后想修改就很麻烦
//这个设计抽象类，让子类做具体实现
//未来还可以设置成抽象工厂来做更多的拓展
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
