package poste;

class Colis extends ObjetPostal
{
	private String declCont;
	private float declVal;
	private static float tarifBase = 0.5f;

	public Colis(String or,String dest,int cp,float pd,float v,int tr,String dc, float dv)
	{
		super(or,dest,cp,pd,v,tr);
		declCont = dc;
		declVal = dv;
	}
	
	public float tarifAff()
	{
		float somtarif = super.tarifAff();
		if(getVolume()>1/8f)
			somtarif += 3;
		return somtarif;
	}
	public float tarifRemb()
	{
		switch(getTauxRecom())
		{
			case 1:
			return declVal*0.1f;
			case 2:
			return declVal*0.5f;
		}
		return 0;
	}
	public float getTarifBase()
	{
		return tarifBase;
	}
	public String tostring()
	{
		return super.tostring()+getVolume()+"/"+declVal;
	}
}
