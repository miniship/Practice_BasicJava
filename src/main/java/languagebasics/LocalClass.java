package languagebasics;

import java.util.Objects;

public class LocalClass {
    private String regularExpression = "[^0-9]";

    public boolean validatePhoneNumber(String number) {
        int numberLength = 10;

        class PhoneNumber {
            private String formattedNumber;

            private PhoneNumber(String number) {
                String currentNumber = number.replaceAll(regularExpression, "");
                if (currentNumber.length() == numberLength) {
                    formattedNumber = currentNumber;
                } else {
                    formattedNumber = null;
                }
            }
        }

        PhoneNumber phoneNumber = new PhoneNumber(number);
        return Objects.nonNull(phoneNumber.formattedNumber);
    }
}
