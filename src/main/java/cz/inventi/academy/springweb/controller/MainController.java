package cz.inventi.academy.springweb.controller;

import java.util.Locale;

import javax.validation.Valid;

import cz.inventi.academy.springweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.inventi.academy.springweb.model.Book;
import org.springframework.web.bind.annotation.RequestMethod;

//TODO: Write annotation for controller
@Controller
public class MainController {

    // TODO: Define bookService and messageSource parameter and inject it via spring annotation

    @Autowired
    BookService bookService;
    @Autowired
    MessageSource messageSource;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    // TODO: Add @RequestMapping with correct parameters (value, method)
    @RequestMapping(value="/list", method= RequestMethod.GET)
    public String list(Model model) {
        // TODO: Load all books
        // TODO: Add books to model
        model.addAttribute("books", bookService.loadBooks());
        return "list";
    }

//    // TODO: Add @RequestMapping with correct parameters (value, method)
//    public String formEdit(Model model) {
//        // TODO: Add new book to model
//        return "edit";
//    }
//
//    // TODO: Add @RequestMapping with correct parameters (value, method)
//    public String formSave(//TODO: Use correct types (validate input book)) {
//        // TODO: When there are no error, then save book and add text message ("info.book.saved") to model from resource bundle
//        return "edit";
//    }
//
//    // TODO: Add @RequestMapping with correct parameters (value, method)
//    public String delete(//TODO: Use correct types (e.g. PathVariable)) {
//        // TODO: Delete book by id
//        // TODO: Load all books
//        // TODO: Add books to model
//        return "redirect:/list";
//    }
}