package kot.mybatis.kotmybatis.biz.service.impl;

import kot.bootstarter.kotmybatis.service.impl.MapperManagerServiceImpl;
import kot.mybatis.kotmybatis.biz.entity.Order;
import kot.mybatis.kotmybatis.biz.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @author yangyu
 */
@Service
public class OrderServiceImpl extends MapperManagerServiceImpl<Order> implements IOrderService {
}
