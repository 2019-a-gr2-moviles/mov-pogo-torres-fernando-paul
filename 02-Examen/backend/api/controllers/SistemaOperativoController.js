/**
 * SistemaOperativoController
 *
 * @description :: Server-side actions for handling incoming requests.
 * @help        :: See https://sailsjs.com/docs/concepts/actions
 */

module.exports = {
    'Registrar':async function(req, res){
        var values = req.body;
        await SistemaOperativo.create(values);
        return res.json({registro:'Satisfactorio'});
    },
    'Mostrar':async function(req, res){
        var values = req.body;
        var SistemasOperativos = await SistemaOperativo.find(values);
        return res.json(SistemasOperativos);
    },
    'Actualizar':async function(req, res){
        var values = req.body;
        await SistemaOperativo.update({id:values.id}).set(values);
        return res.json({actualizacion:'Satisfactoria'});
    },
    'Eliminar':async function(req, res){
        var values = req.body;
        await Aplicacion.destroy({fkSistemaOperativo:values.id});
        await SistemaOperativo.destroy(values);
        return res.json({eliminacion:'Satisfactoria'});
    }
};

