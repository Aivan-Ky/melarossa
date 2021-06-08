public class Atm {
    public static void main(String[] args) {

        Card firstCard = new Card("Ivanov", 1234_1234_1234_1234L, "10");
        CurrencyConversion usd = new CurrencyConversion("USD", 2);

        String s = firstCard.convertToDifferentCurrency(usd);


        Card secondCard = new Card("Petrov", 0000_0000_0000_0000L);
        secondCard.setBalance();

        System.out.println("состояние счёта клиента " + secondCard.getHolderName() +
                " составляет: " + secondCard.getBalance());

        System.out.println("состояние счёта клиента " + firstCard.getHolderName() +
                " в валюте " + usd.getCurrencyName() + " составляет: " + s);
    }
}
