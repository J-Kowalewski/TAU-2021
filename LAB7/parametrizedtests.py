import pytest


def get_interval(a, b, c):
    if type(a) == int and type(b) == int and type(c) == int:
        return -10 <= a <= 10 and -10 <= b <= 10 and -10 <= c <= 10
    else:
        return False


testdata1 = [
    (-10, 4, 10),
    (10, 0, 2),
    (1, 2, 3),
]
testdata2 = [
    (-10, 4, 20),
    (-20, -10, 2),
    ("cztery", 4, 4),
    (2.2, 0, 10),
    (True, 10, -10),
]


@pytest.mark.parametrize("a,b,c", testdata1)
def test_interval_true(a, b, c):
    assert get_interval(a, b, c)


@pytest.mark.parametrize("a,b,c", testdata2)
def test_interval_false(a, b, c):
    assert not get_interval(a, b, c)
