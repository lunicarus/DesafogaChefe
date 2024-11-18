package projetos.desafogachefe.domain.usecases.util;

import java.util.Collection;

 public abstract class Verificator<T> {
    public abstract Notification validate(T type);

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static boolean nullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
