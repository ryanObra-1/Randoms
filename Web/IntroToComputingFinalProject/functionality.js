const toggle = document.getElementById('dark-mode-toggle');

toggle.addEventListener('click', () => {
    document.body.classList.toggle('dark');
    toggle.textContent = document.body.classList.contains('dark') ? '☀️ Light Mode' : '🌙 Dark Mode';
});

// Persist preference
if (localStorage.getItem('darkMode') === 'enabled') {
    document.body.classList.add('dark');
    toggle.textContent = '☀️ Light Mode';
}

toggle.addEventListener('click', () => {
    if (document.body.classList.contains('dark')) {
        localStorage.setItem('darkMode', 'enabled');
    } else {
        localStorage.setItem('darkMode', 'disabled');
    }
});