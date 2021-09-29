package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Category;
import ch.zli.m223.punchclock.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;

    /** List of categories accessible via GET /categories.
     * @author Yassin Wafa
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories() {
        return categoryService.findAllCategories();
    }

    /** Mapping to create a new category, accessible via POST /categories requiring name, description and id
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@Valid @RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    /** Mapping to update an existing category by its id, accessible via PUT /categories/{the ID of the category desired to be updated}
     */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category updateCategory(@Valid @PathVariable Category category) {
        return categoryService.updateCategory(category);
    }
    /** Mapping to remove a category by its id, accessible via DELETE /categories/{the ID of the category desired to be removed}
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable long id) {
        categoryService.deleteCategory(id);
    }
}
