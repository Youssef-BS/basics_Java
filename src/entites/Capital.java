package entites;


public class Capital extends Ville {

    private String pays ;

    public Capital(String leNom , String lePays){
        super(leNom);
        this.pays = lePays;
    }

    public Capital(String lenom , int leNbHab , String lePays){
        super(lenom, leNbHab);
        this.pays = lePays;
    }

    public String presenteToi(){
       return super.presenteToi() + pays;
    }


    public String toString(){
       return  super.toString() + pays ;
    }

}
