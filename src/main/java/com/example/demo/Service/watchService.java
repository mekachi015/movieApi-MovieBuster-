package com.example.demo.Service;

public interface watchService {

    import java.util.List;

    public interface WatchListService {
        List<watchList> getAllWatchLists();
        wacthList getWatchListById(Long id);
        void saveWatchList(WatchList watchList);
        void updateWatchList(Long id, WatchList watchList);
        void deleteWatchList(Long id);
    }

}
