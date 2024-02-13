#include <iostream>
#include <string>

bool isLuckyDigit(char digit) {
    return digit == '4' || digit == '7';
}

int countLuckyDigits(long long number) {
    int count = 0;
    std::string numStr = std::to_string(number);
    for (char digit : numStr) {
        if (digit=='4' || digit=='7') {
            count++;
        }
    }
    return count;
}

bool isNearlyLucky(long long number) {
    int luckyCount = countLuckyDigits(number);
    std::string luckyCountStr = std::to_string(luckyCount);
    for (char digit : luckyCountStr) {
        if (digit != '4' && digit != '7') {
            return false;
        }
    }
    return true;
}

int main() {
    long long n;
    std::cin >> n;

    if (isNearlyLucky(n)) {
        std::cout << "YES" << std::endl;
    } else {
        std::cout << "NO" << std::endl;
    }

    return 0;
}
