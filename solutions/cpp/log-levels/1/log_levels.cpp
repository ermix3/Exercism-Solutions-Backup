#include <string>

using namespace std;

namespace log_line {
    string message(const string &logLine) {
        return logLine.substr(logLine.find(']') + 3);
    }

    string log_level(const string &logLine) {
        return logLine.substr(1, logLine.find(']') - 1);
    }

    string reformat(const string &logLine) {
        return message(logLine) + " (" + log_level(logLine) + ")";
    }
} // namespace log_line
