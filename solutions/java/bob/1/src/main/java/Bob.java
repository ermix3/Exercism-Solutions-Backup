//class Bob {
//    String hey(String input) {
//        input = input.trim();
//        if (input.isEmpty()) return "Fine. Be that way!";
//        if (input.matches(".*[a-zA-Z]+.*") && input.toUpperCase().equals(input))
//            return input.endsWith("?") ? "Calm down, I know what I'm doing!" : "Whoa, chill out!";
//        return input.endsWith("?") ? "Sure." : "Whatever.";
//    }
//}

class Bob {

    private static final String QUESTION_RESPONSE = "Sure.";
    private static final String DEFAULT_RESPONSE = "Whatever.";
    private static final String SHOUTING_RESPONSE = "Whoa, chill out!";
    private static final String SILENCE_RESPONSE = "Fine. Be that way!";
    private static final String SHOUTING_WITH_QUESTION_RESPONSE = "Calm down, I know what I'm doing!";

    String hey(String input) {
        if (isSilence(input)) {
            return SILENCE_RESPONSE;
        } else if (isShoutingWithQuestion(input)) {
            return SHOUTING_WITH_QUESTION_RESPONSE;
        } else if (isShouting(input)) {
            return SHOUTING_RESPONSE;
        } else if (isQuestion(input)) {
            return QUESTION_RESPONSE;
        }

        return DEFAULT_RESPONSE;
    }

    private boolean isSilence(String input) {
        return input.trim().isEmpty();
    }

    private boolean isShoutingWithQuestion(String input) {
        return isShouting(input) && isQuestion(input);
    }

    private boolean isQuestion(String input) {
        return input.trim().endsWith("?");
    }

    private boolean isShouting(String input) {
        return containsLetters(input) && input.toUpperCase().equals(input);
    }

    private boolean containsLetters(String input) {
        return input.matches(".*[a-zA-Z]+.*");
    }
}