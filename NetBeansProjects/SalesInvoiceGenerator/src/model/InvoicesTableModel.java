package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ali
 */

        public class InvoicesTableModel extends AbstractTableModel {
        private ArrayList<Invoice> invoices;
        private String[] columns = {"No.", "Date", "Customer", "Total"};

        
        public InvoicesTableModel() {}
        
        public InvoicesTableModel(ArrayList<Invoice> invoices) {
            this.invoices = invoices;
        }

        
        @Override
        public int getRowCount() {
            return invoices.size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public String getColumnName(int column) {
            return columns[column];
        }

        
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Invoice invoice = invoices.get(rowIndex);

            switch (columnIndex)
            {
                case 0: return invoice.getNumber();
                case 1: return invoice.getDate();
                case 2: return invoice.getCustomerName();
                case 3: return invoice.getInvoiceTotal();
                default : return " ";
            }
        }
        
        
        /*
         @Override
    public String getColumnName (int column) {
        return columns[column];
    }
        */
        
    }
