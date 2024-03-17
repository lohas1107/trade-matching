package cc.secondbrain.trade.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@Accessors(chain = true)
public class DeliveryAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String accountNumber;

    @OneToOne
    @JoinColumn(name = "investorId", updatable = false)
    @JsonIgnore
    private Investor investor;

    @OneToMany(mappedBy = "deliveryAccount", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransferHistory> transferHistories = new ArrayList<>();
}
