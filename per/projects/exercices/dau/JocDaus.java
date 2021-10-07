package per.projects.exercices.dau;

public class JocDaus {
    private Dau[] daus = new Dau[3];
    JocDaus(){}
    JocDaus(Dau[] daus){ this.daus = daus; }
    public void jugar(){
        for(int i = 0;i<this.daus.length;i++){
            this.daus[i].setValor(this.daus[i].tirar());
        }
    }
    public Dau[] getDaus(){
        return this.daus;
    }
    public String toString(){
        String daus = "";
        for(Dau d: this.daus){
            daus+=d.getValor()+" ";
        }
        return daus;
    }
    public void setDaus(int caras, int valor){
        Dau dau = new Dau(caras, valor);
        for(int i = 0;i<this.daus.length;i++){
            this.daus[i] = dau;
            this.daus[i] = dau;
        }
    }
}
