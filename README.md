Projet de calculatrice avec Jakarta EE / Java EE.


Partie backend de l'application:
On a une méthode Calcul qui génère un Webservice REST pour l'operation.

En passant les valeurs de l'operation et le signe en parametre de la requete , on peut générer le XML du calcul, ou meme le resultat:
Ci-dessous s'affiche le XML généré via les parametres:

![Image_web_service_Rest](REST_WEB_SERVICE.png)

La partie frontend est une interface html/css/javascript représentant la calculatrice sous forme de page web, et lorsque on clique sur le bouton = alors on déclenche ce web service et cette URL comme expliqué ci-dessus dans la partie backend.
