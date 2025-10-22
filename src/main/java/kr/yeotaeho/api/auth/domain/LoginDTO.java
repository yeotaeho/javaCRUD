package kr.yeotaeho.api.auth.domain;

public class LoginDTO {

    private String email;
    private String password;
    private int number1;
    private int number2;
    private int nanumnumber1;
    private int nanumnumber2;
    private int minusnumber1;
    private int minusnumber2;
    private int gobnumber1;
    private int gobnumber2;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void number1(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void number2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }

    public void nanumnumber1(int nanumnumber1) {
        this.nanumnumber1 = nanumnumber1;
    }

    public int getNanumnumber1() {
        return nanumnumber1;
    }

    public void nanumnumber2(int nanumnumber2) {
        this.nanumnumber2 = nanumnumber2;
    }

    public int getNanumnumber2() {
        return nanumnumber2;
    }

    public void minusnumber1(int minusnumber1) {
        this.minusnumber1 = minusnumber1;
    }

    public int getMinusnumber1() {
        return minusnumber1;
    }

    public void minusnumber2(int minusnumber2) {
        this.minusnumber2 = minusnumber2;
    }

    public int getMinusnumber2() {
        return minusnumber2;
    }

    public void gobnumber1(int gobnumber1) {
        this.gobnumber1 = gobnumber1;
    }

    public int getGobnumber1() {
        return gobnumber1;
    }

    public void gobnumber2(int gobnumber2) {
        this.gobnumber2 = gobnumber2;
    }

    public int getGobnumber2() {
        return gobnumber2;
    }

}