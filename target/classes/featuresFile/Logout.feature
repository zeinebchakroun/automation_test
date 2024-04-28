@logout
Feature: Deconnexion
  ETQ utilisateur jr souhaite me deconnecter

  Background: 
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail "admin@yourstore.com"
    And je saisis le login "admin"
    And je clique sur le bouton Login
    Then je me redirige vers la page home

  @logout
  Scenario: je souhaite me deconnecter
    When je me deconnecte
