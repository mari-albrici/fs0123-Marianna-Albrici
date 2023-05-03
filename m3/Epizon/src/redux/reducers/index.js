//dove definiamo la funziona pura che sarà il reducer principale
//prende lo stato corrente dell'applicazione nel momento in cui viene "risvegliato" e prende anche l'action che gli arriva con un dispatch.
//A quel punto ne legge il 'type' e con queste informazioni genera il nuovo stato globale dell'applicazione

//uno stato iniziale
const initialState = {
	cart: {
		content: [],
	},
};
// lo stato iniziale è quello che viene generato automaticamente ad ogni refresh del browser
// è una funzione pura, quindi non modificherà mai i suoi parametri direttamente

const mainReducer = (state = initialState, action) => {
	//da questa funzione in ogni caso dovremo ritornare il nuovo stato globale dell'app
	switch (action.type) {
		//inserire i vari casi per i diversi type degli oggetti action
		case 'ADD_TO_CART':
			return {
				...state,
				cart: {
					...state.cart,
					content: [...state.cart.content, action.payload],
					// content: state.cart.content.concat(action.payload),
				},
			};
		case 'REMOVE_FROM_CART':
			return {
				...state,
				cart: {
					...state.cart,
					content: state.cart.content.filter((_, i) => i !== action.payload),
					// Underscore NECESSARIO come placeholder per poter specificare al metodo filter() di usare "i" come secondo parametro
				},
			};
		//da mettere SEMPRE - altrimenti si rompe redux:
		default:
			return state;
	}
};

export default mainReducer;
