package EjemploCoches.example.EjemploCoches;

import java.util.ArrayList;

public class DataHanding {
    public ArrayList<Coche> AnadirObjeto1(Coche objeto1, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Coche> listaAux = reader.LeerFicheroJson1(ruta);
        objeto1.setId(listaAux.get(listaAux.size() - 1).getId() + 1);
        listaAux.add(objeto1);
        return listaAux;
    }
/*
    public ArrayList<Criptomoneda> EliminarObjeto (int id, String ruta)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        ArrayList<Criptomoneda> listaAux = reader.LeerFicheroJson1(ruta);
        for (int i = 0; i < listaAux.size() ; i++ )
        {
            if(listaAux.get(i).getId() == id)
            {
                listaAux.remove(i);
            }
        }
        return listaAux;
    }

    public int ComprobarObjeto(Criptomoneda objeto1, String ruta , ArrayList<Criptomoneda> listaAux)
    {
        //En esta funcion se añaden los nuevos elementos enviados desde el front a un ArrayList para posteriormente actualizar la BBDD
        LeerJson reader = new LeerJson();
        int control = 0;

        for (int i = 0; i < listaAux.size(); i++)
        {
            if
            (       objeto1.getNombre().equals(listaAux.get(i).getNombre()) &&
                    objeto1.getValor() ==  listaAux.get(i).getValor() &&
                    objeto1.getFluctuacion() == listaAux.get(i).getFluctuacion() &&
                    objeto1.getCategoria().equals(listaAux.get(i).getCategoria()) &&
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

*/

}
