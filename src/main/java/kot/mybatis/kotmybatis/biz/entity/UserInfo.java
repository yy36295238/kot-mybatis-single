package kot.mybatis.kotmybatis.biz.entity;

import kot.bootstarter.kotmybatis.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangyu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("user_info")
public class UserInfo {
  /**
   *
   */
  private Long id;

  /**
   *
   */
  private String userName;
}
