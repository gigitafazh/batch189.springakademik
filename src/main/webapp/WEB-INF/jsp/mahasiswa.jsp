<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Mahasiswa</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<center>
			<h3>Formulir Biodata Mahasiswa</h3>
		</center>
		<br>
		<div class="row row-centered">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<form id="form-mahasiswa">
					<div class="form-group">
						<label class="control-label" for="nim">NIM:</label> <input
							type="text" class="form-control" id="nim" name="nim">
					</div>
					<div class="form-group">
						<label class="control-label" for="nama">Nama:</label> <input
							type="text" class="form-control" id="nama" name="nama">
					</div>
					<div class="form-group">
						<label class="control-label" for="tglLahir">Tanggal Lahir:</label>
						<input type="date" class="form-control" id="tglLahir"
							name="tglLahir">
					</div>
					<div class="form-group">
						<label class="control-label" for="fakultas">Fakultas:</label> <input
							type="text" class="form-control" id="fakultas" name="fakultas">
					</div>
					<div class="form-group">
						<label class="control-label" for="prodi">Prodi:</label> <input
							type="text" class="form-control" id="prodi" name="prodi">
					</div>
					<div class="form-group">
						<label class="control-label" for="alamat">Alamat:</label> <input
							type="text" class="form-control" id="alamat" name="alamat">
					</div>
					<div class="form-group">
						<label class="control-label" for="email">Email:</label> <input
							type="text" class="form-control" id="email" name="email">
					</div>
					<div class="form-group">
						<label class="control-label" for="telp">Telepon:</label> <input
							type="text" class="form-control" id="telp" name="telp">
					</div>

					<div class="form-group">
						<input class="btn btn-primary" type="button" value="Submit"
							onclick="simpan()"> <input class="btn btn-secondary"
							type="button" value="Reset" onclick="clicked()"> &emsp;
					</div>
				</form>
			</div>
			<div class="col-md-3"></div>
		</div>
		<br>
		<div class="row row-centered">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<center>
					<h3>Biodata Mahasiswa</h3>
				</center>
				<br>
				<div class="table-responsive">
					<table class="table table-striped table-sm">
						<thead>
							<tr>
								<th>NIM</th>
								<th>Nama</th>
								<th>Tanggal Lahir</th>
								<th>Fakultas</th>
								<th>Prodi</th>
								<th>Alamat</th>
								<th>Email</th>
								<th>Telepon</th>
								<th></th>
							</tr>
						</thead>
						<tbody id="dataMahasiswa">
						</tbody>
					</table>
				</div>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
	<!--		<div class="row">
			<c:forEach items="${list}" var="mahasiswa">
				<div class="form-group">
					<div class="col-md-offset-4 col-md-8">
						<p width="100px">
							<img src="../assets/img/girl.jpg" width="137px" height="200px"
								border="2">
						</p>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="nim">NIM:</label>
					<div class="col-md-8">
						<p>${mahasiswa.nim}</p>
					</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="nama">Nama:</label>
					<div class="col-md-8">
						<p>${mahasiswa.nama}</p>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="tglLahir">Tanggal
						Lahir:</label>
					<div class="col-md-8">
						<p>${mahasiswa.tglLahir}</p>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="jurusan">Jurusan:</label>
					<div class="col-md-8">
						<p>${mahasiswa.btcmp}</p>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="kampus">Asal
						Kampus:</label>
					<div class="col-md-8">
						<p>${mahasiswa.kampus}</p>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="alamat">Alamat:</label>
					<div class="col-md-8">
						<p>${mahasiswa.alamat}</p>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-4" for="email">Email:</label>
					<div class="col-md-8">
						<p>${mahasiswa.email}</p>
					</div>
					<div class="form-group">
					<label class="control-label col-md-4" for="telp">Telepon:</label>
					<div class="col-md-8">
						<p>${mahasiswa.telp}</p>
					</div>
				</div>
			</c:forEach>
		</div>
	</div> -->
	<script>
		var modus = 'insert';

		function getFormData($form) {
			var unindexed_array = $form.serializeArray();
			var indexed_array = {};

			$.map(unindexed_array, function(n, i) {
				indexed_array[n['name']] = n['value'];
			});

			return indexed_array;
		}

		function tampilkanData(d) {
			var s = '';
			$(d)
					.each(
							function(index, element) {
								s += '<tr>';
								s += '<td>' + element.nim + '</td>';
								s += '<td>' + element.nama + '</td>';
								s += '<td>' + element.tglLahir + '</td>';
								s += '<td>' + element.fakultas + '</td>';
								s += '<td>' + element.prodi + '</td>';
								s += '<td>' + element.alamat + '</td>';
								s += '<td>' + element.email + '</td>';
								s += '<td>' + element.telp + '</td>';
								s += '<td>'
										+ '<input class="btn btn-success btn-sm" type="button" value="Edit" style="margin-right: 5px" onclick="load(\''
										+ element.nim
										+ '\')">'
										+ '<input class="btn btn-danger btn-sm" type="button" value="Delete" onclick="hapus(\''
										+ element.nim + '\')">' + '</td>';
								s += '</tr>';
							})
			$('#dataMahasiswa').html(s);
		}

		function loadData() {
			$.ajax({
				type : 'get',
				url : '../mahasiswa-rest/',
				success : function(d) {
					tampilkanData(d);
				}
			});
		}

		function simpan() {
			var method = 'post';
			var data;

			if (modus == 'insert') {
				method = 'post';
				data = getFormData($('#form-mahasiswa'));
			} else {
				method = 'put';
				data = getFormData($('#form-mahasiswa'));
			}
			console.log(data);
			$
					.ajax({
						type : method,
						url : '../mahasiswa-rest/',
						data : JSON.stringify(data),
						dataType : 'json',
						contentType : 'application/json',
						success : function(d) {
							loadData();
							modus = 'insert';
							$(
									'#nim, #nama, #tglLahir, #fakultas, #prodi, #alamat, #email, #telp')
									.val('');
						},
						error : function(d) {

						}
					});
		}

		function clicked() {
			location = 'mahasiswa-reset.html';
		}

		function load(nim) {
			$.ajax({
				type : 'get',
				url : '../mahasiswa-rest/' + nim,
				success : function(d) {
					$('#nim').val(d.nim), $('#nama').val(d.nama),
							$('#tglLahir').val(d.tglLahir), $('#fakultas').val(
									d.fakultas), $('#prodi').val(d.prodi), $(
									'#alamat').val(d.alamat), $('#email').val(
									d.email), $('#telp').val(d.telp);
					modus = 'update';
				}
			});
		}

		function hapus(nim) {
			$.ajax({
				type : 'delete',
				url : '../mahasiswa-rest/' + nim,
				data : {
					nim : nim
				},
				success : function(d) {
					loadData();
				},
				error : function(d) {
				}
			});
		}

		$(document).ready(function() {
			loadData();
		})
	</script>
</body>
</html>