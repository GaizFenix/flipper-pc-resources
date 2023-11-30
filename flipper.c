#include <lvgl.h>

void main() {
    // Inicializar LVGL
    lv_init();

    // Crear la interfaz gráfica de usuario
    lv_obj_t *label_cpu = lv_label_create(lv_scr_act(), NULL);
    lv_label_set_text(label_cpu, "CPU: 0%");

    // ...

    // Iniciar el temporizador para actualizar los datos
    lv_timer_create(UPDATE_INTERVAL, timer_handler, NULL);
}

void timer_handler(lv_timer_t *timer) {
    // Actualizar los datos del hardware
    // Actualizar la interfaz gráfica de usuario
}
