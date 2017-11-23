/*
 * Clase pregunta, maneja todas las preguntas del cuestionario, incluida
la pregunta de prueba. 
 */
package test.de.mirada;

/**
 *
 * @author Adolfo Fragoso
 */
public class Pregunta {
    private String nombreImagen;
    private String[] respuestas;
    private String respuestaCorrecta;
    /*
     * El constructor recibe:
        El nombre de la imagen, cada imagen estará 
        almacenada en una sola carpeta.
        Lista de respuestas, consistiran de cuatro elementos
     */
    public Pregunta(String nombreImagen,String[] respuestas,String respuestaCorrecta){
        this.nombreImagen = nombreImagen;
        this.respuestas = respuestas;
        this.respuestaCorrecta = respuestaCorrecta;
    }
    /*
    * Al momento de presionar un boton como respuesta, se llama a esta funcion para verificar si 
    la respuesta por parte del usuario es correcta. 
    */
    public boolean registrarRespuesta(String respuesta){
        return respuestaCorrecta.equals(this.respuestaCorrecta);
    }
    
}
