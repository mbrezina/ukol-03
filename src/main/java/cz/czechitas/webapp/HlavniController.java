package cz.czechitas.webapp;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Stream;

@Controller
public class HlavniController {

    @RequestMapping({"/", "/index.html"})
    public ModelAndView zobrazIndex() {

        ModelAndView drzak = new ModelAndView("index");

        List<kartaPexesa> seznamKarticek = new ArrayList<>();
        seznamKarticek.add(new kartaPexesa("images/amal.jpg","Amálka", 1));
        seznamKarticek.add(new kartaPexesa("images/amal.jpg","Amálka", 2));
        seznamKarticek.add(new kartaPexesa("images/carod.jpg","Malá Čarodějnice", 1));
        seznamKarticek.add(new kartaPexesa("images/carod.jpg","Malá Čarodějnice", 2));
        seznamKarticek.add(new kartaPexesa("images/mak.jpg","Maková panenka", 1));
        seznamKarticek.add(new kartaPexesa("images/mak.jpg","Maková panenka", 2));
        seznamKarticek.add(new kartaPexesa("images/rakos.jpg","Rákosníček", 1));
        seznamKarticek.add(new kartaPexesa("images/rakos.jpg","Rákosníček", 2));
        seznamKarticek.add(new kartaPexesa("images/rum.jpg","Rumcajs", 1));
        seznamKarticek.add(new kartaPexesa("images/rum.jpg","Rumcajs", 2));
        seznamKarticek.add(new kartaPexesa("images/vecer.jpg","Večerníček", 1));
        seznamKarticek.add(new kartaPexesa("images/vecer.jpg","Večerníček", 2));
        seznamKarticek.add(new kartaPexesa("images/staf.jpg","Štaflík", 1));
        seznamKarticek.add(new kartaPexesa("images/staf.jpg","Štaflík", 2));
        seznamKarticek.add(new kartaPexesa("images/sebes.jpg","Šebestová", 1));
        seznamKarticek.add(new kartaPexesa("images/sebes.jpg","Šebestová", 2));

        Collections.shuffle(seznamKarticek);
        drzak.addObject("balicekPexesa", seznamKarticek);
        drzak.addObject("datum", LocalDateTime.now());
        return drzak;
    }

    @RequestMapping("/hraci.html")
    public ModelAndView zobrazHrace() {

        ModelAndView drzak = new ModelAndView("hraci");

        List<Hrac> seznamHracu = new ArrayList<>();
        seznamHracu.add(new Hrac("Pepina" ,"Nováková" ,"kuk@gmail.com", 1, 20, 0));
        seznamHracu.add(new Hrac("Jolka" ,"Krásná" ,"jolka@gmail.com", 9, 20, 0));
        seznamHracu.add(new Hrac("Jiřina" ,"Trávníková" ,"jirina@gmail.com", 2, 20, 0));
        seznamHracu.add(new Hrac("Jana" ,"Kludská" ,"kludsjanagmail.com", 4, 20, 0));
        seznamHracu.add(new Hrac("Ivana" ,"Opršálková" ,"ivop@gmail.com", 5, 20, 0));

        seznamHracu.sort(Comparator.comparing(Hrac::getPocetVyhranychTurnaju).reversed());
        for (int i = 0; i < seznamHracu.size(); i++) {
            seznamHracu.get(i).setPoradi(++i);
            --i;
        }

        drzak.addObject("zebricekHracu", seznamHracu);
        drzak.addObject("datum", LocalDateTime.now());
        return drzak;

    }
}



