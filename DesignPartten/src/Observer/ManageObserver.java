package Observer;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/6/26 0026.
 */
public class ManageObserver {
    private ArrayList<IObserver> observerArrayList = new ArrayList<IObserver>();

    public ManageObserver addObserver(IObserver iObserver){
        this.observerArrayList.add(iObserver);
        return this;
    }

    public ManageObserver removeObserver(IObserver iObserver){
        this.observerArrayList.remove(iObserver);
        System.out.println(iObserver.getClass().getSimpleName().toString()+" has been removed!");
        return this;
    }

    public int notifyObserver(){
        if (this.observerArrayList.size() == 0){
            System.out.println("no observer");
            return 0;
        }else {
            for(IObserver iObserver:this.observerArrayList){
                iObserver.notifyChanges();
            }
            return this.observerArrayList.size();
        }
    }
}
