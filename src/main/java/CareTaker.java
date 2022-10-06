import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Stats> momentoList = new ArrayList<>();
    static int saveID = 0;

    public void add(Stats state){
        momentoList.add(state);
        System.out.println("State save " + saveID + "\n");
        saveID++;
    }

    public Stats get(int index){
        System.out.println("loading stats from save " + index);
        return momentoList.get(index);
    }



}