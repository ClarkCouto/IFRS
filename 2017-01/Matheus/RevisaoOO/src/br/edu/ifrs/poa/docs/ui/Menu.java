package br.edu.ifrs.poa.docs.ui;

import javax.swing.JOptionPane;

public class Menu {
    
    public int exibe(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }
    
    public void cadastraNome() {
        
    }
    
}
