// Wait for the DOM to fully load
document.addEventListener('DOMContentLoaded', function() {
    const convertForm = document.getElementById('convertForm');
    const convertBtn = document.getElementById('convertBtn');

    // Prevent multiple submissions by disabling the button after click
    convertForm.addEventListener('submit', function(event) {
        const celsiusInput = document.getElementById('celsius').value;

        // Validate if the input is a valid number
        if (isNaN(celsiusInput) || celsiusInput === '') {
            alert('Please enter a valid Celsius temperature.');
            event.preventDefault(); // Stop the form from submitting
            return;
        }

        // Disable button to prevent multiple submissions
        convertBtn.textContent = 'Converting...';
        convertBtn.disabled = true;
    });
});
