package selenium_core;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(String Browser){
        DriverManager driverManager = null;
        switch (Browser){
            case"CHROME":{
                driverManager = new ChromeDriverManager();
            }
            break;
        }
        return driverManager;
    }
}
