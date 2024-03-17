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

    private String account_number;

    @OneToOne
    @JoinColumn(name = "investor_id", updatable = false)
    @JsonIgnore
    private Investor investor;

    @OneToMany(mappedBy = "delivery_account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransferHistory> transfer_histories = new ArrayList<>();
}
