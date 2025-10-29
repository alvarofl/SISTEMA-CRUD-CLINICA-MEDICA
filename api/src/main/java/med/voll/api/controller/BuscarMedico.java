    package med.voll.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import  jakarta.transactional.transactional;
        import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.RequestMapping;
    import  org.springframework.web.bind.annotation.RestController;
    @RestController
import  org.springframework.web.bind.annotation.CrossOrigin;
    @CrossOrigin
public class BuscarMedico {
    @GetMapping("/medicos")
        public  String BuscarMedico () {
            return buscarMedico();

        }

}   