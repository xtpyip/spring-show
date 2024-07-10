package com.pyip.edu.service.impl;

import com.pyip.edu.annotion.MyAutowired;
import com.pyip.edu.annotion.MyService;
import com.pyip.edu.annotion.MyTransactional;
import com.pyip.edu.dao.AccountDao;
import com.pyip.edu.pojo.Account;
import com.pyip.edu.service.TransferService;

@MyService("transferService")
@MyTransactional
public class TransferServiceImpl implements TransferService {

    // 最佳状态
    @MyAutowired
    private AccountDao accountDao;

    // 构造函数传值/set方法传值

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }



    @Override
    public void transfer(String fromCardNo, String toCardNo, int money) throws Exception {
            Account from = accountDao.queryAccountByCardNo(fromCardNo);
            Account to = accountDao.queryAccountByCardNo(toCardNo);

            from.setMoney(from.getMoney()-money);
            to.setMoney(to.getMoney()+money);

            accountDao.updateAccountByCardNo(to);
            int c = 1/0;
            accountDao.updateAccountByCardNo(from);

    }
}
