import React from "react";

const Cards = ({ item, handleClick }) => {
  const { name, count, price, img } = item;
  return (
    <div className="cards">
      <div className="image_box">
        <img src={img} alt="" />
      </div>
      <div className="details">
        <p>{name}</p>
        <p>NO. OF ITEMS {count}</p>
        <p>PRICE - {price}Rs</p>
        <button onClick={() => handleClick(item)}>ADD TO CART</button>
      </div>
    </div>
  );
};

export default Cards;


