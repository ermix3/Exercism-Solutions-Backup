class Acronym {
    protected String phrase;

    Acronym(String phrase) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.phrase = phrase;
    }

    String get() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String[] words = phrase.split("[\\s-_]+");
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            acronym.append(word.charAt(0));
        }
        return acronym.toString().toUpperCase();
    }

}
