/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author User
 */
public interface TipoMaquinaServices {
    
    public int agregar(TipoMaquinaDTO tipomaquina);
    public int consultar(TipoMaquinaDTO tipomaquina);
    public int actualizar(TipoMaquinaDTO tipomaquina);
    public List<TipoMaquinaDTO> retirar ();
    public List<TipoMaquinaDTO> trasladar();
    public List<TipoMaquinaDTO> solicitar ();
    public List<TipoMaquinaDTO> disponible();
    public List<TipoMaquinaDTO> nodisponible();
    public List<TipoMaquinaDTO> dañada();
}
