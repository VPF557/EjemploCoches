package EjemploCoches.example.EjemploCoches;

import java.util.ArrayList;

public class DataHanding {
    public ArrayList<Coche> AnadirObjeto1(Coche objeto1, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList
        LeerJson reader = new LeerJson();
        ArrayList<Coche> listaAux = reader.LeerFicheroJson1(ruta);
        objeto1.setId(listaAux.get(listaAux.size() - 1).getId() + 1);
        listaAux.add(objeto1);
        return listaAux;
    }

    public ArrayList<Coche> EliminarObjeto (int id, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Coche> listaAux = reader.LeerFicheroJson1(ruta);
        for (int i = 0; i < listaAux.size() ; i++ )
        {
            if(listaAux.get(i).getId() == id)
            {
                listaAux.remove(i);
            }
        }
        return listaAux;
    }

    public int ComprobarObjeto(Coche objeto1, String ruta , ArrayList<Coche> listaAux)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        int control = 0;

        for (int i = 0; i < listaAux.size(); i++)
        {
            if
            (       objeto1.getMarca().equals(listaAux.get(i).getMarca()) &&
                    objeto1.getEdad() ==  listaAux.get(i).getEdad() &&
                    objeto1.getColor().equals(listaAux.get(i).getColor()) &&
                    objeto1.getPopularidad().equals(listaAux.get(i).getPopularidad())
            )
            {
                control = 1;
            }
            else
            {
                control = 0;
            }

        }
        return control;
    }

}
