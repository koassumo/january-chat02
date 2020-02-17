package com.geekbrains.chat.server;

public interface AuthManager {
    String getNicknameByLoginAndPassword(String login, String password);
    boolean changeNickname(String oldNickname, String newNickname);
    void start();
    void stop();
}