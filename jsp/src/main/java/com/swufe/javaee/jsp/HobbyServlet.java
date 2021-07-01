package com.swufe.javaee.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = "/hobbyFind")
public class HobbyServlet extends HttpServlet {
    Map<String,List<String>> userHobby ;

//    public List<String> gethobby(String c){
//        List<String> list = new ArrayList<>();
//        list.add(c);
//        return list;
//    }

    public void init() {
        userHobby = new HashMap<>();
        List<String> list1= new ArrayList<>();
        list1.add("内卷");
        list1.add("荒野乱斗");
        userHobby.put("Henry",list1);

        List<String> list4 = new ArrayList<>();
        list4.add("shopping");
        list4.add("basketball");
        list4.add("上课睡觉");
        userHobby.put("Bobby",list4);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("skiing");
        list2.add("scuba");
        userHobby.put("Jim",list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("knitting");
        list3.add("scuba");
        userHobby.put("James",list3);



        ArrayList<String> list5 = new ArrayList<>();
        list5.add("skiing");
        list5.add("scuba");
        userHobby.put("Bob",list5);

        List<String> list6 = new ArrayList<>();
        list6.add("football");
        list6.add("video game");
        userHobby.put("Tom",list6);

        ArrayList<String> list7 = new ArrayList<>();
        list7.add("dating");
        list7.add("scuba");
        list7.add("skiing");
        userHobby.put("Pradeep",list7);



        ArrayList<String> list8 = new ArrayList<>();
        list8.add("skiing");
        list8.add("knitting");
        userHobby.put("Philippe",list8);



    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String hobby = request.getParameter("hobby");
       List<String> names = new ArrayList<>();
       userHobby.forEach((k, v) -> {
           if (v.contains(hobby)) {
               names.add(k);
           }
       });
       request.setAttribute("names", names);
       request.setAttribute("hobby", hobby);
       // Two JSPs have different UI styles.
       //  request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
       request.getRequestDispatcher("hobbyResult.jsp").forward(request, response);
    }

}
