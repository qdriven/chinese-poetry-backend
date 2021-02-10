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
@Table(name = "poets")
@Data
@DynamicInsert
@DynamicUpdate
public class PoetryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String dynasty;
    private String writer;
    private String type;
    private String remark;
    private String translation;
    private String shangxi;
    private String audioUrl;
    @CreationTimestamp
    private Date createdTime = new Date();
    /**
     * 更新时间
     */
    @UpdateTimestamp
    private Date updatedTime = new Date();
}
