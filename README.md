# Tri

Trier avec un arbre 

Exemple :
```
[3,15,-2,52,2,-4,41,86]

        3
       / \
     -2   15
     / \    \
   -4   2    52
            /  \
          41    86
```
## DonnÃ©es manipulÃ©es
```
arbre, racine, node = structure 
	valeur = entier 
	gauche = branche des nodes avec des valeurs inférieures 
	droite = branche des nodes avec des valeurs supérieures
```

## Algorithme de construction de l'arbre
```Java
ajouter (node, racine) =
	si (node.valeur > racine.valeur) alors
		si (racine.droite = vide) alors racine.droite = node
		sinon ajouter(node, racine.droite)
	sinon
		si (racine.gauche = vide) alors racine.gauche = node
		sinon ajouter(node, racine.gauche)
```

## Algorithme de parcours de l'arbre
```Java
parcourir (racine) =
	si (racine != vide) alors
		parcourir(racine.gauche)
		lire racine.valeur
		parcourir(racine.droite)
```

## Algorithme Global
```Java
Variables

Tableau data
Entier taille
Structure arbre, node

DÃ©but
-------
/* initialisation des données : */
data = [15,3,52,81,41]
taille = dimension de data

/* initialisation de l'arbre : */
arbre.valeur = data[0]
arbre.gauche = vide
arbre.droite = vide

/* construction de l'arbre : */
pour i allant de 1 Ã  [taille -1] faire
	node.valeur = data[i]
	node.gauche = vide
	node.droite = vide
	ajouter(node, arbre)

/* parcours de l'arbre : */
parcourir(arbre)
---
Fin
```
