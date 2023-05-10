/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.View;

/**
 *
 * @author vantu
 */
public class ActEvt implements ActionListener{
    View view;

    public ActEvt(View view) {
        this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str);
        switch(str){
            case "ADD":{
                view.Addtable();break;
            }
            case "DELETE":{
                view.DeleteTable();break;
            }
            case "UPDATE":{
                view.UpdateTable();break;
        }
            case "CLEAR":{
                view.cleartxt();break;
            }
            case "LOGOUT":{
                view.logout();
            }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
}
