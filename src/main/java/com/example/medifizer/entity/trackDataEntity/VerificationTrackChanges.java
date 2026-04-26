/*
package com.example.medifizer.entity.trackDataEntity;

import com.example.medifizer.baseClass.BaseDtoEntity;
import com.example.medifizer.interfaces.trackInterfaces.AbstractVerificationTrackChanges;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serial;

*/
/**
 * Concrete implementation of AbstractVerificationTrackChanges
 * Used to store verification track change information
 *//*

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VerificationTrackChanges extends BaseDtoEntity implements AbstractVerificationTrackChanges<BaseDtoEntity> {


    @Serial
    private static final long serialVersionUID = 1634525937684054934L;

    private String changeDescription;
    private String changeType;
    private boolean changeRequested;

    @Override
    public boolean isChangeRequested(BaseDtoEntity dtoEntity) {
        return changeRequested && dtoEntity != null;
    }
}

*/
