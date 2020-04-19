package ua.kiev.prog;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class RoomServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (!LoginData.checkCredentials(req)) {
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        } else {
            String login = req.getParameter("login");
            String roomName = req.getParameter("room_name");
            String param = req.getParameter("param");
            if (LoginData.userExists(roomName)) {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            } else if (!ChatRooms.exists(roomName) || ChatRooms.userIsInRoom(login, roomName)) {
                ChatRooms.addUser(roomName, login, param.split(" "));
            } else resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
        }
    }
}
