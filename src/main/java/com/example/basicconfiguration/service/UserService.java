package src.main.java.com.example.basicconfiguration.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.basicconfiguration.domain.User;
import com.example.basicconfiguration.tuils.CommonResult;

/**
* @author zhoujinpeng
* @description 针对表【user(系统用户)】的数据库操作Service
* @createDate 2023-08-10 16:46:44
*/
public interface UserService extends IService<User> {

    CommonResult adminLogin(User user);
}
