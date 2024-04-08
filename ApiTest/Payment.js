paymentBaseUrl = "http://10.12.13.162:8080/api/payment/"

function getAllPayments() {
    return $.ajax({
        url: paymentBaseUrl + "all",
        type: "GET"
    });
}

function getPaymentById(id) {
    return $.ajax({
        url: paymentBaseUrl + `${id}`,
        type: "GET"
    });
}

function getPaymentByUserId(userId) {
    return $.ajax({
        url: paymentBaseUrl + `user/${userId}`,
        type: "GET"
    });
}

function addPayment(payment) {
    return $.ajax({
        url: paymentBaseUrl + "add",
        type: "POST",
        data: JSON.stringify(payment),
        contentType: "application/json"
    });
}

function updatePayment(payment) {
    return $.ajax({
        url: paymentBaseUrl + "update",
        type: "PUT",
        data: JSON.stringify(payment),
        contentType: "application/json"
    });
}

function deletePayment(id) {
    return $.ajax({
        url: paymentBaseUrl + `delete/${id}`,
        type: "DELETE"
    });
}

function getAllPaymentMethods() {
    return $.ajax({
        url: paymentBaseUrl + "paymentmethods",
        type: "GET"
    });
}