package controler.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}


// todo join  отключить autocomit + блинов конекшни пул + ентити строго равно запросам
// todo 3 фильтра: корилический, локализация, авторизация и аутонтификация 1) залесть в сервис зайти в базу данных и проверить пользователя,
// todo 2) скачать у пользователя, и роль зашить в сесию, логин пользователя зашить в базу контекст
// todo Лог оут, стереть из сесии роль и записать гостя, стереть пользователя из контекста и выйти на главную страницу
// todo редирект по команде. Без фильтра серфлет не запускается пример фильтра в видео
// TODO: 14.08.2018  DTO
