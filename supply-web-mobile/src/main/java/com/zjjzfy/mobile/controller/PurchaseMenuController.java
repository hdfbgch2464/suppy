package com.zjjzfy.mobile.controller;

import com.github.pagehelper.PageInfo;
import com.zjjzfy.common.config.ReturnStatus;
import com.zjjzfy.common.entity.SupplyResult;
import com.zjjzfy.order.service.*;
import com.zjjzfy.pojo.*;
import com.zjjzfy.pojo.dto.DeliverFormExampleDto;
import com.zjjzfy.pojo.dto.ProductDto;
import com.zjjzfy.pojo.dto.PurchaseFormDto;
import com.zjjzfy.product.service.impl.CategoryService;
import com.zjjzfy.product.service.impl.EventsService;
import com.zjjzfy.product.service.impl.ProductService;
import com.zjjzfy.user.service.UserOrgService;
import com.zjjzfy.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("purchase")
@Slf4j
public class PurchaseMenuController {

    @Autowired
    private CartService cartService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private UserOrgService userOrgService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private PurchaseService purchaseService;
    @Autowired
    private OrgBalanceService orgBalanceService;
    @Autowired
    private TbAdvertisementService tbAdvertisementService;
    @Autowired
    private EventsService eventsService;
    @Autowired
    private DeliverService deliverService;

    @Value("${ads.url}")
    private String adsUrl;
    @Value("${spring.peImgPath}")
    private String peImgPath;
    @RequestMapping("myinfo")
    public String myinfo(Model model) {
        TbUserInfo user = userService.getCurrentTbUserInfo();
        int count = cartService.obtainCartCount(user.getUid());
        BigDecimal balance = (BigDecimal) orgBalanceService.getOrgBalance(user.getOrgid()).getData();

        model.addAttribute("user", user);
        model.addAttribute("count", count);
        model.addAttribute("money", balance);
        model.addAttribute("purchaseId", user.getUid());
        model.addAttribute("org", userService.getOrg());
        model.addAttribute("permit", !userOrgService.getUserOrgUserId(user.getUid()).getStatus().equals(ReturnStatus.NOT_AUTHORIZATION.getStatus()));

        DeliverFormExampleDto deliverFormExampleDto = new DeliverFormExampleDto();
        deliverFormExampleDto.setPurchaserId(userService.getCurrentTbUserInfo().getUid());
        List<TbDeliverForm> tbDeliverForms = deliverService.selectDeliverFormNotAccept(userService.getCurrentTbUserInfo().getUid());

        //??????????????? ??????
        model.addAttribute("total",tbDeliverForms==null?0:tbDeliverForms.size());
        return "/purchase/my";
    }

    /**
     * ??????????????????
     *
     * @return
     */
    @RequestMapping("ordToExamine")
    public String ordToExamine(Model model) {
        TbUserInfo userInfo = userService.getCurrentTbUserInfo();
        model.addAttribute("purchaseId", userInfo.getUid());
        return "/purchase/ordToExamine";
    }

    /**
     * ?????????????????? ??????
     *
     * @return
     */
    @RequestMapping("ordToExamineJson")
    @ResponseBody
    public PageInfo<PurchaseFormDto> ordToExamineJson(Integer purchaseId, Integer pageNo, Integer pageSize) {
        List<Integer> ids = (List<Integer>) userOrgService.getUserOrgUserId(purchaseId).getData();
        return purchaseService.selectUncheckedOrderWithPage(ids, pageNo, pageSize);
    }

    /**
     * ??????????????????
     *
     * @param model
     * @return personalCenter/orderDetails
     */
    @RequestMapping("checkOrderDetails")
    public String checkOrderDetails(Model model, Integer purchaseFormId) {
        List<HashMap<String, Object>> list = purchaseService.queryPurchaseData(purchaseFormId);
        List<String> orgnames = purchaseService.queryOrderOrgName(purchaseFormId);
        ;
        //????????????
        //????????????
        TbPurchaseForm form = purchaseService.selectByPurchaseFormId(purchaseFormId);
        model.addAttribute("list", list);
        model.addAttribute("orgnames", orgnames);
        model.addAttribute("form", form);
        List<HashMap<String, Object>> plist = purchaseService.selectPurchaserInfo(form.getPurchaserId());
        if (plist.size() > 0) {
            model.addAttribute("plist", plist.get(0));
        }
        return "/purchase/orderDetails";
    }

