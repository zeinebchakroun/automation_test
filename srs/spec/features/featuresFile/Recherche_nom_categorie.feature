
@categoryname
Feature: Recherche nom produit
ETQ utilisateur je souhaite chercher le nom de categorie
  @categoryName
  Scenario: je souhaite chercher le nom de categorie
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail "admin@yourstore.com"
    And je saisis le login "admin"
    And je clique sur le bouton Login
    Then je me redirige vers la page home
    And je clique sur Catalog
    And je clique sur categories
    And je saisis le nom de categorie "computers"
    And je clique sur le bouton search de category name
