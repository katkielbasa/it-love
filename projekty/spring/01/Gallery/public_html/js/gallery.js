var files = [
    "images/Chrysanthemum.jpg",
    "images/Desert.jpg",
    "images/Hydrangeas.jpg",
    "images/Jellyfish.jpg",
    "images/Koala.jpg",
    "images/Lighthouse.jpg",
    "images/Penguins.jpg",
    "images/Tulips.jpg"
];

$.ready(function() {
    var container = $.get('container'),
        thumbnails = $.get('thumbnails'),
        preview = $.get('preview'),
        thumbnailsImages = thumbnails.getElementsByTagName('img'),
        fadeInTime = 200,
        sizeUnits = 'px';

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
        $.forEach(thumbnailsImages, function (thumbnail) {
            scaleThumbnail(thumbnail, height);
        });
    }
    
    function switchPreviewImage(event) {
        preview.src = event.target.src;
    }

    function scaleAndCenterPreview() {
         var height = ((container.clientHeight - thumbnails.clientHeight) * 0.9).toFixed(0),
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
            thumbnails.style.width = img.width + thumbnails.clientWidth + sizeUnits;
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
    
    load(0);
    $.on(preview, 'load', function () {
        scaleAndCenterPreview();
        preview.style.opacity = 1;
    });
    $.on(window, 'resize', function () {
        scaleAndCenterPreview();
        scaleThumbnails();
    });
  
    preview.src = files[0];
    
});
