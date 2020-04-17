package org.development.webapp.Controller;

import org.development.webapp.model.LoginBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String init(Model model) {
    model.addAttribute("msg", "Please Enter Your Login Details");
    return "login";
  }

  @RequestMapping(method = RequestMethod.POST)
  public String submit(Model model, @ModelAttribute("submitForm") LoginBean loginBean) {
    if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
      if (loginBean.getUserName().equals("admin") && loginBean.getPassword().equals("admin")) {
        model.addAttribute("msg", loginBean.getUserName());
        return "success";
      } else {
        model.addAttribute("error", "Invalid Details");
        return "login";
      }
    } else {
      model.addAttribute("error", "Please enter Details");
      return "login";
    }
  }
  
  @RequestMapping(value = "/ashok", method = RequestMethod.GET)
  public String showAshok(Model model) {
    return "ashok";
  }
  
  @RequestMapping(value = "/vijay", method = RequestMethod.GET)
  public String showVijay(Model model) {
    return "vijay";
  }
  
  @RequestMapping(value = "/ganesan", method = RequestMethod.GET)
  public String showGanesan(Model model) {
    return "ganesan";
  }
  
  @RequestMapping(value = "/manju", method = RequestMethod.GET)
  public String showManju(Model model) {
    return "manju";
  }
  
  @RequestMapping(value = "/vidhya", method = RequestMethod.GET)
  public String showVidhya(Model model) {
    return "vidhya";
  }
  
  @RequestMapping(value = "/success", method = RequestMethod.GET)
  public String showLogged(Model model) {
    return "success";
  }
  
  public int add(int a , int b) {
	  return a + b;
  }
  
  
  
}