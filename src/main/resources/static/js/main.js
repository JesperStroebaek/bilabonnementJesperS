// Page Transitioning
const contents = document.querySelectorAll('.content')
const navLinks = document.querySelectorAll('nav ul li a')

navLinks.forEach((navLink, index) =>
{
    navLink.addEventListener('click', () =>
    {
        hideAllContents()
        hideAllItems()

        navLink.classList.add('active')
        contents[index].classList.add('show')
    })
})


function hideAllContents()
{
    contents.forEach((content) => content.classList.remove('show'))
}

function hideAllItems()
{
    navLinks.forEach((navLink) => navLink.classList.remove('active'))
}

// Add rows to table //
// Getting the table element by its ID
const carStatusTable = document.getElementById('car-status-table')

// Getting the add row button by its ID
const addRowBtn = document.getElementById('add-row-btn')

// Setting the new row to be placed at the bottom of the table
let row = carStatusTable.insertRow(-1)

// Getting the <td></td> with and ID of car by its ID
let car = document.getElementById('car')

// Getting the <td></td> with and ID of rent-status by its ID
let rentStatus = document.getElementById('rent-status')

// Getting the <td></td> with and ID of price by its ID
let price = document.getElementById('price')

// Adding a click event to the add row button
addRowBtn.addEventListener('click', addRowToTable)

// Creaing the function for adding a row to the bottom of the table
function addRowToTable()
{
    // Just adding some placeholder values to the input fields (ultimately, this data should come from the database)



    // Creating a template for the rows (this is called template literals or object literals, if you want to look more at it. They are used for generating HTML through JavaScript).

    // Where it says `<td>${car}</td>`, I'm inserting whatever I've assigned the car variable to be (in this case 'Ferrari'). The same goes for rentStatus and price.
    let tableRowTemplate = `
        <tr>
            <td>
               ${brand}
            </td>
            <td>
               ${model}  
            </td>
            <td>
               ${price} 
            </td>
        </tr>
    `

    /*
       Here, I'm grabbing the table and setting the inner HTML, which basically is what the HTML elements' text value is (what it says inside the element),
       and saying that it should be equal to whatever it says in the template by simply appending the tableRowTemplate to it.

       In this case, the result will be:

           Car         Rent Status      Price
         Ferrari        Not Rented       7000
    */

    carStatusTable.innerHTML += tableRowTemplate

}



