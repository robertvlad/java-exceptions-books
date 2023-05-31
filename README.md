# java-exceptions-books

## Todo
Vogliamo gestire il *catalogo di libri* di una *biblioteca*.

Un `Libro` è composto da :
- titolo
- numero pagine
- autore
- editore

Richiedere all'utente quanti libri vuole inserire. Generare poi un array della dimensione fornita dall'utente e procedere nel richiedere i dati necessari per creare quei libri, salvandoli all'interno dell'array.

All'interno della classe `Libro` (`setter`) verranno validati i seguenti vincoli di integrita':
- titolo e/o autore vuoti
- numero pagine <= 0

Il lancio delle eccezioni all'interno della classe `Libro` deve essere gestito nel `main` e non dove bloccare l'esecuzione di tutto il codice, ma fornire all'utente informazioni riguardanti l'errore che si e' verificato.

---

Al termine dell'inserimento dei libri nell'array salvare tutti gli elementi dell'array (attraverso il `toString` della classe `Libro`) all'interno di un **file**.

---

Al termine del salvataggio dei dati nel file, rileggere tutto il file stampando in `console` tutti i libri uno per riga.
