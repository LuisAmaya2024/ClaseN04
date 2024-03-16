package com.example.aplicacion_seccion4_ingreso

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Uconexion(context: Context): SQLiteOpenHelper(context,"Invetario.db",null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val peticionSQLCreacion = "CREATE TABLE clientes("+
                "IdCliente INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "NombreCompañia TEXT,"+
                "Nombrecontacto, TEXT,"+
                "Cargocontacto TEXT,"+
                "Direccion TEXT,"+
                "Ciudad TEXT,"+
                "Region TEXT,"+
                "CodPostal INTEGER,"+
                "Pais TEXT,"+
                "Telefono,INTEGER,"+
                "Fax INTEGER)"


        db!!.execSQL(peticionSQLCreacion)

        val peticion2SQLCreacion ="CREATE TABLE productos("+
                "IdProducto INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "NombreProveedor TEXT,"+
                "IdProveedor INTEGER,"+
                "IDCategoria INTEGER,"+
                "CantidadPorUnidad INTEGER,"+
                "PrecioUnidad INTEGER,"+
                "UnidadesEnExitencia INTEGER,"+
                "UnidadesEnPedido INTEGER,"+
                "NuevoPedido TEXT,"+
                "Suspendido INTEGER)"
        db!!.execSQL(peticion2SQLCreacion)



    }


    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}