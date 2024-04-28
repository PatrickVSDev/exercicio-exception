package aulaExcecoes;

public class ValorDadoInvalidoException extends RuntimeException {
    public ValorDadoInvalidoException() {
    }

    public ValorDadoInvalidoException(String message) {
        super(message);
    }

    public ValorDadoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValorDadoInvalidoException(Throwable cause) {
        super(cause);
    }

    public ValorDadoInvalidoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
