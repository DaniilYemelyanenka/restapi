package com.yemelyanenka.restapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetsDTO {

    private Long id;

    private String name;

    private Integer age;
}
