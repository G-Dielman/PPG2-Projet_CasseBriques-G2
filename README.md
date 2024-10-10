Todo list



   - 3 classes
   pour chaque :
   - getter setter
   
   balle :
   - déplace dans la classe (à voir la physique)
   - position x,y
   - vitesse vx et vy
   - rayon de la balle
   
   - getteur setteur, modifier la position et modifier la vitesse
   - Créer une méthode move() qui bouge la balle (vx + x && vy + y)
   
   raquette :
   - horizontalement (que axe Y)
   - position x,y
   - largeur (axe x)
   - getters et setters (modifier la position "x" et la largeur)
   
   briques statiques :
   - faire un caddrillage de brique espacer
   - position x,y
   - état (casser ou pas casser (boolean))
   - getter et setter (modifier position x,y / casser ou pas casser (boolean))
   - 
   
   
   Class BreakoutGame
   - créer Pane pour afficher bal, brique, raquette
   - créer Scene et ajouter au stage
   - getchildren().add()
   
   
   Animation timer
   - pour déplacer la balle (utiliser la méthode move de la classe balle)
   - balle rebondit sur les mur et la raquette(si rebondit inverser la directeion)
   - si balle touche raquette verifier si la balle est audessus et entre les bords gauche et droit
