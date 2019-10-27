package whu.se.interpret.po;

import lombok.Getter;
import lombok.Setter;
import whu.se.interpret.po.TableItem;

import java.util.ArrayList;

/**
 * @author xsy
 * @description: TODO
 * @date 10/27/2019 3:56 PM
 */
@Getter
@Setter
public class SymbolTable {

    private String name;
    private String returnType;//返回值类型
    private int paramNum;//参数个数
    private ArrayList<TableItem> tableItems;//符号序列
    private SymbolTable prePointer;//指向前一个符号表的指针



}
