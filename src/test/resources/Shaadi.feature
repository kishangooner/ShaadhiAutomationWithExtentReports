
@ShaadiFirstPage
Feature: Scenario to verify the Mother tongue matches the community

  @Community
  Scenario Outline: Title of your scenario outline
    Given Login into Shaadi.com page with "<DomainName>"
    Then Verify that mother tongue matches the community

    Examples:
    |DomainName|
    |MARATHI|
    |GUJARATHI|