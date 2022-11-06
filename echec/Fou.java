package echec;

import java.util.*;

public class Fou extends Piece implements Mouvement{

	public Fou(int x, int y, Couleur c) {
		super(x, y, c);
	}
	public Fou(int x, int y,Couleur c,boolean b) {
		super(x, y,c,b);
	}


	@Override
	public
	List<Position> getMouvementPossible() {  
		int x=position.getX();
		int y=position.getY();
		Position temp=new Position(x,y);
		List<Position> mouvementPossible = new ArrayList<Position>();


			for(int c=1;c<8;c++)				
			{
				temp.setX(x+c);
				temp.setY(y+c);
				if (temp.inBounds() && !this.bloqueAmi(temp))	
				{
					mouvementPossible.add(temp.clone());
					if (this.bloqueEnnemi(temp))		
						break;
				}
				else
					break;					

			}
			for(int c=1;c<8;c++)				
			{
				temp.setX(x-c);
				temp.setY(y+c);
				if (temp.inBounds() && !this.bloqueAmi(temp))	
				{
					mouvementPossible.add(temp.clone());
					if (this.bloqueEnnemi(temp))		
						break;
				}
				else
					break;					
			}
			for(int c=1;c<8;c++)				
			{
				temp.setX(x-c);
				temp.setY(y-c);
				if (temp.inBounds() && !this.bloqueAmi(temp))	
				{
					mouvementPossible.add(temp.clone());
					if (this.bloqueEnnemi(temp))		
						break;
				}
				else
					break;					
			}
			for(int c=1;c<8;c++)				
			{
				temp.setX(x+c);
				temp.setY(y-c);
				if (temp.inBounds() && !this.bloqueAmi(temp))	
				{
					mouvementPossible.add(temp.clone());
					if (this.bloqueEnnemi(temp))		
						break;
				}
				else
					break;					

			}

		return mouvementPossible;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Fou "+super.position.getX()+","+super.position.getY()+"]" ;
	}



}
