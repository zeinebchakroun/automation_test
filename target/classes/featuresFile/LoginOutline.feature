@outline
Feature: connexion avec plusieurs comptes
  ETQ utilisateur je souhaite me connecter avec plusieurs comptes

  @connexion_multiusers
  Scenario Outline: je souhaite me connecter avec plusieurs comptes
    Given je visite l'application NopCommerce
    When je saisis l'adresse mail "email"
    And je saisis le login "login"
    And je clique sur le bouton Login

    Examples: 
      | email                    | login  |
      | admin@yourstore.com      | admin  |
      | zeinebchakroun@gmail.com | zeineb |
      | azerty@gmail.com         | azerty |
