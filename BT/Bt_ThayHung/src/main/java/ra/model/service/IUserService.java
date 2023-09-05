package ra.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ra.model.entity.User;

public interface IUserService extends IGenericService<User,Long> {
        Page<User> findAll(String name,int page,int size,String sort, String by);
}
