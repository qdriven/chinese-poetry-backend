package io.chinesepoetry.backend.entity;
/*
 *  Copyright 2020-2021 QMETA - this repo owner
 *
 *  Licensed under unkown License
 */

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "writers")
@Data
@DynamicInsert
@DynamicUpdate
public class WriterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String headImageUrl;
    private String simpleIntro;
    private String detailIntro;
    @CreationTimestamp
    private Date createdTime = new Date();
    /**
     * 更新时间
     */
    @UpdateTimestamp
    private Date updatedTime = new Date();
}
