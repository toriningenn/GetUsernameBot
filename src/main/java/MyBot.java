import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class MyBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
                .setChatId(update.getMessage().getChatId())
                .setText(update.getMessage().getForwardFrom().getFirstName());
        try {
            execute(message); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    public String getBotUsername() {
        return "getthatusernamebot";
    }

    public String getBotToken() {
        return System.getenv("TOKEN");
    }
}
