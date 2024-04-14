let previousSelection = null;
function handleSelection(event) {
    const currentSelection = event.target;

    if (currentSelection === previousSelection) {
        currentSelection.checked = false;
        previousSelection = null;} 
    else {
        previousSelection = currentSelection;
    }
}

function goBack() {
    history.go(-1);
}