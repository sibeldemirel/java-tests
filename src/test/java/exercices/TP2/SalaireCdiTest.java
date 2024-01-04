package exercices.TP2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SalaireCdiTest {
    private SalaireCdi salaireCdi;
    private SalaireCdi salaireCdiMock;
    private Identite identiteMock;
    private Salaire salaireMock;
    private Adresse adresseMock;

    @BeforeEach
    public void setUp(){
        identiteMock = mock(Identite.class);
        salaireMock = mock(Salaire.class);
        adresseMock = mock(Adresse.class);
        salaireCdiMock = mock(SalaireCdi.class);
        salaireCdi = new SalaireCdi(salaireMock, identiteMock);
    }

    @Test
    public void testDemenager(){

        salaireCdi.demenager(adresseMock);

        verify(
                identiteMock,
                times(1)
        ).setAdresse(adresseMock);
    }

    @Test
    public void testTravailler(){
        when(salaireMock.payer(151.61)).thenReturn(151.67 * 10);
        salaireCdi.travailler(151.61);
        verify(salaireMock, times(1)).payer(151.61);

        reset(salaireMock);

        when(salaireMock.payer(151.61)).thenReturn(0.0 * 10);
        salaireCdi.travailler(151.61);
        verify(salaireMock, times(1)).payer(151.61);
    }

    @Test
    public void testAugmenter() {
        when(salaireMock.payer(151.61)).thenReturn(10.0);

        double pourcentageAugmentation = 15;
        double tauxHoraireAttendu = 151.67 * 10 * (1 + (pourcentageAugmentation / 100.0));

        salaireCdiMock.augmenter(pourcentageAugmentation);

        assertNotEquals(tauxHoraireAttendu, salaireCdiMock.getSalaire());
    }

}