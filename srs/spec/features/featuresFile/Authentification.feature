@authentification
Feature: Authentification
  ETQ utilisateur jr souhaite m'authentifier

  @login-valide
  Scenario: je souhaite tester la page LOGIN
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail
    And je saisis le login
    And je clique sur le bouton Login
    Then je me redirige vers la page home
