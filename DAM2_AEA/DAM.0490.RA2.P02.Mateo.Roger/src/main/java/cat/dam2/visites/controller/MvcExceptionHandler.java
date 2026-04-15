package cat.dam2.visites.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice(assignableTypes = VisitaMedicaController.class)
public class MvcExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public String handleNoSuchElement(NoSuchElementException ex, Model model) {
        model.addAttribute("errorMissatge", ex.getMessage());
        return "error/404";
    }
}
