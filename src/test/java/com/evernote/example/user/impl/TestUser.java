package com.evernote.example.user.impl;

import com.evernote.example.user.User;

/**
 * テスト用のユーザ。
 *
 * @author naotake
 */
public class TestUser implements User {

    @Override
    public String getName() {
        return "TestUser";
    }

    @Override
    public String getDeveloperToken() {
        return "*****************************";
    }
}
