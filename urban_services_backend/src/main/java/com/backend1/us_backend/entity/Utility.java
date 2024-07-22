package com.backend1.us_backend.entity;

// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.Data;

// import java.util.Date;

@Data
@Entity
@Table(name = "utilities")
public class Utility {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "utilities_id_seq")
    @SequenceGenerator(name = "utilities_id_seq", sequenceName = "utilities_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "typeofservice", length = 50)
    private String typeOfService;

    @Column(name = "pictures", length = 255)
    private String pictures;

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Integer id;

    // @CreationTimestamp
    // @Column(name = "created", updatable = false)
    // private Date created;

    // @UpdateTimestamp
    // @Column(name = "updated")
    // private Date updated;

    // @Column(name = "desc", columnDefinition = "text")
    // private String desc;

    // @Column(name = "name", columnDefinition = "text")
    // private String name;

    // @Column(name = "tags_plural", columnDefinition = "text")
    // private String tagsPlural;

    // @Column(name = "tags_name", columnDefinition = "text")
    // private String tagsName;

    // @Column(name = "category_name_singular", columnDefinition = "text")
    // private String categoryNameSingular;

    // @Column(name = "category_name_service", columnDefinition = "text")
    // private String categoryNameService;

    // @Column(name = "category_name_plural", columnDefinition = "text")
    // private String categoryNamePlural;

    // @Column(name = "category_name_article", columnDefinition = "text")
    // private String categoryNameArticle;

    // @Column(name = "display_name", columnDefinition = "text")
    // private String displayName;

    // @Column(name = "picture", columnDefinition = "text")
    // private String picture;

    // @Column(name = "picture_small", columnDefinition = "text")
    // private String pictureSmall;

    // @Column(name = "picture_big", columnDefinition = "text")
    // private String pictureBig;

    /*
     * // Getters and Setters
     * 
     * public Integer getId() {
     * return id;
     * }
     * 
     * public void setId(Integer id) {
     * this.id = id;
     * }
     * 
     * // public Date getCreated() {
     * // return created;
     * // }
     * 
     * // public void setCreated(Date created) {
     * // this.created = created;
     * // }
     * 
     * // public Date getUpdated() {
     * // return updated;
     * // }
     * 
     * // public void setUpdated(Date updated) {
     * // this.updated = updated;
     * // }
     * 
     * public String getDesc() {
     * return desc;
     * }
     * 
     * public void setDesc(String desc) {
     * this.desc = desc;
     * }
     * 
     * public String getName() {
     * return name;
     * }
     * 
     * public void setName(String name) {
     * this.name = name;
     * }
     * 
     * public String getTagsPlural() {
     * return tagsPlural;
     * }
     * 
     * public void setTagsPlural(String tagsPlural) {
     * this.tagsPlural = tagsPlural;
     * }
     * 
     * public String getTagsName() {
     * return tagsName;
     * }
     * 
     * public void setTagsName(String tagsName) {
     * this.tagsName = tagsName;
     * }
     * 
     * public String getCategoryNameSingular() {
     * return categoryNameSingular;
     * }
     * 
     * public void setCategoryNameSingular(String categoryNameSingular) {
     * this.categoryNameSingular = categoryNameSingular;
     * }
     * 
     * public String getCategoryNameService() {
     * return categoryNameService;
     * }
     * 
     * public void setCategoryNameService(String categoryNameService) {
     * this.categoryNameService = categoryNameService;
     * }
     * 
     * public String getCategoryNamePlural() {
     * return categoryNamePlural;
     * }
     * 
     * public void setCategoryNamePlural(String categoryNamePlural) {
     * this.categoryNamePlural = categoryNamePlural;
     * }
     * 
     * public String getCategoryNameArticle() {
     * return categoryNameArticle;
     * }
     * 
     * public void setCategoryNameArticle(String categoryNameArticle) {
     * this.categoryNameArticle = categoryNameArticle;
     * }
     * 
     * public String getDisplayName() {
     * return displayName;
     * }
     * 
     * public void setDisplayName(String displayName) {
     * this.displayName = displayName;
     * }
     * 
     * public String getPicture() {
     * return picture;
     * }
     * 
     * public void setPicture(String picture) {
     * this.picture = picture;
     * }
     * 
     * public String getPictureSmall() {
     * return pictureSmall;
     * }
     * 
     * public void setPictureSmall(String pictureSmall) {
     * this.pictureSmall = pictureSmall;
     * }
     * 
     * public String getPictureBig() {
     * return pictureBig;
     * }
     * 
     * public void setPictureBig(String pictureBig) {
     * this.pictureBig = pictureBig;
     * }
     */
}
