/*
 *     Computer and algorithm interaction simulation software (CAISS).
 *     Copyright (C) 2016 Sergey Pomelov.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package simulation.structures.interaction;

import javax.annotation.concurrent.Immutable;

/**
 * Data types list.
 *
 * @author Sergey Pomelov on 2/10/14.
 */
@Immutable
public enum DataType {
    BOOL, B_DEC, TWO_B_DEC,
    // --Commented out by Inspection (31/05/2016 22:11):SIXTEEN_B_FL
    // --Commented out by Inspection (31/05/2016 22:10):FOUR_B_DEC, EIGHT_B_DEC, SIXTEEN_B_DEC,
    FOUR_B_FL, EIGHT_B_FL, UNKNOWN,
}
