
function redirectToProductDetail(element){
    window.location.href = "/vts/productDetail?index="+element;
}

/* Function: sortProducts
    * Description: Sorts the products based on the selected sort by option
    * Parameters: productsDetails - Array of product details
    * sortBy - Sort by option selected by the user
    * Returns: Sorted array of product details
    * Note: You can use any sorting algorithm you want
*/
function sortProducts(productsDetails, sortBy) {
    if (sortBy === "name-asc") {
        productsDetails.sort(function (a, b) {
            return a.name.localeCompare(b.name);
        });
    } else if (sortBy === "name-desc") {
        productsDetails.sort(function (a, b) {
            return b.name.localeCompare(a.name);
        });
    } else if (sortBy === "price-asc") {
        productsDetails.sort(function (a, b) {
            return a.price - b.price;
        });
    } else if (sortBy === "price-desc") {
        productsDetails.sort(function (a, b) {
            return b.price - a.price;
        });
    } else if (sortBy === "rating-desc") {
        productsDetails.sort(function (a, b) {
            return b.rating - a.rating;
        });
    }
    return productsDetails;
}



