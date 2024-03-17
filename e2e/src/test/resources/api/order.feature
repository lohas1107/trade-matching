Feature: 下單

  Scenario: 買進
    Given exists data "交割戶":
      | account_number | investor.name |
      | 00123456789    | Musk          |
    Given exists data "證券戶":
      | account_number | investor.name |
      | 9987654321     | Musk          |
    Given exists data "轉帳紀錄":
      | delivery_account.account_number | amount | balance |
      | 00123456789                     | 100000 | 100000  |
