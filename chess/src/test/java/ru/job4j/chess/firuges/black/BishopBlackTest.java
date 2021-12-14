package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack first = new BishopBlack(Cell.B4);
        assertThat(first.position(), is(Cell.B4));
    }

    public void testCopy() {
        BishopBlack first = new BishopBlack(Cell.B4);
        Figure second = first.copy(Cell.F1);
        assertThat(second.position(), is(Cell.F1));
    }

    public void testWay() {
        BishopBlack first = new BishopBlack(Cell.C1);
        assertThat(first.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}