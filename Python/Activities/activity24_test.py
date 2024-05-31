import pytest
@pytest.mark.parametrize("earned, spent, expected",[(30, 10, 20), (20, 2, 18)])
def test_transaction(wallet_amount, earned, spent, expected):
    wallet_amount+= earned

    #deduct expense
    wallet_amount -=spent

    # verify
    assert wallet_amount == expected
