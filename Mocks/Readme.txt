Bartosz Kozłowski 155869
2.1
Aby zweryfikować, czy interakcja metody loadExpenses z obiektem zastępczym bazy danych była poprawna, możemy użyć biblioteki Mockito. Należy stworzyć obiekt zastępczy dla bazy danych i skonfigurować go, wskazując, jakie wywołania metod mogą zostać wykonane oraz jakie wartości będą zwracane. Po wywołaniu metody loadExpenses, możemy użyć InOrder z Mockito, aby sprawdzić, czy metody connect, queryAll i close zostały wywołane w odpowiedniej kolejności.

5.1
Tak, kolejność oczekiwań dla tej samej metody z różnymi argumentami ma znaczenie. Mockito sprawdza wywołania metod w dokładnej kolejności, w jakiej zostały zadeklarowane oczekiwania, dlatego ważne jest, aby były one zapisane w odpowiedniej kolejności. Zamiana kolejności oczekiwań może wpłynąć na wyniki testu, dlatego warto zachować właściwą kolejność, aby uniknąć błędów i zapewnić oczekiwane rezultaty.