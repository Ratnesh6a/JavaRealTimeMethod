package com.example.medifizer.entity.userDataDetails;

import com.example.medifizer.baseClass.BaseDtoEntity;
import com.example.medifizer.enums.trackData.VerificationTrackStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails extends BaseDtoEntity {
    @Serial
    private static final long serialVersionUID = -1180226462851559247L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userDetailsId;

    private VerificationTrackStatus verificationTrackStatus;
    private UUID userReferenceId;
    private UUID companyReferenceId;


}
