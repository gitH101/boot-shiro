package com.example.common.sphere;

import com.google.common.collect.Range;
import io.shardingsphere.core.api.algorithm.sharding.RangeShardingValue;
import io.shardingsphere.core.api.algorithm.sharding.standard.RangeShardingAlgorithm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class DateRangeShardingAlgorithm implements RangeShardingAlgorithm<Date> {

    private String tablePrefix;

    public DateRangeShardingAlgorithm(String tablePrefix){
        this.tablePrefix = tablePrefix;
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Date> rangeShardingValue) {
        Collection<String> result = new HashSet<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMM");
        Range<Date> range = rangeShardingValue.getValueRange();
        Date startTime = range.lowerEndpoint();
        Date endTime = range.upperEndpoint();

        Calendar cal = Calendar.getInstance();

        while(startTime.getTime() <= endTime.getTime()) {
            result.add(tablePrefix + sdf.format(startTime));
            cal.setTime(startTime);//设置起时间
            cal.add(Calendar.MONTH, 1);
            startTime = cal.getTime();
        }
        return result;
    }
}
