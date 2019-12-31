
###Etape 13 :
1) L'URL d'appel "/greeting" est entré en paramètre avec "@GetMapping" ;
2) Lorsque l'on met "public String **greeting**" en effet **greeting** correspond au nom du fichier HTML;
3) Le second lien contient une erreur, il faut mettre *http://localhost:8080/greeting?nameGET=ENSIM* au lieu de *http://localhost:8080/greeting?name=ENSIM*,
en effet c'est grâce au paramètre mit dans "nameGET" dans le "@RequestParam" que l'on peut envoyer le nom pour qu'il s'affiche après "Bonjour";

###Etape 17 :
Il y'a désormais une table appelé "ADRESS" qui apparaît avec des colonnes "ID", "CONTENT", "CREATION", dans le répertoire "jdbc:h2:mem:testdb";

###Etape 18 :
La classe "Adress" qui sert de table dans notre base de données, permet de faire la création de la table grâce aux annotations car elles permettent de 
s'affranchir du fichier XML servant à la configuration, en effet les annotations permettent de guider la dépendance Hibernate dans la création des tables.

###Etape 20 :
En utilisant la commande "SELECT * FROM ADRESS ", on constate que les "INSERT INTO" dans le fichier data.sql se sont bien mis
dans la table "ADRESS"

###Etape 23 :
L'annotation "@Autowired" permet de faire une injection de dépendance entre les beans pour aider Spring dans la création du bean, sa recherche et son injection.

###Etpae 30 : 
Il faut ajouter dans le fichier POM, dans la balise "depedencies" les lignes de codes suivants :
	    <dependency>
			<groupId>org.webjars</groupId>
			<artifactId>bootstrap</artifactId>
			<version>4.3.1</version>
		</dependency>
		
###DM 2 Etape 6 :
-Pour appeler DarkSky il faut obligatoirement une clé que l'on obtient en s'inscrivant.
En effet l'API n'est pas gratuite au delà de 1000 requètes/jours

-L'URL à utiliser est : https://api.darksky.net/forecast/[key]/[latitude],[longitude]
Avec "key" qui est la clé obtenue en s'inscrivant, il faut ensuite ajouter la latitude et la longitude (les coordonnées géographiques)

-Il faut utiliser la méthode HTTP GET

-Il faut utiliser : https://api.darksky.net/forecast/[key]/[latitude],[longitude]?option=val

-On peut trouver les différentes températures dans les sections "Hourly" et "Daily".

-La prévision météo se trouve dans "summary" qui se situe dans les sections "Minutely", "Hourly" et "Daily".

###DM 2 Etape 7 :

Lien du git : https://github.com/PhoenixWalker/DM_POO_API_David_HENG
