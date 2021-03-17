/**
 * Copyright (c) 2020 Intel Corporation
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package com.intel.flightplanning.geometry3d.mesh;

import com.intel.flightplanning.core.MinMaxPair;
import com.jme3.math.Ray;

public class Mesh implements IMesh {

    public double heading;
    public double tilt;
    public double roll;

    MinMaxPair minMaxX = new MinMaxPair();
    MinMaxPair minMaxZ = new MinMaxPair();
    MinMaxPair minMaxY = new MinMaxPair();


    @Override
    public void getVertices() {

    }

    @Override
    public void getNormals() {

    }

    @Override
    public void getBoundingBox() {

    }

    @Override
    public void getTriangles() {

    }

    @Override
    public void intersect(Ray ray) {

    }

    @Override
    public void voxelize() {

    }
}
