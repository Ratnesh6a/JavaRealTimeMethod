package com.example.medifizer.entity.userDataDetails;

import com.example.medifizer.baseClass.BaseDtoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AssignUserData  extends BaseDtoEntity {
    @Serial
    private static final long serialVersionUID = 3927961353184332829L;

    private UUID userReferenceData;
    private CreateOrUpdateUserIdData updateUserDetails;
}
