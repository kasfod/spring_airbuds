package com.kdt.mappers;

import org.mapstruct.Mapper;

import com.kdt.domain.entity.TrackImage;
import com.kdt.dto.TrackImageDTO;

@Mapper(componentModel = "spring")
public interface TrackImageMapper extends GenericMapper<TrackImageDTO, TrackImage> {

}
