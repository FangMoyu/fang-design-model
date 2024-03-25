package AbstractFactory.LenvnoFactory;


import AbstractFactory.factory.*;

public class LenevnoComputerFactory extends ComputerFactory {

    @Override
    public ComputerProcessor createProcessor(String ProcessorName) {
        return new LenevnoProcessor(ProcessorName);
    }

    @Override
    public ComputerGraphics createGraphics(String GraphicsName) {
        return new LenevnoComputerGraphics(GraphicsName);
    }

    @Override
    public ComputerHardDisk createHardDisk(String HardDiskName) {
        return new LenevnoComputerHardDisk(HardDiskName);
    }

    @Override
    public Computer createComputer(String ComputerName, ComputerProcessor processor, ComputerGraphics graphics, ComputerHardDisk hardDisk) {
        return new LenevnoComputer(ComputerName,processor,graphics,hardDisk);
    }
}
