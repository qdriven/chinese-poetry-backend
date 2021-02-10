package io.chinesepoetry.backend.repo;
/*
 *  Copyright 2020-2021 QMETA - this repo owner
 *
 *  Licensed under unkown License
 */

import io.chinesepoetry.backend.entity.PoetryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PoetryRepo  extends JpaRepository<PoetryEntity, Long>,
        JpaSpecificationExecutor<PoetryEntity> {
}
