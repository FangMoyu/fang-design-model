package AbstractFactory.factory;

//抽象电脑
public abstract class Computer {
    private String ComputerName;
    private ComputerProcessor processor;
    private ComputerGraphics graphics;
    private ComputerHardDisk hardDisk;
    public Computer(String computerName, ComputerProcessor processor, ComputerGraphics graphics, ComputerHardDisk hardDisk) {
        ComputerName = computerName;
        this.processor = processor;
        this.graphics = graphics;
        this.hardDisk = hardDisk;
    }
    public abstract void open();
}
