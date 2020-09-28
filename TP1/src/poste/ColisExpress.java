package poste;

import java.util.Date;

class ColisExpress extends Colis
{
    private Date DateEnvoi;
    private static int nbColisExp = 0;
    private int numSuivi;
    private boolean embPoste;

    public ColisExpress(String or,String dest,int cp,float pd,float v,int tr,String dc,float dv,boolean ep)
    {
       super(or,dest,cp,pd,v,tr,dc,dv);
       DateEnvoi = new Date();
       numSuivi = nbColisExp;
       embPoste = ep;
       nbColisExp += 1;
   }
   
   public float tarifAff()
   {
       return 30 +( embPoste?3:0);
   }
   public String tostring()
   {
       return super.tostring()+"/"+getPoids()+"/"+numSuivi;
   }
}
