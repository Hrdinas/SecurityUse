package src.main.java.com.example.basicconfiguration.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.basicconfiguration.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author zhoujinpeng
* @description 针对表【user(系统用户)】的数据库操作Mapper
* @createDate 2023-08-10 16:46:44
* @Entity com.example.offerareward.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
