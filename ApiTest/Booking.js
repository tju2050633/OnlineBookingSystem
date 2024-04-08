bookingBaseUrl = "http://10.12.13.162:8080/api/booking/"

function getAllVenues() {
    return $.ajax({
        url: bookingBaseUrl + "venues",
        type: "GET"
    });
}

function getAllCourtCategories() {
    return $.ajax({
        url: bookingBaseUrl + "court-categories",
        type: "GET"
    });
}

function getAllVenueCourts() {
    return $.ajax({
        url: bookingBaseUrl + "venue-courts",
        type: "GET"
    });
}

function getVenueCourtById(id) {
    return $.ajax({
        url: bookingBaseUrl + `venue-courts/${id}`,
        type: "GET"
    });
}

function getVenueCourtsByVenueId(venueId) {
    return $.ajax({
        url: bookingBaseUrl + `venue-courts/venue/${venueId}`,
        type: "GET"
    });
}

function getVenueCourtsByCourtCategoryId(courtCategoryId) {
    return $.ajax({
        url: bookingBaseUrl + `venue-courts/court-category/${courtCategoryId}`,
        type: "GET"
    });
}

function addVenueCourt(venueCourt) {
    return $.ajax({
        url: bookingBaseUrl + "venue-courts/add",
        type: "POST",
        data: JSON.stringify(venueCourt),
        contentType: "application/json"
    });
}

function updateVenueCourt(venueCourt) {
    return $.ajax({
        url: bookingBaseUrl + "venue-courts/update",
        type: "PUT",
        data: JSON.stringify(venueCourt),
        contentType: "application/json"
    });
}

function deleteVenueCourt(id) {
    return $.ajax({
        url: bookingBaseUrl + `venue-courts/delete/${id}`,
        type: "DELETE"
    });
}

function getAllBookings() {
    return $.ajax({
        url: bookingBaseUrl + "bookings",
        type: "GET"
    });
}

function getBookingById(id) {
    return $.ajax({
        url: bookingBaseUrl + `bookings/${id}`,
        type: "GET"
    });
}

function getBookingsByUserId(userId) {
    return $.ajax({
        url: bookingBaseUrl + `bookings/user/${userId}`,
        type: "GET"
    });
}

function getBookingsByVenueId(venueId) {
    return $.ajax({
        url: bookingBaseUrl + `bookings/venue/${venueId}`,
        type: "GET"
    });
}

function getBookingsByVenueCourtId(venueCourtId) {
    return $.ajax({
        url: bookingBaseUrl + `bookings/venue-court/${venueCourtId}`,
        type: "GET"
    });
}

function addBooking(booking) {
    return $.ajax({
        url: bookingBaseUrl + "bookings/add",
        type: "POST",
        data: JSON.stringify(booking),
        contentType: "application/json"
    });
}

function updateBooking(booking) {
    return $.ajax({
        url: bookingBaseUrl + "bookings/update",
        type: "PUT",
        data: JSON.stringify(booking),
        contentType: "application/json"
    });
}

function deleteBooking(id) {
    return $.ajax({
        url: bookingBaseUrl + `bookings/delete/${id}`,
        type: "DELETE"
    });
}