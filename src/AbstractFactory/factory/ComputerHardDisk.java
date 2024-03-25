package AbstractFactory.factory;

//抽象硬盘
public abstract class ComputerHardDisk {
    private String HardDiskName;

    public ComputerHardDisk(String hardDiskName) {
        HardDiskName = hardDiskName;
    }
}
