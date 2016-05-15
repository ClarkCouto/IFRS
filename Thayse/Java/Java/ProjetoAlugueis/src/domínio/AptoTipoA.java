/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domínio;

/**
 *
 * @author Thayse
 */
public class AptoTipoA extends Apto {
    
    public AptoTipoA() {
        super();
    }
    
    public AptoTipoA(int nro, int area, int andar) {
        super.setNumero(nro);
        super.setArea(area);
        super.setAndar(andar);
        super.setAlugado(false);
    }
    
    public AptoTipoA(int nro, int area, int andar, Inquilino i) {
        super.setNumero(nro);
        super.setArea(area);
        super.setAndar(andar);
        
        super.aluga(i);
        super.setAlugado(true);
        
        
        
    }
    
    @Override
    protected float precoExtra() {
        if (super.getAndar() == 1) {
            return 100f;
        } else if (super.getAndar() == 2) {
            return 200f;
        } else {
            return 300f;
        }
        
    }
}
