package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CabType;
import model.Location;
import model.Place;
import service.BookingService;
import service.BookingServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/BookingController")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookingController() {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		float fare;
		BookingService bookingService = new BookingServiceImpl();
		CabType cabType = CabType.valueOf(request.getParameter("cabType"));
		Location location = new Location(Place.valueOf(request.getParameter("pickUpLocation")),
				Place.valueOf(request.getParameter("pickUpLocation")));
		fare = bookingService.estimateFare(location, cabType);
		request.setAttribute("estimatedFare", fare);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}

}
