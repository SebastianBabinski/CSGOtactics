package babinski.sebastian.controller;

import babinski.sebastian.dao.TacticDao;
import babinski.sebastian.dao.UserDao;
import babinski.sebastian.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {

    UserDao userDao;
    TacticDao tacticDao;

    public UserController(UserDao userDao, TacticDao tacticDao) {
        this.userDao = userDao;
        this.tacticDao = tacticDao;
    }

    @RequestMapping(path = "/user/form", method = RequestMethod.GET)
    public String showRegisterForm(@RequestParam(required = false) Long id, Model model) {
        User user = id == null ? new User() : userDao.getById(id);
        model.addAttribute("user", user);
        return "user/registerForm";
    }

    @RequestMapping(path = "/user/form", method = RequestMethod.POST)
    public String saveRegisterForm(@Valid User user, BindingResult userBindingResult) {
        if (userBindingResult.hasErrors()) {
            return "user/registerForm";
        }
        if (user.getId() == null) {
            userDao.save(user);
        } else {
            userDao.update(user);
        }
        return "/user/registerSuccess";
    }

//    @RequestMapping(path = "/user/save")
//    @ResponseBody
//    public String saveUser(@RequestParam String nickName, @RequestParam String email) {
//        User user = new User();
//        user.setNickName(nickName);
//        user.setEmail(email);
//        userDao.save(user);
//        return user.toString();
//    }
//
//    @RequestMapping(path = "/user/update")
//    @ResponseBody
//    public String updateUser(@RequestParam long id, @RequestParam String nickName, @RequestParam String email) {
//        User user = userDao.getById(id);
//        user.setNickName(nickName);
//        user.setEmail(email);
//        userDao.update(user);
//        return user.toString();
//    }
//
//    @RequestMapping(path = "/user/delete")
//    public String deleteUser(@RequestParam long id) {
//        userDao.deleteById(id);
//        return "";
//    }
//
//    @RequestMapping(path = "/user/get")
//    @ResponseBody
//    public String getUser(@RequestParam long id) {
//        return userDao.getById(id).toString();
//    }
}
