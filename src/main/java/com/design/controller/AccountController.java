package com.design.controller;


import com.design.pojo.Account;
import com.design.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/loginPage")
    public String loginPage(){
        return "loginpage";
    }

    @RequestMapping("/login")
    public String login(Account account, Model model,HttpSession session){
        Account account1 = accountService.existsCardNo(account.getCardNo());
        if(account1 == null) {
            model.addAttribute("errorMsg", "用户不存在,卡号错误");
            return "loginpage";
        } else {
            if(!account1.getPassword().equals(account.getPassword())) {
                model.addAttribute("errorMsg", "密码错误");
                return "loginpage";
            }else {
                if(account1.getStatus() == 0){
                    model.addAttribute("errorMsg","用户被冻结");
                    return "loginpage";
                }else {
                    session.setAttribute("account1",account1);
                    model.addAttribute("errorMsg","登录成功");
                    return "main";
                }
            }
        }

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("account1");
        session.invalidate();
        System.out.println("拜拜咯");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/balance/{cardNo}")
    public String balance(@PathVariable("cardNo") String cardNo,Model model){
        double balance = accountService.queryBalance(cardNo);
        model.addAttribute("balance",balance);
        model.addAttribute("page","balance");
        return "main";
    }

    @RequestMapping("/transferTo")
    public String transferTo(Model model){
        model.addAttribute("page","transfer");
        return "main";
    }

    @RequestMapping("/transfer")
    public String transfer(Model model, @RequestParam("cardNo") String cardNo, @RequestParam("transactionAmount")Double transactionAmount , HttpSession session){
//        System.out.println(cardNo);
//        System.out.println(transactionAmount);
//        Account account = (Account) session.getAttribute("account1");
//        System.out.println(account.getCardNo());

        return "main";
    }


}
