package Bridge;

public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void MultiDisplay(int time){
        open();
        for(int i = 0 ;i < time; i++){
            print();
        }
        close();
    }
}
