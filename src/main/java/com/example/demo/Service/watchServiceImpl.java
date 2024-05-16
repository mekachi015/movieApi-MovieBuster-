import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class WatchListServiceImpl implements WatchListService {

    private final WatchListRepository watchListRepository;

    @Autowired
    public WatchListServiceImpl(WatchListRepository watchListRepository) {
        this.watchListRepository = watchListRepository;
    }

    @Override
    public List<WatchList> getAllWatchLists() {
        return watchListRepository.findAll();
    }

    @Override
    public WatchList getWatchListById(Long id) {
        return watchListRepository.findById(id).orElse(null);
    }

    @Override
    public void saveWatchList(WatchList watchList) {
        watchListRepository.save(watchList);
    }

    @Override
    public void updateWatchList(Long id, WatchList updatedWatchList) {
        WatchList existingWatchList = watchListRepository.findById(id).orElse(null);
        if (existingWatchList != null) {
            existingWatchList.setMovieTitle(updatedWatchList.getMovieTitle());
            existingWatchList.setMovieGenre(updatedWatchList.getMovieGenre());
            existingWatchList.setReleaseYear(updatedWatchList.getReleaseYear());
            watchListRepository.save(existingWatchList);
        }
    }

    @Override
    public void deleteWatchList(Long id) {
        watchListRepository.deleteById(id);
    }
}
