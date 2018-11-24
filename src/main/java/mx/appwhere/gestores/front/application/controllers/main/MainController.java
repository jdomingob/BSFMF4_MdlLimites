package mx.appwhere.gestores.front.application.controllers.main;

import mx.appwhere.gestores.front.application.constants.ApplicationConstants;
import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Luis Angel Flores Pérez
 * @version 1.0 07/02/2018
 */
@RestController
@RequestMapping("/menu")
public class MainController {

    private String bsfOperador = "ig6bpA59BmxGAIwqUPcX5SRRxl3om/4vKuu6jFTBSvU5gKmGr1uJw8UtEY0a81/ln/qt7jxIHGE9hcv8i60x9m+mg/Z4N+1nx0qlofT0nH74sfNW6qh2hEr79LhhvpL0HJLnLxUccp1vLRfvIQwT4kBwlLvAL7ej2uS053oRbzf/fZwMmK2XH7c0UZi4lO6CV9ztJEbZPwL6NJ60uka61mQvv8aLRqVHq9CjZXc7sYo7ha9Nq0qjdK5r7yuxn1Vrwh6uj+SE9xWmoqFJcIxMMpdTrXAqpKWGIZHQBp0FtYd3L7A40AgYixRcMnLVYWhMecD0vf3rdtfqfBH1M47COLtFTveYjdzAwYcHW7h/MDBvQco9jjKXsxWWFy3ZOxzmVJgRO9rw/ePi7IR8kwh2Pj3iuuu8JRiyThEjr473gwuhnenWzTuvjurFrAdSuikptrsUG8kauaBddmjr0+/hW11aRaY0BhUv4Kiz/IgwbHovAg6lur2eQwtuKY0DUC5mPB/3guhszDoPRREzbbi6T3VnvSfI1qPjeAz494bnBIblABBUlUKJ6ahPuUi2X89BNM9BMSiu1DBKTOu5aWZ855fspQki4XoAqjVz1URUwuyQj8uEOQ9d+wyx45C/JjAK3WjPFkuZnIxMQZE0C4x+C/+ODgs8ioG6e9JLoUFyKGlqp26IJqvoeEd9Fjw4o5wO3ZKlyFSg78IM2i6stqFdac0bT55OvTD8jvdZ0Jd//dMZQ1yLuR+JNpBwHBGkqjp7aYnRbH8xn8vao78ihhk9fQ==";
    /**
     * Nombre getMainView
     * Propósito Presentar el formulario para enviar mediante POST en bsfOperador
     * Inputs -
     * @return ModelAndView hacia el archivo HTML /main/main.html
     */
    @GetMapping(produces = ApplicationConstants.VIEWS_PRODUCE_HTML)
    public ModelAndView getMainView() {
        ModelAndView mav = new ModelAndView(ViewsLocation.MAIN_VIEW);
        mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
