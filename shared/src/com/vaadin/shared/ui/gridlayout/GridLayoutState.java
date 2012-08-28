/* 
 * Copyright 2011 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.shared.ui.gridlayout;

import com.vaadin.shared.ui.AbstractLayoutState;

public class GridLayoutState extends AbstractLayoutState {
    private boolean spacing = false;
    private int rows = 0;
    private int columns = 0;
    private int marginsBitmask = 0;

    public boolean isSpacing() {
        return spacing;
    }

    public void setSpacing(boolean spacing) {
        this.spacing = spacing;
    }

    public int getMarginsBitmask() {
        return marginsBitmask;
    }

    public void setMarginsBitmask(int marginsBitmask) {
        this.marginsBitmask = marginsBitmask;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int cols) {
        columns = cols;
    }

}