package com.example.medifizer.entity.trackDataEntity;

import com.example.medifizer.baseClass.BaseDtoEntity;
import com.example.medifizer.entity.userDataDetails.AssignUserData;
import com.example.medifizer.enums.Roles;
import com.example.medifizer.enums.trackData.RequestedChange;
import com.example.medifizer.enums.trackData.VerificationTrackStatus;
import com.example.medifizer.interfaces.trackInterfaces.AbstractVerificationTrackChanges;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Getter
@Setter
public class VerificationTrack extends BaseDtoEntity {
    @Serial
    private static final long serialVersionUID = 2250415379634085409L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID verificationTrackId;
    private VerificationTrackStatus verificationTrackStatus;
    private UUID changedReferenceId;
    private RequestedChange requestedChange;
    private UUID companyRefId;
    private Roles companyRole;
    private UUID requestedUserReference;
    private String requestedUserEmailId;
    private LocalDateTime requestedDate;
    private LocalDateTime lasUpdatedDate;
    private LocalDateTime verifierDate;
    private BaseDtoEntity originalVersion;
    @Transient
    private AbstractVerificationTrackChanges verificationTrackChanges;
    private AssignUserData assignUserData;

}
