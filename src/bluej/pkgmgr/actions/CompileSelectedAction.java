/*
 This file is part of the BlueJ program. 
 Copyright (C) 1999-2009,2016  Michael Kolling and John Rosenberg 
 
 This program is free software; you can redistribute it and/or 
 modify it under the terms of the GNU General Public License 
 as published by the Free Software Foundation; either version 2 
 of the License, or (at your option) any later version. 
 
 This program is distributed in the hope that it will be useful, 
 but WITHOUT ANY WARRANTY; without even the implied warranty of 
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
 GNU General Public License for more details. 
 
 You should have received a copy of the GNU General Public License 
 along with this program; if not, write to the Free Software 
 Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA. 
 
 This file is subject to the Classpath exception as provided in the  
 LICENSE.txt file that accompanied this code.
 */
package bluej.pkgmgr.actions;

import bluej.pkgmgr.PkgMgrFrame;

/**
 * "Compile selected" command. Compiles the selected classes.
 * 
 * @author Davin McCall
 * @version $Id: CompileSelectedAction.java 16081 2016-06-25 09:42:13Z nccb $
 */
final public class CompileSelectedAction extends PkgMgrAction
{
    public CompileSelectedAction(PkgMgrFrame pmf)
    {
        super(pmf, "menu.tools.compileSelected");
    }
    
    public void actionPerformed(PkgMgrFrame pmf)
    {
        pmf.menuCall();
        pmf.compileSelected();
    }
}