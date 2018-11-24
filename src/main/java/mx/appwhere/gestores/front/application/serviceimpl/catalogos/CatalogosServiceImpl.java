package mx.appwhere.gestores.front.application.serviceimpl.catalogos;

import mx.appwhere.gestores.front.application.dto.AttrCatalogueDto;
import mx.appwhere.gestores.front.domain.services.GenericService;
import mx.appwhere.gestores.front.domain.services.catalogos.CatalogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class CatalogosServiceImpl implements CatalogosService {


    @Value("${cat.jar.bsfCatalogue.claveOperacion}")
    private String urlClaveOperacion;


    @Autowired
    GenericService genericService;



    @Override
    public AttrCatalogueDto[] consultaCatalogoOperaciones() {
        AttrCatalogueDto[] catalogo = genericService.consultarCatalogo(urlClaveOperacion);
        return catalogo;
    }


}
