package com.example.medifizer.entity.userDataDetails;

import com.example.medifizer.baseClass.BaseDtoEntity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrUpdateUserIdData extends BaseDtoEntity {
    @Serial
    private static final long serialVersionUID = 8558613564633822393L;
    private UUID userReference;
    private String userEmailData;
    private LocalDateTime localDateTime;
}
