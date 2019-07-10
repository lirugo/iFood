package ua.iFood.exceptions;

public class FoodNotFoundException extends RuntimeException {
    public FoodNotFoundException(Long id) {
        super("404 Could not find food " + id);
    }
}