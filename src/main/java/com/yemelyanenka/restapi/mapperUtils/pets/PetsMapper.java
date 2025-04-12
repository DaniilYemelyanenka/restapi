package com.yemelyanenka.restapi.mapperUtils.pets;

import com.yemelyanenka.restapi.DTO.PetsDTO;
import com.yemelyanenka.restapi.entity.Pets;
import com.yemelyanenka.restapi.mapperUtils.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapper.class)
public interface PetsMapper extends BaseMapper<Pets, PetsDTO> {
}
