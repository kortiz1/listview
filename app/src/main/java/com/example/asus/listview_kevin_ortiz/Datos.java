package com.example.asus.listview_kevin_ortiz;

import java.util.ArrayList;

/**
 * Created by android on 19/09/2017.
 */

public class Datos {

    private static ArrayList<Objeto> obj= new ArrayList<>();

    public static void guardar(Objeto p){

        obj.add(p);
    }

    public static ArrayList<Objeto> obtener(){
        return obj;
    }

}
