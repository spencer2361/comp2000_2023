private class GridIterate implements Iterator<Cell>{
    private int currentRow = 0;
    private int currentCol = 0;

    // currentRow < cells.length: checks whether the current row index is less than the total number of rows in the grid (cells.length). If it is, it means that there are more rows to iterate over.

    //currentCol < cells[currentRow].length:checks if the current colum is greater than the last columns index, if it isn't then there are more columns to check.

    @Override
    public boolean hasNext() {
        return currentRow < cells.length && currentCol < cells[currentRow].length;
    }

    // checks if there is a cell /element after one has been called, returns true if there is.

    @Override
    public Cell next() {
        if (!hasNext()) {
          throw new java.util.NoSuchElementException("No more cells to be checked.");
        }
        // if nothing is next is found to be next, it will throw an exception.

        Cell cell = cells[currentRow][currentCol];
// set

currentCol++;
// Columns position moves up

if (currentCol >= cells[currentRow].length) {
  // if there are no more rows in the current row we reset back to the first column and then move down to the next row
    currentCol = 0;
    currentRow++;
} //  moves to the next row within the column

return cell;
  }


  public Iterator<Cell> itera() {
    return new GridIterate();
}
}