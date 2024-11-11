# System aukcyjny

## Wprowadzenie

Specyfikacja wymagań funkcjonalnych w ramach informatyzacji procesu sprzedaży produktów w oparciu o mechanizm aukcyjny. 

## Procesy biznesowe

---
<a id="bc1"></a>
### BC1: Sprzedaż aukcyjna 

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Opis:** Proces biznesowy opisujący sprzedaż za pomocą mechanizmu aukcyjnego. |

**Scenariusz główny:**
1. [Sprzedający](#ac1) wystawia produkt na aukcję. ([UC1](#uc1))
2. [Kupujący](#ac2) oferuje kwotę za produkt wyższą od aktualnie najwyższej oferty. ([UC2](#uc2)) ([BR1](#br1))
3. [Kupujący](#ac2) wygrywa aukcję ([UC3](#uc3)) ([BR2](#br2))
4. [Kupujący](#ac2) przekazuje należność Sprzedającemu. ([UC4](#uc4))
5. [Sprzedający](#ac1) przekazuje produkt Kupującemu. ([UC5](#uc5))

**Scenariusze alternatywne:** 

2.A. Oferta Kupującego została przebita, a [Kupujący](#ac2) pragnie przebić aktualnie najwyższą ofertę.
* 2.A.1. Przejdź do kroku 2.

3.A. Czas aukcji upłynął i [Kupujący](#ac2) przegrał aukcję. ([BR2](#br2))
* 3.A.1. Koniec przypadku użycia.

---

## Aktorzy

<a id="ac1"></a>
### AC1: Sprzedający

Osoba oferująca towar na aukcji.

<a id="ac2"></a>
### AC2: Kupujący

Osoba chcąca zakupić produkt na aukcji.


## Przypadki użycia poziomu użytkownika

### Aktorzy i ich cele

[Sprzedający](#ac1):
* [UC1](#uc1): Wystawienie produktu na aukcję
* [UC5](#uc5): Przekazanie produktu Kupującemu

[Kupujący](#ac2)
* [UC2](#uc2): Złożenie oferty wyższej ceny
* [UC3](#uc3): Wygranie aukcji
* [UC4](#uc4): Przekazanie należności Sprzedającemu

---
<a id="uc1"></a>
### UC1: Wystawienie produktu na aukcję

**Aktorzy:** [Sprzedający](#ac1)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć wystawienia produktu na aukcję.
2. System prosi o podanie danych produktu i ceny wywoławczej.
3. [Sprzedający](#ac1) podaje dane produktu oraz cenę wywoławczą.
4. System weryfikuje poprawność danych.
5. System informuje o pomyślnym wystawieniu produktu na aukcję.

**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu.
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc2"></a>
### UC2: Złożenie oferty wyższej ceny

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. [Kupujący](#ac2) zgłasza do systemu chęć podbicia ceny produktu.
2. System wyświetla obecną najwyższą ofertę za produkt
2. System prosi o podanie kwoty, którą [Kupujący](#ac2) chce zaoferować.
3. [Kupujący](#ac2) podaje kwotę, jaką chce zaoferować za produkt.
4. System weryfikuje poprawność kwoty, sprawdza, czy jest wyższa od obecnej.
5. System informuje o pomyślnym podbiciu ceny.

**Scenariusze alternatywne:** 

4.A. Podano cenę niższą od obecnie najwyższej.
* 4.A.1. System informuje, że wprowadzona kwota jest niższa niż obecnie najwyższa.
* 4.A.2. Przejdź do kroku 2.

---

<a id="uc3"></a>
### UC3: Wygranie aukcji

**Aktorzy:** [Kupujący](#ac2), [Sprzedający](#ac1)

**Scenariusz główny:**
1. System weryfikuje najwyższą ofertę złożoną na aukcji.
2. System informuje [Kupującego](#ac2), który złożył najwyższą ofertę, o tym, że wygrał aukcję.
3. System informuje [Sprzedającego](#ac1) o tym, który klient wygrał aukcję oraz zakończeniu aukcji.
#### Scenariusze alternatywne:
1.A. Brak propozycji w aukcji.
  * 1.A.1. System informuje o braku ofert i nie ma wygranej aukcji.
  * 1.A.2. Przejdź do kroku 1 (lub zakończ aukcję).

---

<a id="uc4"></a>
### UC4: Przekazanie należności Sprzedającemu

**Aktorzy:** [Kupujący](#ac2)

**Scenariusz główny:**
1. System prosi [Kupującego](#ac2) o opłacenie podanej kwoty za wygrany produkt.
2. System wyświetla dostępne metody płatności.
3. [Kupujący](#ac2) wybiera metodę płatności
4. System przekierowuje do wybranej usługi płatności.
5. [Kupujący](#ac2) dokonuje zapłaty.
6. System weryfikuje, czy płatność zakończyła się pomyślnie.
7. System informuje [Kupującego](#ac2) o pomyślnym zakończeniu transakcji zapłaty.

**Scenariusze alternatywne:** 

6.A. Podczas płatności wystąpił błąd.
* 6.A.1. System informuje, że płatność nie doszła do skutku.
* 6.A.2. System prosi o ponowną próbę płatności lub wybór innej metody.
* 6.A.3. Przejdź do kroku 2.

6.B. Podano nieprawidłową kwotę (np. przekracza dostępne środki lub niezgodność z systemem).
* 6.B.1. System informuje, że podana kwota jest nieprawidłowa.
* 6.B.2. System prosi o wprowadzenie poprawnej kwoty.
* 6.B.3. Przejdź do kroku 3.
---

<a id="uc5"></a>
### UC5: Przekazanie produktu Kupującemu

**Aktorzy:** [Sprzedający](#ac1), [Kupujący](#ac2)

**Scenariusz główny:**
1. [Sprzedający](#ac1) zgłasza do systemu chęć przekazania produktu [Kupującemu](#ac2).
2. System prosi o podanie danych produktu i danych [Kupującego](#ac2).
3. [Sprzedający](#ac1) wpisuje dane produktu oraz dane [Kupującego](#ac2).
4. System weryfikuje poprawność danych.
5. System weryfikuje czy [Kupujący](#ac2) opłacił produkt.
6. System generuje potwierdzenie oraz numer wysyłkowy.
7. System informuje [Kupującego](#ac2) oraz [Sprzedającego](#ac1) o szczegółach wysyłki, w tym numerze śledzenia przesyłki.
8. System usuwa aukcję oraz zmienia status produktu.


**Scenariusze alternatywne:** 

4.A. Podano niepoprawne lub niekompletne dane produktu lub [Kupującego](#ac2).
* 4.A.1. System informuje o błędnie podanych danych.
* 4.A.2. Przejdź do kroku 2.

4.B. Wprowadzone dane [Kupującego](#ac2) nie odpowiadają klientowi, który zaoferował najwyższą cenę.
* 4.B.1. System informuje o wprowadzeniu danych nieodpowiedniego klienta.
* 4.B.2. Przejdź do kroku 2.

5.A. [Kupujący](#ac2) nie opłacił jeszcze produktu.
* 5.A.1. System informuje, że [Kupujący](#ac2) nie dokonał jeszcze zapłaty i należy poczekać.
* 5.A.2. Przejdź do kroku 1.

---

## Obiekty biznesowe (inaczej obiekty dziedzinowe lub informatyczne)

### BO1: Aukcja

Aukcja jest formą zawierania transakcji kupna-sprzedaży, w której Sprzedający określa cenę wywoławczą produktu, natomiast Kupujący mogą oferować własną ofertę zakupu każdorazowo proponując kwotę wyższą od aktualnie oferowanej kwoty. Aukcja kończy się po upływie określonego czasu. Jeśli złożona została co najmniej jedna oferta zakupy produkt nabywa ten Kupujący, który zaproponował najwyższą kwotę. 

### BO2: Produkt

Fizyczny lub cyfrowy obiekt, który ma zostać sprzedany w ramach aukcji.

### BO3: Oferta
Oferta to propozycja zakupu produktu na aukcji, złożona przez Kupującego. Oferta jest wiążąca do momentu zakończenia aukcji i musi być wyższa od aktualnej najwyższej oferty.

### BO4: Płatność
Płatność to proces, w którym Kupujący dokonuje zapłaty za wygrany produkt po zakończeniu aukcji. Płatność jest weryfikowana przez system i stanowi warunek rozpoczęcia procesu wysyłki.

### BO5: Przesyłka
Przesyłka to proces wysyłki produktu do Kupującego po dokonaniu płatności. System monitoruje status przesyłki i umożliwia śledzenie.

## Reguły biznesowe

<a id="br1"></a>
### BR1: Złożenie oferty

Złożenie oferty wymaga zaproponowania kwoty wyższej niż aktualnie oferowana o minimum 1,00 PLN.


<a id="br2"></a>
### BR2: Rozstrzygnięcie aukcji

Aukcję wygrywa ten z [Kupujących](#ac2), który w momencie jej zakończenia (upłynięcia czasu) złożył najwyższą ofertę.

## Macierz CRUDL

| Przypadek użycia                                  | Aukcja | Produkt | Oferta | Płatność | Przesyłka |
| ------------------------------------------------- | ------ | ------- | ------ | -------- | --------- |
| UC1: Wystawienie produktu na aukcję               |    C   |    C    |        |          |           |
| UC2: Złożenie oferty wyższej ceny                 |    U, R|         |   C    |          |           |
| UC3: Wygranie aukcji                              |    U   |         |   R    |          |           |
| UC4: Przekazanie należności Sprzedającemu         |    U   |         |   R    |    C     |           |
| UC5: Przekazanie produktu Kupującemu              |    D   |    U    |   R    |    R     |     C     |

