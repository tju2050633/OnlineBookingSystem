membershipBaseUrl = "http://34.92.41.227:8080/api/membership/"

function getAllMembershipSales() {
    return $.ajax({
        url: membershipBaseUrl + "sale/all",
        type: "GET"
    });
}

function getMembershipSaleById(id) {
    return $.ajax({
        url: membershipBaseUrl + `sale/${id}`,
        type: "GET"
    });
}

function getMembershipSaleByMembershipId(id) {
    return $.ajax({
        url: membershipBaseUrl + `sale/membership/${id}`,
        type: "GET"
    });
}

function getMembershipSaleByUserId(id) {
    return $.ajax({
        url: membershipBaseUrl + `sale/user/${id}`,
        type: "GET"
    });
}

function addMembershipSale(membershipSale) {
    return $.ajax({
        url: membershipBaseUrl + "sale/add",
        type: "POST",
        data: JSON.stringify(membershipSale),
        contentType: "application/json"
    });
}

function updateMembershipSale(membershipSale) {
    return $.ajax({
        url: membershipBaseUrl + "sale/update",
        type: "PUT",
        data: JSON.stringify(membershipSale),
        contentType: "application/json"
    });
}

function deleteMembershipSale(id) {
    return $.ajax({
        url: membershipBaseUrl + `sale/delete/${id}`,
        type: "DELETE"
    });
}

function getAllMemberships() {
    return $.ajax({
        url: membershipBaseUrl + "types",
        type: "GET"
    });
}