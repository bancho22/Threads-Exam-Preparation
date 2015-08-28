/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsObserver;

import java.util.logging.Level;
import java.util.logging.Logger;
import randomperson.RandomUser;
import randomperson.RandomUserGenerator;

/**
 *
 * @author Bancho
 */
public class MyThread extends Thread{
    
    private RandomUserControl randomUserControl;

    public MyThread(RandomUserControl randomUserControl) {
        this.randomUserControl = randomUserControl;
    }
    

    @Override
    public void run() {
        RandomUser user = null;
        try {
            user = RandomUserGenerator.getRandomUser();
        } catch (InterruptedException ex) {
            Logger.getLogger(RandomUserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        randomUserControl.randomUserRetrieved(user);
    }
    
    
}
