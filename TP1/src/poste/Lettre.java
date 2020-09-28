package poste;

class Lettre extends ObjetPostal
{
	private boolean Urgente;
	private static float tarifBase = 0.5f;

	public Lettre(String or,String dest,int cp,float pd,float v,int tr,boolean ur)
	{
		super(or,dest,cp,pd,v,tr);
		Urgente = ur;
	}
	
	public float tarifAff()
	{
		float somtarif = super.tarifAff();
		if(Urgente)
			somtarif += 0.3f;
		return somtarif;
	}
	public float tarifRemb()
	{
		switch(super.getTauxRecom())
		{
			case 1:
			return 1.5f;
			case 2:
			return 15f;
		}
		return 0;
	}
	public float getTarifBase()
	{
		return tarifBase;
	}
	public String tostring()
	{
		String s = super.tostring();
		if(Urgente)
			return s+"Urgente";
		else
			return s+"Ordinaire";
	}
}
