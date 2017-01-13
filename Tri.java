public class Tri{

     public static void main(String []args){
         
        int tableau[]={15,3,52,81,41,-2};

		Node arbre = new Node();
		arbre.setValeur(tableau[0]);
		
		for(int i = 1; i < tableau.length; i++){
			Node node = new Node(tableau[i]);
			ajouter(node,arbre);
		}
		parcourir(arbre);
     }
    
	public static void ajouter( Node node, Node racine){
		if (node.getValeur()>racine.getValeur()){
			if (racine.getDroite()==null){
				racine.setDroite(node);
			}
			else ajouter(node, racine.getDroite());
		}
		else {
			if (racine.getGauche()==null){
				racine.setGauche(node);
			}
			else ajouter(node,racine.getGauche());
		}
	}
	
	public static void parcourir(Node racine){
		if (racine!=null){
			parcourir(racine.getGauche());
			System.out.println("Node Value : " + racine.getValeur());
			parcourir(racine.getDroite());
		}
	}
}
