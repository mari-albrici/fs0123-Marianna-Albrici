fetch('https://striveschool-api.herokuapp.com/books')
	.then((responseObj) => responseObj.json())
	.then((books) => {
		let container = document.querySelector('#container');
		let row = document.createElement('div');
		row.classList.add('row');
		row.classList.add('row-cols-4');
		row.classList.add('g-3');
		row.classList.add('mt-3');
		container.appendChild(row);

		books.forEach((book) => {
			let col = document.createElement('div');
			col.classList.add('col');
			col.className = 'col';
			col.innerHTML = `
			<div class="card shadow" id="${book.asin}" style="height: 650px;">
				<img src="${book.img}" class="card-img-top img-fluid" alt="book thumbnail" style="height: 400px">
				<div class="card-body">
					<h5 class="card-title fs-5">${book.title}</h5>
					<p class="card-text">${book.category}</p>
                    <p class="card-text fs-5">€ ${book.price}</p>
                    <div class="d-flex justify-content-around">
                        <button class="btn btn-success" id="buyButton"> Buy now </button>
                        <button class="btn btn-outline-danger" id="discardButton"> Discard </button>
                    </div>
				</div>
			</div>
		`;
			let discardBtn = col.querySelector('#discardButton');
			discardBtn.addEventListener('click', () => {
				col.remove();
			});

			let cartList = document.getElementById('cartList');
			if (cartList.innerHTML == '') {
				cartList.textContent = 'Non ci sono libri qui!';
			}

			let buyBtn = col.querySelector('#buyButton');
			buyBtn.addEventListener('click', () => {
				let volume = document.createElement('div');
				volume.classList.add('px-3');
				volume.classList.add('d-flex');
				volume.classList.add('justify-content-between');
				volume.classList.add('align-items-center');

				let cartElement = document.createElement('li');

				let bookCover = document.createElement('img');
				bookCover.src = `${book.img}`;
				bookCover.style.width = '35px';

				cartElement.innerHTML =
					`<img src="${book.img}" alt="book cover" style="width: 40px" class="pe-2 py-2">` + `${book.title}`;

				let remove = document.createElement('button');
				remove.classList.add('btn');
				remove.classList.add('btn-outline-secondary');
				remove.classList.add('fs-5');
				remove.textContent = '🗑️';

				volume.appendChild(cartElement);
				volume.appendChild(remove);
				cartList.appendChild(volume);

				let CART = 'Cart';
				let booksCart = [];
				if (localStorage.getItem(CART)) {
					booksCart = JSON.parse(localStorage.getItem(CART));
				}
				localStorage.setItem(CART, JSON.stringify(booksCart));
				booksCart.push(`${book.title}`);
				localStorage.setItem(CART, JSON.stringify(booksCart));

				remove.addEventListener('click', () => {
					volume.remove();
					// localStorage.removeItem(, JSON.stringify(booksCart)); rimuovere elemento ANCHE da localStorage ?!
				});
			});

			row.appendChild(col);
		});
	})

	.catch((error) => console.log('CATCH', error));
