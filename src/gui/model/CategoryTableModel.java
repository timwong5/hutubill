package gui.model;

import entity.Category;
import service.CategoryService;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

public class CategoryTableModel implements TableModel {

    String[] columnNames = new String[]{"分类名称","消费次数"};
    public List<Category> cs = new CategoryService().list();

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
        //反射，String.class可以返回一个代表String类的类对象
        return String.class;
    }

    @Override
    public boolean isCellEditable(int i, int i1) {
        return false;
    }


    // 先通过cs.get(rowIndex)获取行对应的Category对象
    // 然后根据columnIndex返回对应的属性
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category h = cs.get(rowIndex);
        if (0 == columnIndex){
            return h.name;
        }

        if (1 == columnIndex) {
            return h.recordNumber;
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
