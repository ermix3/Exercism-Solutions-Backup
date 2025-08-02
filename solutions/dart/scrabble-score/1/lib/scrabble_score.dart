// Put your code here
int score(String word) {
  int score = 0;
  List<String> letters = word.split('');
  Map<String, int> lettersWithValue = {
    "AEIOULNRST": 1,
    "DG": 2,
    "BCMP": 3,
    "FHVWY": 4,
    "K": 5,
    "JX": 8,
    "QZ": 10
  };
  letters.forEach((letter) {
    lettersWithValue.forEach((key, value) {
      if (key.contains(letter.toUpperCase())) {
        score += value;
      }
    });
  });
  return score;
}
