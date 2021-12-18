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
