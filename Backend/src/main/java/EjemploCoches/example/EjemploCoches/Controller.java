package EjemploCoches.example.EjemploCoches;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/Coches")
    public ArrayList<Coche> listaObjeto1()
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Coche> lista = reader.LeerFicheroJson1("Almacen.json");
        //Mostramos los elementos leidos
        return lista;
    }

    @PostMapping("/CochesA")
    public ArrayList<Coche> create(@RequestBody Coche objeto1)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Coche> lista;
        lista = dataHanding.AnadirObjeto1(objeto1,"Almacen.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }
/*
    @DeleteMapping("/CriptoB{id}")
    public ArrayList<Criptomoneda> Borrar(@RequestParam int id)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Criptomoneda> lista;
        lista = dataHanding.EliminarObjeto(id,"Criptomonedas.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }
*/
}
