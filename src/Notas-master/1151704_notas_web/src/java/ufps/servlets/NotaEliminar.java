/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ufps.modelo.util.Servicio;

/**
 *
 * @author OMAR MONTES
 */
public class NotaEliminar extends HttpServlet {

    private HttpSession session;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        req.setCharacterEncoding("UTF-8");

        session = req.getSession();
        Servicio controlador = (Servicio) session.getAttribute("controlador");

        String asignatura = req.getParameter("asignatura");
        String carrera = req.getParameter("carrera");
        String alumno = req.getParameter("alumno");

        if (controlador != null && asignatura != null && carrera != null && alumno != null) {

            controlador.notaEliminar(asignatura, carrera, alumno);

        }

        resp.sendRedirect(req.getContextPath() + "/notas.jsp");

    }
}
