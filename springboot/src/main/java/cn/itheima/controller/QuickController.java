package cn.itheima.controller;

import cn.itheima.dao.AccountMapper;
import cn.itheima.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {

    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("/quick")
    @ResponseBody
    public Account quick(){
        Account account = accountMapper.selectByPrimaryKey(1);
        return account;
    }
}
