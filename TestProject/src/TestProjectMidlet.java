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
    
     private Form form;
     
    public TestProjectMidlet(){
        form = new Form("Hello World");
    }

    public void startApp() {
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
