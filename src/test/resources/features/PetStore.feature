Feature: PetStore Search Function

  @petAPI
  Scenario Outline: Find Pets By Status With Path
    When verify search function with Path "<status>"
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |

  @petAPI
  Scenario Outline: Find Pets By Status With Contains
    When verify search function with Contains "<status>"
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |

  @petAPI
  Scenario Outline: Find Pets By Status With JsonPath
    When verify search function with JsonPath "<status>"
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |

  @petAPI
  Scenario Outline: Find Pets By Status With HamcrestMatchers
    When verify search function with HamcrestMatchers "<status>"
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |

  @petAPI
  Scenario Outline: Find Pets By Status With JsonToJava
    When verify search function with JsonToJava "<status>"
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |

  @petAPI
  Scenario Outline: Find Pets By Status With POJO
    When verify search function with POJO "<status>"
    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |