package searchengine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import searchengine.model.Lemma;
import searchengine.model.Page;
import searchengine.model.SitePage;

import java.util.Collection;
import java.util.List;

@Repository
public interface PageRepository extends JpaRepository<Page, Long> {
   long countBySiteId(SitePage siteId);
   Iterable<Page> findBySiteId(SitePage site);
   @Query(value = "SELECT p.* FROM Page p JOIN index_search i ON p.id = i.page_id WHERE i.lemma_id IN :lemmas", nativeQuery = true)
   List<Page> findByLemmaList(@Param("lemmas") Collection<Lemma> lemmaListId);
//   @Query(value = "SELECT p.* FROM Page p WHERE p.id IN :pageId AND p.site_id IN :siteId")
//   List<PageEntity> findPathByPageIdAndSiteId(@Param("pageId") PageEntity pageId, @Param("siteId") SiteEntity siteId);

//   @Query(value = "INSERT INTO Page_tamp (site_Id, path, code, content) select site_id, path, code, content from Page")
//   void copy();
}
