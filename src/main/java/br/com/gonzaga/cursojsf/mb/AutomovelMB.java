/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gonzaga.cursojsf.mb;

import br.com.gonzaga.cursojsf.model.Automovel;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author Alexandre
 */
@ManagedBean
@RequestScoped
public class AutomovelMB {
    private Automovel auto = new Automovel();

    public Automovel getAuto() {
        return auto;
    }

    public void setAuto(Automovel auto) {
        this.auto = auto;
    }
    
    public void salvar(Automovel auto){
        System.out.println("Botão salvar chamado");
        System.out.println("Marca: " + this.auto.getMarca());
    }
}
