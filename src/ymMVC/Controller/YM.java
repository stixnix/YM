/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ymMVC.Controller;
//qualquercoisa

import javax.swing.JFrame;
import ymMVC.view.YMTelaRegistro;

/**
 *
 * @author 291500474
 */
public class YM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        YMTelaRegistro j = new YMTelaRegistro();

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1000, 1000);
        j.setVisible(true);
    }    
    
}
