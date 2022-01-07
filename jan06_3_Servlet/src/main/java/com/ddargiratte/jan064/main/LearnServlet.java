package com.ddargiratte.jan064.main;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// main�� ���� ?!?!
// main�� tomcat�� ���ο� ����

// Servlet (Server + Application)

//@XXX : Annotation
// ������ ���� �� ����� �����ؾ� �ߴµ�.. -> �ڵ� ó���� ����!

@WebServlet("/asdfsda") // LearnSErvlet�� Tomcat�� ��� (*** ����� ������ �ȵ�!)
public class LearnServlet extends HttpServlet {
	// HttpServletŬ������ �ִ� ��� (��û������ �����ϱ�)�� ��� ����
	// ������ �� �߰� o
	
	// �۾��ϸ鼭 ���� ǥ���϶��.. (������ ������)
	private static final long serialVersionUID = 1L;

	// ������ - �� LearnServlet ��ü�� ����°� tomcat
	// ���� �� �� ���� (������ ������)
    public LearnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    // event-driven programming
    // Tomcat�� ������ -> LearnServlet�� ����
    //	-> tomcat�� LearnServlet�̶�� ��ü�� ���� ���ѷ���
    //	-> � �̺�Ʈ�� �߻��ϸ� �װ��� ó���ϰ� �ٽ� ������ ����
    
    // **�ٽɺκ�!!
    // �������ٰ� Ŭ���̾�Ʈ�� �� Servlet���� GET��� ��û�ϸ�
    // Tomcat�� doGet�޼ҵ带 �ڵ����� ȣ��
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// �������ٰ� Ŭ���̾�Ʈ�� �� Servlet�� POST��� ��û�ϸ�
	// Tomcatdl doPost�޼ҵ带 �ڵ����� ȣ��
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
