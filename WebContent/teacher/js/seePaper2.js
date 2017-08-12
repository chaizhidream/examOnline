function doDrop(obj, big) {
				var nowHeight = obj.offsetHeight;
				if(nowHeight < big) {
					var need = Math.ceil((big - nowHeight) / 10);
					obj.style.height = nowHeight + need + 'px';
				} else {
					obj.style.opacity = 1;
					clearInterval(obj.time);
				}
			}

			function doUnDrop(obj) {
				var nowHeight = obj.offsetHeight;
				if(nowHeight > 10) {
					var need = Math.ceil(nowHeight / 15);
					obj.style.height = nowHeight - need + 'px';
				} else {
					obj.style.display = 'none';
					clearInterval(obj.time);
				}
			}

			function $(sId) {
				return document.getElementById(sId);
			}

			function drop(obj) {
				clearInterval(obj.time);
				obj.style.display = 'block';
				obj.style.height = 'auto';
				obj.big = obj.offsetHeight;
				obj.style.height = '0px';
				obj.style.opacity = 0.5;
				obj.time = setInterval(function() {
					doDrop(obj, obj.big)
				}, 10);
			}

			function cancelHide(obj) {
				clearInterval(obj.time);
				if(obj.offsetHeight < obj.big) {
					obj.time = setInterval(function() {
						doDrop(obj, obj.big)
					}, 10);
				}
				obj.style.opacity = 1;
				obj.style.display = 'block';
			}

			function unDrop(obj) {
				obj.style.opacity = 0.5;
				clearInterval(obj.time);
				obj.time = setInterval(function() {
					doUnDrop(obj)
				}, 10);
			}