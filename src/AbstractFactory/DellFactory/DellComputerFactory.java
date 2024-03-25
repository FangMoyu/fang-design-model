package AbstractFactory.DellFactory;

import AbstractFactory.factory.*;

public class DellComputerFactory extends ComputerFactory {

    @Override
    public ComputerProcessor createProcessor(String ProcessorName) {
        return new DellProcessor(ProcessorName);
    }

    @Override
    public ComputerGraphics createGraphics(String GraphicsName) {
        return new DellComputerGraphics(GraphicsName);
    }

    @Override
    public ComputerHardDisk createHardDisk(String HardDiskName) {
        return new DellComputerHardDisk(HardDiskName);
    }

    @Override
    public Computer createComputer(String ComputerName, ComputerProcessor processor, ComputerGraphics graphics, ComputerHardDisk hardDisk) {
        return new DellComputer(ComputerName,processor,graphics,hardDisk);
    }
}
