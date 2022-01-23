package per.projects.exercices.dau;

public class JocDaus {
    private Dau[] daus = new Dau[3];
    public JocDaus(Dau[] daus) {
        this.daus = daus;
    }
    public Dau[] jugar(){
        Dau[] newdaus = new Dau[daus.length];
        for(int i = 0; i<daus.length; i++){
            newdaus[i] = new Dau(0);
            newdaus[i].setValor((int)(Math.random() * 6 +1));
        }
        return newdaus;
    }
    public Dau[] getDaus() {
        return daus;
    }
    public void setDaus(Dau[] daus) {
        this.daus = daus;
    }
	public void None(){
		this.daus = null;
		return this.daus;
	}
}