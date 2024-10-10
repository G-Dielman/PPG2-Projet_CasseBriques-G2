Premier temps :

Class balle :
> **Attributs :**
- position Axe x (double x) et Axe y (double y)
- vitesse vecteur axe x (vx) et vecteur axe y (vy)
- Taille de la balle (Rayon)

> **méthodes :**
- Getter et Setter(modifier la position et modifier la vitesse)
- Méthode "move()" qui bouge la balle avec en ajoutant vx à x et vy à y


Class Raquette :
> **Attributs :**
- position de la raquette Axe x (double x) et Axe y (double y)
- Largueur de la raquette en pixel
- 

> **méthodes :**
- Getter et Setters (modifier la position x de la raquette)


Class Brick :
> **Attributs :**
- position Axe x (double x) et Axe y (double y)
- État de la briques (Boolean isBroken)

> **méthodes :**
- Getters et Setters (modifier la position x et y ainsi que l'état de la brique (Broken)



Deuxième Temps :

Class BreakoutGame :
> **Afficher les objets :**
- créer un pane pour afficher la balle, les briques et la raquette
- utiliser les classes JavaFx (Circle et Rectangle)

> **Afficher les objets :**
- Créer un Scene et l'ajouter au stage
- Ajouter les formes à la scènes (getChildren().add())

> **AnimationTimer :**
- Déplacer la balle avec un animation timer et utiliser la fonction "move()" de la classe balle

> **Rebondir sur les murs :**
- Verifier quel mur la balle toucher et modifier la direction en conséquence
- Ajouter des collision à la raquette, vérifier sur quel partie la balle à toucher la raquette
