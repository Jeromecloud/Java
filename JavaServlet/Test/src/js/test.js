// alert("hellwo out js")
// alert("hello js");
// var div = document.getElementsByTagName("div");
// alert(div);
// var a = document.getElementById("1");
// a.href="https://www.91porn.com/video.php?category=rf&page=1";//修改标签体属性值
// a.innerHTML="https://www.91porn.com/video.php?category=rf&page=1";//改变标签体内容
// function fun1() {
//     var a = document.getElementById("1");
//     // a.href="https://www.91porn.com/video.php?category=rf&page=1";
//     a.innerText = "https://www.91porn.com/video.php?category=rf&page=1";
// }
//
// function fun2() {
//     alert("waht");
// }
// var b = document.getElementById("1");
// b.onclick = function () {
//     alert("oooo");
// }
// confirm使用
/*
var flag = confirm("Are u sure ?");
if(flag){
    alert("YYYYYYYYYYYYes");
}else {
    alert("NNNNNNNNNNNNNNo");
}*/
// prompt使用
/*
var name = prompt("What is your NNNNNNNnnname");
alert(name);
*/
//打开关闭新窗口
/*var newWindow;
document.getElementById("button1").onclick = function () {
    newWindow = open("https:www.baidu.com");
}
document.getElementById("button2").onclick = function () {
    newWindow.close();
}*/
//定时器(一次性timeout，循环interval)
/*// setTimeout("alert('BOOOOOOOOOOMMMM~~~~')",3000);
setTimeout("fun()",3000);
function fun() {
    alert("BOOOOOOOOOOOOOMMMM~~~啊")
}
setTimeout(fun,2000);
function fun() {
    alert("aaaaaaaaaaaa")
}
var id = setTimeout(fun,2000);
clearTimeout(id);
*/
// setInterval("alert('eeeeeeee')",2000);写法和timeout相同
//简易轮播图
/*也可以对i值进行判断重置
var i = 0;
function fun(){
    document.getElementById("img").src="img/banner_"+ i%3 +".jpg";
    i++;
}
setInterval(fun,4000);*/
