package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DistributorsController {

    @GetMapping("/games")
    public String listaDistribuidoras (){

        return "/juegos/lista";
    };

    public String editarDistribuidoras(){
        return "";
    };

    public String nuevaDistribuidora(){
        return "";
    };

    public String guardarDistribuidora(){
        return "";
    };

    public String borrarDistribuidora(){
        return "";
    };

}
