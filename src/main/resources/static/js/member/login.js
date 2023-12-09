
function login() {
    $.ajax({
        url: '/login_check',  // 서버 측 처리 URL
        type: 'POST',
        data: $('#loginForm').serialize(),  // 폼 데이터 직렬화
        success: function(response) {
            alert(response);
        },
        error: function(error) {
            alert("아이디 혹은 비밀번호를 다시한번 확인해주세요");

        }
    });

    return false;  // 폼의 기본 제출 동작 방지
}