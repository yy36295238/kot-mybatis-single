package kot.mybatis.kotmybatis.biz.controller;


import kot.mybatis.kotmybatis.biz.entity.Goods;
import kot.mybatis.kotmybatis.biz.entity.Order;
import kot.mybatis.kotmybatis.biz.service.IGoodsService;
import kot.mybatis.kotmybatis.biz.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @Autowired
    private IOrderService orderService;

    @RequestMapping("/secKill")
    public String secKill(Long id, Long userId) {
        final Goods goods = goodsService.newQuery().findOne(Goods.builder().id(id).build());
        // 校验库存
        if (goods.getNum() <= goods.getSold()) {
            System.err.println("已售完");
            return "已售完";
        }
        // 乐观锁更新库存
        final int count = goodsService.newUpdate().updateById(Goods.builder().id(id).version(goods.getVersion()).sold(goods.getSold() + 1).build());
        if (count > 0) {
            // 插入订单
            orderService.newUpdate().insert(Order.builder().goodsId(goods.getId()).userId(userId).build());
            System.err.println("抢购成功");
            return "抢购成功";
        }
        System.err.println("未抢到可以继续抢");
        return "未抢到可以继续抢";
    }

    @RequestMapping("/reset")
    public String reset() {
        goodsService.newUpdate().update(Goods.builder().sold(0).version(0).build(), Goods.builder().id(1L).build());
        orderService.newUpdate().delete(new Order());
        return "SUCCESS";
    }
}
