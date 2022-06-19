package by.itstep.nmrsk.javastages.stage20.model.exception;

public class SomeTechnicalException extends TechnicalConfectioneryProductsException{
    public SomeTechnicalException() {
        super();
    }


    public SomeTechnicalException(String message) {
        super(message);
    }


    public SomeTechnicalException(String message, Throwable cause) {
        super(message, cause);
    }


    public SomeTechnicalException(Throwable cause) {
        super(cause);
    }
}
