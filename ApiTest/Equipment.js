equipmentBaseUrl = "http://34.92.41.227:8080/api/equipment/"

function getAllEquipmentRentals() {
    return $.ajax({
        url: equipmentBaseUrl + "rental",
        type: "GET"
    });
}

function getAllEquipmentPurchases() {
    return $.ajax({
        url: equipmentBaseUrl + "purchase",
        type: "GET"
    });
}

function getAllEquipmentRentalRecords() {
    return $.ajax({
        url: equipmentBaseUrl + "rental/record",
        type: "GET"
    });
}

function getEquipmentRentalRecordsByUserId(userId) {
    return $.ajax({
        url: equipmentBaseUrl + `rental/record/user/${userId}`,
        type: "GET"
    });
}

function getEquipmentRentalRecordsByEquipmentId(equipmentId) {
    return $.ajax({
        url: equipmentBaseUrl + `rental/record/equipment/${equipmentId}`,
        type: "GET"
    });
}

function addEquipmentRentalRecord(equipmentRentalRecord) {
    return $.ajax({
        url: equipmentBaseUrl + "rental/record/add",
        type: "POST",
        data: JSON.stringify(equipmentRentalRecord),
        contentType: "application/json"
    });
}

function updateEquipmentRentalRecord(equipmentRentalRecord) {
    return $.ajax({
        url: equipmentBaseUrl + "rental/record/update",
        type: "PUT",
        data: JSON.stringify(equipmentRentalRecord),
        contentType: "application/json"
    });
}

function deleteEquipmentRentalRecord(id) {
    return $.ajax({
        url: equipmentBaseUrl + `rental/record/delete/${id}`,
        type: "DELETE"
    });
}

function getAllEquipmentPurchaseRecords() {
    return $.ajax({
        url: equipmentBaseUrl + "purchase/record",
        type: "GET"
    });
}

function getEquipmentPurchaseRecordsByUserId(userId) {
    return $.ajax({
        url: equipmentBaseUrl + `purchase/record/user/${userId}`,
        type: "GET"
    });
}

function getEquipmentPurchaseRecordsByEquipmentId(equipmentId) {
    return $.ajax({
        url: equipmentBaseUrl + `purchase/record/equipment/${equipmentId}`,
        type: "GET"
    });
}

function addEquipmentPurchaseRecord(equipmentPurchaseRecord) {
    return $.ajax({
        url: equipmentBaseUrl + "purchase/record/add",
        type: "POST",
        data: JSON.stringify(equipmentPurchaseRecord),
        contentType: "application/json"
    });
}

function updateEquipmentPurchaseRecord(equipmentPurchaseRecord) {
    return $.ajax({
        url: equipmentBaseUrl + "purchase/record/update",
        type: "PUT",
        data: JSON.stringify(equipmentPurchaseRecord),
        contentType: "application/json"
    });
}

function deleteEquipmentPurchaseRecord(id) {
    return $.ajax({
        url: equipmentBaseUrl + `purchase/record/delete/${id}`,
        type: "DELETE"
    });
}