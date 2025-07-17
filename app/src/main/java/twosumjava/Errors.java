package twosumjava;

public class Errors {
    static class NoSolutionException extends Exception {
        public NoSolutionException(String message) {
            super(message);
        }
    }
}
