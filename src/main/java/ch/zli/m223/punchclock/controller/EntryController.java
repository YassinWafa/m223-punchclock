package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {
    private EntryService entryService;

    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    /** List of entries accessible via GET /entries.
     * @author Yassin Wafa
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Entry> getAllEntries() {
        return entryService.findAll();
    }

    /** Mapping to create a new entry, accessible via POST /entries, requiring DateTime for checkIn and checkOut
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@Valid @RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }

    /** Mapping to update an existing entry by its id, accessible via PUT /entries/{the ID of the desired entry to be updated}
     */
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Entry updateEntry(@Valid @PathVariable Entry entry ) {
        return entryService.updateEntry(entry);
    }

    /** Mapping to remove an entry by its id, accessible via DELETE /entries/{the ID of the desired entry to be removed}
     */
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEntry(@PathVariable long id) {
        entryService.deleteEntry(id);
    }
}
