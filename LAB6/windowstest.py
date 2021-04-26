import unittest
from LAB6.main import Testowana


class MyTestCase(unittest.TestCase):
    a = Testowana("windows")

    def test_help(self):
        wynik = Testowana.generate_help(self.a, "cd")
        self.assertIsNotNone(wynik)

    def test_desc_index_error_handling(self):
        wynik = Testowana.get_desc(self.a, "cd")
        self.assertEqual(IndexError, wynik)

    def test_desc(self):
        wynik = Testowana.get_desc(self.a, "cd /d")
        self.assertIsNotNone(wynik)

    def test_desc_key_error_handling(self):
        wynik = Testowana.get_desc(self.a, "l v")
        self.assertEqual(KeyError, wynik)

    def test_help_none_return(self):
        wynik = Testowana.get_desc(self.a, "cd v")
        self.assertIsNone(wynik)


if __name__ == '__main__':
    unittest.main()
