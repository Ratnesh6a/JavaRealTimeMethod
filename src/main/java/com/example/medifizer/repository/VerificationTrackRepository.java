package com.example.medifizer.repository;

import com.example.medifizer.entity.trackDataEntity.VerificationTrack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VerificationTrackRepository extends JpaRepository<VerificationTrack, UUID> {
}
