package simplilearn.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class PurchaseId implements Serializable {
    private static final long serialVersionUID = 2702030623316532366L;

    private Long order_id;
    private Long category;
    private Long product_id;

}
