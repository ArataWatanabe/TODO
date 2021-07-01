package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand = new Random();
		int randomValue = rand.nextInt(4);
		String randomString = new String[] {"Linux", "paiza", "TODOアプリ作成", "履歴書作成"}[randomValue];
		String today = new SimpleDateFormat("MM月dd日").format(new Date());

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String resultHtml = "<html>\n"
				+ "  <head>\n"
				+ "    <title>Phase1</title>\n"
				+ "  </head>\n"
				+ "  <body>\n"
				+ "    <table border=\"1\">\n"
				+ "      <h1>TODOアプリケーション</h1>\n"
				+ "      <h2>渡邊新のTODOリスト</h2>\n"
				+ "      <tr>\n"
				+ "        <th>No</th>\n"
				+ "        <th>重要度</th>\n"
				+ "        <th>内容</th>\n"
				+ "        <th>期日</th>\n"
				+ "      </tr>\n"
				+ "      <tr>\n"
				+ "        <td>" + 1 + "</td>\n"
				+ "        <td>" + (randomValue + 1) + "</td>\n"
				+ "        <td>" + randomString + "</td>\n"
				+ "        <td>" + today + "</td>\n"
				+ "      </tr>\n"
				+ "    </table>\n"
				+ "  </body>\n"
				+ "</html>\n";
		out.println(resultHtml);
	}



}
