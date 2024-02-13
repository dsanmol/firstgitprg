#include <iostream>
#include <string>
#include <cctype>

std::string correctWord(const std::string& word) {
    int upperCount = 0, lowerCount = 0;
    
    // Count the number of uppercase and lowercase letters
    for (char c : word) {
        if (std::isupper(c)) {
            upperCount++;
        } else {
            lowerCount++;
        }
    }
    
    // Determine the corrected word
    if (upperCount > lowerCount) {
        // Convert to uppercase
        std::string correctedWord = word;
        for (char& c : correctedWord) {
            c = std::toupper(c);
        }
        return correctedWord;
    } else {
        // Convert to lowercase
        std::string correctedWord = word;
        for (char& c : correctedWord) {
            c = std::tolower(c);
        }
        return correctedWord;
    }
}

int main() {
    std::string word;
    std::cin >> word;
    
    std::cout << correctWord(word) << std::endl;
    
    return 0;
}
