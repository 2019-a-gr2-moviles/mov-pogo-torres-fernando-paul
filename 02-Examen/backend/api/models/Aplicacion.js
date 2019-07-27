/**
 * Aplicacion.js
 *
 * @description :: A model definition represents a database table/collection.
 * @docs        :: https://sailsjs.com/docs/concepts/models-and-orm/models
 */

module.exports = {

  attributes: {
    id:{
      type:'number',
      unique:true,
      autoIncrement:true,
      columnName:'ID_APLICACION'
    },
    peso:{
      type:'number',
      columnName:'PESO_GIGAS'
    },
    version:{
      type:'number',
      columnName:'VERSION_API'  
    },
    nombre:{
      type:'string',
      columnName:'NOMBRE'
    },
    url:{
      type:'string',
      columnName:'URL_DESCARGA'
    },
    lanzamiento:{
      type:'string',
      columnName:'FECHA_LANZAMIENTO'
    },
    costo:{
      type:'number',
      columnName:'COSTO'
    },
    latitud:{
      type:'string',
      columnName:'LATITUD'
    },
    longitud:{
      type:'string',
      columnName:'LONGITUD'
    },
    fkSistemaOperativo:{
      model:'SistemaOperativo',
      columnName:'FK_SISTEMA_OPERATIVO'
    }    
  },
};

