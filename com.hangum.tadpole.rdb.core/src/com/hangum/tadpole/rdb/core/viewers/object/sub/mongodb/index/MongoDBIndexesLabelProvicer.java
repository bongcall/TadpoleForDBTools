/*******************************************************************************
 * Copyright (c) 2013 hangum.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     hangum - initial API and implementation
 ******************************************************************************/
package com.hangum.tadpole.rdb.core.viewers.object.sub.mongodb.index;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.hangum.tadpole.dao.mongodb.MongoDBIndexDAO;

/**
 * index의 컬럼 정보
 * 
 * @author hangumNote
 *
 */
public class MongoDBIndexesLabelProvicer extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}
	
	@Override
	public String getColumnText(Object element, int columnIndex) {
		MongoDBIndexDAO tc = (MongoDBIndexDAO) element;
		
		switch(columnIndex) {
		case 0: return tc.getNs();
		case 1: return tc.getName();
		case 2: return new Boolean(tc.isUnique()).toString();
		}
		
		return "** not set column **";
	}

}
