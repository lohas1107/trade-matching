package cc.secondbrain.trade.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import net.minidev.json.annotate.JsonIgnore;

@Getter
@Setter
@Entity
@Accessors(chain = true)
public class TradeHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @ManyToOne
    @JsonIgnore
    private SecuritiesAccount securitiesAccount;

    @Enumerated(EnumType.STRING)
    private TradeAction action;

    private String symbol;
    private Double price;
    private int quantity;

    public enum TradeAction {
        BUY, SELL
    }
}
