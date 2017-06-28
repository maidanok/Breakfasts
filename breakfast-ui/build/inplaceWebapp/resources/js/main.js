function submitForm(id) {
    $.ajax({
        url:$(id).attr('action'),
        type:$(id).attr('method'),
        data: $(id).serialize();
    });
    return false;
}

