import pytest
#Sum of numbers
def test_sum():
    num1= 10
    num2 = 25
    sum = num1+num2
    assert sum == 35
#Difference of numbers

def test_minus():
    num1 = 369
    num2= 83
    diff = num1-num2
    assert diff == 286
#Product of numbers
def test_product():
    num1 = 45
    num2 = 8
    product = num1*num2
    assert product == 360
#Quotient of numbers
def test_quot():
    num1 = 63
    num2 =9
    quot = num1/num2
    assert quot== 7

