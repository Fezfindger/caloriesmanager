package com.itstep.caloriesmanager.web.user;

import com.itstep.caloriesmanager.model.User;
import org.springframework.stereotype.Controller;

import static com.itstep.caloriesmanager.web.SecurityUtil.authUserId;

@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(authUserId());
    }

    public void delete() {
        super.delete(authUserId());
    }

    public void update(User user) {
        super.update(user, authUserId());
    }
}