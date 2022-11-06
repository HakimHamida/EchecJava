package echec;

import java.util.List;
import java.util.ArrayList;

public class Joueur{
	private String nom;
	private Couleur couleur;
	 List<Piece> tab=new ArrayList<Piece>();

	private Couleur couleurEnnemie;

	Joueur (String n, Couleur c)
	{
		nom=n;
		couleur=c;
	}

	public Couleur getCouleur()
	{
		return couleur;
	}


	public void updateTab()
	{
		if (couleur.equals(Couleur.BLACK))
		{
			tab=Piece.getBlackPiece();
			couleurEnnemie=Couleur.BLACK;
			
		}
		 else
		 {
			 tab=Piece.getWhitePiece();		 
			 couleurEnnemie=Couleur.WHITE;

		 }

	}



	public String getNom() {
		return nom;
	}





	public void abandonner(){

	}





	public Piece bougerT1(Position depart) {
		Piece selectionnee=null;
		boolean ok=false;
		for (Piece count: tab)
		{
			 if (depart.equals(count.getPosition()))
			 {
				 selectionnee=count;
				 ok=true;
				 System.out.println(count.getMouvementPossible());
				 break;
			 }


		}
		if (!ok)
			System.out.println("Position erron�e, rejouer");
		return selectionnee;

	}
	public Piece bougerRoiT1(Position depart) {
		Piece selectionnee=null;
		boolean ok=false;
		if (depart.equals(Roi.getRoiCouleur(couleur).getPosition()))
		{
			selectionnee=Roi.getRoiCouleur(couleur);
			ok=true;
			System.out.println(selectionnee.getMouvementPossible());

		}



		if (!ok)
			System.out.println("Position erron�e, rejouer");
		return selectionnee;

	}

	public boolean bougerT2(Piece selectionnee, Position depart,Position arrivee) {

		boolean tentative=selectionnee.bouger(arrivee); 						
		if (tentative)
		{
			for (Piece count: Piece.getColoredPiece(couleurEnnemie)  )
			{
				if(count.getPosition().equals(arrivee))
				{
					count.destroy();											
					break;
				}
			}
		}
		else
			System.out.println("Erreur d'arriv�e");
		return tentative;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", couleur=" + couleur + "]";
	}





}
