package com.imooc.mall.service;

import com.github.pagehelper.PageInfo;
import com.imooc.mall.model.request.CreateOrderReq;
import com.imooc.mall.model.vo.CartVO;
import com.imooc.mall.model.vo.OrderVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述 ：订单Service
 */


public interface OrderService {


    String create(CreateOrderReq createOrderReq);

    OrderVO detail(String orderNo);

    void cancel(String orderNo);

    PageInfo listForCustomer(Integer pageNum, Integer pageSize);

    String qrcode(String orderNo);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    void pay(String orderNo);

    void deliver(String orderNo);

    //发货
    void finish(String orderNo);
}
