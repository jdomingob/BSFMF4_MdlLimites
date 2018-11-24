package mx.appwhere.gestores.front.application.serviceimpl.catalogos;

import mx.appwhere.gestores.front.application.dto.AttrCatalogueDto;
import mx.appwhere.gestores.front.application.dto.AttrCatalogueSetDto;
import mx.appwhere.gestores.front.domain.services.GenericService;
import mx.appwhere.gestores.front.domain.services.catalogos.CatalogoSetService;
import mx.appwhere.gestores.front.domain.services.catalogos.CatalogosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CatalogoSetServiceImp implements CatalogoSetService {


    @Value("${cat.jar.bsfCatalogue.generalMoneda}")
    private String urlGeneralMoneda;

    @Autowired
    GenericService genericService;




    @Override
    public AttrCatalogueSetDto[] consultaCatalogoMonedas() {
        AttrCatalogueSetDto[] catalogo = genericService.consultarCatalogoSet(urlGeneralMoneda);
        return catalogo;
    }
}
