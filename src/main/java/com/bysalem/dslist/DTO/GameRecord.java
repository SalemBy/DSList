package com.bysalem.dslist.DTO;

import com.bysalem.dslist.entities.Game;

public record GameRecord(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public GameRecord(Game entity) {
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getImgUrl(), entity.getShortDescription());

    }
}
