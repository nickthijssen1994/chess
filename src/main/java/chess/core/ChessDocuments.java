/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *                              Java Chess                                      *
 *                 Copyright (C) 2005  Arvydas Bancewicz                        *
 *                                                                              *
 *    This program is free software; you can redistribute it and/or modify      *
 *    it under the terms of the GNU General Public License as published by      *
 *    the Free Software Foundation; either version 2 of the License, or         *
 *    (at your option) any later version.                                       *
 *                                                                              *
 *    This program  is distributed in the hope that it will be useful,          *
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of            *
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the             *
 *    GNU General Public License for more details.                              *
 *                                                                              *
 *    You should have received a copy of the GNU General Public License         *
 *    along with Java Chess; if not, write to the Free Software                 *
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA *
 *                                                                              *
 *                    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/*
 * Created on Mar 21, 2005
 *
 */

package chess.core;

import javax.swing.*;
import java.util.Vector;

/**
 * ChessDocuments is a custom list model specific for ChessGames
 *
 * @author Arvydas Bancewicz
 */
public final class ChessDocuments extends AbstractListModel {

	public final static ChessDocuments cdoc;

	static {
		cdoc = new ChessDocuments();
	}

	private final Vector list;

	private ChessDocuments() {
		list = new Vector();
	}

	public static ChessDocuments getInstance() {
		return cdoc;
	}

	public Vector getList() {
		return list;
	}

	public void add(ChessGame game) {
		list.add(game);
		fireIntervalAdded(this, list.size(), list.size());
	}

	public void removeAt(int index) {
		list.remove(index);
	}

	public int getSize() {
		return list.size();
	}

	public Object getElementAt(int index) {
		return list.get(index);
	}

	public void clear() {
		list.clear();
	}

}
