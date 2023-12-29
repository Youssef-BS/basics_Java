package entites;

public class Ville {
    protected String nom ;
    protected int nbHab = -1;

    public  Ville(String lenom){
      this.nom = lenom;
    }
    public Ville(String lenom , int leNbHab){
        this.nom = lenom ;
        if(leNbHab <= 0)
            this.nbHab = -1;
        else
            this.nbHab = leNbHab;
    }
    public String getNom(){
        return nom;
    }

    public int getNbHab(){
        return nbHab;
    }
    public String presenteToi(){
        return nom + nbHab ;
    }

    public String toString(){
        return nom + nbHab ;
    }
}
