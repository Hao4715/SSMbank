package com.design.mapper;

import com.design.pojo.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    Account selectBycardNo(@Param("cardNo") String cardNo);

    double queryBalance(@Param("cardNo") String cardNo);
}
