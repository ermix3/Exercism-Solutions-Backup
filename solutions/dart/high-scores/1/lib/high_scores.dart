import 'dart:math';

class HighScores {
  List<int> scores;
  late List<int> sortedScores;

  HighScores(this.scores) {
    sortedScores = scores.toList();
    sortedScores.sort((a, b) => b - a);
  }

  int latest() => this.scores.last;

  int personalBest() => this.scores.reduce(max);

  List personalTopThree() {
    return this.sortedScores.take(3).toList();
  }
}
