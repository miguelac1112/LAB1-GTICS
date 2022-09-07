package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.pucp.gtics.lab1221.repository.DistributorsRepository;

@Controller
@RequestMapping("/distribuidoras")
public class DistributorsController {

    @Autowired
    DistributorsRepository distributorsRepository;


    @GetMapping(value = {"/lista"})
    public String listaDistribuidoras (){
        return "";
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
