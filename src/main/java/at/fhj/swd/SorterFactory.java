package at.fhj.swd;

public interface SorterFactory{
	Sorter createSorter(SortDirection direction);
}
