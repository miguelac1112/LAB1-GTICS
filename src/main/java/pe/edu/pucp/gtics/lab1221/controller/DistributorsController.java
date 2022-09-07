package pe.edu.pucp.gtics.lab1221.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.pucp.gtics.lab1221.entity.Distributors;
import pe.edu.pucp.gtics.lab1221.repository.DistributorsRepository;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/distribuidoras")
public class DistributorsController {

    @Autowired
    DistributorsRepository distributorsRepository;


    @GetMapping(value = {"/lista"})
    public String listaDistribuidoras (Model model){
        List<Distributors> listaDistributors = distributorsRepository.findAll(Sort.by("nombre"));
        model.addAttribute("listaDistributors",listaDistributors);
        return "distribuidoras/lista";
    }

    @GetMapping("/editar")
    public String editarDistribuidoras(Model model, @RequestParam("id") Integer id){
        Optional<Distributors> optionalDistributors = distributorsRepository.findById(id);
        if (optionalDistributors.isPresent()){
            Distributors distributors = optionalDistributors.get();
            model.addAttribute("distribuidora",distributors);
        }
        return "distribuidoras/editar";
    }

    @GetMapping("/nuevo")
    public String nuevaDistribuidora(){
        return "distribuidoras/nuevo";
    }

    @PostMapping("/guardar")
    public String guardarDistribuidora(Distributors distributors){
        distributorsRepository.save(distributors);
        return "redirect:/distribuidoras/lista";
    }

    @GetMapping("/borrar")
    public String borrarDistribuidora(@RequestParam("id") Integer id){
        distributorsRepository.deleteById(id);
        return "redirect:/distribuidoras/lista";
    }

}
