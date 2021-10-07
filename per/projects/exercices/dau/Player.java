package per.projects.exercices.dau;

public class Player {
    private int ganadas = 0;
    private int jugadas = 0;
    private int perdidas = 0;
    Player(){}
    public void setGanadas(int ganadas){ this.ganadas = ganadas; }
    public void setJugadas(int jugadas){ this.jugadas = jugadas; }
    public void setPerdidas(int perdidas){ this.perdidas = perdidas; }

    public int getGanadas(){ return this.ganadas; }
    public int getJugadas(){ return this.jugadas; }
    public int getPerdidas(){ return this.perdidas; }
}
