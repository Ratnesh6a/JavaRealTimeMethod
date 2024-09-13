package com.example.medifizer.interfaces.trackInterfaces;

public interface AbstractVerificationTrackChanges<T> {
    boolean isChangeRequested(T dtoEntity);
}
