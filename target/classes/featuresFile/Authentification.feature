@authentification
Feature: Authentification
  ETQ utilisateur jr souhaite m'authentifier

  @login-valide
  Scenario: je souhaite tester la page LOGIN
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail "admin@yourstore.com"
    And je saisis le login "admin"
    And je clique sur le bouton Login
    Then je me redirige vers la page home

     @login-invalide
  Scenario: je souhaite tester la page LOGIN
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail "zeineb@yourstore.com"
    And je saisis le login "zeineb"
    And je clique sur le bouton Login
    Then je verifie le message d'erreur
    