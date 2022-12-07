package at.fhj.swd;

public class SorterFactoryStrategyImpl implements SorterFactory{
    @Override
    public Sorter createSorter(SortDirection direction) {
        if (direction == null)
            throw new IllegalArgumentException();

        return switch (direction) {
            default -> throw new IllegalArgumentException();
            case ASCENDING -> new BubbleSortAscendingStrategy();
            case DESCENDING -> new BubbleSortDescendingStrategy();
        };
    }


}
