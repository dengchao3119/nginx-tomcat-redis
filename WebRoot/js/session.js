$(function() {
	
	$.ajax({
		url : 'session',
		method : 'get',
		success : function(result){
			$("#firstSessinId").append(result);
		}
	});
	
})