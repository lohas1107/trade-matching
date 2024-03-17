Feature: 下單

  Scenario: 買進
    Given exists data "交割戶":
      | account_number | investor.name |
      | 00123456789    | Musk          |
    Given exists data "證券戶":
      | account_number | investor.name |
      | 9987654321     | Musk          |
