package com.wakaleo.gameoflife.domain;

public enum Cell {
    LIVE_CELL("*"), DEAD_CELL(".");

    private String symb;

    private Cell(final String initialSymbol) {
        this.symb = initialSymbol;
    }

    @Override
    public String toString() {
        return symb;
    }

    static Cell fromSymbol(final String symb) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symb.equals(symb)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symb;
    }
}
