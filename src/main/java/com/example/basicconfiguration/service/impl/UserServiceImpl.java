package src.main.java.com.example.basicconfiguration.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.basicconfiguration.configure.RedisCache;
import com.example.basicconfiguration.domain.User;
import com.example.basicconfiguration.dto.LoginDto;
import com.example.basicconfiguration.service.UserService;
import com.example.basicconfiguration.mapper.UserMapper;
import com.example.basicconfiguration.tuils.CommonResult;
import com.example.basicconfiguration.tuils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;


/**
 * @author zhoujinpeng
 * @description 针对表【user(系统用户)】的数据库操作Service实现
 * @createDate 2023-08-10 16:46:44
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private RedisCache redisCache;


    @Override
    public CommonResult adminLogin(User userQuery) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userQuery.getUsername(), userQuery.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        if (Objects.isNull(authenticate)) {
            throw new RuntimeException("用户名或密码错误");
        }
        //使用userid生成token
        LoginDto  loginUser = (LoginDto) authenticate.getPrincipal();
        String userId = loginUser.getUser().getId().toString();
        String jwt = JwtUtil.createJWT(userId);
        //authenticate存入redis
        redisCache.setCacheObject("login:" + userId, loginUser);
        //把token响应给前端
        HashMap<String, Object> map = new HashMap<>();
        map.put("token", jwt);
        map.put("user",loginUser);
        //封装成UserDetails对象返回
        return CommonResult.success(map);
    }
}
