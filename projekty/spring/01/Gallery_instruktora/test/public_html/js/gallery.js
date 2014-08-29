$.ready(function() {
    var container = $.get('container'),
            thumbnails = $.get('thumbnails'),
            preview = $.get('preview'),
            thumbnailsImages = thumbnails.getElementsByTagName('img'),
            thumbnailsSpace = 6,
            fadeInTime = 200,
            sizeUnits = 'px',
            files = [];

    function getAspectRatio(img) {
        return img.width / img.height;
    }

    function scaleThumbnail(img, height) {
        var aspectRatio = getAspectRatio(img);
        img.height = height;
        img.width = (height * aspectRatio).toFixed(0);
    }

    function scaleThumbnails() {
        var height = thumbnails.clientHeight;
        $.forEach(thumbnailsImages, function(thumbnail) {
            thumbnails.style.width = thumbnail.width + thumbnails.clientWidth + thumbnailsSpace + sizeUnits;
            scaleThumbnail(thumbnail, height);
        });
    }

    function switchPreviewImage(event) {
        preview.src = event.target.src;
    }

    function scaleAndCenterPreview() {
        var height = ((container.clientHeight - thumbnails.clientHeight) * 0.8).toFixed(0),
                width = (height * getAspectRatio(preview)).toFixed(0);
        preview.style.height = height + sizeUnits;
        preview.style.width = width + sizeUnits;
        preview.style.left = ((container.clientWidth - width) / 2).toFixed(0) + sizeUnits;
        preview.style.top = ((container.clientHeight - height
                + thumbnails.clientHeight) / 2).toFixed(0)
                + sizeUnits;
    }

    function addThumbnail(path) {
        var img = document.createElement('img');
        img.src = path;
        $.on(img, 'load', function() {
            $.on(img, 'click', switchPreviewImage);
            scaleThumbnail(img, thumbnails.clientHeight);
            thumbnails.style.width = img.width + thumbnails.clientWidth + thumbnailsSpace + sizeUnits;
            $.fadeIn(img, fadeInTime);
            thumbnails.appendChild(img);
        });
        return img;
    }

    function load(idx) {
        $.on(addThumbnail(files[idx]), 'load', function() {
            if (idx < files.length - 1) {
                load(++idx);
            }
        });
    }

    $.ajax({
        url: 'data/files.json',
        success: function(data) {
            var startX = 0,
                currentX = 0,
                shift = 0;
            
            function mouseMoveHandler (event) {
                var val = shift + currentX - startX;
                currentX = event.clientX;
                if (val < thumbnails.clientWidth) {
                    thumbnails.style.left = val + sizeUnits;
                }
            }

            files = eval(data);
            $.on(window, 'resize', function() {
                scaleAndCenterPreview();
                scaleThumbnails();
            });
            $.on(preview, 'load', function() {
                scaleAndCenterPreview();
                preview.style.opacity = 1;
            });            
            preview.src = files[0];
            load(0);
                       
            $.on(window, 'mousedown', function (event) {
                startX = event.clientX;
                $.on(window, 'mousemove', mouseMoveHandler);
            });
            $.on(window, 'mouseup', function() {
                shift = currentX - startX;
                $.off(window, 'mousemove', mouseMoveHandler);
            });
        }
    });

});
