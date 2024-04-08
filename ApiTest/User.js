userBaseUrl = "http://10.12.13.162:8080/api/user/"

function getAllUsers() {
    console.log(userBaseUrl);
    return $.ajax({
        url: userBaseUrl + "all",
        type: "GET"
    });
}

function getUserById(id) {
    return $.ajax({
        url: userBaseUrl + `${id}`,
        type: "GET"
    });
}

function addUser(user) {
    return $.ajax({
        url: userBaseUrl + "add",
        type: "POST",
        data: JSON.stringify(user),
        contentType: "application/json"
    });
}

function updateUser(user) {
    return $.ajax({
        url: userBaseUrl + "update",
        type: "PUT",
        data: JSON.stringify(user),
        contentType: "application/json"
    });
}

function deleteUser(id) {
    return $.ajax({
        url: userBaseUrl + `delete/${id}`,
        type: "DELETE"
    });
}

function getAllBannedUsers() {
    return $.ajax({
        url: userBaseUrl + "blacklist/all",
        type: "GET"
    });
}

function getBannedUserById(id) {
    return $.ajax({
        url: userBaseUrl + `blacklist/${id}`,
        type: "GET"
    });
}

function addBannedUser(blacklist) {
    return $.ajax({
        url: userBaseUrl + "blacklist/add",
        type: "POST",
        data: JSON.stringify(blacklist),
        contentType: "application/json"
    });
}

function updateBannedUser(blacklist) {
    return $.ajax({
        url: userBaseUrl + "blacklist/update",
        type: "PUT",
        data: JSON.stringify(blacklist),
        contentType: "application/json"
    });
}

function deleteBannedUser(id) {
    return $.ajax({
        url: userBaseUrl + `blacklist/delete/${id}`,
        type: "DELETE"
    });
}