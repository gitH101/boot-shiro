package com.example.common.sphere;

import io.shardingsphere.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class DatePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Date> {

    private String tablePrefix;

    public DatePreciseShardingAlgorithm(String tablePrefix){
        this.tablePrefix = tablePrefix;
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyMM");
        return tablePrefix +formatter.format(preciseShardingValue.getValue());
    }
}
