/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;


/**
 * @author JACKNTP
 */
public class TestProjectMidlet extends MIDlet {
    
     private MyForm form;
     
    public TestProjectMidlet(){
        form = new MyForm();
    }

    public void startApp() {
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
