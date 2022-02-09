package com.codegym.controller;

import com.codegym.IOFile.ReadFile;
import com.codegym.IOFile.WriteFile;
import com.codegym.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManagement implements WriteFile, ReadFile {
    private static List<User> users = new ArrayList<>();
    private static final String REGEX_ID = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";//Tối thiểu tám ký tự, ít nhất một chữ cái và một số
    private static final String REGEX_PASS = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";//Tối thiểu tám ký tự, ít nhất một chữ cái viết hoa, một chữ cái viết thường và một số

    public UserManagement() {
        File file = new File("user.txt");
        if (file.exists()) {
            try {
                readFile("user.txt");
            } catch (IOException | ClassNotFoundException e) {
            }
        }
    }

    public void displayAll() {
        for (User user : users)
            System.out.println(user);
    }

    public void register(User user) {
        users.add(user);
        try {
            writeFile("user.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public boolean validateUserName(String regex) {
        Pattern pattern = Pattern.compile(REGEX_ID);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validatePassWord(String regex) {
        Pattern pattern = Pattern.compile(REGEX_PASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

   public boolean checkExistId(String string) {
        for (User user : users) {
            if (user.getUserName().equals(string)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkUserLogin(String userName, String password){
        boolean isLogin = false;
        for (int i = 0; i < users.size(); i++) {
            if (userName.equals(users.get(i).getUserName()) && password.equals(users.get(i).getPassword())){
                isLogin = true;
                break;
            }
        }
        return  isLogin;
    }


    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        users = (List<User>) ois.readObject();
    }

    @Override
    public void writeFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(users);
    }
}
