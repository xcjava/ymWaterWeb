/**
 * jquery选项卡插件
 * 调用方法如下：
 * 	
 *		$.jqtab("#tabs","#tab_conbox","click");
 *		
 *		$.jqtab("#tabs2","#tab_conbox2","mouseenter");
 *		<li class="curr"><a href="#">焦点幻灯片</a></li> 设置这个样式则默认选定改选显卡
 */
/*;jQuery.jqtab = function(tabtit,tab_conbox,shijian) {
	$(tab_conbox).find("li").hide();
	$(tabtit).find("li:first").addClass("thistab").show(); 
	$(tab_conbox).find("li:first").show();
	
	var thisindex = $(tabtit).find("li.curr").index();
	if(thisindex > -1){
		$(tabtit).find(".curr").addClass("thistab").show().siblings("li").removeClass("thistab");
		$(tab_conbox).children().eq(thisindex).show().siblings().hide();
	}

	$(tabtit).find("li").bind(shijian,function(){
	  $(this).addClass("thistab").siblings("li").removeClass("thistab"); 
		var activeindex = $(tabtit).find("li").index(this);
		$(tab_conbox).children().eq(activeindex).show().siblings().hide();
		return false;
	});

};*/
;jQuery.jqtab = function(tabtit,tab_conbox,iframe,shijian) {
	$(tabtit).find("li:first").addClass("thistab").show();
	$(iframe).attr('src',$(tabtit).find("li:first").attr('data-src'));
	var thisindex = $(tabtit).find("li.curr").index();
	if(thisindex > -1){
		$(tabtit).find(".curr").addClass("thistab").show().siblings("li").removeClass("thistab");
		$(iframe).attr('src',$(tabtit).find(".curr").attr('data-src'));
	}
	$(tabtit).find("li").bind(shijian,function(){
	  $(this).addClass("thistab").siblings("li").removeClass("thistab");
		$(iframe).attr('src',$(this).attr('data-src').replace("message=", ""));
		return false;
	});
};