package com.eharmony.services.mymatchesservice.service;

import rx.Observable;

public interface HBaseStoreFeedService {

    public Observable<HBaseStoreFeedResponse> getUserMatchesByStatusGroupSafe(HBaseStoreFeedRequestContext request);
}