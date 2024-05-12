package com.sparksuccess.demo.ContentController;



public class VinDialect {

    public static String getModel( String vinChunk) {
        // Call the service method to get the meaning of the VIN chunk
        switch(vinChunk) {
            case "111":
                return "Tahoe";
            case "222":
                return "Traverse";
            case "333":
                return "Equinox";
            case "444":
                return "Captiva";
            case "555":
                return "Tracker";
            case "666":
                return "Malibu";
            case "777":
                return "Onix";
            case "888":
                return "Labo";
            case "999":
                return "Gentra";
            case "AAA":
                return "Cobalt";
            case "BBB":
                return "Spark";
            default:
                return "Неизвестная модель";
        }

    }
    public static String getYear( String vinChunk) {
        // Call the service method to get the meaning of the VIN chunk
        switch(vinChunk) {
            case "001":
                return "2023";
            case "002":
                return "2024";
            default:
                return "Неизвестный год";
        }

    }
    public static String getColor( String vinChunk) {
        // Call the service method to get the meaning of the VIN chunk
        switch(vinChunk) {
            case "111":
                return "черный";
            case "222":
                return "белый";
            case "333":
                return "мокрый асфальт";
            case "444":
                return "зелёный";
            default:
                return "неизвестный цвет";
        }

    }
    public static String getBody( String vinChunk) {
        // Call the service method to get the meaning of the VIN chunk
        switch(vinChunk) {
            case "01":
                return "Седан";
            case "02":
                return "Внедорожник";
            case "03":
                return "Купе";
            default:
                return "неизвестный тип кузова";
        }

    }
}
