package kjm.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.util.main.MainCommand;
import kr.co.util.main.MainCommandAction;

public class insertUICommand implements MainCommand {

	@Override
	public MainCommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		return new MainCommandAction(false, "kjmInsert.jsp");
	}

}