    /**
     * ???????????????
     *
     * @param model
     * @return
     */
    @RequestMapping("index")
    public String index(Model model) {
//        List<ProductDto> news = productService.selectProductAndStock(null, null, null, null);
//        List<ProductDto> hots = productService.selectProductAndStock(null, null, null, null);
        //List<TbCategory> categoryList = categoryService.getCategoryList(0,1);
        //4?????? ??????
        //        List<TbEvents> eventsList = eventsService.getEventsList(0,0,4);
        TbUserInfo user = userService.getCurrentTbUserInfo();
        int count = cartService.obtainCartCount(user.getUid());
        //4??????:??????(????????????)ctgr_class=1(????????????)ctgr_class=2
        List<TbCategory> categoryList = categoryService.getCategoryListSp(0,null);
        categoryList.addAll(categoryService.getCategoryListTitle(0,0));
        //1??????:????????????:??????
        List<TbAdvertisement> tbAdvertisements=tbAdvertisementService.getAdsByPosition(1, "1","1",1);
        //2??????:????????????:??????
        List<TbAdvertisement> tbAdvertisementsText=tbAdvertisementService.getAdsByPosition(1, "1","0",2);
        //3??????:????????????:????????????,????????????(??????????????????)
        List<TbAdvertisement> textAdvertisements3=tbAdvertisementService.getAdsByPosition(5, "1","1",3);
        //2?????????4??????:???????????? advClassification =2
        List<TbAdvertisement> textInterface=tbAdvertisementService.getAdsByPosition(4, "1","2",null);


//        Map map = tbAdvertisementService.getAdsByPosition(1,"1");
//        List<TbAdvertisement> tbAdvertisements= (List<TbAdvertisement>) map.get("adv");
//        List<TbAdvertisement> tbAdvertisementsText= (List<TbAdvertisement>) map.get("textAdv");
//        List<TbAdvertisement> textAdvertisements3= (List<TbAdvertisement>) map.get("textAdv3");
//        List<TbAdvertisement> textInterface= (List<TbAdvertisement>) map.get("textItfc");

//        model.addAttribute("adsUrl", adsUrl);
//        model.addAttribute("news", news);
//        model.addAttribute("hots", hots);
        model.addAttribute("textItfc", textInterface);
        model.addAttribute("textads3", tbAdvertisementService.ImgPathoperation(peImgPath,textAdvertisements3));
        model.addAttribute("textads", tbAdvertisementsText);
        model.addAttribute("ads", tbAdvertisementService.ImgPathoperation(peImgPath,tbAdvertisements));
        //?????????????????????
        model.addAttribute("count", count);
        //???????????????id
        model.addAttribute("purchaserid", user.getUid());
        //????????????,????????????????????????????????????
        model.addAttribute("categoryList", categoryList);
        //????????????,???????????????????????????
//        model.addAttribute("eventsList", eventsList);
//        return "/index";
        return "/purchaseIndexNew";
    }


    @RequestMapping("commodityList")
    public String commodityList(Model model, Integer categoryId, String categoryName) {
        TbUserInfo user = userService.getCurrentTbUserInfo();
        int count = cartService.obtainCartCount(user.getUid());

        if (categoryName != null && !categoryName.equals("")) {
            categoryName = URLDecoder.decode(categoryName);
        }
        model.addAttribute("count", count);
        model.addAttribute("purchaserId", user.getUid());
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("categoryName", categoryName);
        return "/purchase/commodityList";
    }

    @RequestMapping("prefectureCommodityList")
    public String prefectureCommodityList(Model model, Integer categoryId, String categoryName) {
        TbUserInfo user = userService.getCurrentTbUserInfo();
        int count = cartService.obtainCartCount(user.getUid());

        if (categoryName != null && !categoryName.equals("")) {
            categoryName = URLDecoder.decode(categoryName);
        }
        model.addAttribute("count", count);
        model.addAttribute("purchaserId", user.getUid());
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("categoryName", categoryName);
        model.addAttribute("prefecture", 0);
        return "/purchase/commodityList";
    }



    @RequestMapping("commodityDetail")
    public String commodityDetail(Integer proId, Model model) {
        TbUserInfo user = userService.getCurrentTbUserInfo();
        int count = cartService.obtainCartCount(user.getUid());
        model.addAttribute("count", count);
        model.addAttribute("purchaserid", user.getUid());
        ProductDto pd = productService.selectProductDetail(proId);
        model.addAttribute("pd", pd);
        return "/purchase/commodityDetail";
    }


    @RequestMapping("commodityClassification")
    public String commodityClassification(Model model) {
        TbUserInfo currentTbUserInfo = userService.getCurrentTbUserInfo();
        model.addAttribute("categoryList", categoryService.getCategoryList(0,0));
        int count = cartService.obtainCartCount(currentTbUserInfo.getUid());

        model.addAttribute("count", count);
//        return "/purchase/commodityClassification";
        return "/purchase/commodityClassificationNew";
    }


    @RequestMapping("/purchaseFormInit")
    public String queryPurchaseFormList(Model model, String startDate, String endDate, Byte status) {
        TbUserInfo user = userService.getCurrentTbUserInfo();
        int count = cartService.obtainCartCount(user.getUid());
        model.addAttribute("count", count);
        model.addAttribute("purchaseId", user.getUid());
        model.addAttribute("user", user);
        model.addAttribute("purchaserId", userService.getCurrentTbUserInfo().getUid());
        model.addAttribute("startDate", startDate);
        model.addAttribute("endDate", endDate);
        model.addAttribute("status", status);

        return "/purchase/orderGoods";
    }

    /**
     * ????????????
     *
     * @param model
     * @param type
     * @return
     */
    @RequestMapping("/bestSeller")
    public String bestSeller(Model model, Integer type) {
        TbUserInfo user = userService.getCurrentTbUserInfo();
        int count = cartService.obtainCartCount(user.getUid());
        model.addAttribute("count", count);
        model.addAttribute("type", type);
        return "/purchase/commodityBestSeller";
    }
    /**
     * ??????
     *
     * @param type
     * @return
     */
    @RequestMapping("/selectProductByEv")
    @ResponseBody
    public Object selectProdcutByEv(Integer pageIndex, Integer pageSize, Integer type) {
        PageInfo<ProductDto> pageInfo = productService.selectProductByEv(pageIndex, pageSize, type);
        return pageInfo.getList();
    }
}
