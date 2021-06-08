import java.math.BigDecimal;
import java.util.Scanner;

public class Card {
    private String holderName = "Holder Name";
    private long cardNumber;
    private BigDecimal balance;

    public Card(String holderName, long cardNumber, String balanceSetInString) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        balance = new BigDecimal(balanceSetInString);
        this.balance = balance;
    }

    public Card(String holderName, long cardNumber) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
    }

    public BigDecimal setBalance() {                                        // изменил сеттер правильно ????????
        Scanner inScannerBalance = new Scanner(System.in);
        System.out.print("\nвведите сумму на счету >> ");
        String balanceSetInString = inScannerBalance.next();
        balanceSetInString = balanceSetInString.replace(',', '.');

        if (balanceSetInString.matches("(.*)[^0-9](.*)")) {                 // как добавить точку ??????
            System.out.println("Ошибка при вводе. Повторите ввод.");
            return setBalance();
        } else {
            balance = new BigDecimal(balanceSetInString);
        }
        this.balance = balance;
        return balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String convertToDifferentCurrency (CurrencyConversion currency) {
        return "валюта " + currency.getCurrencyName() + " :" + balance.multiply(new BigDecimal(currency.getConversionRate()));
    }


}
