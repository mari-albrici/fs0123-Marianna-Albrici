//API key: GmC620yGq1fyBHI1cGxrxf4k9DVvUkq8p5LjmwSdsTVJwRA2HUNsXlLI

// Fetch primary images: https://api.pexels.com/v1/search?query=[your-query]

//Fetch secondary images: https://api.pexels.com/v1/search?query=[your-secondary-query]

let primaryBtn = document.getElementById('primaryLoad');
let secondaryBtn = document.getElementById('secondaryLoad');

let searchInput = document.getElementById('searchBar');
let searchBtn = document.getElementById('searchButton');

let primaryImgs = async () => {
	try {
		let loadedImg = await fetch('https://api.pexels.com/v1/search?query=sky', {
			headers: new Headers({
				Authorization: 'gPDGxuK3N0faAq0l1IS4BFo1aOBkRp6MbfCWNDFi5bQT6OqORIZu7GII',
			}),
		});
		let elements = await loadedImg.json();
		let photos = elements.photos;

		primaryBtn.addEventListener('click', () => {
			let cards = document.querySelectorAll('.card');
			cards.forEach((card, index) => {
				let photo = photos[index];
				card.innerHTML = `<img src="${photo.src.landscape}" alt="${photo.alt}">
									<div class="card-body">
										<h5 class="card-title">${photo.alt}</h5>
										<p class="card-text"> This photo was taken by ${photo.photographer}</p>
										<div class="d-flex justify-content-between align-items-center">
											<div class="btn-group">
												<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal-${index}"> View </button>
												<div class="modal fade" id="exampleModal-${index}" tabindex="-1" aria-labelledby="exampleModalLabel"
													aria-hidden="true">
													<div class="modal-dialog">
													<div class="modal-content text-light text-center" style="background-color: ${photo.avg_color}">
														<div class="modal-header">
														<h5 class="modal-title" id="exampleModalLabel">${photo.alt}</h5>
														<button type="button" class="close" data-dismiss="modal" aria-label="Close">
															<span aria-hidden="true">&times;</span>
														</button>
														</div>
														<div class="modal-body text-center" >
														<img src="${photo.src.small}" alt="${photo.alt}" class>
														<p class="card-text py-3 fs-3 text-light"> This photo was taken by ${photo.photographer} | <span><a
																href="${photo.photographer_url}"> Discover more</a></span></p>
														</div>
														<div class="modal-footer">
														<p class="text-center py-3 fs-5 text-light"> Photo ID: ${photo.id} </p>
														</div>
													</div>
													</div>
												</div>
											<button type="button" class="btn btn-sm btn-outline-secondary">
											Hide
											</button>
										</div>
										<small class="text-muted">${photo.id}</small>
										</div>`;
			});
		});
	} catch (error) {
		console.log(error);
	}
};
primaryImgs();

let secondaryImgs = async () => {
	try {
		let loadedImg = await fetch('https://api.pexels.com/v1/search?query=food', {
			headers: new Headers({
				Authorization: 'gPDGxuK3N0faAq0l1IS4BFo1aOBkRp6MbfCWNDFi5bQT6OqORIZu7GII',
			}),
		});
		let elements = await loadedImg.json();
		let photos = elements.photos;
		function changePhotos() {
			let cards = document.querySelectorAll('.card');
			cards.forEach((card, index) => {
				let photo = photos[index];
				card.innerHTML = `<img src="${photo.src.landscape}" alt="${photo.alt}">
				<div class="card-body">
					<h5 class="card-title">${photo.alt}</h5>
					<p class="card-text"> This photo was taken by ${photo.photographer}</p>
					<div class="d-flex justify-content-between align-items-center">
						<div class="btn-group">
							<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal-${index}"> View </button>
							<div class="modal fade" id="exampleModal-${index}" tabindex="-1" aria-labelledby="exampleModalLabel"
								aria-hidden="true">
								<div class="modal-dialog">
								<div class="modal-content text-light text-center" style="background-color: ${photo.avg_color}">
									<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">${photo.alt}</h5>
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									</div>
									<div class="modal-body text-center" >
									<img src="${photo.src.small}" alt="${photo.alt}" class>
									<p class="card-text py-3 fs-3 text-light"> This photo was taken by ${photo.photographer} | <span><a
											href="${photo.photographer_url}"> Discover more</a></span></p>
									</div>
									<div class="modal-footer">
									<p class="text-center py-3 fs-5 text-light"> Photo ID: ${photo.id} </p>
									</div>
								</div>
								</div>
							</div>
						<button type="button" class="btn btn-sm btn-outline-secondary">
						Hide
						</button>
					</div>
					<small class="text-muted">${photo.id}</small>
					</div>`;
			});
		}
		changePhotos();
	} catch (error) {
		console.log(error);
	}
};

secondaryBtn.addEventListener('click', secondaryImgs);

let searchedImgs = async () => {
	try {
		let loadedImg = await fetch('https://api.pexels.com/v1/search?query=' + searchInput.value, {
			headers: new Headers({
				Authorization: 'gPDGxuK3N0faAq0l1IS4BFo1aOBkRp6MbfCWNDFi5bQT6OqORIZu7GII',
			}),
		});
		let elements = await loadedImg.json();
		let photos = elements.photos;
		function changePhotos() {
			let cards = document.querySelectorAll('.card');
			cards.forEach((card, index) => {
				let photo = photos[index];
				card.innerHTML = `<img src="${photo.src.landscape}" alt="${photo.alt}">
				<div class="card-body">
					<h5 class="card-title">${photo.alt}</h5>
					<p class="card-text"> This photo was taken by ${photo.photographer}</p>
					<div class="d-flex justify-content-between align-items-center">
						<div class="btn-group">
							<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal-${index}"> View </button>
							<div class="modal fade" id="exampleModal-${index}" tabindex="-1" aria-labelledby="exampleModalLabel"
								aria-hidden="true">
								<div class="modal-dialog">
								<div class="modal-content text-light text-center" style="background-color: ${photo.avg_color}">
									<div class="modal-header">
									<h5 class="modal-title" id="exampleModalLabel">${photo.alt}</h5>
									<button type="button" class="close" data-dismiss="modal" aria-label="Close">
										<span aria-hidden="true">&times;</span>
									</button>
									</div>
									<div class="modal-body text-center" >
									<img src="${photo.src.small}" alt="${photo.alt}" class>
									<p class="card-text py-3 fs-3 text-light"> This photo was taken by ${photo.photographer} | <span><a
											href="${photo.photographer_url}"> Discover more</a></span></p>
									</div>
									<div class="modal-footer">
									<p class="text-center py-3 fs-5 text-light"> Photo ID: ${photo.id} </p>
									</div>
								</div>
								</div>
							</div>
						<button type="button" class="btn btn-sm btn-outline-secondary">
						Hide
						</button>
					</div>
					<small class="text-muted">${photo.id}</small>
					</div>`;
			});
		}
		changePhotos();
	} catch (error) {
		console.log(error);
	}
};

searchBtn.addEventListener('click', searchedImgs);
