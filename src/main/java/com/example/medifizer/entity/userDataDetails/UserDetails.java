package com.example.medifizer.entity.userDataDetails;

import com.example.medifizer.enums.trackData.VerificationTrackStatus;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID userDetailsId;

    private VerificationTrackStatus verificationTrackStatus;
    private UUID userReferenceId;
    private UUID companyReferenceId;


}
