package com.ces2.clase1.controladores;


import com.ces2.clase1.modelos.Arquitecto;
import com.ces2.clase1.modelos.ArquitectoInteriores;
import com.ces2.clase1.modelos.ArquitectoResidencial;
import com.ces2.clase1.modelos.ArquitectoUrbanista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
public class ControladorArquitecto {
    //PETICION GET PARA ACCEDER
    @GetMapping("/arquitectos")

    public String listar(Model model) {
        StringBuilder resultado = new StringBuilder();

        List<Arquitecto> listaarquitectos = new ArrayList<>();
        listaarquitectos.add(new ArquitectoResidencial( "Yeison Isaza", 0));
        listaarquitectos.add(new ArquitectoUrbanista("Paula Echeverri", 2));
        listaarquitectos.add(new ArquitectoInteriores("Jenny Echeverri" , 1));
        listaarquitectos.add(new ArquitectoResidencial( "Yeison Isaza", 0));
        listaarquitectos.add(new ArquitectoUrbanista("Paula Echeverri", 2));
        listaarquitectos.add(new ArquitectoInteriores("Jenny Echeverri" , 1));
        listaarquitectos.add(new ArquitectoResidencial( "Yeison Isaza", 0));
        listaarquitectos.add(new ArquitectoUrbanista("Paula Echeverri", 2));
        listaarquitectos.add(new ArquitectoInteriores("Jenny Echeverri" , 1));
        listaarquitectos.add(new ArquitectoResidencial( "Yeison Isaza", 0));
        listaarquitectos.add(new ArquitectoUrbanista("Paula Echeverri", 2));
        listaarquitectos.add(new ArquitectoInteriores("Jenny Echeverri" , 1));
        listaarquitectos.add(new ArquitectoResidencial( "Yeison Isaza", 0));
        listaarquitectos.add(new ArquitectoUrbanista("Paula Echeverri", 2));
        listaarquitectos.add(new ArquitectoInteriores("Jenny Echeverri" , 1));

        //EJEMPLO
        //for(Persona a: empleados){
          //  resultado.append( ( (Persona)a).promover((18)) ).append("<br>");
       // }


        for(Arquitecto a: listaarquitectos){
            resultado.append(a.disenarEstructura()).append("  <br> ");

        }

        model.addAttribute("listaarquitectos",listaarquitectos );
        return "vista1";
    }
}
