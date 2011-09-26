/*
 * This file is part of mmoMinecraft (https://github.com/mmoMinecraftDev).
 *
 * mmoMinecraft is free software: you can redistribute it and/or modify
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
package mmo.Quest;

import mmo.Core.MMOPlugin;
import mmo.Core.util.EnumBitSet;

public class MMOQuest extends MMOPlugin {

	@Override
	public EnumBitSet mmoSupport(EnumBitSet support) {
		support.set(Support.MMO_DATABASE);
		return support;
	}

	@Override
	public void onEnable() {
		super.onEnable();

	}

	@Override
	public void onDisable() {
		super.onDisable();

	}
}
