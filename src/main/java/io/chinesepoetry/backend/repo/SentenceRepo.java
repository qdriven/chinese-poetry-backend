package io.chinesepoetry.backend.repo;
/*
 *  Copyright 2020-2021 QMETA - this repo owner
 *
 *  Licensed under unkown License
 */

import io.chinesepoetry.backend.entity.SentenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SentenceRepo extends JpaRepository<SentenceEntity, Long>,
        JpaSpecificationExecutor<SentenceEntity> {
}
