/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Youssouf
 */
public class Comment implements Serializable {
    private Long idNovel;
    private Long idUser;
    private Date date;
    private String Content;
    private String state;

    public Long getIdNovel() {
        return idNovel;
    }

    public void setIdNovel(Long idNovel) {
        this.idNovel = idNovel;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
