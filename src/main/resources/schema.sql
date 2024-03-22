create table if not exists product (
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName text,
    price DOUBLE
);

create table if not exists review (
    reviewId INT PRIMARY KEY AUTO_INCREMENT,
    reviewContent text,
    rating INT,
    productId INT,
    FOREIGN KEY (productId) REFERENCES product(productId)
);