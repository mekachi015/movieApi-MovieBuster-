import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/watchlists")
public class WatchListController {

    @Autowired
    private WatchListService watchListService;

    @GetMapping
    public List<WatchList> findAll(){
        return watchListService.getAllWatchLists();
    }

    @PostMapping
    public void save(@RequestBody WatchList watchList){
        watchListService.saveWatchList(watchList);
    }

    @GetMapping("/{id}")
    public WatchList findOne(@PathVariable Long id) {
        return watchListService.getWatchListById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody WatchList watchList) {
        watchListService.updateWatchList(id, watchList);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        watchListService.deleteWatchList(id);
    }
}
