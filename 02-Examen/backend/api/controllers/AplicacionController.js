/**
 * AplicacionController
 *
 * @description :: Server-side actions for handling incoming requests.
 * @help        :: See https://sailsjs.com/docs/concepts/actions
 */

module.exports = {
    'Registrar':async function(req, res){
        var values = req.body;
        await Aplicacion.create(values);
        return res.json({registro:'Satisfactorio'});
    },
    'Mostrar':async function(req, res){
        var values = req.body;
        var Aplicaciones = await Aplicacion.find(values);
        return res.json(Aplicaciones);
    },
    'Actualizar':async function(req, res){
        var values = req.body;
        await Aplicacion.update({id:values.id}).set(values);
        return res.json({actualizacion:'Satisfactoria'});
    },
    'Eliminar':async function(req, res){
        var values = req.body;
        await Aplicacion.destroy(values);
        return res.json({eliminacion:'Satisfactoria'});
    }
};

