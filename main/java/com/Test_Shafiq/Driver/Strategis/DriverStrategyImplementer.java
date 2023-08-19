package com.Test_Shafiq.Driver.Strategis;


import com.Test_Shafiq.Utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

        //    case Constants.FIREFOX:
        //        return new Firefox();

            default:
                return null;
        }
    }
}
