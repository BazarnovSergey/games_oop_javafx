package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        Cell rsl = bishopBlack.position();
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = Cell.D3;
        Cell rsl = bishopBlack.copy(Cell.D3).position();
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenWayC1ToG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] rsl = bishopBlack.way(Cell.G5);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenWayG3ToB8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G3);
        Cell[] expected = {Cell.F4, Cell.E5, Cell.D6, Cell.C7, Cell.B8};
        Cell[] rsl = bishopBlack.way(Cell.B8);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenWayA5ToD8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A5);
        Cell[] expected = {Cell.B6, Cell.C7, Cell.D8};
        Cell[] rsl = bishopBlack.way(Cell.D8);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenWayF2ToC5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F2);
        Cell[] expected = {Cell.E3, Cell.D4, Cell.C5};
        Cell[] rsl = bishopBlack.way(Cell.C5);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayNotCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.C3, Cell.C5, Cell.C7};
        Cell[] rsl = bishopBlack.way(Cell.C7);
        Assert.assertArrayEquals(expected, rsl);
    }
}