/*
 * Sudokuki - essential sudoku game
 * Copyright (C) 2007-2013 Sylvain Vedrenne
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.jankenpoi.sudokuki.model;

public class Position {
	private int li;
	private int co;
	
	public Position(int li, int co) {
		this.li = li;
		this.co = co;
	}
	
	public int getLi() {
		return li;
	}
	
	public int getCo() {
		return co;
	}
}
