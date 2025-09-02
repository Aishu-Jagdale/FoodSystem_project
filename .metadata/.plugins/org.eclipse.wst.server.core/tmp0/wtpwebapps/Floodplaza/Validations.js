function LoginValidation(){
	type= document.getElementById('type').value;
	if(type.selectedIndex<0){
		document.getElementById('selecterror').innerHTML="Please select type";
		return false;
	}
	
	email = document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailID";
		return false;
	}
	
	pass = document.getElementById('pass').value;
	if(pass==""){
		document.getElementById("passerror").innerHTML="Please Enter Password";
		return false;
	}
	return true;
}

function CustomerValidation(){
	
	cname =  document.getElementById('cname').value;
	if(cname==""){
		document.getElementById('cnameerror').innerHTML="Please Enter Name";
		return false;
	}
	cemail = document.getElementById('cemail').value;
	if(cemail==""){
		document.getElementById('cemailerror').innerHTML="please Enter EmailID";
		return false;
	}
	cpass = document.getElementById('cpass').value;
	if(cpass==""){
		document.getElementById("cpasserror").innerHTML="Please Enter Password";
		return false;
	}
	cadd = document.getElementById('cadd').value;
	if(cadd==""){
		document.getElementById("cadderror").innerHTML="Please Enter Address";
		return false;
	}
	ccon = document.getElementById('ccon').value;
	if(ccon==""){
		document.getElementById("cconerror").innerHTML="Please Enter Contact No.";
		return false;
	}
	return true;
}

function FeedBackValidation(){
	femail = document.getElementById('femail').value;
	if(femail==""){
		document.getElementById('femailerror').innerHTML="please Enter EmailID";
		return false;
	}
	freview = document.getElementById('freview').value;
	if(freview==""){
		document.getElementById('freviewerror').innerHTML="please Enter Review ";
		return false;
	}
	frank = document.getElementById('frank').value;
	if(frank==""){
		document.getElementById('frankerror').innerHTML="please Enter Rank ";
		return false;
	}
	frank = document.getElementById('frank').value;
	if(frank==""){
		document.getElementById('frankerror').innerHTML="please Enter Rank ";
		return false;
	}
	fsugg = document.getElementById('frank').value;
	if(frank==""){
		document.getElementById('frankerror').innerHTML="please Enter Rank ";
		return false;
	}	
	return true;
}

function CartValidation(){
	
	email = document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailID";
		return false;
	}
	fid = document.getElementById('fid').value;
	if(fid==""){
		document.getElementById('fiderror').innerHTML="please Enter FoodId";
		return false;
	}
	fname =  document.getElementById('fname').value;
	if(cname==""){
		document.getElementById('fnameerror').innerHTML="Please Enter Name";
		return false;
	}
	fprice =  document.getElementById('fprice').value;
	if(fprice==""){
		document.getElementById('fpriceerror').innerHTML="Please Enter Price";
		return false;
	}
	fquan =  document.getElementById('fquan').value;
	if(fquan==""){
		document.getElementById('fquanerror').innerHTML="Please Enter Quantity";
		return false;
	}
	tprice =  document.getElementById('tprice').value;
	if(tprice==""){
		document.getElementById('tpriceerror').innerHTML="Please Enter TotalPrice";
		return false;
	}
	return true;
}

function FoodValidation(){
	
	fname =  document.getElementById('fname').value;
	if(cname==""){
		document.getElementById('fnameerror').innerHTML="Please Enter Name";
		return false;
	}
	ftype =  document.getElementById('ftype').value;
	if(ftype==""){
		document.getElementById('ftypeerror').innerHTML="Please Enter Type";
		return false;
	}
	fcat =  document.getElementById('fcat').value;
	if(fcat==""){
		document.getElementById('fcaterror').innerHTML="Please Enter Category";
		return false;
	}
	fprice =  document.getElementById('fprice').value;
	if(fprice==""){
		document.getElementById('fpriceerror').innerHTML="Please Enter Price";
		return false;
	}
	return true;
}

function ChangePassValidation(){
	
	email = document.getElementById('email').value;
	if(email==""){
		document.getElementById('emailerror').innerHTML="please Enter EmailID";
		return false;
	}
	opass = document.getElementById('opass').value;
	if(opass==""){
		document.getElementById("opasserror").innerHTML="Please Enter Old Password";
		return false;
	}
	npass = document.getElementById('npass').value;
	if(npass==""){
		document.getElementById("npasserror").innerHTML="Please Enter New Password";
		return false;
	}
	cpass = document.getElementById('cpass').value;
	if(cpass==""){
		document.getElementById("cpasserror").innerHTML="Please Enter Confirm Password";
		return false;
	}
	return true;	
}

