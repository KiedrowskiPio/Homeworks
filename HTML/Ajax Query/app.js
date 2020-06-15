function jquery(){
    $("#testAnim").on('click', function(){
        $(this).animate({
            width: "500px",
            opacity: 0.4,
            fontSize: "3em",
            borderWidth: "10px"
        }, 1500);
    });
    
    $('#pierwszy').css({ background : 'blue' })
    .delay(2000)
    .slideUp()
    .delay(1000) 
    .fadeIn(1000); 

const apiUrl = "https://jsonplaceholder.typicode.com";
const $list = $('.user-list');

$('.test-ajax').on('click', function() {
    const $btn = $(this);

    $.ajax({
        url : apiUrl + '/users',
        dataType : 'json'
    })
    .done((res) => {
        $list.empty();

        res.forEach(el => {
            $list.append(`<li>${el.address.geo.lat} : ${el.address.geo.lng}</li>`);
        })
    })
    .always(() => {
        $btn.removeClass('loading');
        $btn.prop('disabled', false);
    });
});

}

window.onload = jquery;