/*
 * Demo1:选取一张图片，并预览
 */
$("#img_input").on("change", function(e) {
  var file = e.target.files[0]; //获取图片资源
  // 只选择图片文件
  if (!file.type.match('image.*')) {
    return false;
  }

  var reader = new FileReader();

  reader.readAsDataURL(file); // 读取文件

  // 渲染文件
  reader.onload = function(arg) {

    var img = '<img class="preview" style="width: 100%;height: 80px;" src="' + arg.target.result + '" alt="preview"/>';
    $(".preview_box").empty().append(img);
  }
    
  //filebayftpto();
   
});

/**
 * ajax提交图片到ftp服务上
 */
function filebayftpto(){
	 var form_data = new FormData();
	//获取文件
	  var file_data = $("#img_input").prop("files")[0];
	//把所以表单信息
	  form_data.append("id", "001");
	  form_data.append("name", "test");
	  form_data.append("img", file_data);
	  
	  $.ajax({
		    type: "POST",
		    url: "http://127.0.0.1:8080/campusbus/Article/file",
		    dataType : "json",
		    processData: false,  // 注意：让jQuery不要处理数据
		    contentType: false,  // 注意：让jQuery不要设置contentType
		    data: form_data
		}).success(function(msg) {
		    console.log(msg);
		}).fail(function(msg) {
		    console.log(msg);
		});
}

/*
 * Demo2:拖拽上传
 */
// 必须阻止dragenter和dragover事件的默认行为，这样才能触发 drop 事件
function handleFileSelect(evt) {
  evt.stopPropagation();
  evt.preventDefault();

  var files = evt.dataTransfer.files; // 文件对象

  // 处理多文件
  var output = [];
  for (var i = 0, f; f = files[i]; i++) {
    output.push('<li><strong>', escape(f.name), '</strong> (', f.type || 'n/a', ') - ',
      f.size, ' bytes, last modified: ',
      f.lastModifiedDate.toLocaleDateString(), '</li>');
  }
  // 显示文件信息
  document.getElementById('list').innerHTML = output.join('');
}

function handleDragOver(evt) {
  evt.stopPropagation();
  evt.preventDefault();
  evt.dataTransfer.dropEffect = 'copy';
}

// Setup the dnd listeners.
var dropZone = document.getElementById('drop_zone');
//dropZone.addEventListener('dragover', handleDragOver, false);
//dropZone.addEventListener('drop', handleFileSelect, false);

/*
 * Demo3:label样式
 */
$("#img_input2").on("change", function(e) {

  var file = e.target.files[0]; //获取图片资源

  // 只选择图片文件
  if (!file.type.match('image.*')) {
    return false;
  }

  var reader = new FileReader();

  reader.readAsDataURL(file); // 读取文件

  // 渲染文件
  reader.onload = function(arg) {

    var img = '<img class="preview"  src="' + arg.target.result + '" alt="preview"/>';
    $("#preview_box2").empty().append(img);
  }
});


/**
 * 处理插入图片
 */
$("#img_input3").on("change", function(e) {
	  var file = e.target.files[0]; //获取图片资源
	  // 只选择图片文件
	  if (!file.type.match('image.*')) {
	    return false;
	  }

	  var reader = new FileReader();

	  reader.readAsDataURL(file); // 读取文件

	  // 渲染文件
	  reader.onload = function(arg) {
       
	    $('.textarea_list').append('<div class="item"><a class="close"></a><img class="preview" style="width: 100%;height: 60px;" src="' + arg.target.result + '" alt="preview"/></div>')
	  }
	    
	  //filebayftpto();
	   
	});