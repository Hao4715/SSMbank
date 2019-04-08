package com.design.service.impl;

import com.design.mapper.AccountMapper;
import com.design.pojo.Account;
import com.design.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account existsCardNo(String cardNo) {
        return accountMapper.selectBycardNo(cardNo);
    }

    @Override
    public double queryBalance(String cardNo) {
        return accountMapper.queryBalance(cardNo);
    }
}
