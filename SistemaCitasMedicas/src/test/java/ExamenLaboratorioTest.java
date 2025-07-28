/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CltControl
 */
public class ExamenLaboratorioTest {
    
    public ExamenLaboratorioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of registrarResultado method, of class ExamenLaboratorio.
     */
    @Test
    public void testRegistrarResultado() {
        System.out.println("registrarResultado");
        
        String resultado = "positivo";
        ExamenLaboratorio instance = new ExamenLaboratorio(null, null);
        
        instance.registrarResultado(resultado);
        
        assertEquals(resultado, instance.getResultado());
        assertNotNull(instance.getResultado());
    }

    /**
     * Test of toString method, of class ExamenLaboratorio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String cedula= "123";
        String nombre = "Jacqueline";  
        String correo = "correo@gmail.com";
        
        Paciente p = new Paciente(cedula, nombre, correo);
        ExamenLaboratorio e = new ExamenLaboratorio(p, "examentipo");
                
        assertEquals("pendiente", e.getResultado());
        
    }
    
}
