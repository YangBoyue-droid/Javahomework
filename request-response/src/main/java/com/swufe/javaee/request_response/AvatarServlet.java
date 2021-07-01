package com.swufe.javaee.request_response;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;
import com.talanlabs.avatargenerator.cat.CatAvatar;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;


@WebServlet(urlPatterns= "/AvatarServlet")
public class AvatarServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,
            IOException {

        Avatar avatar = CatAvatar.newAvatarBuilder().build();
        String data = request.getParameter("data");
        long l=Long.parseLong(data);
        BufferedImage image = avatar.create(l);

        ImageIO.write(image, "PNG", response.getOutputStream());

    }
}
