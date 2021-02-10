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
@Table(name = "good_sentences")
@Data
@DynamicInsert
@DynamicUpdate
public class SentenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String source;
    @CreationTimestamp
    private Date createdTime = new Date();
    /**
     * 更新时间
     */
    @UpdateTimestamp
    private Date updatedTime = new Date();
}
