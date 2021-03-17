/**
 * Copyright (c) 2020 Intel Corporation
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.intel.flightplanning.geometry2d;

import com.jme3.math.Vector2f;
import java.util.List;

public class LineString extends Geometry2D {
    List<Vector2f> cornerPoints;

    @Override
    public List<Vector2f> getCornerPoints() {
        return null;
    }
}
