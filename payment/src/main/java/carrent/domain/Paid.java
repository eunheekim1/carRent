package carrent.domain;

import carrent.domain.*;
import carrent.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long payId;
    private Long rentId;
    private Double rentCost;

    public Paid(Payment aggregate) {
        super(aggregate);
    }

    public Paid() {
        super();
    }
    // keep

}
