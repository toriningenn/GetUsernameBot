import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        System.out.println("lol" + System.getenv().get("TOKEN"));
        TelegramBotsApi botsApi = new TelegramBotsApi();

                try {
                    botsApi.registerBot(new MyBot());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
