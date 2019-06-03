//动态加载外部的js文件

function loadScript(url){
	let script = document.createElement('script')
	script.type = 'text/javascript';
	script.src = url;
	document.documentElement.appendChild(script);
}

//动态加载css
function loadStyle(url){
	let link = document.createElement('link');
	link.rel = 'stylesheet';
	link.type = 'text/css';
	link.href = url;

	const head = document.getElementsByTagName('head')[0];
	head.appendChild(link);
}
// 以前通过class选取元素 
function getByClass(cls){
	var ele = document.getElementsByTagName('*');
	var result = [];
	for(var i = 0;i<ele.length; i++){
		if(ele[i].className == cls){
			result.push(ele[i]);
		}
	}
	return result;
}
// 现在 document.getElementsByClassName()