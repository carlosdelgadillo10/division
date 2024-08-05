package com.example;

import com.google.gson.Gson;
import static spark.Spark.*;

public class DivisionAPI {

    private static class DivisionRequest {
        double num1;
        double num2;
    }

    public static void main(String[] args) {
        port(8006); // Configura el puerto

        Gson gson = new Gson();

        post("/divide", (request, response) -> {
            DivisionRequest divisionRequest = gson.fromJson(request.body(), DivisionRequest.class);

            if (divisionRequest.num2 == 0) {
                response.status(400);
                return "Cannot divide by zero";
            }

            double result = divisionRequest.num1 / divisionRequest.num2;
            response.type("application/json");
            return gson.toJson(result);
        });
    }
}
