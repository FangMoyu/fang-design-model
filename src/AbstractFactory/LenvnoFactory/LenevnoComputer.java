package AbstractFactory.LenvnoFactory;

import AbstractFactory.factory.Computer;
import AbstractFactory.factory.ComputerGraphics;
import AbstractFactory.factory.ComputerHardDisk;
import AbstractFactory.factory.ComputerProcessor;

public class LenevnoComputer extends Computer {

    public LenevnoComputer(String computerName,
                        ComputerProcessor processor,
                        ComputerGraphics graphics,
                        ComputerHardDisk hardDisk) {
        super(computerName, processor, graphics, hardDisk);
    }

    @Override
    public void open() {
        System.out.println("Lenevno Computer is open");
    }
}
