/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sh_mvcexample;

import SH_Controller.SHController;
import SH_Model.SHModel;
import SH_VIew.SHView;

/**
 *
 * @author Shorlo
 */
public class SH_MVCExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        SHView view = new SHView();
        SHModel model = new SHModel();
        
        SHController controller = new SHController(view, model);
        
        controller.start();
        view.setVisible(true);        
    }
    
}
