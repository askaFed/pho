package com.eharmony.services.mymatchesservice.service;


public abstract class AbstractStoreFeedResponse {

    private Throwable error;
    private boolean dataAvailable;


    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.error = error;
    }

    public boolean isDataAvailable() {
        return dataAvailable;
    }

    public void setDataAvailable(boolean dataAvailable) {
        this.dataAvailable = dataAvailable;
    }
    

}