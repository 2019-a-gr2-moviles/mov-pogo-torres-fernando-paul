/**
 * SistemaOperativo.js
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
      columnName:'ID_SISTEMA_OPERATIVO'
    },
    nombre:{
      type:'string',
      columnName:'NOMBRE'
    },
    version:{
      type:'number',
      columnName:'VERSION_API'  
    },
    lanzamiento:{
      type:'string',
      columnName:'FECHA_LANZAMIENTO'
    },
    peso:{
      type:'number',
      columnName:'PESO_GIGAS'
    },
    instalado:{
      type:'boolean',
      columnName:'INSTALADO'
    },
    aplicaciones:{
      collection:'Aplicacion',
      via:'fkSistemaOperativo'
    }    
  },
};

