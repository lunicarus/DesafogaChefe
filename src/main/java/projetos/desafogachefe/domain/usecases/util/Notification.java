package projetos.desafogachefe.domain.usecases.util;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Notification {

    List<Error> errors = new ArrayList<>();

    public void addError(String message) {
        addError(message, null);
    }

    public void addError(String message, Exception exception) {
        errors.add(new Error(message, exception));
    }

    public boolean isCorrect() {
        return errors.isEmpty();
    }

    public boolean hasErrors() {
        return !isCorrect();
    }

    private static class Error {
        String message;
        Exception cause;

        public Error(String message, Exception cause) {
            this.message = message;
            this.cause = cause;
        }
    }

    public String getErrorMessage() {
        return errors.stream()
                .map(e -> e.message)
                .collect(Collectors.joining("\n"));
    }
}
