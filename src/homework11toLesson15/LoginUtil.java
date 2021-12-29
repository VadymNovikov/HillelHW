import java.util.HashMap;
import java.util.Map;

public class LoginUtil {
    private static Map<String, String> loginData = new HashMap<>();

    static {
        loginData.put("WhiteOcean", "Fish");
        loginData.put("Drakula", "vampire");
        loginData.put("Sidorov", "Sidor05");
        loginData.put("Petrova12", "Petrova12");
        loginData.put("Sergant84", "Myaso");
        loginData.put("Masha74", "new15");
    }

    static boolean isUserAuthentic(String login, String password, String confirmPassword) {
        try {
            if (password == null || !password.equals(confirmPassword)) throw new WrongPasswordException();
            if (login == null) throw new WrongLoginException();
            isLoginValid(login);
            isPasswordValid(password);
        } catch (WrongLoginException | WrongPasswordException exception) {
            return false;
        }
        return true;
    }

    private static void isLoginValid(String login) throws WrongLoginException {
        if (!(login.length() > 0 && login.length() < 20)
                || !login.matches("^[a-zA-Z0-9|_]+$")
                || !loginData.containsKey(login)) {
            throw new WrongLoginException("Login is incorrect");
        }
    }

    private static void isPasswordValid(String password) throws WrongPasswordException {
        if (!(password.length() > 0 && password.length() < 20) || (!password.matches("^[a-zA-Z0-9|_]+$"))
        ) {
            throw new WrongPasswordException("Password is incorrect");
        }
    }
}