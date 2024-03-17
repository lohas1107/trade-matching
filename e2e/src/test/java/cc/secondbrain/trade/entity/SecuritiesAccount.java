package cc.secondbrain.trade.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@Accessors(chain = true)
public class SecuritiesAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String accountNumber;

    @OneToOne
    @JoinColumn(name = "investorId", updatable = false)
    @JsonIgnore
    private Investor investor;
}
