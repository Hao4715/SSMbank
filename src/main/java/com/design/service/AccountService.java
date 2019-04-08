package com.design.service;

import com.design.pojo.Account;

public interface AccountService {
    Account existsCardNo(String cardNo);

    double queryBalance(String cardNo);
}
