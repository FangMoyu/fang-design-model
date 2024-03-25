package Bridge;

public class Display {
    private DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open(){
        this.displayImpl.rawOpen();
    }
    public void print(){
        this.displayImpl.rawPrint();
    }
    public void close(){
        this.displayImpl.rawClose();
    }


    public void display(){
        open();
        print();
        close();
    }
}
