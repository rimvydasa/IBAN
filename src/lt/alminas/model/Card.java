package lt.alminas.model;

import java.math.BigInteger;


/**
 * Provides card information
 * Card number may be correct or incorrect
 */
public class Card {

//https://www.iban.com/structure

    /**
     * The modules of dividend.
     */
    private BigInteger IBAN_CHECKSUM_DIVIDEND = new BigInteger("97");
    /**
     * Minimum length of the country IBAN structure
     */
    private int IBAN_NUMBER_MIN_SIZE = 15;
    /**
     * Maximum length of the country IBAN structure
     */
    private int IBAN_NUMBER_MAX_SIZE = 32;

    public Card() {

    }

    /** Gets an IBAN exists or not.
     * @param accountNumber, The IBAN.
     * @return A boolean representing IBAN  validator.
     */
    public boolean ibanNumberCheck(String accountNumber) {

        StringBuilder numericOfLetter = new StringBuilder();
        String newAccountNumber = accountNumber.trim();
        try {
            if(newAccountNumber.length() >= IBAN_NUMBER_MIN_SIZE && newAccountNumber.length() <= IBAN_NUMBER_MAX_SIZE) {

                newAccountNumber = newAccountNumber.substring(4) + newAccountNumber.substring(0, 4);

                for (int i = 0; i < newAccountNumber.length(); i++) {
                    numericOfLetter.append(Character.getNumericValue(newAccountNumber.charAt(i)));
                }
                BigInteger ibanNumber = new BigInteger(numericOfLetter.toString());
                return ibanNumber.mod(IBAN_CHECKSUM_DIVIDEND).intValue() == 1;
            }
        } catch (Exception ex) {

            System.out.println("IbanNumberCheck" + ex.getMessage());
        }
        return false;
    }
}
