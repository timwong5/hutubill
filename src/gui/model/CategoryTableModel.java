package gui.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class CategoryTableModel implements TableModel {

    String[] columnNames = new String[]{"��������","���Ѵ���"};
    List<String> cs = new ArrayList<>();

    public CategoryTableModel(){
        cs.add("����");
        cs.add("��ͨ");
        cs.add("ס��");
        cs.add("����");
    }

    @Override
    public int getRowCount() {
        return cs.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int index) {
        return columnNames[index];
    }

    @Override
    public Class<?> getColumnClass(int i) {
        //���䣬String.class���Է���һ������String��������
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0) {
            return cs.get(rowIndex);
        }
        if(columnIndex == 1) {
            return 0;
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int i, int i1) {

    }

    @Override
    public void addTableModelListener(TableModelListener tableModelListener) {

    }

    @Override
    public void removeTableModelListener(TableModelListener tableModelListener) {

    }
}