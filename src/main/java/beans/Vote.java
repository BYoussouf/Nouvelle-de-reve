/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author Youssouf
 */
public class Vote implements Serializable {
    private Long idUser;
    private Long idNovel;
    private int quality;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdNovel() {
        return idNovel;
    }

    public void setIdNovel(Long idNovel) {
        this.idNovel = idNovel;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
    
}
