function getAngka(x) {
	return Number($(x).val());
}
function myFunction1() {
	var hasil = getAngka("#Number1") + getAngka("#Number2");
	$("#demo").val(hasil);
}
function myFunction2() {
	var hasil = getAngka("#Number1") - getAngka("#Number2");
	$("#demo").val(hasil);
}
function myFunction3() {
	var hasil = getAngka("#Number1") * getAngka("#Number2");
	$("#demo").val(hasil);
}
function myFunction4() {
	var hasil = getAngka("#Number1") / getAngka("#Number2");
	$("#demo").val(hasil);
}

$(document).ready(function() {
	alert("Dokumen sudah termuat");
});
