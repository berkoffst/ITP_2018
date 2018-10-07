/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tharika;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Thari
 */

public class NewJframe extends JFrame{
    
    
    

    @Override
    public void setSize(Dimension d) {
        setBounds(400,100,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
     
    
    
}
