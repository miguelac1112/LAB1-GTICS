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

}
