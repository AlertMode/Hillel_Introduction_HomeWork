package com.vicesunrise.xxx;

public class LogicalUnit {
    private byte length;
    private int[] digits = {48, 57};
    private int[] uppercase = {65, 90};
    private int[] lowercase = {97, 122};

    public void setLength(byte length){
        this.length = length;
    }

    public char[] passwordGenerator() {
        char[] password = new char[length];
        byte[] check = {0, 0, 0};
        boolean status = (check[0] != 0) && (check[1] != 0) && (check[2] != 0);
        do {
            for (int j = 0; j < password.length; j++) {
                int port = random(1, 3);
                switch (port) {
                    case 1:
                        password[j] = (char) random(digits[0], digits[1]);
                        ++check[0];
                        break;
                    case 2:
                        password[j] = (char) random(uppercase[0], uppercase[1]);
                        ++check[1];
                        break;
                    case 3:
                        password[j] = (char) random(lowercase[0], lowercase[1]);
                        ++check[2];
                        break;
                }
            }
        } while(status);
        return password;
    }

    private static int random(int minimum, int maximum){
        return (int)(Math.random() * ((maximum - minimum) + 1) + minimum);
    }
}