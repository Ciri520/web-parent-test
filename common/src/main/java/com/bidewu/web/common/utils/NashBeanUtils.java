package com.bidewu.web.common.utils;

import com.bidewu.web.common.commonmodel.Money;
import com.bidewu.web.common.utils.BeanUtilsConverts.MoneyConvert;
import com.bidewu.web.common.utils.BeanUtilsConverts.NashLongConverter;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

/**
 * zhangjinglei 2017/9/9 下午2:00
 */
public class NashBeanUtils {
    private static boolean hasInit=false;

    public static void copyProperties(Object dest, Object orig){
        if(!hasInit){
            hasInit=true;
            ConvertUtils.deregister(Long.class);
            ConvertUtils.register(new NashLongConverter(),Long.class);
            ConvertUtils.register(new MoneyConvert(),Money.class);
        }
        try {
            BeanUtils.copyProperties(dest, orig);
        }
        catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
