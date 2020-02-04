
package MoneyCalculator;

import Control.CalculateCommand;
import Persistence.CurrencyListLoader;
import Persistence.Files.FileCurrencyListLoader;
import Persistence.Rest.RestExchangeRateLoader;

public class Main {

    public static void main(String[] args) {
        CurrencyListLoader currencyLoader = new FileCurrencyListLoader("currencies");
        RestExchangeRateLoader exchangeRateLoader = new RestExchangeRateLoader();
        MainFrame mainFrame = new MainFrame(currencyLoader.currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDisplay(), mainFrame.getMoneyDialog(),exchangeRateLoader));
    }

}