package kot.mybatis.kotmybatis.biz.service;

import kot.bootstarter.kotmybatis.service.MapperManagerService;
import kot.mybatis.kotmybatis.biz.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author yangyu
 */
public interface UserService extends MapperManagerService<User> {
    List<Map<String, Object>> listForMap();

    Map<String, Object> findOneForMap();

    int myInsert(User user);
}
