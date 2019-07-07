package kot.mybatis.kotmybatis.biz.service.impl;

import kot.bootstarter.kotmybatis.service.impl.MapperManagerServiceImpl;
import kot.mybatis.kotmybatis.biz.entity.User;
import kot.mybatis.kotmybatis.biz.mapper.UserMapper;
import kot.mybatis.kotmybatis.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author yangyu
 */
@Service
public class UserServiceImpl extends MapperManagerServiceImpl<User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Map<String, Object>> listForMap() {
        return userMapper.listForMap();
    }

    @Override
    public Map<String, Object> findOneForMap() {
        return userMapper.findOneForMap();
    }

    @Override public int myInsert(User user) {
        return userMapper.myInsert(user);
    }
}
