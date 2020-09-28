package poste;

import java.util.Scanner;

public abstract class ObjetPostal
{
    private String origine;
    private String destination;
    private int codePostal;
    private float poids;//on grammes
    private float volume;//m³
    private int taux_de_recommandation;

    public ObjetPostal(String or,String dest,int cp,float pd,float v,int tr)
    {
       origine = or;
       destination = dest;
       codePostal = cp;
       poids = pd;
       volume = v;
       taux_de_recommandation = tr;
   }
   public float tarifAff()
   {
       float somtarif = getTarifBase();
       if(taux_de_recommandation == 1)
       {
           somtarif += 0.5f;
       }
       else if(taux_de_recommandation == 2)
       {
           somtarif += 1.5f;
       }
       return somtarif;
   }
   public abstract float tarifRemb();
   public abstract float getTarifBase();
   public int getTauxRecom(){return taux_de_recommandation;}
   public void Affichage()
   {
       System.out.println(tostring());
   }
   public String tostring()
   {
       return codePostal+"/"+destination+"/"+taux_de_recommandation+"/";
   }
   public float getVolume(){return volume;}
   public float getPoids(){return poids;}
}
