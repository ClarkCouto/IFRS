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
public abstract class Apto {
    //atributos da classe
    private static float reaisPorMetroQuadrado = 10f;
    private int numero;
    private int andar;
    private float area;
    private boolean alugado;
    private Inquilino inquilino;
    
    //construtores
    public Apto() {
        
    }
    
    public Apto(int n, int a, float area, boolean alugado) {
        
        this.numero = n;
        this.andar = a;
        this.area = area;
        this.alugado = alugado;
        
    }
    
    public Apto(int n, int a, float area, boolean alugado, Inquilino inquilino) {
        
        this.numero = n;
        this.andar = a;
        this.area = area;
        this.alugado = alugado;
        this.inquilino = inquilino;
    }
    
    //getters e setters
    public void setReaisPorMetroQuadrado(float reaisPorMetroQuadrado) {
        this.reaisPorMetroQuadrado = reaisPorMetroQuadrado;
    }
    
    public float getReaisPorMetroQuadrado() {
        return this.reaisPorMetroQuadrado;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setAndar(int andar) {
        this.andar = andar;
    }
    
    public int getAndar() {
        return this.andar;
    }
    
    public void setArea(float area) {
        this.area = area;
    }
    
    public float getArea() {
        return this.area;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public boolean getAlugado() {
        return this.alugado;
        
    }
    
    public Inquilino getInquilino() {
        return this.inquilino;
    }
    
    //métodos
    public float precoFinal() {
        float p = (this.getArea() * this.getReaisPorMetroQuadrado() + this.precoExtra());
        return p;
    }
    
    protected abstract float precoExtra();
    
    
    public void aluga(Inquilino i) {
        this.inquilino = i;
        
    }
}
