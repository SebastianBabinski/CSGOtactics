package babinski.sebastian.controller;

import babinski.sebastian.dao.TacticDao;
import babinski.sebastian.model.Tactic;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MapsController {

    TacticDao tacticDao;

    public MapsController(TacticDao tacticDao) {
        this.tacticDao = tacticDao;
    }

    @RequestMapping(path = "/maps")
    public String goToMaps() {
        return "maps/maps";
    }

    @RequestMapping(path = "maps/dust2")
    public String goToDust2() {
        return "maps/dust2/dust2home";
    }

    @RequestMapping(path = "maps/dust2/ct")
    public String goToDust2Ct() {
        return "maps/dust2/dust2CtTactics";
    }

    @RequestMapping(path = "maps/dust2/terro")
    public String goToDust2T() {
        return "maps/dust2/dust2TerroTactics";
    }

    @RequestMapping(path = "maps/inferno")
    public String goToInferno() {
        return "maps/inferno/infernohome";
    }

    @RequestMapping(path = "maps/inferno/ct")
    public String goToInfernoCt() {
        return "maps/inferno/infernoCtTactics";
    }

    @RequestMapping(path = "maps/inferno/terro")
    public String goToInfernoT() {
        return "maps/inferno/infernoTerroTactics";
    }

    @RequestMapping(path = "maps/mirage")
    public String goToMirage() {
        return "maps/mirage/miragehome";
    }

    @RequestMapping(path = "maps/mirage/ct")
    public String goToMirageCt() {
        return "maps/mirage/mirageCtTactics";
    }

    @RequestMapping(path = "maps/mirage/terro")
    public String goToMirageT() {
        return "maps/mirage/mirageTerroTactics";
    }

    @RequestMapping(path = "maps/nuke")
    public String goToNuke() {
        return "maps/nuke/nukehome";
    }

    @RequestMapping(path = "maps/nuke/ct")
    public String goToNukeCt() {
        return "maps/nuke/nukeCtTactics";
    }

    @RequestMapping(path = "maps/nuke/terro")
    public String goToNukeT() {
        return "maps/nuke/nukeTerroTactics";
    }

    @RequestMapping(path = "maps/overpass")
    public String goToOverpass() {
        return "maps/overpass/overpasshome";
    }

    @RequestMapping(path = "maps/overpass/ct")
    public String goToOverpassCt() {
        return "maps/overpass/overpassCtTactics";
    }

    @RequestMapping(path = "maps/overpass/terro")
    public String goToOverpassT() {
        return "maps/overpass/overpassTerroTactics";
    }

    @RequestMapping(path = "maps/train")
    public String goToTrain() {
        return "maps/train/trainhome";
    }

    @RequestMapping(path = "maps/train/ct")
    public String goToTrainCt() {
        return "maps/train/trainCtTactics";
    }

    @RequestMapping(path = "maps/train/terro")
    public String goToTrainT() {
        return "maps/train/trainTerroTactics";
    }

    @RequestMapping(path = "maps/vertigo")
    public String goToVertigo() {
        return "maps/vertigo/vertigohome";
    }

    @RequestMapping(path = "maps/vertigo/ct")
    public String goToVertigoCt() {
        return "maps/vertigo/vertigoCtTactics";
    }

    @RequestMapping(path = "maps/vertigo/terro")
    public String goToVertigoT() {
        return "maps/vertigo/vertigoTerroTactics";
    }

    @ModelAttribute("tactics")
    public List<Tactic> getAllTactics() {
        return tacticDao.getAllTactics();
    }

    @ModelAttribute("dust2Tactics")
    public List<Tactic> getAllDust2Tactics() {
        return tacticDao.getAllDust2Tactics();
    }

    @ModelAttribute("dust2CtTactics")
    public List<Tactic> getAllDust2CtTactics() {
        return tacticDao.getAllDust2CtTactics();
    }

    @ModelAttribute("dust2TerroTactics")
    public List<Tactic> getAllDust2TerroTactics() {
        return tacticDao.getAllDust2TerroTactics();
    }

    @ModelAttribute("infernoTactics")
    public List<Tactic> getAllInfernoTactics() {
        return tacticDao.getAllInfernoTactics();
    }

    @ModelAttribute("infernoCtTactics")
    public List<Tactic> getAllInfernoCtTactics() {
        return tacticDao.getAllInfernoCtTactics();
    }

    @ModelAttribute("infernoTerroTactics")
    public List<Tactic> getAllInfernoTerroTactics() {
        return tacticDao.getAllInfernoTerroTactics();
    }

    @ModelAttribute("mirageTactics")
    public List<Tactic> getAllMirageTactics() {
        return tacticDao.getAllMirageTactics();
    }

    @ModelAttribute("mirageCtTactics")
    public List<Tactic> getAllMirageCtTactics() {
        return tacticDao.getAllMirageCtTactics();
    }

    @ModelAttribute("mirageTerroTactics")
    public List<Tactic> getAllMirageTerroTactics() {
        return tacticDao.getAllMirageTerroTactics();
    }

    @ModelAttribute("nukeTactics")
    public List<Tactic> getNukeTactics() {
        return tacticDao.getAllNukeTactics();
    }

    @ModelAttribute("nukeCtTactics")
    public List<Tactic> getAllNukeCtTactics() {
        return tacticDao.getAllNukeCtTactics();
    }

    @ModelAttribute("nukeTerroTactics")
    public List<Tactic> getAllNukeTerroTactics() {
        return tacticDao.getAllNukeTerroTactics();
    }

    @ModelAttribute("overpassTactics")
    public List<Tactic> getAllOverpassTactics() {
        return tacticDao.getAllOverpassTactics();
    }

    @ModelAttribute("overpassCtTactics")
    public List<Tactic> getAllOverpassCtTactics() {
        return tacticDao.getAllOverpassCtTactics();
    }

    @ModelAttribute("overpassTerroTactics")
    public List<Tactic> getAllOverpassTerroTactics() {
        return tacticDao.getAllOverpassTerroTactics();
    }

    @ModelAttribute("trainTactics")
    public List<Tactic> getTrainTactics() {
        return tacticDao.getAllTrainTactics();
    }

    @ModelAttribute("trainCtTactics")
    public List<Tactic> getAllTrainCtTactics() {
        return tacticDao.getAllTrainCtTactics();
    }

    @ModelAttribute("trainTerroTactics")
    public List<Tactic> getAllTrainTerroTactics() {
        return tacticDao.getAllTrainTerroTactics();
    }

    @ModelAttribute("vertigoTactics")
    public List<Tactic> getAllVertigoTactics() {
        return tacticDao.getAllVertigoTactics();
    }

    @ModelAttribute("vertigoCtTactics")
    public List<Tactic> getAllVertigoCtTactics() {
        return tacticDao.getAllVertigoCtTactics();
    }

    @ModelAttribute("vertigoTerroTactics")
    public List<Tactic> getAllVertigoTerroTactics() {
        return tacticDao.getAllVertigoTerroTactics();
    }


}
