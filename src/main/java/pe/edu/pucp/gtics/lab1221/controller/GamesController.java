package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public class GamesController {

    public String listaJuegos (){
        return "";
    };

    public String editarJuegos(){
        return "";
    };

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
