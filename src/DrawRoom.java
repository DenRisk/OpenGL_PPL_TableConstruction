public class DrawRoom {

    //Backside of the Room

    public static float[] makeRoomBackVertices(float[] color) {

        // Definition of positions of vertices for a cuboid
        float[] p0 = {3.5f, -0.6f, -4.0f}; // 0
        float[] p1 = {-3.5f, -0.6f, -4.0f}; // 1
        float[] p2 = {-3.5f, 3f, -4.0f}; // 2
        float[] p3 = {3.5f, 3f, -4.0f}; // 3

        // color vector
        float[] c = color;
        // Definition of normal vectors for cuboid surfaces
        float[] nf = {0, 0, 1}; // front

        // Definition of texture coordinates for cuboid surfaces
        float[] uv00 = {0, 0}; // u = 0, v = 0
        float[] uv01 = {0, 1}; // u = 0, v = 1
        float[] uv10 = {1, 0}; // u = 1, v = 0
        float[] uv11 = {1, 1}; // u = 1, v = 1

        float[] verticies = {
                //index: 0
                p0[0], p0[1], p0[2],   // position
                c[0], c[1], c[2],    // color
                nf[0], nf[1], nf[2],   // normal
                uv10[0], uv10[1],      // texture coordinate
                // index: 1
                p3[0], p3[1], p3[2],   // position
                c[0], c[1], c[2],   // color
                nf[0], nf[1], nf[2],   // normal
                uv00[0], uv00[1],      // texture coordinates
                // index: 2
                p1[0], p1[1], p1[2],   // position
                c[0], c[1], c[2],   // color
                nf[0], nf[1], nf[2],   // normal
                uv01[0], uv01[1],      // texture coordinates
                // index: 3
                p2[0], p2[1], p2[2],   // position
                c[0], c[1], c[2],   // color
                nf[0], nf[1], nf[2],   // normal
                uv11[0], uv11[1],      // texture coordinates
        };
        return verticies;
    }

    //Leftside of the Room

    public static float[] makeRoomLeftVertices(float[] color) {

        // Definition of positions of vertices for a cuboid
        float[] p0 = {-3.5f, -0.6f, -4.0f}; // 0
        float[] p1 = {-3.5f, -0.6f, 4.0f}; // 1
        float[] p2 = {-3.5f, 3f, 4.0f}; // 2
        float[] p3 = {-3.5f, 3f, -4.0f}; // 3

        // color vector
        float[] c = color;
        // Definition of normal vectors for cuboid surfaces
        float[] nl = {-1, 0, 0}; // 0 left

        // Definition of texture coordinates for cuboid surfaces
        float[] uv00 = {0, 0}; // u = 0, v = 0
        float[] uv01 = {0, 1}; // u = 0, v = 1
        float[] uv10 = {1, 0}; // u = 1, v = 0
        float[] uv11 = {1, 1}; // u = 1, v = 1

        float[] verticies = {
                //index: 0
                p0[0], p0[1], p0[2],   // position
                c[0], c[1], c[2],    // color
                nl[0], nl[1], nl[2],   // normal
                uv10[0], uv10[1],      // texture coordinate
                // index: 1
                p3[0], p3[1], p3[2],   // position
                c[0], c[1], c[2],   // color
                nl[0], nl[1], nl[2],   // normal
                uv00[0], uv00[1],      // texture coordinates
                // index: 2
                p1[0], p1[1], p1[2],   // position
                c[0], c[1], c[2],   // color
                nl[0], nl[1], nl[2],   // normal
                uv01[0], uv01[1],      // texture coordinates
                // index: 3
                p2[0], p2[1], p2[2],   // position
                c[0], c[1], c[2],   // color
                nl[0], nl[1], nl[2],   // normal
                uv11[0], uv11[1],      // texture coordinates
        };
        return verticies;
    }

    public static float[] makeRoomRightVertices(float[] color) {

        // Definition of positions of vertices for a cuboid
        float[] p0 = {3.5f, -0.6f, 4.0f}; // 0
        float[] p1 = {3.5f, -0.6f, -4.0f}; // 1
        float[] p2 = {3.5f, 3f, -4.0f}; // 2
        float[] p3 = {3.5f, 3f, 4.0f}; // 3

        // color vector
        float[] c = color;
        // Definition of normal vectors for cuboid surfaces

        float[] nr = {1, 0, 0}; // 0 right

        // Definition of texture coordinates for cuboid surfaces
        float[] uv00 = {0, 0}; // u = 0, v = 0
        float[] uv01 = {0, 1}; // u = 0, v = 1
        float[] uv10 = {1, 0}; // u = 1, v = 0
        float[] uv11 = {1, 1}; // u = 1, v = 1

        float[] verticies = {
                //index: 0
                p0[0], p0[1], p0[2],   // position
                c[0], c[1], c[2],    // color
                nr[0], nr[1], nr[2],   // normal
                uv10[0], uv10[1],      // texture coordinate
                // index: 1
                p3[0], p3[1], p3[2],   // position
                c[0], c[1], c[2],   // color
                nr[0], nr[1], nr[2],   // normal
                uv00[0], uv00[1],      // texture coordinates
                // index: 2
                p1[0], p1[1], p1[2],   // position
                c[0], c[1], c[2],   // color
                nr[0], nr[1], nr[2],   // normal
                uv01[0], uv01[1],      // texture coordinates
                // index: 3
                p2[0], p2[1], p2[2],   // position
                c[0], c[1], c[2],   // color
                nr[0], nr[1], nr[2],   // normal
                uv11[0], uv11[1],      // texture coordinates
        };
        return verticies;
    }

    public static float[] makeRoomFrontVertices(float[] color) {

        // Definition of positions of vertices for a cuboid
        float[] p0 = {-3.5f, -0.6f, 4.0f}; // 0
        float[] p1 = {3.5f, -0.6f, 4.0f}; // 1
        float[] p2 = {3.5f, 3f, 4.0f}; // 2 f
        float[] p3 = {-3.5f, 3f, 4.0f}; // 3

        // color vector
        float[] c = color;
        // Definition of normal vectors for cuboid surfaces

        float[] nf = {0, 0, 1}; // 0

        // Definition of texture coordinates for cuboid surfaces
        float[] uv00 = {0, 0}; // u = 0, v = 0
        float[] uv01 = {0, 1}; // u = 0, v = 1
        float[] uv10 = {1, 0}; // u = 1, v = 0
        float[] uv11 = {1, 1}; // u = 1, v = 1

        float[] verticies = {
                //index: 0
                p0[0], p0[1], p0[2],   // position
                c[0], c[1], c[2],    // color
                nf[0], nf[1], nf[2],   // normal
                uv10[0], uv10[1],      // texture coordinate
                // index: 1
                p3[0], p3[1], p3[2],   // position
                c[0], c[1], c[2],   // color
                nf[0], nf[1], nf[2],   // normal
                uv00[0], uv00[1],      // texture coordinates
                // index: 2
                p1[0], p1[1], p1[2],   // position
                c[0], c[1], c[2],   // color
                nf[0], nf[1], nf[2],   // normal
                uv01[0], uv01[1],      // texture coordinates
                // index: 3
                p2[0], p2[1], p2[2],   // position
                c[0], c[1], c[2],   // color
                nf[0], nf[1], nf[2],   // normal
                uv11[0], uv11[1],      // texture coordinates
        };
        return verticies;
    }

    public static float[] makeRoomBottomVertices(float[] color) {

        // Definition of positions of vertices for a cuboid
        float[] p0 = {-3.5f, -0.6f, -4.0f}; // 0
        float[] p1 = {3.5f, -0.6f, -4.0f}; // 1
        float[] p2 = {3.5f, -0.6f, 4.0f}; // 2
        float[] p3 = {-3.5f, -0.6f, 4.0f}; // 3

        // color vector
        float[] c = color;
        // Definition of normal vectors for cuboid surfaces

        float[] nd = { 0, 1,  0}; // 0 down (bottom)

        // Definition of texture coordinates for cuboid surfaces
        float[] uv00 = {0, 0}; // u = 0, v = 0
        float[] uv01 = {0, 1}; // u = 0, v = 1
        float[] uv10 = {1, 0}; // u = 1, v = 0
        float[] uv11 = {1, 1}; // u = 1, v = 1

        float[] verticies = {
                //index: 0
                p0[0], p0[1], p0[2],   // position
                c[0], c[1], c[2],    // color
                nd[0], nd[1], nd[2],   // normal
                uv10[0], uv10[1],      // texture coordinate
                // index: 1
                p3[0], p3[1], p3[2],   // position
                c[0], c[1], c[2],   // color
                nd[0], nd[1], nd[2],   // normal
                uv00[0], uv00[1],      // texture coordinates
                // index: 2
                p1[0], p1[1], p1[2],   // position
                c[0], c[1], c[2],   // color
                nd[0], nd[1], nd[2],   // normal
                uv01[0], uv01[1],      // texture coordinates
                // index: 3
                p2[0], p2[1], p2[2],   // position
                c[0], c[1], c[2],   // color
                nd[0], nd[1], nd[2],   // normal
                uv11[0], uv11[1],      // texture coordinates
        };
        return verticies;
    }

    public static float[] makeRoomTopVertices(float[] color) {

        // Definition of positions of vertices for a cuboid
        float[] p0 = {-3.5f, 3f, 4.0f}; // 0
        float[] p1 = {3.5f, 3f, 4.0f}; // 1
        float[] p2 = {3.5f, 3f, -4.0f}; // 2
        float[] p3 = {-3.5f, 3f, -4.0f}; // 3

        // color vector
        float[] c = color;
        // Definition of normal vectors for cuboid surfaces

        float[] nd = { 0, -1,  0}; // 0 down (bottom)

        // Definition of texture coordinates for cuboid surfaces
        float[] uv00 = {0, 0}; // u = 0, v = 0
        float[] uv01 = {0, 1}; // u = 0, v = 1
        float[] uv10 = {1, 0}; // u = 1, v = 0
        float[] uv11 = {1, 1}; // u = 1, v = 1

        float[] verticies = {
                //index: 0
                p0[0], p0[1], p0[2],   // position
                c[0], c[1], c[2],    // color
                nd[0], nd[1], nd[2],   // normal
                uv10[0], uv10[1],      // texture coordinate
                // index: 1
                p3[0], p3[1], p3[2],   // position
                c[0], c[1], c[2],   // color
                nd[0], nd[1], nd[2],   // normal
                uv00[0], uv00[1],      // texture coordinates
                // index: 2
                p1[0], p1[1], p1[2],   // position
                c[0], c[1], c[2],   // color
                nd[0], nd[1], nd[2],   // normal
                uv01[0], uv01[1],      // texture coordinates
                // index: 3
                p2[0], p2[1], p2[2],   // position
                c[0], c[1], c[2],   // color
                nd[0], nd[1], nd[2],   // normal
                uv11[0], uv11[1],      // texture coordinates
        };
        return verticies;
    }

    public static int[] makeRoomIndicesForTriangleStrip() {

        int[] indices = {
                1, 0, 3, 2
        };
        return indices;
    }

    public static int noOfIndicesForRoom() {
        return 4;
    }

}
