/*
$("ul").on("click", ".init", function() {
    $(this).closest("ul").children('li:not(.init)').toggle();
});
*/

$("ul").click(function() {
	$(this).children('li:not(.init)').toggle();
});

var allOptions = $("ul").children('li:not(.init)');

$("li:not(.init)").click(function() {
    allOptions.removeClass('selected');
    $(this).addClass('selected');
    $("ul").children('.init').html($(this).html());
    allOptions.toggle();
});


/*
$("ul").on("click", "li:not(.init)", function() {
    allOptions.removeClass('selected');
    $(this).addClass('selected');
    $("ul").children('.init').html($(this).html());
    allOptions.toggle();
});
*/