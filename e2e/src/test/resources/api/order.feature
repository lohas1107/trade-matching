Feature: 下單

  Scenario: 買進
    Given exists data "交割戶":
      | accountNumber | investor.name |
      | 00123456789   | Musk          |
    Given exists data "證券戶":
      | accountNumber | investor.name |
      | 9987654321    | Musk          |
    Given exists data "轉帳紀錄":
      | deliveryAccount.accountNumber | amount | balance |
      | 00123456789                   | 100000 | 100000  |
    When POST "/v1/stack/orders":
    """
    {
      "action": "BUY",
      "code": "2890",
      "price": 20,
      "share": 1000,
    }
    """
    Then response should be:
    """
    : {
      code: 201
      body= {}
    }
    """
#    那麼存在"交易紀錄":
#      | account_number | action | code | price | share |
#      | 9987654321     | BUY    | 2890 | 20    | 1000  |