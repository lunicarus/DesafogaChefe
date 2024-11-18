package projetos.desafogachefe.domain.entities;

import org.mindrot.jbcrypt.BCrypt;

import java.util.UUID;
import java.util.regex.Pattern;

public abstract class User {
    private final UUID id;
    private String login;
    private String password;

    public User(String login, String password) {
        this.id = UUID.randomUUID();
        setLogin(login);
        setPassword(password);
    }

    public UUID getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        if (isValidLogin(login)) {
            this.login = login;
        } else {
            throw new IllegalArgumentException("Invalid login format.");
        }
    }

    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = hashPassword(password);
        } else {
            throw new IllegalArgumentException("Password must meet security requirements.");
        }
    }

    // Check if login meets certain requirements
    private boolean isValidLogin(String login) {
        return login != null && login.length() >= 5; // Example: login must be at least 5 characters
    }

    // Validate password complexity (example: min 8 chars, 1 digit, 1 uppercase)
    private boolean isValidPassword(String password) {
        if (password == null) return false;
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z]).{8,}$");
        return pattern.matcher(password).matches();
    }

    // Hash the password securely using BCrypt
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Verify a password against the stored hash
    public boolean verifyPassword(String password) {
        return BCrypt.checkpw(password, this.password);
    }
}
