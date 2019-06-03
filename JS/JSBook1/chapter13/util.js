var EventUtil = {
	// 添加事件
	addHandler: function(ele,type,func){
		if(ele.addEventListener){
			ele.addEventListener(type,func,false);
		}else if(ele.attachEvent){
			ele.attachEvent('on'+type,func);
		}else{
			ele['on'+type] = func;
		}
	},
	// 移除事件
	removeHandler: function(ele,type,func){
		if(ele.removeEventListener){
			ele.removerEventListener(type,func,false);
		}else if(ele.detachEvent){
			ele.detachEvent('on'+type,func);
		}else{
			ele['on'+type] = null;
		}
	}
	
	getEvent: function(event){
		return event?event:window.event;
	}

	getTarget: function(event){
		return event.target || event.srcElement;	// IE
	}
	// 阻止默认事件
	preventDefault: function(event){
		if(event.preventDefault){
			event.preventDefault();
		}else{
			event.returnValue = false;	// IE
		}
	}
	// 阻止事件冒泡
	stopPropagation: function(event){
		if(event.stopPropagation){
			event.stopPropagation();
		}else{
			event.cancelBubble = true;	// IE
		}
	}
}