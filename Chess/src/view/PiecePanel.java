/*
Quiet Intrigue is a chess playing engine with GUI written in Java.
Copyright (C) <2014>  Matthew Voss

Quiet Intrigue is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Quiet Intrigue is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Quiet Intrigue.  If not, see <http://www.gnu.org/licenses/>.
*/

package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MasterListener;
import model.Piece;

/**
 * Each square on the board is a piece panel, and stores the label the piece is on, the piece object represented,
 * and the row and column coordinates of the square
 * @author Matthew
 *
 */
public class PiecePanel extends JPanel {

	JLabel label;
	Piece pieceRepresented;
	int row;
	int col;
	
	/**
	 * Constructor
	 * @param row
	 * @param col
	 * @param labelIn
	 * @param masterListenerIn
	 * @param pieceRepresentedIn
	 */
	public PiecePanel(int row, int col, JLabel labelIn, Piece pieceRepresentedIn){
		super();
		
		this.row = row;
		this.col = col;
		this.label = labelIn;
		this.add(label);
		this.setOpaque(false);
//		this.addMouseListener(masterListenerIn);
//		this.addMouseMotionListener(masterListenerIn);
		this.pieceRepresented = pieceRepresentedIn;
	}

	@Override
	public String toString() {
		return "PiecePanel [pieceRepresented="
				+ pieceRepresented + ", row=" + row + ", col=" + col + "]";
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public Piece getPieceRepresented() {
		return pieceRepresented;
	}

	public void setPieceRepresented(Piece pieceRepresented) {
		this.pieceRepresented = pieceRepresented;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
}
