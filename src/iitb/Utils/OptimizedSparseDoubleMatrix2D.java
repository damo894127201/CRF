/*
 * Created on Jun 3, 2005
 */
package iitb.Utils;

import gnu.trove.TIntObjectHashMap;

/**
 * @author imran
 *
 */
public class OptimizedSparseDoubleMatrix2D {
    TIntObjectHashMap rows; //row-index --> row (OptimizedSparseDoubleMatrix1D

    public OptimizedSparseDoubleMatrix2D(int capacity) {
        rows = new TIntObjectHashMap(capacity);
    }
    
    public OptimizedSparseDoubleMatrix2D() {
        this(0);
    }
    
    public OptimizedSparseDoubleMatrix1D getRow(int rowId){
        return (OptimizedSparseDoubleMatrix1D) rows.get(rowId);
    }

    public void setRow(int rowId, OptimizedSparseDoubleMatrix1D row){
        rows.put(rowId, row);
    }

    public void clear(){
        rows.clear();
    }

    public static void main(String[] args) {
    }
}