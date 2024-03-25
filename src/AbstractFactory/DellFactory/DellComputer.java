package AbstractFactory.DellFactory;

import AbstractFactory.factory.Computer;
import AbstractFactory.factory.ComputerGraphics;
import AbstractFactory.factory.ComputerHardDisk;
import AbstractFactory.factory.ComputerProcessor;

public class DellComputer extends Computer {

    public DellComputer(String computerName,
                        ComputerProcessor processor,
                        ComputerGraphics graphics,
                        ComputerHardDisk hardDisk) {
        super(computerName, processor, graphics, hardDisk);
    }
    public void open(){
        System.out.println("Dell Computer is opening...");
    }
}
