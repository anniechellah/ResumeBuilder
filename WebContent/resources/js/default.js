/**
 * 
 */
jQuery(document).ready(function($){
	
	$(".lightbox").click(function() {
		var overlayLink = $(this).attr("href");
		console.log(overlayLink);
		var queryString = overlayLink.split("?");
		queryString = queryString[1].split("=");
		var variableName = queryString[0];
		var variableValue = queryString[1];
		console.log(queryString);
		$.ajax({
			type:'POST',
			url: 'viewSummary.jsp',
			dataType:'html',
			data:{
				page:variableValue
			},
			success: function(data){
				console.log(data);
				window.startOverlay(data);
			}
		})
		
		return false;
		});
});

function startOverlay(overlayLink) {

   $("body").append('<div class="overlay"></div><div class="container"></div>').css({"overflow-y":"hidden"});
   $(".overlay").animate({"opacity":"0.6"}, 200, "linear");
   $(".container").html(overlayLink);
   
   $('.container').show();
   
   $(".overlay").click(function(){
	   console.log("here in overlay");
	    $(".container, .overlay")
	    .animate({"opacity":"0"}, 200, function(){
	        $(".container, .overlay").remove();
	    })
	    return false;
	});

       
}


