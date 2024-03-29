@productname
Feature: Recherche nom produit
  ETQ utilisateur je souhaite chercher le nom du produit

  @productName
  Scenario: je souhaite chercher le nom du produit
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail "admin@yourstore.com"
    And je saisis le login "admin"
    And je clique sur le bouton Login
    Then je me redirige vers la page home
    And je clique sur Catalog
    And je clique sur products
    And je saisis le nom du produit "parfum"
    And je clique sur le bouton search