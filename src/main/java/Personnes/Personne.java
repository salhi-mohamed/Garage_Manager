/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnes;

/**
 *
 * @author LENOVO
 */
public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int telephone;
    public Personne(int id , String nom, String prenom , String adresse , int telephone)
    {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.telephone=telephone;
    }
    public void set_id(int id)
    {
        this.id=id;
    }
    public void set_nom(String nom)
    {
        this.nom=nom;
    }
    public void set_prenom(String prenom)
    {
        this.prenom=prenom;
    }
    public void set_adresse(String adresse)
    {
        this.adresse=adresse;
    }
    public void set_telephone(int telephone)
    {
        this.telephone=telephone;
    }
    public int get_id()
    {
        return id;
    }
    
    
    
    
    
}
