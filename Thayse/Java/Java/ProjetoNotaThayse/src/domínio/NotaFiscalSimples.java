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
public class NotaFiscalSimples extends NotaFiscal {

    public NotaFiscalSimples(Cliente c, int num){
        super.cliente = c;
        super.numero = num;
    }
    @Override
    public float imposto() {
        return super.valorProdutos() * 0.2f;
    }
    
}
