import pytest
import math

def test_square():
    num= 5
    assert num*num == 25

def test_addition():
    num = 6
    assert num== 6

def test_sqrt():
    num = 25
    assert math.sqrt(num) ==5
