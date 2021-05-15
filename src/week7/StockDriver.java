package week7;

public class StockDriver {
    public static void main(String[] args) {
        Stock stock1 = new Stock("GOOG", "Google Inc.");
        stock1.setPreviousClosingPrice(100);
        stock1.setCurrentPrice(90);
        System.out.println(stock1.changePercent());

        Stock stock2 = new Stock("AAPL", "Apple Inc.");
        stock2.setPreviousClosingPrice(121.38);
        stock2.setCurrentPrice(123.37);
        System.out.println(stock2.changePercent());

        Stock stock3 = new Stock("TSLA", "Tesla Inc.");
        stock3.setCurrentPrice(670.0);
        stock3.setPreviousClosingPrice(693.97);
        System.out.println(stock3.changePercent());
    }
}
