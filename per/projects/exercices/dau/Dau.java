package per.projects.exercices.dau;

public class Dau{
    private int caras;
    private int valor;
    Dau(){}
    Dau(int caras, int valor){ this.caras = caras; this.valor = valor;}
    public void setCaras(int caras){ this.caras = caras; }
    public void setValor(int valor){ this.valor=valor; }
    public int tirar(){ return (int) (Math.random()*this.caras+1); }
    public String toString(){ return ""+this.valor; }
    public int getCaras(){ return this.caras; }
    public int getValor(){ return this.valor; }
}