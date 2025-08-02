class SpaceAge {
    protected double seconds;
    protected double earthYear = 31557600;

    SpaceAge(double seconds) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.seconds = seconds;
    }

    double getSeconds() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds;
    }

    double onEarth() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / this.earthYear;
    }

    double onMercury() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / (this.earthYear * 0.2408467);
    }

    double onVenus() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / (this.earthYear * 0.61519726);
    }

    double onMars() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / (this.earthYear * 1.8808158);
    }

    double onJupiter() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / (this.earthYear * 11.862615);
    }

    double onSaturn() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / (this.earthYear * 29.447498);
    }

    double onUranus() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / (this.earthYear * 84.016846);
    }

    double onNeptune() {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.seconds / (this.earthYear * 164.79132);
    }

}
