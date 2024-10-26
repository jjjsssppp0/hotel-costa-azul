package pe.com.cibertec.service;

import pe.com.cibertec.model.HabitacionEntity;

import java.util.List;

public interface HabitacionService {
    List<HabitacionEntity> buscarTodasHabitaciones();
    HabitacionEntity buscarHabitacionPorId(Integer id);
    void crearHabitacion(HabitacionEntity habitacion);
    void actualizarHabitacion(HabitacionEntity habitacion);
    void eliminarHabitacion(Integer id);
}
