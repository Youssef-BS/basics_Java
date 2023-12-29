import entites.Capital;
import entites.Ville;



public class Monde {
    public static void main(String[] args) {
        Ville v1 = new Ville("tunis" , 12);
        Ville v2 = new Ville("alg" , 14);
        Capital c1 = new Capital("tunis" , 1 , "bizerte");
        Capital c2 = new Capital("alg" , 2 , "aneba");


        Ville tab[]=new Ville [5];
        tab[0]=v1;
        tab[1]=c1;
        tab[2]=v2;
        tab[3]=c2;
        tab[4]= new Capital("Tripoli", 750000, "Libie");

        for(int i=0 ; i<tab.length ; i++){
            System.out.println(tab[i]);
        }

        System.out.println("Afficher Capital");
        for(int i=0 ; i<tab.length ; i++){
           if(tab[i] instanceof Capital){
               System.out.println(tab[i]);
           }
        }

    }


}