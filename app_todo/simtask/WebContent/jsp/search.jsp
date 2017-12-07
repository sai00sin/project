<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Task"%>
<%@page import="java.util.List"%>

<%
	request.setCharacterEncoding("UTF-8");
	List<Task> taskList = new ArrayList<Task>();
	taskList = (List<Task>) request.getAttribute("taskList");
	System.out.println("taskListは" + taskList.size());
%>

<!-- header.jsp -->
<jsp:include page="header.jsp" />

<header class="masthead text-center text-white">
	<section id="services">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="section-heading">検索結果</h2>
					<hr class="my-4">
					<table class="table table-bordered">
						<thead>
							<tr class="bg-primary">
								<th>タイトル</th>
								<th>内容</th>
								<th>期限</th>
								<th>編集</th>
								<th>削除</th>
							</tr>
						</thead>
						<tbody>
							<%
								for (Task t : taskList) {
							%>
							<tr>
								<th scope="row"><%=t.getTitle()%></th>
								<td><%=t.getTask()%></td>
								<td><%=t.getLimitdate()%></td>
								<td><a
									href="/simtask/update?ID=<%=t.getId()%>&TITLE=<%=t.getTitle()%>&TASK=<%=t.getTask()%>&LIMITDATE=<%=t.getLimitdate()%>">編集</a></td>
								<td><a href="/simtask/delete?ID=<%=t.getId()%>">削除</a></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>
					<a href="/simtask/findAll" class="badge badge-danger">一覧に戻る</a>
				</div>
			</div>
		</div>
	</section>
</header>

<!-- footer.jsp -->
<jsp:include page="footer.jsp" />
