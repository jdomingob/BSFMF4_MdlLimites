package mx.appwhere.gestores.front.application.controllers.limites;


import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LimitesController {


    @PostMapping("vista-principal")
    public ModelAndView getSecondaryView(@RequestParam("BSFOPERADOR") String bsfOperador) {
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_PRINCIPAL);
        return mv;
    }

    @PostMapping("vista-limites")
    public ModelAndView getMainView(@RequestParam(required=false) String bsfOperador) {
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_LIMITES);
        return mv;
    }



}
