/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.linggapurnamaalhamdi.latihanmvc.model;

import edu.linggapurnamaalhamdi.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 */
public class PelangganModel {
    
    private String Nama;
    private String Email;
    private String noTelp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
        fireOnChange();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange() {
        if (pelangganListener!=null) {
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm() {
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    
    public void simpanForm() {
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
        
    }
}
