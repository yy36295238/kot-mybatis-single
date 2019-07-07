package kot.mybatis.kotmybatis.biz.service.impl;

import kot.bootstarter.kotmybatis.service.impl.MapperManagerServiceImpl;
import kot.mybatis.kotmybatis.biz.entity.UserInfo;
import kot.mybatis.kotmybatis.biz.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @author yangyu
 */
@Service
public class UserInfoServiceImpl extends MapperManagerServiceImpl<UserInfo> implements UserInfoService {
}
