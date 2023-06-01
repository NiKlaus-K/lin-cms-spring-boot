package io.github.talelin.latticy.controller.v1;

import io.github.talelin.autoconfigure.exception.NotFoundException;
import io.github.talelin.core.annotation.GroupRequired;
import io.github.talelin.core.annotation.PermissionMeta;
import io.github.talelin.latticy.dto.article.CreateOrUpdateArticleDTO;
import io.github.talelin.latticy.model.ArticleDO;
import io.github.talelin.latticy.service.ArticleService;
import io.github.talelin.latticy.vo.CreatedVO;
import io.github.talelin.latticy.vo.DeletedVO;
import io.github.talelin.latticy.vo.UpdatedVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Positive;
import java.util.List;

/**
 * 文章控制器
 * @author pedro@TaleLin
 * @author Juzi@TaleLin
 */
@RestController
@RequestMapping("/v1/article")
@Validated
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/{id}")
    public ArticleDO getArticle(@PathVariable(value = "id") @Positive(message = "{id.positive}") Integer id) {
        ArticleDO article = articleService.getById(id);
        if (article == null) {
            throw new NotFoundException(10022);
        }
        return article;
    }

    @GetMapping("")
    public List<ArticleDO> getArticles() {
        return articleService.findAll();
    }


    @GetMapping("/search")
    public List<ArticleDO> searchArticle(@RequestParam(value = "q", required = false, defaultValue = "") String q) {
        return articleService.getArticleByKeyword("%" + q + "%");
    }


    @PostMapping("")
    public CreatedVO createArticle(@RequestBody @Validated CreateOrUpdateArticleDTO validator) {
        articleService.createArticle(validator);
        return new CreatedVO(12);
    }


    @PutMapping("/{id}")
    public UpdatedVO updateArticle(@PathVariable("id") @Positive(message = "{id.positive}") Integer id, @RequestBody @Validated CreateOrUpdateArticleDTO validator) {
        ArticleDO article = articleService.getById(id);
        if (article == null) {
            throw new NotFoundException(10022);
        }
        articleService.updateArticle(article, validator);
        return new UpdatedVO(13);
    }


    @DeleteMapping("/{id}")
    @GroupRequired
    @PermissionMeta(value = "删除文章", module = "文章")
    public DeletedVO deleteArticle(@PathVariable("id") @Positive(message = "{id.positive}") Integer id) {
        ArticleDO article = articleService.getById(id);
        if (article == null) {
            throw new NotFoundException(10022);
        }
        articleService.deleteById(article.getId());
        return new DeletedVO(14);
    }


}
