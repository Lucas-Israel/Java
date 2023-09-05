package orm.hibernate;

@Entity
@Table(name = "T_LIVROS", schema = "PUBLICACAO")
public class Livro {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String titulo;

  @Column(name = "ISBN_NUMERO")
  private String isbn;
}
