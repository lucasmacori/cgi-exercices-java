# Exercices Java - CGI

<img height="60" src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/CGI_logo.svg/2560px-CGI_logo.svg.png"/>

### Informations
**Version de Java utilisée :** 1.8<br />
**Gestionnaire de paquets :** Maven<br />
**Dépendances :**

| Nom   | Version |
|-------|---------|
| jUnit | 4.13.2  |


### Organisation du projet
**Premier topic :** se situe dans le répertoire *src/main/java/org/cgi/exercice1*<br />
**Tests unitaires du premier topic :** se situent dans le répertoire *src/main/java/org/cgi/exercice1/junit*

**Second topic :** se situe dans le répertoire *src/main/java/org/cgi/exercice2*<br />
**Tests unitaires du second topic :** se situent dans le répertoire *src/main/java/org/cgi/exercice2/junit*<br />

### Sujet
**1ére topic**

- Créer une classe **Personne**
  - Sexe - ENUM M / F
  - Nom - String
  - Prenom - String
  - Date de naissance - Date
  - Taille - Int

- Classe **skills** enum
  - Java
  - PHP
  - Angular
  - Delivery
  - Selenium
  - GCP
  - React
  - Jenkins

- Créer une classe **Developpeur**, qui hérite de la classe **Personne**
  - Attribut Manager
  - ArrayList de skills
  - Méthode qui liste des skills
  - Méthode qui récupère le manager
  - Méthode qui permet de récupérer l'age
  - Méthode AddSkills

- Créer une classe **Manager**, qui hérite de la classe **Personne**
  - ArrayList listemembres
  - Méthode addMember
  - Méthode qui liste les membres

- Classe de Main
  - Créer 4 développeurs
    - Pierre MARCHAND : M : 14/02/1989 : 180cm
    - Paul DURANT : M : 18/07/1991 : 178cm
    - Jacques ADIT : M : 24/12/1980 ans : 160cm
    - Julie PACOT : F : 09/08/1976 ans : 155cm
  - Créer 2 manager
    - Sam DEBIF : F : 07/09/1972 : 168cm
    - Raumane DUMONT : F : 04/04/1983 : 154cm
  - Ajouter Sam en tant que manager à Pierre et Paul
  - Ajouter Raumane en tant que manager à Jacques et Julie
  - Ajouter au moins 2 compétences aux 4 développeurs
  - Lister  le nom, le prénom et l'age des membres qui ont la compétences Java et le nom et prénom du manager à contacter
  - Lister toutes les personnes qui mesurent plus de 160cm

**2ème topic**

- Dans un tableau Array, Parcourir le tableau et retourner l’index d’un certain nombre<br />
  *Ex : [6,5,9,0] Retourner l’index du tableau pour le chiffre 5. Attention à gérer les exceptions (si le numéro n’existe pas dans la liste)*
- Trier une liste par ordre croissant
- 3 classes (Animal(mère), Chien(fille), Chat(fille))
  - Attribut : Age, Nom, Sexe 
  - Constante : Nb Patte et Son
  - Dans la classe main, créer un animal chien et un animal chat
  - Afficher dans la console, pour tous les animaux créés : « Nom » – « Age » – « Sexe » - Age X patte + la première lettre du sexe – « son »<br /> 
  *Ex : pour le chien (« toto » ; « 15 » ; »Male ») : TOTO – 15 – Male – 60M – wouaf*