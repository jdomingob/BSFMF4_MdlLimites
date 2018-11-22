package mx.appwhere.limites.front.application.serviceimpl.limites;

import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import mx.appwhere.gestores.front.domain.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LimitesServiceImpl implements mx.appwhere.gestores.front.domain.services.gestores.LimitesService {

    @Autowired
    GenericService genericService;


    @Override
    public ModelAndView getMainView(String bsfOperador) {
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_LIMITES);
        return mv;
    }

}
