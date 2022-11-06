package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BishopBlackTest {

    @Test
    public void bishopBlackPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell expected = bishopBlack.position();
        Cell actual = Cell.F8;
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    public void bishopBlackCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure actual = bishopBlack.copy(Cell.F8);
        assertThat(bishopBlack.position()).isEqualTo(actual.position());
    }

    @Test
    public void bishopBlackWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(actual).isEqualTo(expected);
    }
}