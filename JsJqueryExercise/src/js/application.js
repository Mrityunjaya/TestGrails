function getDate() {
    return new Date();
}

function getDateInFormat(dateFormat) {
    var convertedDateString;
    var date = new Date();
    locale = "en-us";
    var shortMonth = date.toLocaleString(locale, {month: "short"});
    var longMonth = date.toLocaleString(locale, {month: "long"});
    var longYear = date.getFullYear();
    var shortYear = longYear.toString().substr(2, 2);
    var month = (Math.floor((date.getMonth() + 1) / 10) == 0) ? ("0".concat(date.getMonth() + 1)) : (date.getMonth() + 1);
    console.log("month = " + month);
    var day = (Math.floor((date.getDate()) / 10) == 0) ? ("0".concat(date.getDate())) : (date.getDate());
    switch (dateFormat) {
        case "dd-MM-YYYY":
            convertedDateString = day + "-" + month + "-" + longYear;
            break;
        case "MMM-dd-YYYY":
            convertedDateString = shortMonth + "-" + day + "-" + longYear;
            break;
        case "dd-MM-YY":
            convertedDateString = day + "-" + month + "-" + shortYear;
            console.log(shortYear)
            break;
        case "YYYY-MM-dd":
            convertedDateString = longYear + "-" + month + "-" + day;
            break;
    }
    return convertedDateString;
}

function updateElementById(elemId, updateString) {
    var element = document.getElementById(elemId);
    element.innerHTML = updateString;
}
function getDateObject() {
    var dateInstance = new Date()
    var dateObj = new Object();
    dateObj.date = dateInstance.getDate();
    dateObj.day = dateInstance.getDay();
    dateObj.year = dateInstance.getYear();
    dateObj.month = dateInstance.getMonth();
    dateObj.fullYear = dateInstance.getFullYear();
    return dateObj;
}

function getTime() {
    var date = new Date();
    var minutes = date.getMinutes()
    var seconds = date.getSeconds();
    var hours = date.getHours();
    var time = hours + ":" + minutes + ":" + seconds
    return time;
}
