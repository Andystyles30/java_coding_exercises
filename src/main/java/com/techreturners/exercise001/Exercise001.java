package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if(word == null || word.isEmpty()) {
            return word;
        }
    
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0, 1) + '.' + lastName.substring(0, 1);
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = ( originalPrice / 100 ) * vatRate;
        double result = originalPrice + vat;
        return Math.round(result * 100.0) / 100.0; // Using this to round to two decimal places - theres probably a better solution.
    }

    public String reverse(String sentence) {
        String sentenceReversed = new StringBuilder(sentence).reverse().toString();
        return sentenceReversed;
    }

    public int countLinuxUsers(List<User> users) {
        // DID TRY THIS BUT LAMBDA EXPRESSIONS NOT SUPPORTED IN THIS VERSION
        // long countLinuxUsers = users
        //     .stream()
        //     .filter(elem -> elem.getType() == "Linux")
        //     .count();
        int countLinuxUsers = 0;
        for (User user : users) {
            if (user.getType() == "Linux") {
            countLinuxUsers++;
            }
        }
        return countLinuxUsers;
    }
}
