/**
 * 验证表单数据是否正确
 * @returns
 */
	
function checkForm(){
	var bookName = document.getElementById("bookName").value;
	var bookPrice = document.getElementById("bookPrice").value;
	var bookNum = document.getElementById("bookNum").value;
	var regxName = /^\w{3,12}$/;
	var regxPrice = /^[1-9][0-9]{0,5}\.[0,9]{2}|[0]\.[0,9]{2}$/;
	var regxNum = /^[1-9][0-9]{0,5}$/;
	var flag = true;
	//验证账户是否符合规则
	if(!regxName.test(bookName)){
		document.getElementById("errorName").style.display="inline-block";
		flag = false;
		return false;	
	}else{
		document.getElementById("errorName").style.display="none";
		if(!regxPrice.test(bookPrice)){
			document.getElementById("errorPrice").style.display="inline-block";
			flag = false;
			return false;	
		}else{
			document.getElementById("errorPrice").style.display="none";
			if(!regxNum.test(bookNum)){
				document.getElementById("errorNum").style.display="inline-block";
				flag = false;
				return false;	
				
			}
		}
	}
	
	return flag;
	
}

function test(){
	alert("test");
}
