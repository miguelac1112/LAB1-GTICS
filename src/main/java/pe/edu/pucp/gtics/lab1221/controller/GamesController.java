package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.pucp.gtics.lab1221.entity.Games;
import pe.edu.pucp.gtics.lab1221.repository.GamesRepository;

import java.util.List;
import java.util.Optional;

public class GamesController {

    @Autowired
    GamesRepository gamesRepository;


    @GetMapping(value = {"/lista", ""})
    public String listaJuegos (Model model){
        List<Games> lista = gamesRepository.findAll();
        model.addAttribute("gamesList", lista);

        return "juegos/lista";
    };

    public String editarJuegos(){
        return "";
    };
    @PostMapping("juegos/guardar")
    public String guardarJuegos(Games games){
            gamesRepository.save(games);
            return "redirect:/shipper/list";
    }

    @GetMapping("/editar")
    public String editarJuegos(Model model, @RequestParam("id") int id){
        Optional<Games> optGames = gamesRepository.findById(id);
        if (optGames.isPresent()){
            Games games = optGames.get();
            model.addAttribute("games", games);
            return "juegos/editar";
        }else{
            return "redirect:/juegos/lista";
        }
    }

}
