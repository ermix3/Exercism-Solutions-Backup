namespace targets {
    class Alien {
    public:
        int x_coordinate;
        int y_coordinate;
        int health;
        Alien(int x, int y) {
            x_coordinate = x;
            y_coordinate = y;
            health = 3;
        }
        int get_health() {
            return health;
        }
        bool hit() {
            health--;
            return true;
        }
        bool is_alive() {
            return health > 0;
        }
        bool teleport(int x, int y) {
            x_coordinate = x;
            y_coordinate = y;
            return true;
        }
//        collision_detection
        bool collision_detection(Alien alien) {
            return x_coordinate == alien.x_coordinate && y_coordinate == alien.y_coordinate;
        }
    };
}  // namespace targets