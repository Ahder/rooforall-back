package com.rizomm.m2.rooforall.rooforall.dto;

import com.rizomm.m2.rooforall.rooforall.entites.House;
import com.rizomm.m2.rooforall.rooforall.enums.RecordStatus;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecordDto {

    Long id;

    private boolean draft;

    @NotBlank(message = "habitatType must not be blank")
    private String habitatType;

    @NotNull(message = "budgetMin cannot be null")
    private Long budgetMin;

    @NotNull(message = "budgetMax cannot be null")
    private Long budgetMax;

    @NotNull(message = "habitationSurface cannot be null")
    private Long habitationSurface;

    @NotBlank(message = "town must not be blank")
    private String town;

    private RecordStatus status;

    private List<House> houseList;

}
