package io.chinesepoetry.backend.service;
/*
 *  Copyright 2020-2021 QMETA - this repo owner
 *
 *  Licensed under unkown License
 */

import cn.hutool.core.io.FileUtil;
import cn.hutool.json.JSONUtil;
import io.chinesepoetry.backend.entity.PoetryEntity;
import io.chinesepoetry.backend.entity.SentenceEntity;
import io.chinesepoetry.backend.entity.WriterEntity;
import io.chinesepoetry.backend.repo.PoetryRepo;
import io.chinesepoetry.backend.repo.SentenceRepo;
import io.chinesepoetry.backend.repo.WriterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoaderService {

    @Autowired
    PoetryRepo poetryRepo;

    @Autowired
    SentenceRepo sentenceRepo;

    @Autowired
    WriterRepo writerRepo;

    @PostConstruct
    public void loadAllFiles(){
        String basePath = "/Users/Patrick/workspace/products/focus/chinese-poetry-backend/src/main/resources/";
//        File[] guwenFiles = FileUtil.ls(basePath+"sentence");
        File[] guwenFiles = FileUtil.ls(basePath+"writer");
//        File[] guwenFiles = FileUtil.ls(basePath+"guwen");
        for (File guwenFile : guwenFiles) {
            List<String> lines = FileUtil.readLines(guwenFile, Charset.defaultCharset());
            List<WriterEntity> poetryEntities = new ArrayList<>();
            for (String line : lines) {
                WriterEntity poetryEntity =  JSONUtil.toBean(line, WriterEntity.class);
                poetryEntities.add(poetryEntity);
            }
            writerRepo.saveAll(poetryEntities);
        }
    }
}
