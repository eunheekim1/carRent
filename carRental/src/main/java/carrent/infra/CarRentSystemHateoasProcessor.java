package carrent.infra;

import carrent.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CarRentSystemHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CarRentSystem>> {

    @Override
    public EntityModel<CarRentSystem> process(
        EntityModel<CarRentSystem> model
    ) {
        return model;
    }
}
