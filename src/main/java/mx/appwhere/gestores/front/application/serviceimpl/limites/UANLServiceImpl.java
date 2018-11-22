package mx.appwhere.gestores.front.application.serviceimpl.limites;

import mx.appwhere.gestores.front.domain.services.ConverterService;
import mx.appwhere.gestores.front.domain.util.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UANLServiceImpl {

    private RestClient restClient;

    private ConverterService converterService;

    @Autowired
    public UANLServiceImpl(RestClient restClient, ConverterService converterService) {
        this.restClient = restClient;
        this.converterService = converterService;
    }


}
