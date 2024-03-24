package cc.secondbrain.trade.spec;

import cc.secondbrain.trade.entity.TradeHistory;
import cc.secondbrain.trade.entity.TransferHistory;
import com.github.leeonky.jfactory.Global;
import com.github.leeonky.jfactory.Spec;

public class Histories {
    @Global
    public static class 轉帳紀錄 extends Spec<TransferHistory> { }

    public static class 交易紀錄 extends Spec<TradeHistory> { }
}
