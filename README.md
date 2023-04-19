# Internet-Movie-DataBase

Internet Movie DataBase est un TP réalisé en binôme, celui-ci consiste à valider les acquis de l'apprentissage du langage JAVA. 
On y retrouve de la POO, des tests unitaires mais aussi JPA, JDBC et du mapping de base de données...  

## Objectifs

- Créer un diagramme UML à partir d'un fichier JSON ;
- Créer un projet Maven, déclarer les dependence ... dans le pom.xml ;
- Créer une connexion entre l'API et le serveur (localhost) avec EntityManager et persistence-unit ;
- Faire le mapping de la base de données en respectant les relations et les multiplicités ;
- Gérer des tests unitaires pour gérer le bon fonctionnement de l'API ;  

>**Warning** Create clean and optimized code 

## Installation

Pour installer l'API sur votre machine :

Télécharger le repos ou `git clone URL_REPO`

<details>
  <summary>Remarque :</summary>

  Vous allez devoir possiblement modifier un peu de code dans le fichier "persistence.xml" pour insérer des données propres à votre serveur local.
  
  Par défaut le fichier persistence.xml se présente comme ceci :
  
  ```xml
     [...]
     
        <!-- configuration d'accès à la base de données -->
        <property name="jakarta.persistence.jdbc.url" value="jdbc:mariadb://localhost:3306/MovieDataBase"/>
        <property name="jakarta.persistence.jdbc.user" value="root"/>
        <property name="jakarta.persistence.jdbc.password" value=""/>
        <property name="jakarta.persistence.jdbc.driver" value="org.mariadb.jdbc.Driver"/>
        
     [...]
  ```
  
  Il vous faut adapter le port de votre serveur ainsi que le nom d'utilisateur et le mot de passe.
  

</details>


#### formation diginamic 2023
