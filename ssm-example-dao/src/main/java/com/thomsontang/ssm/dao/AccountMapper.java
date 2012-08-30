package com.thomsontang.ssm.dao;

import com.thomsontang.ssm.domain.Account;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Thomson Tang
 * @since 12-8-17
 */
public interface AccountMapper {

    /**
     * Get account info by accountId.
     * @param accountId
     * @return
     */
    Account getAccountByAccountId(String accountId);
}
