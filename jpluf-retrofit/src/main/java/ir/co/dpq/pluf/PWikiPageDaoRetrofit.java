package ir.co.dpq.pluf;

import static ir.co.dpq.pluf.retrofit.wiki.WUtil.*;
import java.util.List;

import ir.co.dpq.pluf.km.PCategory;
import ir.co.dpq.pluf.km.PLabel;
import ir.co.dpq.pluf.retrofit.RPaginatorParameter;
import ir.co.dpq.pluf.retrofit.Util;
import ir.co.dpq.pluf.retrofit.wiki.IRWikiPageService;
import ir.co.dpq.pluf.retrofit.wiki.RWikiPage;
import ir.co.dpq.pluf.wiki.IPWikiPageDao;
import ir.co.dpq.pluf.wiki.PWikiPage;

/**
 * 
 * @author maso
 *
 */
public class PWikiPageDaoRetrofit implements IPWikiPageDao {

	private IRWikiPageService wikiPageService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ir.co.dpq.pluf.wiki.IPWikiPageDao#createWikiPage(ir.co.dpq.pluf.wiki.
	 * PWikiPage)
	 */
	@Override
	public PWikiPage createWikiPage(PWikiPage page) {
		RWikiPage rbook = toRObject(page);
		return wikiPageService.createWikiPage(rbook.toMap());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ir.co.dpq.pluf.wiki.IPWikiPageDao#getWikiPage(java.lang.Long)
	 */
	@Override
	public PWikiPage getWikiPage(Long id) {
		return wikiPageService.getWikiPage(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ir.co.dpq.pluf.wiki.IPWikiPageDao#deleteWikiPage(ir.co.dpq.pluf.wiki.
	 * PWikiPage)
	 */
	@Override
	public PWikiPage deleteWikiPage(PWikiPage page) {
		return wikiPageService.deleteWikiPage(page.getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ir.co.dpq.pluf.wiki.IPWikiPageDao#findWikiPage(ir.co.dpq.pluf.
	 * PPaginatorParameter)
	 */
	@Override
	public IPPaginatorPage<PWikiPage> findWikiPage(PPaginatorParameter param) {
		RPaginatorParameter rparams = Util.toRObject(param);
		return wikiPageService.findWikiPage(rparams.toMap());
	}

	@Override
	public PWikiPage addLabelToPage(PWikiPage page, PLabel label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PLabel> getPageLabels(PWikiPage page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PWikiPage deleteLabelFromPage(PWikiPage page, PLabel label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PWikiPage addCategoryToPage(PWikiPage page, PCategory category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PWikiPage deleteCategoryFromPage(PWikiPage page, PCategory category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PCategory> getPageCategories(PWikiPage page) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setWikiPageService(IRWikiPageService wikiPageService) {
		this.wikiPageService = wikiPageService;
	}

	@Override
	public void createWikiPage(PWikiPage page, IPCallback<PWikiPage> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getWikiPage(Long id, IPCallback<PWikiPage> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteWikiPage(PWikiPage page, IPCallback<PWikiPage> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findWikiPage(PPaginatorParameter param, IPCallback<IPPaginatorPage<PWikiPage>> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLabelToPage(PWikiPage page, PLabel label, IPCallback<PWikiPage> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPageLabels(PWikiPage page, IPCallback<List<PLabel>> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLabelFromPage(PWikiPage page, PLabel label, IPCallback<PWikiPage> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCategoryToPage(PWikiPage page, PCategory category, IPCallback<PWikiPage> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategoryFromPage(PWikiPage page, PCategory category, IPCallback<PWikiPage> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPageCategories(PWikiPage page, IPCallback<List<PCategory>> callback) {
		// TODO Auto-generated method stub
		
	}

}
