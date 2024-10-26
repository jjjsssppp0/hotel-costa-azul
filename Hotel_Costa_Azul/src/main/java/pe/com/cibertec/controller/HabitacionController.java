package pe.com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import pe.com.cibertec.model.HabitacionEntity; // Cambiado a HabitacionEntity
import pe.com.cibertec.service.HabitacionService; // Cambiado a HabitacionService
import pe.com.cibertec.service.UsuarioService;
import pe.com.cibertec.service.impl.PdfService;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/habitaciones") // Cambiado a habitaciones
public class HabitacionController {

    @Autowired
    private HabitacionService habitacionService; // Cambiado a HabitacionService
    @Autowired
    private PdfService pdfService;

    @GetMapping("/menu")
    public String listarHabitaciones(Model model) {
        List<HabitacionEntity> habitaciones = habitacionService.buscarTodasHabitaciones(); // Cambiado a buscarTodasHabitaciones
        model.addAttribute("habitaciones", habitaciones);
        return "menu"; // Puedes cambiar a una vista específica de habitaciones si lo deseas
    }

    @GetMapping("/ver/{id}")
    public String verHabitacion(@PathVariable("id") Integer id, Model model) {
        HabitacionEntity habitacion = habitacionService.buscarHabitacionPorId(id); // Cambiado a buscarHabitacionPorId
        model.addAttribute("habitacion", habitacion);
        return "ver_habitacion"; // Cambia a la vista correspondiente
    }

    @GetMapping("/crear")
    public String mostrarFormularioCrear(Model model) {
        model.addAttribute("habitacion", new HabitacionEntity());
        return "crear_habitacion"; // Cambia a la vista de creación de habitaciones
    }

    @PostMapping("/crear")
    public String crearHabitacion(@ModelAttribute("habitacion") HabitacionEntity habitacion) {
        habitacionService.crearHabitacion(habitacion); // Cambiado a crearHabitacion
        return "redirect:/habitaciones/menu"; // Cambiado a habitaciones
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Integer id, Model model) {
        HabitacionEntity habitacion = habitacionService.buscarHabitacionPorId(id); // Cambiado a buscarHabitacionPorId
        model.addAttribute("habitacion", habitacion);
        return "editar_habitacion"; // Cambia a la vista de edición de habitaciones
    }

    @PostMapping("/editar")
    public String actualizarHabitacion(@ModelAttribute("habitacion") HabitacionEntity habitacion) {
        habitacionService.actualizarHabitacion(habitacion); // Cambiado a actualizarHabitacion
        return "redirect:/habitaciones/menu"; // Cambiado a habitaciones
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarHabitacion(@PathVariable("id") Integer id) {
        habitacionService.eliminarHabitacion(id); // Cambiado a eliminarHabitacion
        return "redirect:/habitaciones/menu"; // Cambiado a habitaciones
    }

    @GetMapping("/generar_pdf")
    public ResponseEntity<InputStreamResource> generarPdf() throws IOException {
        List<HabitacionEntity> habitaciones = habitacionService.buscarTodasHabitaciones(); // Cambiado a buscarTodasHabitaciones
        Map<String, Object> datosPdf = new HashMap<>();
        datosPdf.put("habitaciones", habitaciones); // Cambiado a habitaciones

        ByteArrayInputStream pdfBytes = pdfService.generarPdf("template_pdf", datosPdf);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=habitaciones.pdf"); // Cambiado a habitaciones.pdf

        return ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdfBytes));
        
        
        
        
    }
}
