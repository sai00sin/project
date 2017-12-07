<%@page import="entity.Task"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- header.jsp -->
<jsp:include page="header.jsp" />

<%
	request.setCharacterEncoding("UTF-8");
	Task task = new Task();
	task = (Task) request.getAttribute("task");
%>

<header class="masthead text-center text-white">
	<section id="services">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="section-heading">一覧</h2>
					<hr class="my-4">
					<form action="/simtask/update" method="post">
						<div class="form-group">
							<input type="hidden" name="ID" value="<%=task.getId() %>">
						</div>
						<div class="form-group">
							<label for="exampleFormControlSelect1">タイトル</label>
							<input type="text" name="TITLE" class="form-control" value="<%=task.getTitle()%>">
						</div>
						<div class="form-group">
							<label for="exampleFormControlTextarea1">タスク</label>
							<textarea name="TASK" class="form-control"><%=task.getTask()%></textarea>
						</div>
						<div class="form-group">
							<label for="exampleFormControlSelect2">期限</label>
							<input type="text" name="LIMITDATE" class="form-control" value="<%=task.getLimitdate()%>">
						</div>
						<button type="submit" class="btn btn-primary">更新</button>
					</form>
				</div>
			</div>
		</div>
	</section>
</header>


<!-- footer.jsp -->
<jsp:include page="footer.jsp" />
