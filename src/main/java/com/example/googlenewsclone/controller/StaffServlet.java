package com.example.googlenewsclone.controller;

import com.example.googlenewsclone.utils.ServletUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StaffServlet", value = "/Staff/*")
public class StaffServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();
        switch (path){
            case "/Editor":
                ServletUtils.forward("/views/vwEditor/index.jsp", request, response);
                break;
            case "/Writer":
                ServletUtils.forward("/views/vwWriter/index.jsp", request, response);
                break;
            case "/Admin":
                ServletUtils.forward("/views/vwAdmin/vwAdminUser/index.jsp", request, response);
                break;
            default:
                ServletUtils.forward("/views/404.jsp", request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();
        switch (path) {
            default:
                ServletUtils.forward("/views/404.jsp", request, response);
                break;
        }
    }
}
