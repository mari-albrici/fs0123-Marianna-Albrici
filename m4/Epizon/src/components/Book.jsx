import { Badge, Card } from "react-bootstrap";

const Book = ({ book, changeBook, bookSelected }) => (
  <Card
    className={`border border-2 ${bookSelected?.id === book.id ? "border-primary mt-3" : "mt-3"}`}
    onClick={() => changeBook(book)}
    style={{ cursor: "pointer" }}
  >
    <Card.Body className="d-flex">
      <img className="book-image" src={book.imageUrl} alt="book cover" />
      <div>
        <Card.Text className="font-weight-bold">{book.title}</Card.Text>
        <Badge bg="primary">{book.price}€</Badge>
      </div>
    </Card.Body>
  </Card>
);

export default Book;
