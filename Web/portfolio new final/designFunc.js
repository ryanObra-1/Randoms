const home = document.getElementsByClassName('home')[0];
const verticalLine = document.getElementsByClassName('verticalLine')[0];
const leftVerticalLine = document.getElementsByClassName('leftVertLine')[0];
const icons = [ document.querySelector('.discordLogo'), document.querySelector('.linkedinLogo'), document.querySelector('.facebookLogo')];
const rows = document.getElementsByClassName('rows');

const themeTogglerBtn = document.querySelector('.themeInput');
// toggler func
/*
themeTogglerBtn.addEventListener('click', function () {
    //dark theme
    if (themeTogglerBtn.checked) {
        home.style.backgroundColor = '#131516';
        home.style.color = 'white';
        verticalLine.style.borderColor = 'white';
        icons.style.filter = 'invert(100%)';
        leftVerticalLine.style.borderColor = 'white';
        explore.style.backgroundColor = '#0f0f0f';
        explore.style.boxShadow = 'none';
        explore.style.color = 'white';
    }
    // light theme 
    else {
        home.style.backgroundColor = '#faebd7';
        home.style.color = 'black';
        verticalLine.style.borderColor = 'black';
    }
});
*/


const explore = document.getElementsByClassName('exploreBtn')[0];
const sections = document.getElementsByClassName('sectionsContainer')[0];
const container = document.getElementsByClassName('container')[0];
// removes the wrapper
function displayMainPage() {
    container.style.overflow = 'visible';
    home.style.display = 'none';
    sections.style.opacity = '1';
};

// portfolio pop up
const popupPortCon = document.getElementsByClassName('portfolioCon')[0];
function litawPortfolioContainer() {
    popupPortCon.style.visibility = 'visible';
}

const returnBtnP = document.getElementsByClassName('return')[0];
returnBtnP.addEventListener('click', ()=> {
    popupPortCon.style.visibility = 'hidden';
});

// blog popup
const popupBlogCon = document.getElementsByClassName('fbCon')[0];
function litawlogContainer() {
    popupBlogCon.style.visibility = 'visible';
}

const returnBtnB = document.getElementsByClassName('return')[1];
returnBtnB.addEventListener('click', ()=> {
    popupBlogCon.style.visibility = 'hidden';
});