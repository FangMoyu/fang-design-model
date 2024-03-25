package Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TxtBuilder extends Builder{
    private PrintWriter writer;
    private String filename;
    @Override
    public void makeTitle(String title) {
        filename = title + ".txt";
        try {
            writer = new PrintWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("欢迎来到"+title);
    }

    @Override
    public void makeString(String str) {
        writer.println(str);
    }

    @Override
    public void makeItems(String[] item) {
        for(String i : item){
            writer.println(i);
        }
    }

    @Override
    public void close() {
        writer.println("要完事了");
        writer.close();
    }
    public String getResult(){
        return filename;
    }
}
