package threadsObserver;

import java.util.Observable;
import randomperson.RandomUser;

public class RandomUserControl extends Observable {

    public void fetchRandomUser() {
        Thread t1 = new MyThread(this);
        t1.start();
    }
    
    public void randomUserRetrieved(RandomUser user){
        setChanged();
        notifyObservers(user);
    }
}
