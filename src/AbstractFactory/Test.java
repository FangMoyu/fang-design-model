package AbstractFactory;

import AbstractFactory.factory.*;


public class Test {
    public static void main(String[] args) {
        ComputerFactory dellFactory = ComputerFactory.getComputerFactory("AbstractFactory.DellFactory.DellComputerFactory");
        ComputerProcessor IntelProcessor = dellFactory.createProcessor("英特尔处理器");
        ComputerGraphics NvdiaGraphics = dellFactory.createGraphics("英伟达显卡");
        ComputerHardDisk SunHardDisk = dellFactory.createHardDisk("三星硬盘");
        Computer dellComputer = dellFactory.createComputer("戴尔电脑",
                IntelProcessor, NvdiaGraphics, SunHardDisk);
        dellComputer.open();

    }
}
