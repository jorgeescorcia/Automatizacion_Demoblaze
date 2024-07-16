package com.co.enlace.utils.front;

import com.github.javafaker.Faker;



public abstract class Diccionario {

    private  static  Faker faker = new Faker();
    public static final String ACTOR_NAME = "Jorgito";
    public static final String URL_BASE ="https://www.demoblaze.com/";

    public static final String USER_REGISTRO = faker.name().fullName().toLowerCase();
    public static final String PASSWORD_REGISTRO = faker.number().digits(15);


    public static final String EMAIL_LOGIN = USER_REGISTRO;
    public static final String PASSWORD_LOGIN = PASSWORD_REGISTRO;

    public static  final  double VALOR_CORRECTO = 1150.0;








}
