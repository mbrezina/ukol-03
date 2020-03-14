package cz.czechitas.webapp;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.*;

@Controller
public class HlavniController {

    List <Polozka> polozkyKosiku = new Arraylist<>();

    private static final List<kartaPexesa> SEZNAMKARTICEK = asList(
            new kartaPexesa("images/amal.jpg", "Amálka", 1),
            new kartaPexesa("images/amal.jpg", "Amálka", 2),
            new kartaPexesa("images/carod.jpg", "Malá Čarodějnice", 1),
            new kartaPexesa("images/carod.jpg", "Malá Čarodějnice", 2),
            new kartaPexesa("images/mak.jpg", "Maková panenka", 1),
            new kartaPexesa("images/mak.jpg", "Maková panenka", 2),
            new kartaPexesa("images/rakos.jpg", "Rákosníček", 1),
            new kartaPexesa("images/rakos.jpg", "Rákosníček", 2),
            new kartaPexesa("images/rum.jpg", "Rumcajs", 1),
            new kartaPexesa("images/rum.jpg", "Rumcajs", 2),
            new kartaPexesa("images/vecer.jpg", "Večerníček", 1),
            new kartaPexesa("images/vecer.jpg", "Večerníček", 2),
            new kartaPexesa("images/staf.jpg", "Štaflík", 1),
            new kartaPexesa("images/staf.jpg", "Štaflík", 2),
            new kartaPexesa("images/sebes.jpg", "Šebestová", 1),
            new kartaPexesa("images/sebes.jpg", "Šebestová", 2)
    );

    private static final List<Hrac> SEZNAMHRACU = asList(
            new Hrac("Pepina", "Nováková", "kuk@gmail.com", 1, 20, 0),
            new Hrac("Jolka", "Krásná", "jolka@gmail.com", 9, 20, 0),
            new Hrac("Jiřina", "Trávníková", "jirina@gmail.com", 2, 20, 0),
            new Hrac("Jana", "Kludská", "kludsjanagmail.com", 4, 20, 0),
            new Hrac("Ivana", "Opršálková", "ivop@gmail.com", 5, 20, 0)
    );


    @RequestMapping({"/", "/index.html"})
    public ModelAndView zobrazIndex() {

        ModelAndView drzak = new ModelAndView("index");
        Collections.shuffle(SEZNAMKARTICEK);
        drzak.addObject("balicekPexesa", SEZNAMKARTICEK);
        drzak.addObject("datum", LocalDateTime.now());
        return drzak;
    }

    @RequestMapping("/hraci.html")
    public ModelAndView zobrazHrace() {

        ModelAndView drzak = new ModelAndView("hraci");
        SEZNAMHRACU.sort(Comparator.comparing(Hrac::getPocetVyhranychTurnaju).reversed());
        for (int i = 0; i < SEZNAMHRACU.size(); i++) {
            SEZNAMHRACU.get(i).setPoradi(++i);
            --i;
        }

        drzak.addObject("zebricekHracu", SEZNAMHRACU);
        drzak.addObject("datum", LocalDateTime.now());
        return drzak;

    }
}



