package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import pe.edu.pucp.gtics.lab1221.entity.Games;
import pe.edu.pucp.gtics.lab1221.repository.GamesRepository;

public class GamesController {

    @Autowired
    GamesRepository gamesRepository;



    public String listaJuegos (){
        return "";
    };

    public String editarJuegos(){
        return "";
    };
    @PostMapping("juegos/guardar")
    public String guardarJuegos(Games games){
            gamesRepository.save(games);
            return "redirect:/shipper/list";
    }

    GetMapping("/editar")
    public String guardarJuegos(Model model, @RequestParam("id") int id){
        Optional<Games> optGames = gamesRepository.findById(id);
        if (optShipper.isPresent()){
            Games games = optGames.get();
            model.addAttribute("games", games);
            return "juegos/editar";
        }else{
            return "redirect:/juegos/lista";
        }
    }

}
