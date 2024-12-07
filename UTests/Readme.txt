Bartosz Kozłowski 155869
3.1
Tak, testy przestałyby działać. Zmiana adnotacji z @BeforeEach na @BeforeAll spowodowałaby, że metoda setUp zostałaby wykonana tylko raz, przed wszystkimi testami, a nie przed każdym z osobna. W kontekście naszych testów oznaczałoby to, że pole calculator byłoby inicjalizowane tylko raz, a nie przed każdym testem.
4.1
Metoda test1 zostanie oznaczona jako failure, metoda test2 jako error.
4.2
JUnit oczekuje na klasę AssertionFailedError rzucanego obiektu.
5.1
Jest to test typu whitebox.
5.2
W metodzie calculate znajduje się 4 możliwych ścieżek działania.