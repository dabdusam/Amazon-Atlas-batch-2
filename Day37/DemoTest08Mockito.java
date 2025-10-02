package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DemoTest08Mockito {

    @Spy
    ToyService spyToyService;

    @Test
    void method1() {
        // When
        String name = spyToyService.getToyName(1);

        // Then
        assertEquals("Lego", name);

        // Verify interaction
        verify(spyToyService, times(1)).getToyName(1);
    }

    @Test
    void method2() {
        // Stub fallback method
        doReturn("Default toy").when(spyToyService).getFallbackName();

        // When
        String name = spyToyService.getToyName(3);

        // Then
        assertEquals("Default toy", name);

        // Verify fallback method was called
        verify(spyToyService, times(1)).getFallbackName();
    }
}

