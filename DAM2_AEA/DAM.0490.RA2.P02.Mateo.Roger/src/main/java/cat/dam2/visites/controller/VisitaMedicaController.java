package cat.dam2.visites.controller;

import cat.dam2.visites.model.VisitaMedica;
import cat.dam2.visites.service.VisitaMedicaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/visites")
public class VisitaMedicaController {

    private final VisitaMedicaService service;

    public VisitaMedicaController(VisitaMedicaService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("visites", service.findAll());
        return "visites/list";
    }

    @GetMapping("/nova")
    public String newForm(Model model) {
        model.addAttribute("visita", new VisitaMedica());
        model.addAttribute("formulariTitol", "Nova visita");
        return "visites/form";
    }

    @PostMapping
    public String create(@Valid @ModelAttribute("visita") VisitaMedica visitaMedica,
                         BindingResult bindingResult,
                         Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("formulariTitol", "Nova visita");
            return "visites/form";
        }
        service.save(visitaMedica);
        redirectAttributes.addFlashAttribute("missatge", "Visita creada correctament.");
        return "redirect:/visites";
    }

    @GetMapping("/{idVisita}/editar")
    public String editForm(@PathVariable Long idVisita, Model model) {
        model.addAttribute("visita", service.findById(idVisita));
        model.addAttribute("formulariTitol", "Editar visita");
        return "visites/form";
    }

    @PostMapping("/{idVisita}")
    public String update(@PathVariable Long idVisita,
                         @Valid @ModelAttribute("visita") VisitaMedica visitaMedica,
                         BindingResult bindingResult,
                         Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("formulariTitol", "Editar visita");
            return "visites/form";
        }
        visitaMedica.setIdVisita(idVisita);
        service.save(visitaMedica);
        redirectAttributes.addFlashAttribute("missatge", "Visita actualitzada correctament.");
        return "redirect:/visites";
    }

    @PostMapping("/{idVisita}/eliminar")
    public String delete(@PathVariable Long idVisita, RedirectAttributes redirectAttributes) {
        service.deleteById(idVisita);
        redirectAttributes.addFlashAttribute("missatge", "Visita eliminada correctament.");
        return "redirect:/visites";
    }
}
