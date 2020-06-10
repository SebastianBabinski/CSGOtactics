package babinski.sebastian.controller;

import babinski.sebastian.dao.TacticDao;
import babinski.sebastian.dao.UserDao;
import babinski.sebastian.model.Tactic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TacticController {

    TacticDao tacticDao;
    UserDao userDao;

    @Autowired
    public TacticController(TacticDao tacticDao, UserDao userDao) {
        this.tacticDao = tacticDao;
        this.userDao = userDao;
    }

    @GetMapping("/addtactic")
    public String addTactic(Model model) {
        model.addAttribute("tactic", new Tactic());
        return "tactic/tacticForm";
    }

    @PostMapping("/addtactic")
    public String saveTactic(@Valid Tactic tactic, BindingResult result) {
        if (result.hasErrors()) {
            return "tactic/tacticForm";
        }
        tacticDao.save(tactic);
        return "tactic/success";
    }
}
