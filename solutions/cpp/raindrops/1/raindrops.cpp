#include "raindrops.h"

namespace raindrops {
    string convert(int number) {
        string result;
        if (number % 3 == 0) result += "Pling";
        if (number % 5 == 0) result += "Plang";
        if (number % 7 == 0) result += "Plong";
        if (result.empty()) result = to_string(number);

        return result;
    }
}  // namespace raindrops
