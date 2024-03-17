package cc.secondbrain.trade.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@Accessors(chain = true)
public class Investor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private LocalDate birthday;

    @OneToOne(mappedBy = "investor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private DeliveryAccount deliveryAccount;

    @OneToOne(mappedBy = "investor", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private SecuritiesAccount securitiesAccount;
}