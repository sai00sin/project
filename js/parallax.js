$(function() {
	$(window).scroll(function() {
		var value = $(this).scrollTop();
		$('#scrollValue').text(value);
	});
})