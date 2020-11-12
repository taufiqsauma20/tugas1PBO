package Pra_UAS;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hendy PC
 * Nama : M.Taufiq Sauma Hendy
 * NIM  : 18104410131
 * Kalau copy Izin Dulu
 */
public class ModelTamiya extends AbstractTableModel{
    
    public List<Tamiya> listData = new ArrayList<>();
    public String[] colName = {"Nama", "Tahun"};
    
    public void setListData(List<Tamiya> listData) {
        this.listData = listData;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
    return listData.size();
    }

    @Override
    public int getColumnCount() {
    return colName.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
    switch (col){
        case 0:
        return listData.get(row).getNama();
    
        case 1:
        return listData.get(row).getTahun();
    
        default:
        return null;
    }
    }
}