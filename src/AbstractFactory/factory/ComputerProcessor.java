package AbstractFactory.factory;

//抽象处理器
public abstract class ComputerProcessor {
    private String ProcessorName;
    public ComputerProcessor(String processorName) {
        ProcessorName = processorName;
    }
}
