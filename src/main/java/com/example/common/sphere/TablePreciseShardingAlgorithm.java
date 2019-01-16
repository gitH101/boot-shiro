package com.example.common.sphere;

import io.shardingsphere.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;
import java.util.Date;

public final class TablePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    // 动态分表

    @Override
    public String doSharding(final Collection<String> availableTargetNames, final PreciseShardingValue<Long> shardingValue) {
        int size = availableTargetNames.size();
        for (String each : availableTargetNames) {
            if (each.endsWith(shardingValue.getValue() % size + "")) {
                return each;
            }
            if(size == 1){
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
