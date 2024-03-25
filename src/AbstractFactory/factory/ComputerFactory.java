package AbstractFactory.factory;



public  abstract class ComputerFactory {
        //作为工厂，你总得返回给客户端一个工厂对象吧，不然人家咋生成电脑呢？所以定义 getComputerFactory 方法
    public static ComputerFactory getComputerFactory(String factoryName) {
        ComputerFactory factory = null;
        try {
            factory = ( ComputerFactory) Class.forName(factoryName).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    //定义创建处理器、显卡、硬盘以及电脑的方法
    public abstract ComputerProcessor createProcessor(String ProcessorName);
    public abstract ComputerGraphics createGraphics (String GraphicsName);
    public abstract ComputerHardDisk createHardDisk(String HardDiskName);
    public abstract Computer createComputer(String ComputerName, ComputerProcessor processor, ComputerGraphics graphics, ComputerHardDisk hardDisk);

}

