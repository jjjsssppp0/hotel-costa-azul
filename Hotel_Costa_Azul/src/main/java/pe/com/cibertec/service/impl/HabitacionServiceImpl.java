package pe.com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.cibertec.model.HabitacionEntity;
import pe.com.cibertec.repository.HabitacionRepository; // Asegúrate de que este repositorio esté bien definido
import pe.com.cibertec.service.HabitacionService;

import java.util.List;

@Service
public class HabitacionServiceImpl implements HabitacionService {

    @Autowired
    private HabitacionRepository habitacionRepository;

    @Override
    public List<HabitacionEntity> buscarTodasHabitaciones() {
        return habitacionRepository.findAll();
    }

    @Override
    public HabitacionEntity buscarHabitacionPorId(Integer id) {
        return habitacionRepository.findById(id).orElse(null);
    }

    @Override
    public void crearHabitacion(HabitacionEntity habitacion) {
        habitacionRepository.save(habitacion);
    }

    @Override
    public void actualizarHabitacion(HabitacionEntity habitacion) {
        habitacionRepository.save(habitacion);
    }

    @Override
    public void eliminarHabitacion(Integer id) {
        habitacionRepository.deleteById(id);
    }
}
