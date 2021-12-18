package SH_Controller;

import SH_Model.SHModel;
import SH_VIew.SHView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Shorlo
 */
public class SHController implements ActionListener
{
    private SHView view;
    private SHModel model;

    public SHController()
    {
        
    }
    
    public SHController(SHView view, SHModel model)
    {
        this.view = view;
        this.model = model;
        this.view.btnMultiply.addActionListener(this);
    }
    
    public void start()
    {
        view.setTitle("Model View Controller Multiply");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        model.setNum1(Integer.parseInt(view.txtNum1.getText()));
        model.setNum2(Integer.parseInt(view.txtNum2.getText()));
        model.multiply();
        
        view.txtResutl.setText(String.valueOf(model.getResult()));
    }
}
