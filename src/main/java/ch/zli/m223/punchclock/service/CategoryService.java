package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Category;
import ch.zli.m223.punchclock.repository.CategoryRepository;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepopsitory) {
        this.categoryRepository = categoryRepopsitory;
    }

    public Category createCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }

    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
}
