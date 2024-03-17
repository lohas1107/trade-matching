package cc.secondbrain.trade.spec;

import cc.secondbrain.trade.entity.Investor;
import cc.secondbrain.trade.entity.SecuritiesAccount;
import com.github.leeonky.jfactory.Global;
import com.github.leeonky.jfactory.Spec;

public class Accounts {
    @Global
    public static class 投資人 extends Spec<Investor> { }

    @Global
    public static class 交割戶 extends Spec<SecuritiesAccount> { }
}
