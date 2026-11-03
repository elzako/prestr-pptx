package com.aspose.slides;

final class AutoShapeImp extends AutoShapeImpBase {
   private final int[] x7n;
   private final int[] z0k;
   private final com.aspose.slides.internal.o9b.j5[] g8v;
   private final AutoShapeImpBase$n5[] k1d;
   private final AutoShapeImpBase$l6[] v2s;
   private final com.aspose.slides.internal.o9b.j5[] f1c;
   private static final com.aspose.slides.internal.o9b.j5[] p6w = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483643),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483643),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600)
   };
   private static final int[] p4l = new int[]{10, 24576, 32768};
   private static final AutoShapeImpBase$n5[] p6t = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027),
      new AutoShapeImpBase$n5(8194, (short)327, (short)0, (short)0)
   };
   private static final int[] e3m = new int[]{14400, 5400, 18000, 8100};
   private static final AutoShapeImpBase$l6[] k9m = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] h3d = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483642, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483642, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp u6p = new AutoShapeImp(p6w, p4l, p6t, e3m, k9m, 21600, 21600, h3d);
   private static final com.aspose.slides.internal.o9b.j5[] o8m = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483644),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483645)
   };
   private static final int[] f3c = new int[]{10, 24576, 32768};
   private static final AutoShapeImpBase$n5[] j2p = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027),
      new AutoShapeImpBase$n5(8194, (short)327, (short)21600, (short)0)
   };
   private static final int[] u0a = new int[]{7200, 5400, 3600, 8100};
   private static final AutoShapeImpBase$l6[] w1n = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0), new com.aspose.slides.internal.o9b.j5(21600, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] m6n = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483642, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483642, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp l7h = new AutoShapeImp(o8m, f3c, j2p, u0a, w1n, 21600, 21600, m6n);
   private static final com.aspose.slides.internal.o9b.j5[] r7c = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(21600, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483645, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483643, Integer.MIN_VALUE)
   };
   private static final int[] l2p = new int[]{10, 24576, 32768};
   private static final AutoShapeImpBase$n5[] r5t = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027),
      new AutoShapeImpBase$n5(8194, (short)327, (short)21600, (short)0)
   };
   private static final int[] r6i = new int[]{7200, 5400, 3600, 8100};
   private static final AutoShapeImpBase$l6[] h3r = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, Integer.MIN_VALUE), new com.aspose.slides.internal.o9b.j5(21600, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] n5u = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483642)
   };
   private static final AutoShapeImp b8c = new AutoShapeImp(r7c, l2p, r5t, r6i, h3r, 21600, 21600, n5u);
   private static final com.aspose.slides.internal.o9b.j5[] t1z = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483643, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483645, Integer.MIN_VALUE)
   };
   private static final int[] d0p = new int[]{10, 24576, 32768};
   private static final AutoShapeImpBase$n5[] x6s = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027),
      new AutoShapeImpBase$n5(8194, (short)327, (short)0, (short)0)
   };
   private static final int[] s5g = new int[]{14400, 5400, 18000, 8100};
   private static final AutoShapeImpBase$l6[] k4s = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(21600, Integer.MIN_VALUE))
   };
   private static final com.aspose.slides.internal.o9b.j5[] x7i = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483642)
   };
   private static final AutoShapeImp r5d = new AutoShapeImp(t1z, d0p, x6s, s5g, k4s, 21600, 21600, x7i);
   private static final com.aspose.slides.internal.o9b.j5[] v9e = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483643),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483645)
   };
   private static final int[] t9p = new int[]{17, 24576, 32768};
   private static final AutoShapeImpBase$n5[] w4w = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1026),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027)
   };
   private static final int[] c9b = new int[]{5400, 5400, 2700, 8100};
   private static final AutoShapeImpBase$l6[] r5w = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0), new com.aspose.slides.internal.o9b.j5(-2147483644, 21600))
   };
   private static final AutoShapeImp t5g = new AutoShapeImp(v9e, t9p, w4w, c9b, r5w, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] m5l = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(0, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483644),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483644),
      new com.aspose.slides.internal.o9b.j5(21600, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483641, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483645, Integer.MIN_VALUE)
   };
   private static final int[] k3h = new int[]{17, 24576, 32768};
   private static final AutoShapeImpBase$n5[] u4k = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1026),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027)
   };
   private static final int[] g1p = new int[]{5400, 5500, 2700, 8100};
   private static final AutoShapeImpBase$l6[] c4t = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, Integer.MIN_VALUE), new com.aspose.slides.internal.o9b.j5(21600, -2147483644))
   };
   private static final AutoShapeImp z1n = new AutoShapeImp(m5l, k3h, u4k, g1p, c4t, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] k2p = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483645, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483641, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483644, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483644),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483644),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483643),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483645)
   };
   private static final int[] u7f = new int[]{31, 24576, 32768};
   private static final AutoShapeImpBase$n5[] s1o = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1026),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027)
   };
   private static final int[] n2z = new int[]{5400, 8100, 2700, 9400};
   private static final AutoShapeImpBase$l6[] w8d = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(
         new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE), new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483644)
      )
   };
   private static final AutoShapeImp l8r = new AutoShapeImp(k2p, u7f, s1o, n2z, w8d, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] x1f = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(6140, 6350),
      new com.aspose.slides.internal.o9b.j5(8470, 8680),
      new com.aspose.slides.internal.o9b.j5(13130, 6350),
      new com.aspose.slides.internal.o9b.j5(15460, 8680),
      new com.aspose.slides.internal.o9b.j5(4870, -2147483647),
      new com.aspose.slides.internal.o9b.j5(8680, -2147483646),
      new com.aspose.slides.internal.o9b.j5(12920, -2147483646),
      new com.aspose.slides.internal.o9b.j5(16730, -2147483647)
   };
   private static final int[] o3i = new int[]{41730, 24576, 32772, 41730, 24576, 33026, 41730, 24576, 33026, 8193, 33024};
   private static final AutoShapeImpBase$n5[] z6e = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)15510),
      new AutoShapeImpBase$n5(32768, (short)17520, (short)0, (short)1024),
      new AutoShapeImpBase$n5(16384, (short)15510, (short)1024, (short)0)
   };
   private static final AutoShapeImpBase$l6[] g4u = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, -2147483647), new com.aspose.slides.internal.o9b.j5(-2147483644, 21600))
   };
   private static final int[] y8m = new int[]{17520};
   private static final AutoShapeImp c7f = new AutoShapeImp(x1f, o3i, z6e, y8m, s3, 21600, 21600, p8);
   private static final com.aspose.slides.internal.o9b.j5[] c1x = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483647)
   };
   private static final int[] j8m = new int[]{41730, 41730, 32768};
   private static final AutoShapeImpBase$n5[] p7x = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0), new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327)
   };
   private static final AutoShapeImp o6t = new AutoShapeImp(c1x, j8m, p7x, t2, s3, 21600, 21600, p8);
   private static final com.aspose.slides.internal.o9b.j5[] l1b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483636),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483632)
   };
   private static final int[] n9q = new int[]{41730, 41988, 24576, 41988, 24576, 32768};
   private static final AutoShapeImpBase$n5[] d2n = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)327),
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)2),
      new AutoShapeImpBase$n5(41088, (short)1027, (short)0, (short)1026),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1027),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1027, (short)0),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1028),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1028, (short)0),
      new AutoShapeImpBase$n5(24705, (short)1029, (short)1031, (short)450),
      new AutoShapeImpBase$n5(24706, (short)1029, (short)1031, (short)450),
      new AutoShapeImpBase$n5(24705, (short)1029, (short)1032, (short)450),
      new AutoShapeImpBase$n5(24706, (short)1029, (short)1032, (short)450),
      new AutoShapeImpBase$n5(24705, (short)1030, (short)1032, (short)450),
      new AutoShapeImpBase$n5(24706, (short)1030, (short)1032, (short)450),
      new AutoShapeImpBase$n5(24705, (short)1030, (short)1031, (short)450),
      new AutoShapeImpBase$n5(24706, (short)1030, (short)1031, (short)450)
   };
   private static final AutoShapeImp g2x = new AutoShapeImp(l1b, n9q, d2n, u9, s3, 21600, 21600, p8);
   private static final com.aspose.slides.internal.o9b.j5[] s2b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483645),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] o5k = new int[]{41988, 42244, 24576, 32768};
   private static final int[] n1g = new int[]{11796480, 5400};
   private static final AutoShapeImpBase$n5[] q8g = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(16394, (short)10800, (short)327, (short)0),
      new AutoShapeImpBase$n5(16393, (short)10800, (short)327, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1024, (short)10800, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1025, (short)10800, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1026),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)328),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)328, (short)0),
      new AutoShapeImpBase$n5(24586, (short)1029, (short)327, (short)0),
      new AutoShapeImpBase$n5(24585, (short)1029, (short)327, (short)0),
      new AutoShapeImpBase$n5(24586, (short)1035, (short)327, (short)0),
      new AutoShapeImpBase$n5(24585, (short)1035, (short)327, (short)0),
      new AutoShapeImpBase$n5(16386, (short)10800, (short)328, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1033, (short)10800, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1034, (short)10800, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1036),
      new AutoShapeImpBase$n5(8198, (short)1024, (short)21600, (short)0),
      new AutoShapeImpBase$n5(57350, (short)1024, (short)1030, (short)1029)
   };
   private static final com.aspose.slides.internal.o9b.j5[] e6a = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, -2147483633),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483635),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483632),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483635)
   };
   private static final AutoShapeImp x4a = new AutoShapeImp(s2b, o5k, q8g, n1g, null, 21600, 21600, e6a);
   private static final com.aspose.slides.internal.o9b.j5[] r7n = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 21599),
      new com.aspose.slides.internal.o9b.j5(321, 6886),
      new com.aspose.slides.internal.o9b.j5(70, 6036),
      new com.aspose.slides.internal.o9b.j5(-9, 5766),
      new com.aspose.slides.internal.o9b.j5(-1, 5474),
      new com.aspose.slides.internal.o9b.j5(2, 5192),
      new com.aspose.slides.internal.o9b.j5(6, 4918),
      new com.aspose.slides.internal.o9b.j5(43, 4641),
      new com.aspose.slides.internal.o9b.j5(101, 4370),
      new com.aspose.slides.internal.o9b.j5(159, 4103),
      new com.aspose.slides.internal.o9b.j5(245, 3837),
      new com.aspose.slides.internal.o9b.j5(353, 3582),
      new com.aspose.slides.internal.o9b.j5(460, 3326),
      new com.aspose.slides.internal.o9b.j5(591, 3077),
      new com.aspose.slides.internal.o9b.j5(741, 2839),
      new com.aspose.slides.internal.o9b.j5(892, 2598),
      new com.aspose.slides.internal.o9b.j5(1066, 2369),
      new com.aspose.slides.internal.o9b.j5(1253, 2155),
      new com.aspose.slides.internal.o9b.j5(1443, 1938),
      new com.aspose.slides.internal.o9b.j5(1651, 1732),
      new com.aspose.slides.internal.o9b.j5(1874, 1543),
      new com.aspose.slides.internal.o9b.j5(2097, 1351),
      new com.aspose.slides.internal.o9b.j5(2337, 1174),
      new com.aspose.slides.internal.o9b.j5(2587, 1014),
      new com.aspose.slides.internal.o9b.j5(2839, 854),
      new com.aspose.slides.internal.o9b.j5(3106, 708),
      new com.aspose.slides.internal.o9b.j5(3380, 584),
      new com.aspose.slides.internal.o9b.j5(3656, 459),
      new com.aspose.slides.internal.o9b.j5(3945, 350),
      new com.aspose.slides.internal.o9b.j5(4237, 264),
      new com.aspose.slides.internal.o9b.j5(4533, 176),
      new com.aspose.slides.internal.o9b.j5(4838, 108),
      new com.aspose.slides.internal.o9b.j5(5144, 66),
      new com.aspose.slides.internal.o9b.j5(5454, 22),
      new com.aspose.slides.internal.o9b.j5(5771, 1),
      new com.aspose.slides.internal.o9b.j5(6086, 3),
      new com.aspose.slides.internal.o9b.j5(6407, 7),
      new com.aspose.slides.internal.o9b.j5(6731, 35),
      new com.aspose.slides.internal.o9b.j5(7048, 89),
      new com.aspose.slides.internal.o9b.j5(7374, 144),
      new com.aspose.slides.internal.o9b.j5(7700, 226),
      new com.aspose.slides.internal.o9b.j5(8015, 335),
      new com.aspose.slides.internal.o9b.j5(8344, 447),
      new com.aspose.slides.internal.o9b.j5(8667, 590),
      new com.aspose.slides.internal.o9b.j5(8972, 756),
      new com.aspose.slides.internal.o9b.j5(9297, 932),
      new com.aspose.slides.internal.o9b.j5(9613, 1135),
      new com.aspose.slides.internal.o9b.j5(9907, 1363),
      new com.aspose.slides.internal.o9b.j5(10224, 1609),
      new com.aspose.slides.internal.o9b.j5(10504, 1900),
      new com.aspose.slides.internal.o9b.j5(10802, 2169),
      new com.aspose.slides.internal.o9b.j5(11697, 1363),
      new com.aspose.slides.internal.o9b.j5(11971, 1116),
      new com.aspose.slides.internal.o9b.j5(12304, 934),
      new com.aspose.slides.internal.o9b.j5(12630, 756),
      new com.aspose.slides.internal.o9b.j5(12935, 590),
      new com.aspose.slides.internal.o9b.j5(13528, 450),
      new com.aspose.slides.internal.o9b.j5(13589, 335),
      new com.aspose.slides.internal.o9b.j5(13901, 226),
      new com.aspose.slides.internal.o9b.j5(14227, 144),
      new com.aspose.slides.internal.o9b.j5(14556, 89),
      new com.aspose.slides.internal.o9b.j5(14872, 35),
      new com.aspose.slides.internal.o9b.j5(15195, 7),
      new com.aspose.slides.internal.o9b.j5(15517, 3),
      new com.aspose.slides.internal.o9b.j5(15830, 0),
      new com.aspose.slides.internal.o9b.j5(16147, 22),
      new com.aspose.slides.internal.o9b.j5(16458, 66),
      new com.aspose.slides.internal.o9b.j5(16764, 109),
      new com.aspose.slides.internal.o9b.j5(17068, 177),
      new com.aspose.slides.internal.o9b.j5(17365, 264),
      new com.aspose.slides.internal.o9b.j5(17658, 349),
      new com.aspose.slides.internal.o9b.j5(17946, 458),
      new com.aspose.slides.internal.o9b.j5(18222, 584),
      new com.aspose.slides.internal.o9b.j5(18496, 708),
      new com.aspose.slides.internal.o9b.j5(18762, 854),
      new com.aspose.slides.internal.o9b.j5(19015, 1014),
      new com.aspose.slides.internal.o9b.j5(19264, 1172),
      new com.aspose.slides.internal.o9b.j5(19504, 1349),
      new com.aspose.slides.internal.o9b.j5(19730, 1543),
      new com.aspose.slides.internal.o9b.j5(19950, 1731),
      new com.aspose.slides.internal.o9b.j5(20158, 1937),
      new com.aspose.slides.internal.o9b.j5(20350, 2155),
      new com.aspose.slides.internal.o9b.j5(20536, 2369),
      new com.aspose.slides.internal.o9b.j5(20710, 2598),
      new com.aspose.slides.internal.o9b.j5(20861, 2839),
      new com.aspose.slides.internal.o9b.j5(21010, 3074),
      new com.aspose.slides.internal.o9b.j5(21143, 3323),
      new com.aspose.slides.internal.o9b.j5(21251, 3582),
      new com.aspose.slides.internal.o9b.j5(21357, 3835),
      new com.aspose.slides.internal.o9b.j5(21443, 4099),
      new com.aspose.slides.internal.o9b.j5(21502, 4370),
      new com.aspose.slides.internal.o9b.j5(21561, 4639),
      new com.aspose.slides.internal.o9b.j5(21595, 4916),
      new com.aspose.slides.internal.o9b.j5(21600, 5192),
      new com.aspose.slides.internal.o9b.j5(21606, 5474),
      new com.aspose.slides.internal.o9b.j5(21584, 5760),
      new com.aspose.slides.internal.o9b.j5(21532, 6036),
      new com.aspose.slides.internal.o9b.j5(21478, 6326),
      new com.aspose.slides.internal.o9b.j5(21366, 6603),
      new com.aspose.slides.internal.o9b.j5(21282, 6887),
      new com.aspose.slides.internal.o9b.j5(10802, 21602)
   };
   private static final int[] f3l = new int[]{2, 8208, 1, 8208, 1, 24576, 32772};
   private static final AutoShapeImpBase$l6[] p2i = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(5080, 2540), new com.aspose.slides.internal.o9b.j5(16520, 13550))
   };
   private static final com.aspose.slides.internal.o9b.j5[] c9t = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 2180),
      new com.aspose.slides.internal.o9b.j5(3090, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(18490, 10800)
   };
   private static final int[] m4d = new int[]{-9, 0, 21606, 21602};
   private static final AutoShapeImp g3y = new AutoShapeImp(r7n, f3l, null, null, p2i, 21615, 21602, c9t);
   private static final com.aspose.slides.internal.o9b.j5[] d2a = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(8458, 0),
      new com.aspose.slides.internal.o9b.j5(0, 3923),
      new com.aspose.slides.internal.o9b.j5(7564, 8416),
      new com.aspose.slides.internal.o9b.j5(4993, 9720),
      new com.aspose.slides.internal.o9b.j5(12197, 13904),
      new com.aspose.slides.internal.o9b.j5(9987, 14934),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(14768, 12911),
      new com.aspose.slides.internal.o9b.j5(16558, 12016),
      new com.aspose.slides.internal.o9b.j5(11030, 6840),
      new com.aspose.slides.internal.o9b.j5(12831, 6120),
      new com.aspose.slides.internal.o9b.j5(8458, 0)
   };
   private static final int[] r6a = new int[]{16384, 11, 24576, 32768};
   private static final AutoShapeImpBase$l6[] c5q = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(8680, 7410), new com.aspose.slides.internal.o9b.j5(13970, 14190))
   };
   private static final com.aspose.slides.internal.o9b.j5[] p6r = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(8458, 0),
      new com.aspose.slides.internal.o9b.j5(0, 3923),
      new com.aspose.slides.internal.o9b.j5(4993, 9720),
      new com.aspose.slides.internal.o9b.j5(9987, 14934),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(16558, 12016),
      new com.aspose.slides.internal.o9b.j5(12831, 6120)
   };
   private static final int[] e8p = new int[]{2, 2, 3, 3, 4, 1, 1};
   private static final AutoShapeImp e4w = new AutoShapeImp(d2a, r6a, null, null, c5q, 21600, 21600, p6r, e8p);
   private static final com.aspose.slides.internal.o9b.j5[] y4k = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483639),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483633),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483629),
      new com.aspose.slides.internal.o9b.j5(-2147483628, -2147483627),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483625),
      new com.aspose.slides.internal.o9b.j5(-2147483624, -2147483623),
      new com.aspose.slides.internal.o9b.j5(-2147483622, -2147483621),
      new com.aspose.slides.internal.o9b.j5(-2147483620, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483618, -2147483617),
      new com.aspose.slides.internal.o9b.j5(-2147483616, -2147483615),
      new com.aspose.slides.internal.o9b.j5(-2147483614, -2147483613),
      new com.aspose.slides.internal.o9b.j5(-2147483612, -2147483611),
      new com.aspose.slides.internal.o9b.j5(-2147483610, -2147483609),
      new com.aspose.slides.internal.o9b.j5(-2147483608, -2147483607),
      new com.aspose.slides.internal.o9b.j5(-2147483606, -2147483605),
      new com.aspose.slides.internal.o9b.j5(-2147483604, -2147483603),
      new com.aspose.slides.internal.o9b.j5(-2147483602, -2147483601),
      new com.aspose.slides.internal.o9b.j5(-2147483600, -2147483599),
      new com.aspose.slides.internal.o9b.j5(-2147483598, -2147483597),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483647)
   };
   private static final int[] h6l = new int[]{
      2,
      24576,
      32768,
      2,
      24576,
      32768,
      2,
      24576,
      32768,
      2,
      24576,
      32768,
      2,
      24576,
      32768,
      2,
      24576,
      32768,
      2,
      24576,
      32768,
      2,
      24576,
      32768,
      41730,
      24576,
      32768
   };
   private static final AutoShapeImpBase$n5[] q4d = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)2700),
      new AutoShapeImpBase$n5(8193, (short)1026, (short)5080, (short)7425),
      new AutoShapeImpBase$n5(8192, (short)1027, (short)2540, (short)0),
      new AutoShapeImpBase$n5(32768, (short)10125, (short)0, (short)327),
      new AutoShapeImpBase$n5(8193, (short)1029, (short)2120, (short)7425),
      new AutoShapeImpBase$n5(8192, (short)1030, (short)210, (short)0),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1031, (short)0),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1031),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1032, (short)450),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1032, (short)450),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1033, (short)450),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1033, (short)450),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1032, (short)900),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1032, (short)900),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1033, (short)900),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1033, (short)900),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1032, (short)1350),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1032, (short)1350),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1033, (short)1350),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1033, (short)1350),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1032, (short)1800),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1032, (short)1800),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1033, (short)1800),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1033, (short)1800),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1032, (short)2250),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1032, (short)2250),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1033, (short)2250),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1033, (short)2250),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1032, (short)2700),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1032, (short)2700),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1033, (short)2700),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1033, (short)2700),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1032, (short)3150),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1032, (short)3150),
      new AutoShapeImpBase$n5(24705, (short)1028, (short)1033, (short)3150),
      new AutoShapeImpBase$n5(24706, (short)1028, (short)1033, (short)3150),
      new AutoShapeImpBase$n5(8321, (short)327, (short)10800, (short)450),
      new AutoShapeImpBase$n5(8321, (short)327, (short)10800, (short)2250)
   };
   private static final AutoShapeImpBase$l6[] q9u = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483596, -2147483596), new com.aspose.slides.internal.o9b.j5(-2147483595, -2147483595))
   };
   private static final AutoShapeImp y5s = new AutoShapeImp(y4k, h6l, q4d, t2, q9u, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] b9y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483644),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 5080),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 10800),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 16520),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483643),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(9740, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 16730),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(0, 4870),
      new com.aspose.slides.internal.o9b.j5(9740, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0)
   };
   private static final int[] d9m = new int[]{8196, 24576, 32768};
   private static final AutoShapeImpBase$n5[] g9t = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)1, (short)2),
      new AutoShapeImpBase$n5(24576, (short)1026, (short)327, (short)0),
      new AutoShapeImpBase$n5(8193, (short)327, (short)1794, (short)10000),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1028),
      new AutoShapeImpBase$n5(8193, (short)327, (short)4000, (short)18900),
      new AutoShapeImpBase$n5(32897, (short)0, (short)10800, (short)1030),
      new AutoShapeImpBase$n5(32898, (short)0, (short)10800, (short)1030),
      new AutoShapeImpBase$n5(24576, (short)1031, (short)1031, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1032)
   };
   private static final AutoShapeImpBase$l6[] e2l = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(
         new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483640), new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483638)
      )
   };
   private static final com.aspose.slides.internal.o9b.j5[] v2x = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 10800)
   };
   private static final int[] y9r = new int[]{2, 3, 4, 1};
   private static final AutoShapeImp u7c = new AutoShapeImp(b9y, d9m, g9t, x8, e2l, 21600, 21600, v2x, y9r);
   private static final com.aspose.slides.internal.o9b.j5[] x2y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(0, -2147483647),
      new com.aspose.slides.internal.o9b.j5(0, -2147483646),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483645, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483646),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483645, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(0, -2147483647),
      new com.aspose.slides.internal.o9b.j5(0, -2147483646),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483645, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483646),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483645, 0)
   };
   private static final int[] x5h = new int[]{42753, 1, 43009, 1, 42753, 1, 43009, 1, 24576, 33044, 42753, 1, 43009, 32768, 42753, 1, 43009, 32768};
   private static final AutoShapeImpBase$n5[] s0i = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(24576, (short)320, (short)327, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)327, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)327),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)327),
      new AutoShapeImpBase$n5(8322, (short)327, (short)0, (short)450),
      new AutoShapeImpBase$n5(8192, (short)1028, (short)0, (short)10800),
      new AutoShapeImpBase$n5(32768, (short)0, (short)0, (short)327),
      new AutoShapeImpBase$n5(40960, (short)1030, (short)0, (short)1029),
      new AutoShapeImpBase$n5(40960, (short)320, (short)0, (short)1031),
      new AutoShapeImpBase$n5(40960, (short)321, (short)0, (short)1031),
      new AutoShapeImpBase$n5(24576, (short)322, (short)1031, (short)0),
      new AutoShapeImpBase$n5(24576, (short)323, (short)1031, (short)0),
      new AutoShapeImpBase$n5(40960, (short)320, (short)0, (short)1029),
      new AutoShapeImpBase$n5(40960, (short)321, (short)0, (short)1029),
      new AutoShapeImpBase$n5(24576, (short)322, (short)1029, (short)0),
      new AutoShapeImpBase$n5(24576, (short)323, (short)1029, (short)0)
   };
   private static final AutoShapeImpBase$l6[] l4o = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483639), new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483637))
   };
   private static final AutoShapeImp a2w = new AutoShapeImp(x2y, x5h, s0i, h0, l4o, 21600, 21600, e2);
   private static final int[] w3k = new int[]{43009, 1, 42753, 1, 43009, 1, 42753, 24576, 32772};
   private static final AutoShapeImpBase$l6[] b1r = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483635), new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483633))
   };
   private static final AutoShapeImp y2o = new AutoShapeImp(x2y, w3k, s0i, h0, b1r, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] r2n = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483644, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483642),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483641),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483640, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483641),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483640, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483642),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483641),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483640, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483641),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483640, 0)
   };
   private static final int[] s7k = new int[]{
      42753,
      1,
      43009,
      42753,
      1,
      43009,
      1,
      42753,
      1,
      43009,
      42753,
      1,
      43009,
      1,
      24576,
      32784,
      42753,
      1,
      43009,
      42753,
      1,
      43009,
      32768,
      42753,
      1,
      43009,
      42753,
      1,
      43009,
      32768
   };
   private static final AutoShapeImpBase$n5[] d7u = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(24576, (short)320, (short)327, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)327, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)327),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)327),
      new AutoShapeImpBase$n5(8193, (short)1024, (short)2, (short)1),
      new AutoShapeImpBase$n5(8193, (short)327, (short)2, (short)1),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)327),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1030),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1029),
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)3),
      new AutoShapeImpBase$n5(24576, (short)1033, (short)327, (short)0),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1034, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1033, (short)0),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1034),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1033)
   };
   private static final AutoShapeImpBase$l6[] j3b = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483636), new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483634))
   };
   private static final AutoShapeImp o9i = new AutoShapeImp(r2n, s7k, d7u, u3, j3b, 21600, 21600, e2);
   private static final AutoShapeImpBase$n5[] a1k = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)2),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(8192, (short)1024, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024)
   };
   private static final int[] k5w = new int[]{8193, 1, 8193, 1, 24576, 32788, 8193, 1, 8193, 32768};
   private static final com.aspose.slides.internal.o9b.j5[] k4o = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, -2147483645),
      new com.aspose.slides.internal.o9b.j5(0, -2147483647),
      new com.aspose.slides.internal.o9b.j5(0, -2147483646),
      new com.aspose.slides.internal.o9b.j5(0, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, -2147483645),
      new com.aspose.slides.internal.o9b.j5(0, -2147483647),
      new com.aspose.slides.internal.o9b.j5(0, -2147483646),
      new com.aspose.slides.internal.o9b.j5(0, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final AutoShapeImpBase$l6[] v4m = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(6350, -2147483645), new com.aspose.slides.internal.o9b.j5(21600, -2147483644))
   };
   private static final com.aspose.slides.internal.o9b.j5[] j3z = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(21600, 0), new com.aspose.slides.internal.o9b.j5(0, 10800), new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final AutoShapeImp f4l = new AutoShapeImp(k4o, k5w, a1k, u3, v4m, 21600, 21600, j3z);
   private static final com.aspose.slides.internal.o9b.j5[] s5r = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483645),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483646),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483645),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483646),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600)
   };
   private static final AutoShapeImpBase$l6[] g5d = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, -2147483645), new com.aspose.slides.internal.o9b.j5(15150, -2147483644))
   };
   private static final com.aspose.slides.internal.o9b.j5[] u0b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(0, 21600), new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp c4i = new AutoShapeImp(s5r, k5w, a1k, u3, g5d, 21600, 21600, u0b);
   private static final AutoShapeImpBase$n5[] m2n = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)2),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(40960, (short)1028, (short)0, (short)327),
      new AutoShapeImpBase$n5(40960, (short)1028, (short)0, (short)1024),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1028, (short)1024, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1028, (short)327, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024),
      new AutoShapeImpBase$n5(8193, (short)327, (short)10000, (short)31953),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1033)
   };
   private static final int[] e2o = new int[]{8193, 1, 8194, 1, 8193, 1, 24576, 32784, 8193, 1, 8194, 1, 8193, 32768};
   private static final int[] m0l = new int[]{1800, 10800};
   private static final com.aspose.slides.internal.o9b.j5[] a1g = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(16200, 0),
      new com.aspose.slides.internal.o9b.j5(10800, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483647),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483645),
      new com.aspose.slides.internal.o9b.j5(5400, -2147483644),
      new com.aspose.slides.internal.o9b.j5(0, -2147483644),
      new com.aspose.slides.internal.o9b.j5(5400, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483643),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483641),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483640),
      new com.aspose.slides.internal.o9b.j5(16200, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(16200, 0),
      new com.aspose.slides.internal.o9b.j5(10800, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483647),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483645),
      new com.aspose.slides.internal.o9b.j5(5400, -2147483644),
      new com.aspose.slides.internal.o9b.j5(0, -2147483644),
      new com.aspose.slides.internal.o9b.j5(5400, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483643),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483641),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483640),
      new com.aspose.slides.internal.o9b.j5(16200, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final AutoShapeImpBase$l6[] q5v = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(13800, -2147483639), new com.aspose.slides.internal.o9b.j5(21600, -2147483638))
   };
   private static final AutoShapeImp t1h = new AutoShapeImp(a1g, e2o, m2n, m0l, q5v, 21600, 21600, j3z);
   private static final com.aspose.slides.internal.o9b.j5[] i8n = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(5400, 0),
      new com.aspose.slides.internal.o9b.j5(10800, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483647),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483645),
      new com.aspose.slides.internal.o9b.j5(16200, -2147483644),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483644),
      new com.aspose.slides.internal.o9b.j5(16200, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483643),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483641),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483640),
      new com.aspose.slides.internal.o9b.j5(5400, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(5400, 0),
      new com.aspose.slides.internal.o9b.j5(10800, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483647),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483646),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483645),
      new com.aspose.slides.internal.o9b.j5(16200, -2147483644),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483644),
      new com.aspose.slides.internal.o9b.j5(16200, -2147483644),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483643),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483641),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483640),
      new com.aspose.slides.internal.o9b.j5(5400, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600)
   };
   private static final AutoShapeImpBase$l6[] k0y = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, -2147483639), new com.aspose.slides.internal.o9b.j5(7800, -2147483638))
   };
   private static final AutoShapeImp v7o = new AutoShapeImp(i8n, e2o, m2n, m0l, k0y, 21600, 21600, u0b);
   private static final com.aspose.slides.internal.o9b.j5[] x5e = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10901, 5905),
      new com.aspose.slides.internal.o9b.j5(8458, 2399),
      new com.aspose.slides.internal.o9b.j5(7417, 6425),
      new com.aspose.slides.internal.o9b.j5(476, 2399),
      new com.aspose.slides.internal.o9b.j5(4732, 7722),
      new com.aspose.slides.internal.o9b.j5(106, 8718),
      new com.aspose.slides.internal.o9b.j5(3828, 11880),
      new com.aspose.slides.internal.o9b.j5(243, 14689),
      new com.aspose.slides.internal.o9b.j5(5772, 14041),
      new com.aspose.slides.internal.o9b.j5(4868, 17719),
      new com.aspose.slides.internal.o9b.j5(7819, 15730),
      new com.aspose.slides.internal.o9b.j5(8590, 21600),
      new com.aspose.slides.internal.o9b.j5(10637, 15038),
      new com.aspose.slides.internal.o9b.j5(13349, 19840),
      new com.aspose.slides.internal.o9b.j5(14125, 14561),
      new com.aspose.slides.internal.o9b.j5(18248, 18195),
      new com.aspose.slides.internal.o9b.j5(16938, 13044),
      new com.aspose.slides.internal.o9b.j5(21600, 13393),
      new com.aspose.slides.internal.o9b.j5(17710, 10579),
      new com.aspose.slides.internal.o9b.j5(21198, 8242),
      new com.aspose.slides.internal.o9b.j5(16806, 7417),
      new com.aspose.slides.internal.o9b.j5(18482, 4560),
      new com.aspose.slides.internal.o9b.j5(14257, 5429),
      new com.aspose.slides.internal.o9b.j5(14623, 106),
      new com.aspose.slides.internal.o9b.j5(10901, 5905)
   };
   private static final int[] r1x = new int[]{24, 24576, 32772};
   private static final AutoShapeImpBase$l6[] y4u = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(4627, 6320), new com.aspose.slides.internal.o9b.j5(16702, 13937))
   };
   private static final com.aspose.slides.internal.o9b.j5[] f9d = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(14623, 106),
      new com.aspose.slides.internal.o9b.j5(106, 8718),
      new com.aspose.slides.internal.o9b.j5(8590, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 13393)
   };
   private static final AutoShapeImp g3j = new AutoShapeImp(x5e, r1x, null, null, y4u, 21600, 21600, f9d);
   private static final com.aspose.slides.internal.o9b.j5[] z3b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(11464, 4340),
      new com.aspose.slides.internal.o9b.j5(9722, 1887),
      new com.aspose.slides.internal.o9b.j5(8548, 6383),
      new com.aspose.slides.internal.o9b.j5(4503, 3626),
      new com.aspose.slides.internal.o9b.j5(5373, 7816),
      new com.aspose.slides.internal.o9b.j5(1174, 8270),
      new com.aspose.slides.internal.o9b.j5(3934, 11592),
      new com.aspose.slides.internal.o9b.j5(0, 12875),
      new com.aspose.slides.internal.o9b.j5(3329, 15372),
      new com.aspose.slides.internal.o9b.j5(1283, 17824),
      new com.aspose.slides.internal.o9b.j5(4804, 18239),
      new com.aspose.slides.internal.o9b.j5(4918, 21600),
      new com.aspose.slides.internal.o9b.j5(7525, 18125),
      new com.aspose.slides.internal.o9b.j5(8698, 19712),
      new com.aspose.slides.internal.o9b.j5(9871, 17371),
      new com.aspose.slides.internal.o9b.j5(11614, 18844),
      new com.aspose.slides.internal.o9b.j5(12178, 15937),
      new com.aspose.slides.internal.o9b.j5(14943, 17371),
      new com.aspose.slides.internal.o9b.j5(14640, 14348),
      new com.aspose.slides.internal.o9b.j5(18878, 15632),
      new com.aspose.slides.internal.o9b.j5(16382, 12311),
      new com.aspose.slides.internal.o9b.j5(18270, 11292),
      new com.aspose.slides.internal.o9b.j5(16986, 9404),
      new com.aspose.slides.internal.o9b.j5(21600, 6646),
      new com.aspose.slides.internal.o9b.j5(16382, 6533),
      new com.aspose.slides.internal.o9b.j5(18005, 3172),
      new com.aspose.slides.internal.o9b.j5(14524, 5778),
      new com.aspose.slides.internal.o9b.j5(14789, 0),
      new com.aspose.slides.internal.o9b.j5(11464, 4340)
   };
   private static final int[] r1q = new int[]{28, 24576, 32772};
   private static final AutoShapeImpBase$l6[] h6t = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(5372, 6382), new com.aspose.slides.internal.o9b.j5(14640, 15935))
   };
   private static final com.aspose.slides.internal.o9b.j5[] d0c = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(9722, 1887),
      new com.aspose.slides.internal.o9b.j5(0, 12875),
      new com.aspose.slides.internal.o9b.j5(11614, 18844),
      new com.aspose.slides.internal.o9b.j5(21600, 6646)
   };
   private static final AutoShapeImp b7s = new AutoShapeImp(z3b, r1q, null, null, h6t, 21600, 21600, d0c);
   private static final com.aspose.slides.internal.o9b.j5[] n5p = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483647, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483647),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(0, 10800)
   };
   private static final int[] a2p = new int[]{8, 24576, 32772};
   private static final AutoShapeImpBase$n5[] l4w = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1026),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1026, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1027, (short)19601, (short)27720),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)327)
   };
   private static final AutoShapeImpBase$l6[] l3e = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483644), new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483645))
   };
   private static final AutoShapeImp j8o = new AutoShapeImp(n5p, a2p, l4w, s7, l3e, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] e8b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10797, 0),
      new com.aspose.slides.internal.o9b.j5(8278, 8256),
      new com.aspose.slides.internal.o9b.j5(0, 8256),
      new com.aspose.slides.internal.o9b.j5(6722, 13405),
      new com.aspose.slides.internal.o9b.j5(4198, 21600),
      new com.aspose.slides.internal.o9b.j5(10797, 16580),
      new com.aspose.slides.internal.o9b.j5(17401, 21600),
      new com.aspose.slides.internal.o9b.j5(14878, 13405),
      new com.aspose.slides.internal.o9b.j5(21600, 8256),
      new com.aspose.slides.internal.o9b.j5(13321, 8256),
      new com.aspose.slides.internal.o9b.j5(10797, 0)
   };
   private static final int[] q6r = new int[]{10, 24576, 32772};
   private static final AutoShapeImpBase$l6[] o7b = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(6722, 8256), new com.aspose.slides.internal.o9b.j5(14878, 15460))
   };
   private static final com.aspose.slides.internal.o9b.j5[] z8m = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 8256),
      new com.aspose.slides.internal.o9b.j5(4198, 21600),
      new com.aspose.slides.internal.o9b.j5(17401, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 8256)
   };
   private static final AutoShapeImp t7p = new AutoShapeImp(e8b, q6r, null, null, o7b, 21600, 21600, z8m);
   private static final AutoShapeImpBase$n5[] u2w = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)0),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)0),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)75),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)75),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)150),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)150),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)225),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)225),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)300),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)300),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)375),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)375),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)525),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)525),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)600),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)600),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)675),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)675),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)750),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)750),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)825),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)825),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)975),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)975),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1050),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1050),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1125),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1125),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1200),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1200),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1275),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1275),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1425),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1425),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1500),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1500),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1575),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1575),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1650),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1650),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1725),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1725),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1875),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1875),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1950),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1950),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2025),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2025),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2100),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2100),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2175),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2175),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2325),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2325),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2400),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2400),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2475),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2475),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2550),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2550),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2625),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2625),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2775),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2775),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2850),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2850),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2925),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2925),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3000),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3000),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3075),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3075),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3225),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3225),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3300),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3300),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3375),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3375),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3450),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3450),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3525),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3525)
   };
   private static final com.aspose.slides.internal.o9b.j5[] o2b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483636),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483619, -2147483618),
      new com.aspose.slides.internal.o9b.j5(-2147483613, -2147483612),
      new com.aspose.slides.internal.o9b.j5(-2147483607, -2147483606),
      new com.aspose.slides.internal.o9b.j5(-2147483601, -2147483600),
      new com.aspose.slides.internal.o9b.j5(-2147483595, -2147483594),
      new com.aspose.slides.internal.o9b.j5(-2147483589, -2147483588),
      new com.aspose.slides.internal.o9b.j5(-2147483583, -2147483582),
      new com.aspose.slides.internal.o9b.j5(-2147483577, -2147483576),
      new com.aspose.slides.internal.o9b.j5(-2147483571, -2147483570),
      new com.aspose.slides.internal.o9b.j5(-2147483565, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483559, -2147483558),
      new com.aspose.slides.internal.o9b.j5(-2147483553, -2147483552),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642)
   };
   private static final int[] q4o = new int[]{16, 24576, 32772};
   private static final AutoShapeImpBase$l6[] k0b = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646), new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483644))
   };
   private static final AutoShapeImp t2d = new AutoShapeImp(o2b, q4o, u2w, a6, k0b, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] h9s = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483636),
      new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483632),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483623, -2147483622),
      new com.aspose.slides.internal.o9b.j5(-2147483621, -2147483620),
      new com.aspose.slides.internal.o9b.j5(-2147483619, -2147483618),
      new com.aspose.slides.internal.o9b.j5(-2147483617, -2147483616),
      new com.aspose.slides.internal.o9b.j5(-2147483615, -2147483614),
      new com.aspose.slides.internal.o9b.j5(-2147483613, -2147483612),
      new com.aspose.slides.internal.o9b.j5(-2147483611, -2147483610),
      new com.aspose.slides.internal.o9b.j5(-2147483609, -2147483608),
      new com.aspose.slides.internal.o9b.j5(-2147483607, -2147483606),
      new com.aspose.slides.internal.o9b.j5(-2147483605, -2147483604),
      new com.aspose.slides.internal.o9b.j5(-2147483603, -2147483602),
      new com.aspose.slides.internal.o9b.j5(-2147483601, -2147483600),
      new com.aspose.slides.internal.o9b.j5(-2147483599, -2147483598),
      new com.aspose.slides.internal.o9b.j5(-2147483597, -2147483596),
      new com.aspose.slides.internal.o9b.j5(-2147483595, -2147483594),
      new com.aspose.slides.internal.o9b.j5(-2147483593, -2147483592),
      new com.aspose.slides.internal.o9b.j5(-2147483591, -2147483590),
      new com.aspose.slides.internal.o9b.j5(-2147483589, -2147483588),
      new com.aspose.slides.internal.o9b.j5(-2147483587, -2147483586),
      new com.aspose.slides.internal.o9b.j5(-2147483585, -2147483584),
      new com.aspose.slides.internal.o9b.j5(-2147483583, -2147483582),
      new com.aspose.slides.internal.o9b.j5(-2147483581, -2147483580),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642)
   };
   private static final int[] r2q = new int[]{32, 24576, 32772};
   private static final AutoShapeImpBase$n5[] t3h = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)0),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)0),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)113),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)113),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)225),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)225),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)338),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)338),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)563),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)563),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)675),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)675),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)788),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)788),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1013),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1013),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1125),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1125),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1238),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1238),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1463),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1463),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1575),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1575),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1688),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1688),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1913),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1913),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2025),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2025),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2138),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2138),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2363),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2363),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2475),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2475),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2588),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2588),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2813),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2813),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2925),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2925),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3038),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3038),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3263),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3263),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3375),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3375),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3488),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3488)
   };
   private static final AutoShapeImp t6g = new AutoShapeImp(h9s, r2q, t3h, a6, k0b, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] o9n = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483636),
      new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483632),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483623, -2147483622),
      new com.aspose.slides.internal.o9b.j5(-2147483621, -2147483620),
      new com.aspose.slides.internal.o9b.j5(-2147483619, -2147483618),
      new com.aspose.slides.internal.o9b.j5(-2147483617, -2147483616),
      new com.aspose.slides.internal.o9b.j5(-2147483615, -2147483614),
      new com.aspose.slides.internal.o9b.j5(-2147483613, -2147483612),
      new com.aspose.slides.internal.o9b.j5(-2147483611, -2147483610),
      new com.aspose.slides.internal.o9b.j5(-2147483609, -2147483608),
      new com.aspose.slides.internal.o9b.j5(-2147483607, -2147483606),
      new com.aspose.slides.internal.o9b.j5(-2147483605, -2147483604),
      new com.aspose.slides.internal.o9b.j5(-2147483603, -2147483602),
      new com.aspose.slides.internal.o9b.j5(-2147483601, -2147483600),
      new com.aspose.slides.internal.o9b.j5(-2147483599, -2147483598),
      new com.aspose.slides.internal.o9b.j5(-2147483597, -2147483596),
      new com.aspose.slides.internal.o9b.j5(-2147483595, -2147483594),
      new com.aspose.slides.internal.o9b.j5(-2147483593, -2147483592),
      new com.aspose.slides.internal.o9b.j5(-2147483591, -2147483590),
      new com.aspose.slides.internal.o9b.j5(-2147483589, -2147483588),
      new com.aspose.slides.internal.o9b.j5(-2147483587, -2147483586),
      new com.aspose.slides.internal.o9b.j5(-2147483585, -2147483584),
      new com.aspose.slides.internal.o9b.j5(-2147483583, -2147483582),
      new com.aspose.slides.internal.o9b.j5(-2147483581, -2147483580),
      new com.aspose.slides.internal.o9b.j5(-2147483579, -2147483578),
      new com.aspose.slides.internal.o9b.j5(-2147483577, -2147483576),
      new com.aspose.slides.internal.o9b.j5(-2147483575, -2147483574),
      new com.aspose.slides.internal.o9b.j5(-2147483573, -2147483572),
      new com.aspose.slides.internal.o9b.j5(-2147483571, -2147483570),
      new com.aspose.slides.internal.o9b.j5(-2147483569, -2147483568),
      new com.aspose.slides.internal.o9b.j5(-2147483567, -2147483566),
      new com.aspose.slides.internal.o9b.j5(-2147483565, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483563, -2147483562),
      new com.aspose.slides.internal.o9b.j5(-2147483561, -2147483560),
      new com.aspose.slides.internal.o9b.j5(-2147483559, -2147483558),
      new com.aspose.slides.internal.o9b.j5(-2147483557, -2147483556),
      new com.aspose.slides.internal.o9b.j5(-2147483555, -2147483554),
      new com.aspose.slides.internal.o9b.j5(-2147483553, -2147483552),
      new com.aspose.slides.internal.o9b.j5(-2147483551, -2147483550),
      new com.aspose.slides.internal.o9b.j5(-2147483549, -2147483548),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642)
   };
   private static final int[] y7w = new int[]{48, 24576, 32772};
   private static final AutoShapeImp d3v = new AutoShapeImp(o9n, y7w, u2w, a6, k0b, 21600, 21600, e2);
   private static final AutoShapeImpBase$n5[] e0w = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)0),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)0),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)56),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)56),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)113),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)113),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)169),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)169),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)225),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)225),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)281),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)281),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)338),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)338),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)394),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)394),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)450),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)506),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)506),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)563),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)563),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)619),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)619),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)675),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)675),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)731),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)731),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)788),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)788),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)843),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)843),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)900),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)956),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)956),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1013),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1013),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1069),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1069),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1125),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1125),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1181),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1181),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1238),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1238),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1294),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1294),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1350),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1406),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1406),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1462),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1462),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1519),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1519),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1575),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1575),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1631),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1631),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1688),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1688),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1744),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1744),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1800),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1856),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1856),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)1913),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)1913),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)1969),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)1969),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2025),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2025),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2081),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2081),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2138),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2138),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2194),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2194),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2250),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2306),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2306),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2362),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2362),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2418),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2418),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2475),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2475),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2531),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2531),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2587),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2587),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2643),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2643),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2700),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2756),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2756),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2812),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2812),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2868),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2868),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)2925),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)2925),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)2981),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)2981),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3037),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3037),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3093),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3093),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3150),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3206),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3206),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3262),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3262),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3318),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3318),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3375),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3375),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3431),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3431),
      new AutoShapeImpBase$n5(129, (short)0, (short)10800, (short)3487),
      new AutoShapeImpBase$n5(130, (short)0, (short)10800, (short)3487),
      new AutoShapeImpBase$n5(8321, (short)1024, (short)10800, (short)3543),
      new AutoShapeImpBase$n5(8322, (short)1024, (short)10800, (short)3543)
   };
   private static final com.aspose.slides.internal.o9b.j5[] d3c = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483636),
      new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483632),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483623, -2147483622),
      new com.aspose.slides.internal.o9b.j5(-2147483621, -2147483620),
      new com.aspose.slides.internal.o9b.j5(-2147483619, -2147483618),
      new com.aspose.slides.internal.o9b.j5(-2147483617, -2147483616),
      new com.aspose.slides.internal.o9b.j5(-2147483615, -2147483614),
      new com.aspose.slides.internal.o9b.j5(-2147483613, -2147483612),
      new com.aspose.slides.internal.o9b.j5(-2147483611, -2147483610),
      new com.aspose.slides.internal.o9b.j5(-2147483609, -2147483608),
      new com.aspose.slides.internal.o9b.j5(-2147483607, -2147483606),
      new com.aspose.slides.internal.o9b.j5(-2147483605, -2147483604),
      new com.aspose.slides.internal.o9b.j5(-2147483603, -2147483602),
      new com.aspose.slides.internal.o9b.j5(-2147483601, -2147483600),
      new com.aspose.slides.internal.o9b.j5(-2147483599, -2147483598),
      new com.aspose.slides.internal.o9b.j5(-2147483597, -2147483596),
      new com.aspose.slides.internal.o9b.j5(-2147483595, -2147483594),
      new com.aspose.slides.internal.o9b.j5(-2147483593, -2147483592),
      new com.aspose.slides.internal.o9b.j5(-2147483591, -2147483590),
      new com.aspose.slides.internal.o9b.j5(-2147483589, -2147483588),
      new com.aspose.slides.internal.o9b.j5(-2147483587, -2147483586),
      new com.aspose.slides.internal.o9b.j5(-2147483585, -2147483584),
      new com.aspose.slides.internal.o9b.j5(-2147483583, -2147483582),
      new com.aspose.slides.internal.o9b.j5(-2147483581, -2147483580),
      new com.aspose.slides.internal.o9b.j5(-2147483579, -2147483578),
      new com.aspose.slides.internal.o9b.j5(-2147483577, -2147483576),
      new com.aspose.slides.internal.o9b.j5(-2147483575, -2147483574),
      new com.aspose.slides.internal.o9b.j5(-2147483573, -2147483572),
      new com.aspose.slides.internal.o9b.j5(-2147483571, -2147483570),
      new com.aspose.slides.internal.o9b.j5(-2147483569, -2147483568),
      new com.aspose.slides.internal.o9b.j5(-2147483567, -2147483566),
      new com.aspose.slides.internal.o9b.j5(-2147483565, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483563, -2147483562),
      new com.aspose.slides.internal.o9b.j5(-2147483561, -2147483560),
      new com.aspose.slides.internal.o9b.j5(-2147483559, -2147483558),
      new com.aspose.slides.internal.o9b.j5(-2147483557, -2147483556),
      new com.aspose.slides.internal.o9b.j5(-2147483555, -2147483554),
      new com.aspose.slides.internal.o9b.j5(-2147483553, -2147483552),
      new com.aspose.slides.internal.o9b.j5(-2147483551, -2147483550),
      new com.aspose.slides.internal.o9b.j5(-2147483549, -2147483548),
      new com.aspose.slides.internal.o9b.j5(-2147483547, -2147483546),
      new com.aspose.slides.internal.o9b.j5(-2147483545, -2147483544),
      new com.aspose.slides.internal.o9b.j5(-2147483543, -2147483542),
      new com.aspose.slides.internal.o9b.j5(-2147483541, -2147483540),
      new com.aspose.slides.internal.o9b.j5(-2147483539, -2147483538),
      new com.aspose.slides.internal.o9b.j5(-2147483537, -2147483536),
      new com.aspose.slides.internal.o9b.j5(-2147483535, -2147483534),
      new com.aspose.slides.internal.o9b.j5(-2147483533, -2147483532),
      new com.aspose.slides.internal.o9b.j5(-2147483531, -2147483530),
      new com.aspose.slides.internal.o9b.j5(-2147483529, -2147483528),
      new com.aspose.slides.internal.o9b.j5(-2147483527, -2147483526),
      new com.aspose.slides.internal.o9b.j5(-2147483525, -2147483524),
      new com.aspose.slides.internal.o9b.j5(-2147483523, -2147483522),
      new com.aspose.slides.internal.o9b.j5(-2147483521, -2147483520),
      new com.aspose.slides.internal.o9b.j5(-2147483519, -2147483518),
      new com.aspose.slides.internal.o9b.j5(-2147483517, -2147483516),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642)
   };
   private static final int[] w2a = new int[]{64, 24576, 32772};
   private static final AutoShapeImp r6o = new AutoShapeImp(d3c, w2a, e0w, a6, k0b, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] v6s = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483633, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483632, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(2750, -2147483641),
      new com.aspose.slides.internal.o9b.j5(0, -2147483646),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483646),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483644),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483638, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483637, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483631, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483630, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483646),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483646),
      new com.aspose.slides.internal.o9b.j5(18850, -2147483641),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483628, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483627, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483625),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483624),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483622),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483623),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483621),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483625),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483628, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483622),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483623),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483621),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483647),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483623),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483623),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483646)
   };
   private static final int[] k7m = new int[]{
      1, 8193, 5, 8193, 1, 8193, 5, 8193, 1, 24576, 32768, 1, 8193, 1, 8194, 24576, 33026, 1, 8193, 1, 8194, 24576, 33026, 1, 32768, 1, 32768
   };
   private static final AutoShapeImpBase$n5[] f2i = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(8193, (short)1026, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)1027, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)1028, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)1, (short)2),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1030),
      new AutoShapeImpBase$n5(0, (short)420, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1032, (short)2, (short)1),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1032, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1033, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1024, (short)2700, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1028),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1029),
      new AutoShapeImpBase$n5(40960, (short)1036, (short)0, (short)1032),
      new AutoShapeImpBase$n5(40960, (short)1036, (short)0, (short)1033),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1035),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1034),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1040),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1039),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1036),
      new AutoShapeImpBase$n5(40960, (short)1037, (short)0, (short)1029),
      new AutoShapeImpBase$n5(24576, (short)1025, (short)1027, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1025, (short)1028, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1049, (short)1029, (short)0),
      new AutoShapeImpBase$n5(40960, (short)1049, (short)0, (short)1029)
   };
   private static final int[] e4j = new int[]{5400, 18900};
   private static final AutoShapeImpBase$l6[] n9a = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0), new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483647))
   };
   private static final com.aspose.slides.internal.o9b.j5[] i4w = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(2750, -2147483641),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483647),
      new com.aspose.slides.internal.o9b.j5(18850, -2147483641)
   };
   private static final AutoShapeImp o7p = new AutoShapeImp(v6s, k7m, f2i, e4j, n9a, 21600, 21600, i4w);
   private static final com.aspose.slides.internal.o9b.j5[] a3p = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483633, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483632, 0),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(2750, -2147483642),
      new com.aspose.slides.internal.o9b.j5(0, -2147483647),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483635),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483638, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483637, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483631, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483630, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483647),
      new com.aspose.slides.internal.o9b.j5(18850, -2147483642),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483628, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483627, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483620),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483619),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483617),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483618),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483616),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483620),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483628, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483617),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483618),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483616),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483646),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483618),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483618),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483647)
   };
   private static final com.aspose.slides.internal.o9b.j5[] q0g = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, -2147483646),
      new com.aspose.slides.internal.o9b.j5(2750, -2147483642),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(18850, -2147483642)
   };
   private static final AutoShapeImpBase$n5[] g7i = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)328),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(8193, (short)1026, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)1027, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)1028, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)1, (short)2),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1030),
      new AutoShapeImpBase$n5(0, (short)420, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1032, (short)2, (short)1),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1032, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1033, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1024, (short)2700, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1028),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1029),
      new AutoShapeImpBase$n5(40960, (short)1036, (short)0, (short)1032),
      new AutoShapeImpBase$n5(40960, (short)1036, (short)0, (short)1033),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1035),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1034),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1040),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1039),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1036),
      new AutoShapeImpBase$n5(40960, (short)1037, (short)0, (short)1029),
      new AutoShapeImpBase$n5(24576, (short)1025, (short)1027, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1025, (short)1028, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1049, (short)1029, (short)0),
      new AutoShapeImpBase$n5(40960, (short)1049, (short)0, (short)1029),
      new AutoShapeImpBase$n5(24576, (short)1028, (short)1029, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1048),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1049),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1050),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1051)
   };
   private static final int[] d3l = new int[]{5400, 2700};
   private static final AutoShapeImpBase$l6[] u7q = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483646), new com.aspose.slides.internal.o9b.j5(-2147483629, 21600))
   };
   private static final AutoShapeImp d9l = new AutoShapeImp(a3p, k7m, g7i, d3l, u7q, 21600, 21600, q0g);
   private static final com.aspose.slides.internal.o9b.j5[] w2i = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483639),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483637),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(2700, -2147483635),
      new com.aspose.slides.internal.o9b.j5(0, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(21600, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483639),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483637),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(18900, -2147483635),
      new com.aspose.slides.internal.o9b.j5(21600, Integer.MIN_VALUE),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483623),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483622, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483621, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483620, -2147483624),
      new com.aspose.slides.internal.o9b.j5(-2147483620, -2147483623),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483618, -2147483617),
      new com.aspose.slides.internal.o9b.j5(-2147483616, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483615, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483614, -2147483617),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483619),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483614, -2147483613),
      new com.aspose.slides.internal.o9b.j5(-2147483615, -2147483612),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483612),
      new com.aspose.slides.internal.o9b.j5(-2147483616, -2147483612),
      new com.aspose.slides.internal.o9b.j5(-2147483618, -2147483613),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483619)
   };
   private static final int[] d8y = new int[]{
      8193, 2, 8193, 2, 24576, 32768, 8193, 2, 8193, 2, 24576, 32768, 8193, 2, 24576, 32770, 8193, 2, 24576, 32770, 8194, 1, 8194, 1, 24576, 32768
   };
   private static final AutoShapeImpBase$n5[] q0y = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(24576, (short)329, (short)1061, (short)0),
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)3),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1063, (short)0),
      new AutoShapeImpBase$n5(8193, (short)327, (short)2, (short)3),
      new AutoShapeImpBase$n5(40960, (short)1030, (short)0, (short)1072),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1053, (short)1061, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1053, (short)328, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)2700, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1081, (short)328, (short)0),
      new AutoShapeImpBase$n5(40960, (short)1033, (short)0, (short)1082),
      new AutoShapeImpBase$n5(8192, (short)1063, (short)21600, (short)0),
      new AutoShapeImpBase$n5(57345, (short)1086, (short)1086, (short)1071),
      new AutoShapeImpBase$n5(24576, (short)1042, (short)1088, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1032),
      new AutoShapeImpBase$n5(24576, (short)1036, (short)1061, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)900, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1031, (short)1093, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)1800, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1048, (short)1100, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)2700, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1097, (short)328, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1048, (short)1061, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1043),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1045),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1047),
      new AutoShapeImpBase$n5(57345, (short)1069, (short)1069, (short)1071),
      new AutoShapeImpBase$n5(8193, (short)1091, (short)2, (short)3),
      new AutoShapeImpBase$n5(24576, (short)1053, (short)1094, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1092, (short)1, (short)3),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1056),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1054),
      new AutoShapeImpBase$n5(24576, (short)328, (short)1055, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1062),
      new AutoShapeImpBase$n5(24576, (short)328, (short)329, (short)0),
      new AutoShapeImpBase$n5(24577, (short)1064, (short)1065, (short)1),
      new AutoShapeImpBase$n5(16385, (short)10800, (short)1066, (short)1),
      new AutoShapeImpBase$n5(8192, (short)1067, (short)0, (short)1),
      new AutoShapeImpBase$n5(24577, (short)329, (short)1, (short)5400),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1068),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)1, (short)10800),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1070),
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)10800),
      new AutoShapeImpBase$n5(32769, (short)1, (short)1, (short)329),
      new AutoShapeImpBase$n5(24577, (short)1073, (short)1074, (short)1),
      new AutoShapeImpBase$n5(24577, (short)1075, (short)1066, (short)1),
      new AutoShapeImpBase$n5(40960, (short)1069, (short)0, (short)1076),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)327),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1077),
      new AutoShapeImpBase$n5(8193, (short)1027, (short)1, (short)10800),
      new AutoShapeImpBase$n5(57345, (short)1079, (short)1079, (short)1071),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1080),
      new AutoShapeImpBase$n5(8193, (short)1032, (short)1, (short)10800),
      new AutoShapeImpBase$n5(24576, (short)1078, (short)1061, (short)0),
      new AutoShapeImpBase$n5(24577, (short)1083, (short)1084, (short)1),
      new AutoShapeImpBase$n5(24577, (short)1085, (short)1066, (short)1),
      new AutoShapeImpBase$n5(40960, (short)1079, (short)0, (short)1069),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1032),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1087),
      new AutoShapeImpBase$n5(1, (short)2700, (short)1, (short)10800),
      new AutoShapeImpBase$n5(8193, (short)328, (short)1, (short)2),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1090),
      new AutoShapeImpBase$n5(8193, (short)1054, (short)1, (short)10800),
      new AutoShapeImpBase$n5(8192, (short)327, (short)5400, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)21600, (short)0),
      new AutoShapeImpBase$n5(24577, (short)1073, (short)1, (short)-12),
      new AutoShapeImpBase$n5(24577, (short)1073, (short)1095, (short)1),
      new AutoShapeImpBase$n5(40960, (short)1089, (short)0, (short)1069),
      new AutoShapeImpBase$n5(8193, (short)1043, (short)1, (short)10800),
      new AutoShapeImpBase$n5(57345, (short)1098, (short)1098, (short)1071),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1099),
      new AutoShapeImpBase$n5(8193, (short)1047, (short)1, (short)10800),
      new AutoShapeImpBase$n5(24577, (short)1101, (short)1066, (short)-12),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1047)
   };
   private static final int[] w2v = new int[]{5400, 16200, 2700};
   private static final AutoShapeImpBase$l6[] p5w = new AutoShapeImpBase$l6[]{new AutoShapeImpBase$l6(-2147483643, -2147483619, -2147483632, -2147483641)};
   private static final com.aspose.slides.internal.o9b.j5[] g7e = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(2700, -2147483635),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483612),
      new com.aspose.slides.internal.o9b.j5(18900, -2147483635)
   };
   private static final AutoShapeImp b8u = new AutoShapeImp(w2i, d8y, q0y, w2v, p5w, 21600, 21600, g7e);
   private static final com.aspose.slides.internal.o9b.j5[] l1f = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, -2147483568),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483567),
      new com.aspose.slides.internal.o9b.j5(-2147483645, -2147483566),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483565),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483563),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483562),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483561),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(2700, -2147483560),
      new com.aspose.slides.internal.o9b.j5(0, -2147483568),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483568),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483567),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483566),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483565),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483563),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483562),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483561),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(18900, -2147483560),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483568),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483559),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483558),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483557),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483556),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483622, -2147483559),
      new com.aspose.slides.internal.o9b.j5(-2147483621, -2147483558),
      new com.aspose.slides.internal.o9b.j5(-2147483620, -2147483557),
      new com.aspose.slides.internal.o9b.j5(-2147483620, -2147483556),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483555),
      new com.aspose.slides.internal.o9b.j5(-2147483618, -2147483554),
      new com.aspose.slides.internal.o9b.j5(-2147483616, 21600),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483615, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483614, -2147483554),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483555),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483614, -2147483553),
      new com.aspose.slides.internal.o9b.j5(-2147483615, -2147483552),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483552),
      new com.aspose.slides.internal.o9b.j5(-2147483616, -2147483552),
      new com.aspose.slides.internal.o9b.j5(-2147483618, -2147483553),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483564),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483555)
   };
   private static final AutoShapeImpBase$n5[] d9r = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(24576, (short)1103, (short)1061, (short)0),
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)3),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1063, (short)0),
      new AutoShapeImpBase$n5(8193, (short)327, (short)2, (short)3),
      new AutoShapeImpBase$n5(40960, (short)1030, (short)0, (short)1072),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1053, (short)1061, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1053, (short)1102, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)2700, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1081, (short)1102, (short)0),
      new AutoShapeImpBase$n5(40960, (short)1033, (short)0, (short)1082),
      new AutoShapeImpBase$n5(8192, (short)1063, (short)21600, (short)0),
      new AutoShapeImpBase$n5(57345, (short)1086, (short)1086, (short)1071),
      new AutoShapeImpBase$n5(24576, (short)1042, (short)1088, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1027),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1032),
      new AutoShapeImpBase$n5(24576, (short)1036, (short)1061, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)900, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1031, (short)1093, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)1800, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1048, (short)1100, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)2700, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1097, (short)1102, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1048, (short)1061, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1043),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1045),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1047),
      new AutoShapeImpBase$n5(57345, (short)1069, (short)1069, (short)1071),
      new AutoShapeImpBase$n5(8193, (short)1091, (short)2, (short)3),
      new AutoShapeImpBase$n5(24576, (short)1053, (short)1094, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1092, (short)1, (short)3),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1056),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1054),
      new AutoShapeImpBase$n5(24576, (short)1102, (short)1055, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1102, (short)0, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1062),
      new AutoShapeImpBase$n5(24576, (short)1102, (short)1103, (short)0),
      new AutoShapeImpBase$n5(24577, (short)1064, (short)1065, (short)1),
      new AutoShapeImpBase$n5(16385, (short)10800, (short)1066, (short)1),
      new AutoShapeImpBase$n5(8192, (short)1067, (short)0, (short)1),
      new AutoShapeImpBase$n5(24577, (short)1103, (short)1, (short)5400),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1068),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)1, (short)10800),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1070),
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)10800),
      new AutoShapeImpBase$n5(32769, (short)1, (short)1, (short)1103),
      new AutoShapeImpBase$n5(24577, (short)1073, (short)1074, (short)1),
      new AutoShapeImpBase$n5(24577, (short)1075, (short)1066, (short)1),
      new AutoShapeImpBase$n5(40960, (short)1069, (short)0, (short)1076),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)327),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1077),
      new AutoShapeImpBase$n5(8193, (short)1027, (short)1, (short)10800),
      new AutoShapeImpBase$n5(57345, (short)1079, (short)1079, (short)1071),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1080),
      new AutoShapeImpBase$n5(8193, (short)1032, (short)1, (short)10800),
      new AutoShapeImpBase$n5(24576, (short)1078, (short)1061, (short)0),
      new AutoShapeImpBase$n5(24577, (short)1083, (short)1084, (short)1),
      new AutoShapeImpBase$n5(24577, (short)1085, (short)1066, (short)1),
      new AutoShapeImpBase$n5(40960, (short)1079, (short)0, (short)1069),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1032),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1087),
      new AutoShapeImpBase$n5(1, (short)2700, (short)1, (short)10800),
      new AutoShapeImpBase$n5(8193, (short)1102, (short)1, (short)2),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1090),
      new AutoShapeImpBase$n5(8193, (short)1054, (short)1, (short)10800),
      new AutoShapeImpBase$n5(8192, (short)327, (short)5400, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)21600, (short)0),
      new AutoShapeImpBase$n5(24577, (short)1073, (short)1, (short)-12),
      new AutoShapeImpBase$n5(24577, (short)1073, (short)1095, (short)1),
      new AutoShapeImpBase$n5(40960, (short)1089, (short)0, (short)1069),
      new AutoShapeImpBase$n5(8193, (short)1043, (short)1, (short)10800),
      new AutoShapeImpBase$n5(57345, (short)1098, (short)1098, (short)1071),
      new AutoShapeImpBase$n5(32768, (short)1, (short)0, (short)1099),
      new AutoShapeImpBase$n5(8193, (short)1047, (short)1, (short)10800),
      new AutoShapeImpBase$n5(24577, (short)1101, (short)1066, (short)-12),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)1047),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)328),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)329),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1024),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1026),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1028),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1030),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1031),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1033),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1034),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1035),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1037),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1044),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1046),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1048),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1049),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1053),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1055),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1059),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1060)
   };
   private static final int[] w3u = new int[]{5400, 5400, 18900};
   private static final AutoShapeImpBase$l6[] l0u = new AutoShapeImpBase$l6[]{new AutoShapeImpBase$l6(-2147483643, -2147483564, -2147483632, -2147483555)};
   private static final com.aspose.slides.internal.o9b.j5[] v2r = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, -2147483552),
      new com.aspose.slides.internal.o9b.j5(2700, -2147483560),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(18900, -2147483560)
   };
   private static final AutoShapeImp t6q = new AutoShapeImp(l1f, d8y, d9r, w3u, l0u, 21600, 21600, v2r);
   private static final com.aspose.slides.internal.o9b.j5[] c5i = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483645, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483636, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483635, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483634, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483632),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483632),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483632),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483637)
   };
   private static final int[] u3r = new int[]{8195, 1, 8195, 24576, 32768};
   private static final AutoShapeImpBase$n5[] c9v = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8197, (short)1054, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1044, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1045, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1046, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1047, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)2, (short)1),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1048, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1049, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1050, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1043, (short)1050, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1025),
      new AutoShapeImpBase$n5(24576, (short)1043, (short)1049, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1043, (short)1048, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1043, (short)1047, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1043, (short)1046, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1030),
      new AutoShapeImpBase$n5(24576, (short)1043, (short)1045, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1043, (short)1044, (short)0),
      new AutoShapeImpBase$n5(8197, (short)1053, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1051, (short)2, (short)10),
      new AutoShapeImpBase$n5(8193, (short)1051, (short)18, (short)40),
      new AutoShapeImpBase$n5(8193, (short)1051, (short)4, (short)5),
      new AutoShapeImpBase$n5(8193, (short)1051, (short)6, (short)5),
      new AutoShapeImpBase$n5(8193, (short)1051, (short)62, (short)40),
      new AutoShapeImpBase$n5(8193, (short)1051, (short)18, (short)10),
      new AutoShapeImpBase$n5(8193, (short)1051, (short)2, (short)1),
      new AutoShapeImpBase$n5(24580, (short)328, (short)1052, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)328),
      new AutoShapeImpBase$n5(8193, (short)1055, (short)2, (short)1),
      new AutoShapeImpBase$n5(8193, (short)1055, (short)-2, (short)1),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)10800),
      new AutoShapeImpBase$n5(24581, (short)1053, (short)1054, (short)0),
      new AutoShapeImpBase$n5(24578, (short)1028, (short)1029, (short)0),
      new AutoShapeImpBase$n5(24578, (short)1038, (short)1039, (short)0),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)328),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1059)
   };
   private static final int[] r0w = new int[]{2700, 10800};
   private static final AutoShapeImpBase$l6[] n3o = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483616, -2147483642), new com.aspose.slides.internal.o9b.j5(-2147483622, -2147483632))
   };
   private static final com.aspose.slides.internal.o9b.j5[] i5k = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483615, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483613, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483614, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483612, 10800)
   };
   private static final AutoShapeImp c8q = new AutoShapeImp(c5i, u3r, c9v, r0w, n3o, 21600, 21600, i5k);
   private static final com.aspose.slides.internal.o9b.j5[] w1g = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483645, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483639, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483638, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483637, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483630, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483629, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483628, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483625, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483624, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483623, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483622, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483621, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483620, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483619, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483618, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483617, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483617, -2147483631)
   };
   private static final int[] c3g = new int[]{8197, 1, 8197, 24576, 32768};
   private static final AutoShapeImpBase$n5[] g4d = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8197, (short)1072, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1056, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1057, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1058, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1059, (short)0),
      new AutoShapeImpBase$n5(8193, (short)327, (short)2, (short)1),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1060, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1061, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1062, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1063, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1064, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1065, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1066, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1067, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1068, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1068, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)327),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1067, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1066, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1065, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1064, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1030),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1063, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1062, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1061, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1060, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1059, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1058, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1057, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1055, (short)1056, (short)0),
      new AutoShapeImpBase$n5(8197, (short)1071, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)2, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)4, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)8, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)12, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)16, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)20, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)20, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)24, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)28, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)32, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)36, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)38, (short)20),
      new AutoShapeImpBase$n5(8193, (short)1069, (short)2, (short)1),
      new AutoShapeImpBase$n5(24580, (short)328, (short)1070, (short)0),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)328),
      new AutoShapeImpBase$n5(8193, (short)1073, (short)2, (short)1),
      new AutoShapeImpBase$n5(8193, (short)1073, (short)-2, (short)1),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)10800),
      new AutoShapeImpBase$n5(24581, (short)1071, (short)1072, (short)0),
      new AutoShapeImpBase$n5(32768, (short)10800, (short)0, (short)328),
      new AutoShapeImpBase$n5(32768, (short)21600, (short)0, (short)1075)
   };
   private static final int[] l3a = new int[]{1400, 10800};
   private static final AutoShapeImpBase$l6[] a0q = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483598, -2147483642), new com.aspose.slides.internal.o9b.j5(-2147483604, -2147483622))
   };
   private static final com.aspose.slides.internal.o9b.j5[] w3o = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483597, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483624, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483596, 10800)
   };
   private static final AutoShapeImp n9p = new AutoShapeImp(w1g, c3g, g4d, l3a, a0q, 21600, 21600, w3o);
   private static final com.aspose.slides.internal.o9b.j5[] c0h = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(-2147483640, 21600),
      new com.aspose.slides.internal.o9b.j5(0, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483629),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483629),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483637, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483638, 0),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483636, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483627),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483640, 21600),
      new com.aspose.slides.internal.o9b.j5(0, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483629),
      new com.aspose.slides.internal.o9b.j5(-2147483633, -2147483626),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483637, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483635, -2147483630),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483629),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483628),
      new com.aspose.slides.internal.o9b.j5(-2147483637, -2147483631),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483631)
   };
   private static final int[] n6h = new int[]{
      42754, 2, 43009, 1, 42754, 2, 43009, 24576, 32768, 43009, 42754, 24576, 33026, 43011, 42754, 24576, 33026, 42753, 32768, 1, 32768, 1, 32768
   };
   private static final AutoShapeImpBase$n5[] t7q = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1024, (short)1, (short)2),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1025, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1024, (short)2, (short)1),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)1, (short)2),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1028, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1025, (short)1028, (short)0),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1024, (short)0),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1025, (short)0),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1024),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1025),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1026, (short)0),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1026),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1027, (short)0),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1029, (short)0),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1030, (short)0),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1030),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1024, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1025, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1024),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1025),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1030, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1030),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1029)
   };
   private static final AutoShapeImpBase$l6[] l9a = new AutoShapeImpBase$l6[]{new AutoShapeImpBase$l6(-2147483634, -2147483631, -2147483625, -2147483628)};
   private static final com.aspose.slides.internal.o9b.j5[] h5r = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483641, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483639, 10800)
   };
   private static final AutoShapeImp a4s = new AutoShapeImp(c0h, n6h, t7q, u9, l9a, 21600, 21600, h5r);
   private static final com.aspose.slides.internal.o9b.j5[] v0v = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(21600, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483628, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483641),
      new com.aspose.slides.internal.o9b.j5(0, -2147483637),
      new com.aspose.slides.internal.o9b.j5(0, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483630, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483639),
      new com.aspose.slides.internal.o9b.j5(-2147483628, -2147483639),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483636),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483627, -2147483634),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483628, -2147483641),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483628, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483640),
      new com.aspose.slides.internal.o9b.j5(-2147483626, -2147483633),
      new com.aspose.slides.internal.o9b.j5(-2147483628, -2147483640),
      new com.aspose.slides.internal.o9b.j5(0, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483630, -2147483635),
      new com.aspose.slides.internal.o9b.j5(-2147483629, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483628, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483631, -2147483638)
   };
   private static final AutoShapeImpBase$n5[] e5q = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1024, (short)1, (short)2),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1025, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1024, (short)2, (short)1),
      new AutoShapeImpBase$n5(8193, (short)1025, (short)1, (short)2),
      new AutoShapeImpBase$n5(24576, (short)1024, (short)1028, (short)0),
      new AutoShapeImpBase$n5(24576, (short)1025, (short)1028, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1024, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1025, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1024),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1025),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1026, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1026),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1027, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1029, (short)0),
      new AutoShapeImpBase$n5(24576, (short)321, (short)1030, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1030),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1024, (short)0),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1025, (short)0),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1024),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1025),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1030, (short)0),
      new AutoShapeImpBase$n5(40960, (short)322, (short)0, (short)1030),
      new AutoShapeImpBase$n5(24576, (short)320, (short)1024, (short)0),
      new AutoShapeImpBase$n5(40960, (short)323, (short)0, (short)1024)
   };
   private static final int[] c4z = new int[]{
      43010, 2, 42753, 1, 43010, 2, 42753, 24576, 32768, 42755, 24576, 33026, 42755, 43010, 24576, 33026, 43009, 32768, 1, 32768, 1, 32768
   };
   private static final AutoShapeImpBase$l6[] j6e = new AutoShapeImpBase$l6[]{new AutoShapeImpBase$l6(-2147483631, -2147483634, -2147483628, -2147483624)};
   private static final com.aspose.slides.internal.o9b.j5[] c5e = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, -2147483641),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, -2147483639),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp f7v = new AutoShapeImp(v0v, c4z, e5q, u9, j6e, 21600, 21600, c5e);
   private static final com.aspose.slides.internal.o9b.j5[] e3j = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0)
   };
   private static final int[] v2c = new int[]{4, 24576, 32768};
   private static final AutoShapeImp s0c = new AutoShapeImp(e3j, v2c, null, null, null, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] u5b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, -2147483646),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483647, 0),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483646),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483647, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(0, -2147483645)
   };
   private static final int[] x8w = new int[]{43009, 1, 42753, 1, 43009, 1, 42753, 24576, 32772};
   private static final AutoShapeImpBase$n5[] i2i = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)320, (short)2540, (short)0),
      new AutoShapeImpBase$n5(8192, (short)322, (short)0, (short)2540),
      new AutoShapeImpBase$n5(8192, (short)321, (short)2540, (short)0),
      new AutoShapeImpBase$n5(8192, (short)323, (short)0, (short)2540),
      new AutoShapeImpBase$n5(8192, (short)320, (short)800, (short)0),
      new AutoShapeImpBase$n5(8192, (short)322, (short)0, (short)800),
      new AutoShapeImpBase$n5(8192, (short)321, (short)800, (short)0),
      new AutoShapeImpBase$n5(8192, (short)323, (short)0, (short)800)
   };
   private static final AutoShapeImpBase$l6[] b5x = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483642), new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483641))
   };
   private static final AutoShapeImp y4g = new AutoShapeImp(u5b, x8w, i2i, null, b5x, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] j0e = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800)
   };
   private static final int[] t5n = new int[]{4, 24576, 32772};
   private static final AutoShapeImpBase$l6[] z6y = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(5400, 5400), new com.aspose.slides.internal.o9b.j5(16200, 16200))
   };
   private static final AutoShapeImp a9t = new AutoShapeImp(j0e, t5n, null, null, z6y, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] q8o = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(4230, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(17370, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(4230, 0)
   };
   private static final int[] n4m = new int[]{4, 24576, 32772};
   private static final AutoShapeImpBase$l6[] m9a = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(4230, 0), new com.aspose.slides.internal.o9b.j5(17370, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] a6z = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(12960, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(2160, 10800),
      new com.aspose.slides.internal.o9b.j5(8600, 21600),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(19400, 10800)
   };
   private static final AutoShapeImp n6d = new AutoShapeImp(q8o, n4m, null, null, m9a, 21600, 21600, a6z);
   private static final com.aspose.slides.internal.o9b.j5[] w2f = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(2540, 0),
      new com.aspose.slides.internal.o9b.j5(2540, 21600),
      new com.aspose.slides.internal.o9b.j5(19060, 0),
      new com.aspose.slides.internal.o9b.j5(19060, 21600)
   };
   private static final int[] v2o = new int[]{3, 24576, 32768, 1, 32768, 1, 32768};
   private static final AutoShapeImpBase$l6[] f3h = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(2540, 0), new com.aspose.slides.internal.o9b.j5(19060, 21600))
   };
   private static final AutoShapeImp a0p = new AutoShapeImp(w2f, v2o, null, null, f3h, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] h0y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(4230, 0),
      new com.aspose.slides.internal.o9b.j5(4230, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 4230),
      new com.aspose.slides.internal.o9b.j5(21600, 4230)
   };
   private static final int[] t7k = new int[]{3, 24576, 32768, 1, 32768, 1, 32768};
   private static final AutoShapeImpBase$l6[] k6r = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(4230, 4230), new com.aspose.slides.internal.o9b.j5(21600, 21600))
   };
   private static final AutoShapeImp p2n = new AutoShapeImp(h0y, t7k, null, null, k6r, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] h2v = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 17360),
      new com.aspose.slides.internal.o9b.j5(13050, 17220),
      new com.aspose.slides.internal.o9b.j5(13340, 20770),
      new com.aspose.slides.internal.o9b.j5(5620, 21600),
      new com.aspose.slides.internal.o9b.j5(2860, 21100),
      new com.aspose.slides.internal.o9b.j5(1850, 20700),
      new com.aspose.slides.internal.o9b.j5(0, 20120)
   };
   private static final int[] d1z = new int[]{2, 8194, 24576, 32768};
   private static final AutoShapeImpBase$l6[] x1j = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(21600, 17360))
   };
   private static final com.aspose.slides.internal.o9b.j5[] e6q = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 20320),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp w9c = new AutoShapeImp(h2v, d1z, null, null, x1j, 21600, 21600, e6q);
   private static final com.aspose.slides.internal.o9b.j5[] t9z = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 3600),
      new com.aspose.slides.internal.o9b.j5(1500, 3600),
      new com.aspose.slides.internal.o9b.j5(1500, 1800),
      new com.aspose.slides.internal.o9b.j5(3000, 1800),
      new com.aspose.slides.internal.o9b.j5(3000, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 14409),
      new com.aspose.slides.internal.o9b.j5(20100, 14409),
      new com.aspose.slides.internal.o9b.j5(20100, 16209),
      new com.aspose.slides.internal.o9b.j5(18600, 16209),
      new com.aspose.slides.internal.o9b.j5(18600, 18009),
      new com.aspose.slides.internal.o9b.j5(11610, 17893),
      new com.aspose.slides.internal.o9b.j5(11472, 20839),
      new com.aspose.slides.internal.o9b.j5(4833, 21528),
      new com.aspose.slides.internal.o9b.j5(2450, 21113),
      new com.aspose.slides.internal.o9b.j5(1591, 20781),
      new com.aspose.slides.internal.o9b.j5(0, 20300),
      new com.aspose.slides.internal.o9b.j5(1500, 3600),
      new com.aspose.slides.internal.o9b.j5(18600, 3600),
      new com.aspose.slides.internal.o9b.j5(18600, 16209),
      new com.aspose.slides.internal.o9b.j5(3000, 1800),
      new com.aspose.slides.internal.o9b.j5(20100, 1800),
      new com.aspose.slides.internal.o9b.j5(20100, 14409)
   };
   private static final int[] v1y = new int[]{10, 8194, 24576, 32768, 2, 33024, 2, 33024};
   private static final AutoShapeImpBase$l6[] x7u = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 3600), new com.aspose.slides.internal.o9b.j5(18600, 18009))
   };
   private static final com.aspose.slides.internal.o9b.j5[] t4p = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 19890),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp m5k = new AutoShapeImp(t9z, v1y, null, null, x7u, 21600, 21600, t4p);
   private static final com.aspose.slides.internal.o9b.j5[] x2o = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(3470, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(3470, 0),
      new com.aspose.slides.internal.o9b.j5(18130, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(18130, 21600)
   };
   private static final int[] w9n = new int[]{42754, 1, 42754, 24576, 32772};
   private static final AutoShapeImpBase$l6[] a8e = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(1060, 3180), new com.aspose.slides.internal.o9b.j5(20540, 18420))
   };
   private static final AutoShapeImp l6s = new AutoShapeImp(x2o, w9n, null, null, a8e, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] p6x = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(4350, 0),
      new com.aspose.slides.internal.o9b.j5(17250, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(17250, 21600),
      new com.aspose.slides.internal.o9b.j5(4350, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(4350, 0)
   };
   private static final int[] z3o = new int[]{6, 24576, 32772};
   private static final AutoShapeImpBase$l6[] o8r = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(4350, 0), new com.aspose.slides.internal.o9b.j5(17250, 21600))
   };
   private static final AutoShapeImp v9l = new AutoShapeImp(p6x, z3o, null, null, o8r, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] w1y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 4300),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 4300)
   };
   private static final int[] i1t = new int[]{4, 24576, 32772};
   private static final AutoShapeImpBase$l6[] k3w = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 4300), new com.aspose.slides.internal.o9b.j5(21600, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] g7p = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 2150),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 19890),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp w2k = new AutoShapeImp(w1y, i1t, null, null, k3w, 21600, 21600, g7p);
   private static final com.aspose.slides.internal.o9b.j5[] z5p = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(17250, 21600),
      new com.aspose.slides.internal.o9b.j5(4350, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0)
   };
   private static final int[] n1b = new int[]{4, 24576, 32772};
   private static final AutoShapeImpBase$l6[] q6f = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(4350, 0), new com.aspose.slides.internal.o9b.j5(17250, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] q9r = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(2160, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(19440, 10800)
   };
   private static final AutoShapeImp t6w = new AutoShapeImp(z5p, n1b, null, null, q6f, 21600, 21600, q9r);
   private static final com.aspose.slides.internal.o9b.j5[] z5z = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] y8b = new int[]{41730, 24576, 32772};
   private static final AutoShapeImpBase$l6[] w4c = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3180, 3180), new com.aspose.slides.internal.o9b.j5(18420, 18420))
   };
   private static final AutoShapeImp o1o = new AutoShapeImp(z5z, y8b, null, null, w4c, 21600, 21600, p8);
   private static final com.aspose.slides.internal.o9b.j5[] h9q = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 17150),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 17150),
      new com.aspose.slides.internal.o9b.j5(0, 0)
   };
   private static final int[] p5g = new int[]{5, 24576, 32772};
   private static final AutoShapeImpBase$l6[] u1n = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(21600, 17150))
   };
   private static final AutoShapeImp o6x = new AutoShapeImp(h9q, p5g, null, null, u1n, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] p5x = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(4300, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 4300),
      new com.aspose.slides.internal.o9b.j5(4300, 0)
   };
   private static final int[] p9w = new int[]{5, 24576, 32772};
   private static final AutoShapeImpBase$l6[] a9y = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 4300), new com.aspose.slides.internal.o9b.j5(21600, 21600))
   };
   private static final AutoShapeImp b1m = new AutoShapeImp(p5x, p9w, null, null, a9y, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] t2h = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 2230),
      new com.aspose.slides.internal.o9b.j5(820, 3990),
      new com.aspose.slides.internal.o9b.j5(3410, 3980),
      new com.aspose.slides.internal.o9b.j5(5370, 4360),
      new com.aspose.slides.internal.o9b.j5(7430, 4030),
      new com.aspose.slides.internal.o9b.j5(10110, 3890),
      new com.aspose.slides.internal.o9b.j5(10690, 2270),
      new com.aspose.slides.internal.o9b.j5(11440, 300),
      new com.aspose.slides.internal.o9b.j5(14200, 160),
      new com.aspose.slides.internal.o9b.j5(16150, 0),
      new com.aspose.slides.internal.o9b.j5(18670, 170),
      new com.aspose.slides.internal.o9b.j5(20690, 390),
      new com.aspose.slides.internal.o9b.j5(21600, 2230),
      new com.aspose.slides.internal.o9b.j5(21600, 19420),
      new com.aspose.slides.internal.o9b.j5(20640, 17510),
      new com.aspose.slides.internal.o9b.j5(18320, 17490),
      new com.aspose.slides.internal.o9b.j5(16140, 17240),
      new com.aspose.slides.internal.o9b.j5(14710, 17370),
      new com.aspose.slides.internal.o9b.j5(11310, 17510),
      new com.aspose.slides.internal.o9b.j5(10770, 19430),
      new com.aspose.slides.internal.o9b.j5(10150, 21150),
      new com.aspose.slides.internal.o9b.j5(7380, 21290),
      new com.aspose.slides.internal.o9b.j5(5290, 21600),
      new com.aspose.slides.internal.o9b.j5(3220, 21250),
      new com.aspose.slides.internal.o9b.j5(610, 21130),
      new com.aspose.slides.internal.o9b.j5(0, 19420)
   };
   private static final int[] v4y = new int[]{8196, 1, 8196, 24576, 32768};
   private static final AutoShapeImpBase$l6[] p0s = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 4360), new com.aspose.slides.internal.o9b.j5(21600, 17240))
   };
   private static final com.aspose.slides.internal.o9b.j5[] g0t = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 2020),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 19320),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp q2c = new AutoShapeImp(t2h, v4y, null, null, p0s, 21600, 21600, g0t);
   private static final com.aspose.slides.internal.o9b.j5[] w1c = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(3100, 3100),
      new com.aspose.slides.internal.o9b.j5(18500, 18500),
      new com.aspose.slides.internal.o9b.j5(3100, 18500),
      new com.aspose.slides.internal.o9b.j5(18500, 3100)
   };
   private static final int[] r3x = new int[]{41730, 24576, 32772, 1, 32768, 1, 32768};
   private static final AutoShapeImpBase$l6[] y4x = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3100, 3100), new com.aspose.slides.internal.o9b.j5(18500, 18500))
   };
   private static final AutoShapeImp g3x = new AutoShapeImp(w1c, r3x, null, null, y4x, 21600, 21600, p8);
   private static final com.aspose.slides.internal.o9b.j5[] b9b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 21600)
   };
   private static final int[] d9v = new int[]{41730, 24576, 32772, 1, 32768, 1, 32768};
   private static final AutoShapeImpBase$l6[] l9o = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3100, 3100), new com.aspose.slides.internal.o9b.j5(18500, 18500))
   };
   private static final AutoShapeImp p4t = new AutoShapeImp(b9b, d9v, null, null, l9o, 21600, 21600, p8);
   private static final com.aspose.slides.internal.o9b.j5[] c9q = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(0, 0)
   };
   private static final int[] l6j = new int[]{4, 24576, 32768};
   private static final AutoShapeImpBase$l6[] t3o = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(5400, 5400), new com.aspose.slides.internal.o9b.j5(16200, 16200))
   };
   private static final com.aspose.slides.internal.o9b.j5[] o3n = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0), new com.aspose.slides.internal.o9b.j5(10800, 10800), new com.aspose.slides.internal.o9b.j5(10800, 21600)
   };
   private static final AutoShapeImp o8x = new AutoShapeImp(c9q, l6j, null, null, t3o, 21600, 21600, o3n);
   private static final com.aspose.slides.internal.o9b.j5[] v7y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final int[] l6o = new int[]{3, 24576, 32772, 1, 32768};
   private static final AutoShapeImpBase$l6[] v6g = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(5400, 5400), new com.aspose.slides.internal.o9b.j5(16200, 16200))
   };
   private static final AutoShapeImp k0r = new AutoShapeImp(v7y, l6o, null, null, v6g, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] c8m = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(10800, 0)
   };
   private static final int[] k4y = new int[]{3, 24576, 32772};
   private static final AutoShapeImpBase$l6[] n8e = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(5400, 10800), new com.aspose.slides.internal.o9b.j5(16200, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] l6z = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(5400, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(16200, 10800)
   };
   private static final AutoShapeImp n1n = new AutoShapeImp(c8m, k4y, null, null, n8e, 21600, 21600, l6z);
   private static final com.aspose.slides.internal.o9b.j5[] b5j = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0)
   };
   private static final int[] k2s = new int[]{3, 24576, 32772};
   private static final AutoShapeImpBase$l6[] b8n = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(5400, 0), new com.aspose.slides.internal.o9b.j5(16200, 10800))
   };
   private static final AutoShapeImp w9s = new AutoShapeImp(b5j, k2s, null, null, b8n, 21600, 21600, l6z);
   private static final com.aspose.slides.internal.o9b.j5[] h0i = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(3600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(3600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(18000, 10800),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] f5n = new int[]{42754, 1, 42754, 24576, 32772};
   private static final AutoShapeImpBase$l6[] d0e = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3600, 0), new com.aspose.slides.internal.o9b.j5(18000, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] u3t = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(18000, 10800)
   };
   private static final AutoShapeImp b3z = new AutoShapeImp(h0i, f5n, null, null, d0e, 21600, 21600, u3t);
   private static final com.aspose.slides.internal.o9b.j5[] a3s = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0)
   };
   private static final int[] k7d = new int[]{42754, 2, 24576, 32772};
   private static final AutoShapeImpBase$l6[] f7k = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 3100), new com.aspose.slides.internal.o9b.j5(18500, 18500))
   };
   private static final AutoShapeImp w5i = new AutoShapeImp(a3s, k7d, null, null, f7k, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] z9u = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(20980, 18150),
      new com.aspose.slides.internal.o9b.j5(20980, 21600),
      new com.aspose.slides.internal.o9b.j5(10670, 21600),
      new com.aspose.slides.internal.o9b.j5(4770, 21540),
      new com.aspose.slides.internal.o9b.j5(0, 16720),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(0, 4840),
      new com.aspose.slides.internal.o9b.j5(4840, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(16740, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 4840),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(21600, 13520),
      new com.aspose.slides.internal.o9b.j5(20550, 16160),
      new com.aspose.slides.internal.o9b.j5(18670, 18170)
   };
   private static final int[] a3k = new int[]{2, 8196, 24576, 32768};
   private static final AutoShapeImpBase$l6[] i1k = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3100, 3100), new com.aspose.slides.internal.o9b.j5(18500, 18500))
   };
   private static final AutoShapeImp d8v = new AutoShapeImp(z9u, a3k, null, null, i1k, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] j7h = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 3400),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 3400),
      new com.aspose.slides.internal.o9b.j5(21600, 18200),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 18200),
      new com.aspose.slides.internal.o9b.j5(0, 3400),
      new com.aspose.slides.internal.o9b.j5(10800, 6800),
      new com.aspose.slides.internal.o9b.j5(21600, 3400)
   };
   private static final int[] b9j = new int[]{43010, 1, 43010, 24576, 32768, 43010, 32768};
   private static final AutoShapeImpBase$l6[] n2d = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 6800), new com.aspose.slides.internal.o9b.j5(21600, 18200))
   };
   private static final com.aspose.slides.internal.o9b.j5[] h3k = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 6800),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp p1s = new AutoShapeImp(j7h, b9j, null, null, n2d, 21600, 21600, h3k);
   private static final com.aspose.slides.internal.o9b.j5[] s9c = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(18200, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(18200, 21600),
      new com.aspose.slides.internal.o9b.j5(3400, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(3400, 0),
      new com.aspose.slides.internal.o9b.j5(18200, 0),
      new com.aspose.slides.internal.o9b.j5(14800, 10800),
      new com.aspose.slides.internal.o9b.j5(18200, 21600)
   };
   private static final int[] s8x = new int[]{42754, 1, 42754, 24576, 32768, 42754, 32768};
   private static final AutoShapeImpBase$l6[] e5m = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3400, 0), new com.aspose.slides.internal.o9b.j5(14800, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] k4d = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(14800, 10800),
      new com.aspose.slides.internal.o9b.j5(21600, 10800)
   };
   private static final AutoShapeImp t6j = new AutoShapeImp(s9c, s8x, null, null, e5m, 21600, 21600, k4d);
   private static final com.aspose.slides.internal.o9b.j5[] e1x = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(3600, 0),
      new com.aspose.slides.internal.o9b.j5(17800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(17800, 21600),
      new com.aspose.slides.internal.o9b.j5(3600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 10800)
   };
   private static final int[] v3s = new int[]{1, 42754, 2, 24576, 32768};
   private static final AutoShapeImpBase$l6[] c4y = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3600, 0), new com.aspose.slides.internal.o9b.j5(17800, 21600))
   };
   private static final AutoShapeImp w4s = new AutoShapeImp(e1x, v3s, null, null, c4y, 21600, 21600, e2);
   private static final com.aspose.slides.internal.o9b.j5[] c8e = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(0, 3590),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(0, 8970),
      new com.aspose.slides.internal.o9b.j5(0, 12630),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643),
      new com.aspose.slides.internal.o9b.j5(0, 18010),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(3590, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483641),
      new com.aspose.slides.internal.o9b.j5(8970, 21600),
      new com.aspose.slides.internal.o9b.j5(12630, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483639),
      new com.aspose.slides.internal.o9b.j5(18010, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 18010),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483637),
      new com.aspose.slides.internal.o9b.j5(21600, 12630),
      new com.aspose.slides.internal.o9b.j5(21600, 8970),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483635),
      new com.aspose.slides.internal.o9b.j5(21600, 3590),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(18010, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483633),
      new com.aspose.slides.internal.o9b.j5(12630, 0),
      new com.aspose.slides.internal.o9b.j5(8970, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483631),
      new com.aspose.slides.internal.o9b.j5(3590, 0),
      new com.aspose.slides.internal.o9b.j5(0, 0)
   };
   private static final int[] e6s = new int[]{28, 24576, 32768};
   private static final AutoShapeImpBase$n5[] x4q = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)10800),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)10800),
      new AutoShapeImpBase$n5(24582, (short)1042, (short)327, (short)0),
      new AutoShapeImpBase$n5(24582, (short)1042, (short)328, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1047, (short)327, (short)0),
      new AutoShapeImpBase$n5(24582, (short)1047, (short)328, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1050, (short)327, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1050, (short)328, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1053, (short)327, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1053, (short)328, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1056, (short)327, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1056, (short)328, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1058, (short)327, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1058, (short)328, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1060, (short)327, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1060, (short)328, (short)0),
      new AutoShapeImpBase$n5(24582, (short)1062, (short)327, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1062, (short)328, (short)0),
      new AutoShapeImpBase$n5(40966, (short)327, (short)-1, (short)1043),
      new AutoShapeImpBase$n5(40966, (short)1025, (short)-1, (short)1046),
      new AutoShapeImpBase$n5(8195, (short)1024, (short)0, (short)0),
      new AutoShapeImpBase$n5(8195, (short)1025, (short)0, (short)0),
      new AutoShapeImpBase$n5(40960, (short)1044, (short)0, (short)1045),
      new AutoShapeImpBase$n5(40966, (short)327, (short)-1, (short)1048),
      new AutoShapeImpBase$n5(24582, (short)1025, (short)1046, (short)-1),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1049, (short)1051, (short)-1),
      new AutoShapeImpBase$n5(40966, (short)1024, (short)-1, (short)1052),
      new AutoShapeImpBase$n5(40960, (short)1045, (short)0, (short)1044),
      new AutoShapeImpBase$n5(24582, (short)1049, (short)1054, (short)-1),
      new AutoShapeImpBase$n5(24582, (short)1024, (short)1052, (short)-1),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1055, (short)1057, (short)-1),
      new AutoShapeImpBase$n5(24582, (short)1025, (short)1046, (short)-1),
      new AutoShapeImpBase$n5(24582, (short)1055, (short)1059, (short)-1),
      new AutoShapeImpBase$n5(40966, (short)1025, (short)-1, (short)1046),
      new AutoShapeImpBase$n5(40966, (short)328, (short)-1, (short)1061),
      new AutoShapeImpBase$n5(24582, (short)1024, (short)1052, (short)-1),
      new AutoShapeImpBase$n5(40966, (short)328, (short)-1, (short)1063),
      new AutoShapeImpBase$n5(40966, (short)1024, (short)-1, (short)1052),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0)
   };
   private static final int[] p2h = new int[]{1400, 25920};
   private static final AutoShapeImpBase$l6[] n3p = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(21600, 21600))
   };
   private static final com.aspose.slides.internal.o9b.j5[] q1y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483608, -2147483607)
   };
   private static final AutoShapeImp n8n = new AutoShapeImp(c8e, e6s, x4q, p2h, n3p, 21600, 21600, q1y);
   private static final com.aspose.slides.internal.o9b.j5[] r2o = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(3590, 0),
      new com.aspose.slides.internal.o9b.j5(0, 3590),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(0, 8970),
      new com.aspose.slides.internal.o9b.j5(0, 12630),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643),
      new com.aspose.slides.internal.o9b.j5(0, 18010),
      new com.aspose.slides.internal.o9b.j5(3590, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483641),
      new com.aspose.slides.internal.o9b.j5(8970, 21600),
      new com.aspose.slides.internal.o9b.j5(12630, 21600),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483639),
      new com.aspose.slides.internal.o9b.j5(18010, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 18010),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483637),
      new com.aspose.slides.internal.o9b.j5(21600, 12630),
      new com.aspose.slides.internal.o9b.j5(21600, 8970),
      new com.aspose.slides.internal.o9b.j5(-2147483636, -2147483635),
      new com.aspose.slides.internal.o9b.j5(21600, 3590),
      new com.aspose.slides.internal.o9b.j5(18010, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483634, -2147483633),
      new com.aspose.slides.internal.o9b.j5(12630, 0),
      new com.aspose.slides.internal.o9b.j5(8970, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483632, -2147483631),
      new com.aspose.slides.internal.o9b.j5(3590, 0)
   };
   private static final int[] v1w = new int[]{42753, 5, 43009, 5, 42753, 5, 43009, 5, 24576, 32768};
   private static final AutoShapeImpBase$n5[] d4r = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)10800),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)10800),
      new AutoShapeImpBase$n5(24582, (short)1042, (short)327, (short)0),
      new AutoShapeImpBase$n5(24582, (short)1042, (short)328, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1047, (short)327, (short)0),
      new AutoShapeImpBase$n5(24582, (short)1047, (short)328, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1050, (short)327, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1050, (short)328, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1053, (short)327, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1053, (short)328, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1056, (short)327, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1056, (short)328, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1058, (short)327, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1058, (short)328, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1060, (short)327, (short)15320),
      new AutoShapeImpBase$n5(24582, (short)1060, (short)328, (short)0),
      new AutoShapeImpBase$n5(24582, (short)1062, (short)327, (short)6280),
      new AutoShapeImpBase$n5(24582, (short)1062, (short)328, (short)0),
      new AutoShapeImpBase$n5(40966, (short)327, (short)-1, (short)1043),
      new AutoShapeImpBase$n5(40966, (short)1025, (short)-1, (short)1046),
      new AutoShapeImpBase$n5(8195, (short)1024, (short)0, (short)0),
      new AutoShapeImpBase$n5(8195, (short)1025, (short)0, (short)0),
      new AutoShapeImpBase$n5(40960, (short)1044, (short)0, (short)1045),
      new AutoShapeImpBase$n5(40966, (short)327, (short)-1, (short)1048),
      new AutoShapeImpBase$n5(24582, (short)1025, (short)1046, (short)-1),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1049, (short)1051, (short)-1),
      new AutoShapeImpBase$n5(40966, (short)1024, (short)-1, (short)1052),
      new AutoShapeImpBase$n5(40960, (short)1045, (short)0, (short)1044),
      new AutoShapeImpBase$n5(24582, (short)1049, (short)1054, (short)-1),
      new AutoShapeImpBase$n5(24582, (short)1024, (short)1052, (short)-1),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)21600),
      new AutoShapeImpBase$n5(24582, (short)1055, (short)1057, (short)-1),
      new AutoShapeImpBase$n5(24582, (short)1025, (short)1046, (short)-1),
      new AutoShapeImpBase$n5(24582, (short)1055, (short)1059, (short)-1),
      new AutoShapeImpBase$n5(40966, (short)1025, (short)-1, (short)1046),
      new AutoShapeImpBase$n5(40966, (short)328, (short)-1, (short)1061),
      new AutoShapeImpBase$n5(24582, (short)1024, (short)1052, (short)-1),
      new AutoShapeImpBase$n5(40966, (short)328, (short)-1, (short)1063),
      new AutoShapeImpBase$n5(40966, (short)1024, (short)-1, (short)1052),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0)
   };
   private static final int[] b1k = new int[]{1350, 25920};
   private static final AutoShapeImpBase$l6[] v3y = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(800, 800), new com.aspose.slides.internal.o9b.j5(20800, 20800))
   };
   private static final com.aspose.slides.internal.o9b.j5[] w8s = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483608, -2147483607)
   };
   private static final AutoShapeImp w2p = new AutoShapeImp(r2o, v1w, d4r, b1k, v3y, 21600, 21600, w8s);
   private static final com.aspose.slides.internal.o9b.j5[] d2x = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643)
   };
   private static final AutoShapeImpBase$n5[] a8m = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1030, (short)0),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1031, (short)0),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1032, (short)0),
      new AutoShapeImpBase$n5(16384, (short)10800, (short)1033, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(16393, (short)10800, (short)1034, (short)0),
      new AutoShapeImpBase$n5(16394, (short)10800, (short)1034, (short)0),
      new AutoShapeImpBase$n5(16393, (short)10800, (short)1035, (short)0),
      new AutoShapeImpBase$n5(16394, (short)10800, (short)1035, (short)0),
      new AutoShapeImpBase$n5(8206, (short)1036, (short)0, (short)11),
      new AutoShapeImpBase$n5(8206, (short)1036, (short)11, (short)0),
      new AutoShapeImpBase$n5(24584, (short)1038, (short)1037, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)10800),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)10800)
   };
   private static final int[] a9w = new int[]{42244, 1, 24576, 32768};
   private static final int[] g1i = new int[]{1350, 25920};
   private static final AutoShapeImpBase$l6[] b3r = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3200, 3200), new com.aspose.slides.internal.o9b.j5(18400, 18400))
   };
   private static final com.aspose.slides.internal.o9b.j5[] s7m = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(3160, 3160),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(3160, 18440),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(18440, 18440),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(18440, 3160),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643)
   };
   private static final AutoShapeImp y8i = new AutoShapeImp(d2x, a9w, a8m, g1i, b3r, 21600, 21600, s7m);
   private static final com.aspose.slides.internal.o9b.j5[] e5k = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(1930, 7160),
      new com.aspose.slides.internal.o9b.j5(1530, 4490),
      new com.aspose.slides.internal.o9b.j5(3400, 1970),
      new com.aspose.slides.internal.o9b.j5(5270, 1970),
      new com.aspose.slides.internal.o9b.j5(5860, 1950),
      new com.aspose.slides.internal.o9b.j5(6470, 2210),
      new com.aspose.slides.internal.o9b.j5(6970, 2600),
      new com.aspose.slides.internal.o9b.j5(7450, 1390),
      new com.aspose.slides.internal.o9b.j5(8340, 650),
      new com.aspose.slides.internal.o9b.j5(9340, 650),
      new com.aspose.slides.internal.o9b.j5(10004, 690),
      new com.aspose.slides.internal.o9b.j5(10710, 1050),
      new com.aspose.slides.internal.o9b.j5(11210, 1700),
      new com.aspose.slides.internal.o9b.j5(11570, 630),
      new com.aspose.slides.internal.o9b.j5(12330, 0),
      new com.aspose.slides.internal.o9b.j5(13150, 0),
      new com.aspose.slides.internal.o9b.j5(13840, 0),
      new com.aspose.slides.internal.o9b.j5(14470, 460),
      new com.aspose.slides.internal.o9b.j5(14870, 1160),
      new com.aspose.slides.internal.o9b.j5(15330, 440),
      new com.aspose.slides.internal.o9b.j5(16020, 0),
      new com.aspose.slides.internal.o9b.j5(16740, 0),
      new com.aspose.slides.internal.o9b.j5(17910, 0),
      new com.aspose.slides.internal.o9b.j5(18900, 1130),
      new com.aspose.slides.internal.o9b.j5(19110, 2710),
      new com.aspose.slides.internal.o9b.j5(20240, 3150),
      new com.aspose.slides.internal.o9b.j5(21060, 4580),
      new com.aspose.slides.internal.o9b.j5(21060, 6220),
      new com.aspose.slides.internal.o9b.j5(21060, 6720),
      new com.aspose.slides.internal.o9b.j5(21000, 7200),
      new com.aspose.slides.internal.o9b.j5(20830, 7660),
      new com.aspose.slides.internal.o9b.j5(21310, 8460),
      new com.aspose.slides.internal.o9b.j5(21600, 9450),
      new com.aspose.slides.internal.o9b.j5(21600, 10460),
      new com.aspose.slides.internal.o9b.j5(21600, 12750),
      new com.aspose.slides.internal.o9b.j5(20310, 14680),
      new com.aspose.slides.internal.o9b.j5(18650, 15010),
      new com.aspose.slides.internal.o9b.j5(18650, 17200),
      new com.aspose.slides.internal.o9b.j5(17370, 18920),
      new com.aspose.slides.internal.o9b.j5(15770, 18920),
      new com.aspose.slides.internal.o9b.j5(15220, 18920),
      new com.aspose.slides.internal.o9b.j5(14700, 18710),
      new com.aspose.slides.internal.o9b.j5(14240, 18310),
      new com.aspose.slides.internal.o9b.j5(13820, 20240),
      new com.aspose.slides.internal.o9b.j5(12490, 21600),
      new com.aspose.slides.internal.o9b.j5(11000, 21600),
      new com.aspose.slides.internal.o9b.j5(9890, 21600),
      new com.aspose.slides.internal.o9b.j5(8840, 20790),
      new com.aspose.slides.internal.o9b.j5(8210, 19510),
      new com.aspose.slides.internal.o9b.j5(7620, 20000),
      new com.aspose.slides.internal.o9b.j5(7930, 20290),
      new com.aspose.slides.internal.o9b.j5(6240, 20290),
      new com.aspose.slides.internal.o9b.j5(4850, 20290),
      new com.aspose.slides.internal.o9b.j5(3570, 19280),
      new com.aspose.slides.internal.o9b.j5(2900, 17640),
      new com.aspose.slides.internal.o9b.j5(1300, 17600),
      new com.aspose.slides.internal.o9b.j5(480, 16300),
      new com.aspose.slides.internal.o9b.j5(480, 14660),
      new com.aspose.slides.internal.o9b.j5(480, 13900),
      new com.aspose.slides.internal.o9b.j5(690, 13210),
      new com.aspose.slides.internal.o9b.j5(1070, 12640),
      new com.aspose.slides.internal.o9b.j5(380, 12160),
      new com.aspose.slides.internal.o9b.j5(0, 11210),
      new com.aspose.slides.internal.o9b.j5(0, 10120),
      new com.aspose.slides.internal.o9b.j5(0, 8590),
      new com.aspose.slides.internal.o9b.j5(840, 7330),
      new com.aspose.slides.internal.o9b.j5(1930, 7160),
      new com.aspose.slides.internal.o9b.j5(1930, 7160),
      new com.aspose.slides.internal.o9b.j5(1950, 7410),
      new com.aspose.slides.internal.o9b.j5(2040, 7690),
      new com.aspose.slides.internal.o9b.j5(2090, 7920),
      new com.aspose.slides.internal.o9b.j5(6970, 2600),
      new com.aspose.slides.internal.o9b.j5(7200, 2790),
      new com.aspose.slides.internal.o9b.j5(7480, 3050),
      new com.aspose.slides.internal.o9b.j5(7670, 3310),
      new com.aspose.slides.internal.o9b.j5(11210, 1700),
      new com.aspose.slides.internal.o9b.j5(11130, 1910),
      new com.aspose.slides.internal.o9b.j5(11080, 2160),
      new com.aspose.slides.internal.o9b.j5(11030, 2400),
      new com.aspose.slides.internal.o9b.j5(14870, 1160),
      new com.aspose.slides.internal.o9b.j5(14720, 1400),
      new com.aspose.slides.internal.o9b.j5(14640, 1720),
      new com.aspose.slides.internal.o9b.j5(14540, 2010),
      new com.aspose.slides.internal.o9b.j5(19110, 2710),
      new com.aspose.slides.internal.o9b.j5(19130, 2890),
      new com.aspose.slides.internal.o9b.j5(19230, 3290),
      new com.aspose.slides.internal.o9b.j5(19190, 3380),
      new com.aspose.slides.internal.o9b.j5(20830, 7660),
      new com.aspose.slides.internal.o9b.j5(20660, 8170),
      new com.aspose.slides.internal.o9b.j5(20430, 8620),
      new com.aspose.slides.internal.o9b.j5(20110, 8990),
      new com.aspose.slides.internal.o9b.j5(18660, 15010),
      new com.aspose.slides.internal.o9b.j5(18740, 14200),
      new com.aspose.slides.internal.o9b.j5(18280, 12200),
      new com.aspose.slides.internal.o9b.j5(17000, 11450),
      new com.aspose.slides.internal.o9b.j5(14240, 18310),
      new com.aspose.slides.internal.o9b.j5(14320, 17980),
      new com.aspose.slides.internal.o9b.j5(14350, 17680),
      new com.aspose.slides.internal.o9b.j5(14370, 17360),
      new com.aspose.slides.internal.o9b.j5(8220, 19510),
      new com.aspose.slides.internal.o9b.j5(8060, 19250),
      new com.aspose.slides.internal.o9b.j5(7960, 18950),
      new com.aspose.slides.internal.o9b.j5(7860, 18640),
      new com.aspose.slides.internal.o9b.j5(2900, 17640),
      new com.aspose.slides.internal.o9b.j5(3090, 17600),
      new com.aspose.slides.internal.o9b.j5(3280, 17540),
      new com.aspose.slides.internal.o9b.j5(3460, 17450),
      new com.aspose.slides.internal.o9b.j5(1070, 12640),
      new com.aspose.slides.internal.o9b.j5(1400, 12900),
      new com.aspose.slides.internal.o9b.j5(1780, 13130),
      new com.aspose.slides.internal.o9b.j5(2330, 13040),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483639),
      new com.aspose.slides.internal.o9b.j5(-2147483638, -2147483637)
   };
   private static final AutoShapeImpBase$n5[] t7m = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(16384, (short)9000, (short)1036, (short)0),
      new AutoShapeImpBase$n5(16384, (short)9000, (short)1037, (short)0),
      new AutoShapeImpBase$n5(16384, (short)12600, (short)1036, (short)0),
      new AutoShapeImpBase$n5(16384, (short)12600, (short)1037, (short)0),
      new AutoShapeImpBase$n5(16384, (short)9600, (short)1038, (short)0),
      new AutoShapeImpBase$n5(16384, (short)9600, (short)1039, (short)0),
      new AutoShapeImpBase$n5(16384, (short)12000, (short)1038, (short)0),
      new AutoShapeImpBase$n5(16384, (short)12000, (short)1039, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)600),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)600),
      new AutoShapeImpBase$n5(8192, (short)327, (short)600, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)600, (short)0),
      new AutoShapeImpBase$n5(57355, (short)1040, (short)1046, (short)1047),
      new AutoShapeImpBase$n5(57356, (short)1040, (short)1046, (short)1047),
      new AutoShapeImpBase$n5(57355, (short)1041, (short)1046, (short)1047),
      new AutoShapeImpBase$n5(57356, (short)1041, (short)1046, (short)1047),
      new AutoShapeImpBase$n5(8192, (short)1043, (short)12600, (short)0),
      new AutoShapeImpBase$n5(8192, (short)1042, (short)15600, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1043, (short)2, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1044, (short)1, (short)3),
      new AutoShapeImpBase$n5(8192, (short)1045, (short)0, (short)17400),
      new AutoShapeImpBase$n5(24704, (short)1046, (short)1047, (short)0),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)10800),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)10800),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0)
   };
   private static final int[] l4s = new int[]{
      8214,
      24576,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      8193,
      32768,
      42242,
      24576,
      32768,
      42242,
      24576,
      32768,
      42242,
      24576,
      32768
   };
   private static final int[] z9j = new int[]{1350, 25920};
   private static final AutoShapeImpBase$l6[] h6m = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3000, 3320), new com.aspose.slides.internal.o9b.j5(17110, 17330))
   };
   private static final com.aspose.slides.internal.o9b.j5[] q7j = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 1220),
      new com.aspose.slides.internal.o9b.j5(50, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483624, -2147483623)
   };
   private static final AutoShapeImp i4u = new AutoShapeImp(e5k, l4s, t7m, z9j, h6m, 21300, 21600, q7j);
   private static final com.aspose.slides.internal.o9b.j5[] j7d = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] v4b = new int[]{1, 32768};
   private static final AutoShapeImp f2z = new AutoShapeImp(j7d, v4b, null, null, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] d1t = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] f7o = new int[]{3, 32768};
   private static final AutoShapeImpBase$n5[] u1u = new AutoShapeImpBase$n5[]{new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0)};
   private static final AutoShapeImp z7r = new AutoShapeImp(d1t, f7o, u1u, x8, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] e9b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0), new com.aspose.slides.internal.o9b.j5(21600, 0), new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] g0e = new int[]{2, 32768};
   private static final AutoShapeImp b9q = new AutoShapeImp(e9b, g0e, null, null, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] n4b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483647),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] t3c = new int[]{4, 32768};
   private static final AutoShapeImpBase$n5[] r2t = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0), new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0)
   };
   private static final int[] y1i = new int[]{10800, 10800};
   private static final AutoShapeImp o3h = new AutoShapeImp(n4b, t3c, r2t, y1i, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] b1g = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] x9p = new int[]{5, 32768};
   private static final AutoShapeImpBase$n5[] i4k = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0)
   };
   private static final int[] u3n = new int[]{10800, 10800, 10800};
   private static final AutoShapeImp w2z = new AutoShapeImp(b1g, x9p, i4k, u3n, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] j5s = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483647, 5400),
      new com.aspose.slides.internal.o9b.j5(-2147483647, 10800),
      new com.aspose.slides.internal.o9b.j5(-2147483647, 16200),
      new com.aspose.slides.internal.o9b.j5(-2147483646, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] w7e = new int[]{8194, 32768};
   private static final AutoShapeImpBase$n5[] b7i = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)2),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)1027, (short)1, (short)2),
      new AutoShapeImpBase$n5(8192, (short)327, (short)21600, (short)0)
   };
   private static final AutoShapeImp f6a = new AutoShapeImp(j5s, w7e, b7i, l6, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] f4q = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] r2r = new int[]{8193, 32768};
   private static final AutoShapeImp t4e = new AutoShapeImp(f4q, r2r, null, null, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] j2k = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483642),
      new com.aspose.slides.internal.o9b.j5(21600, -2147483639),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] m3e = new int[]{8195, 32768};
   private static final AutoShapeImpBase$n5[] x9f = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)2),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)328, (short)1, (short)4),
      new AutoShapeImpBase$n5(8193, (short)328, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)328, (short)3, (short)4),
      new AutoShapeImpBase$n5(24578, (short)327, (short)1031, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8194, (short)327, (short)21600, (short)0),
      new AutoShapeImpBase$n5(8194, (short)1031, (short)21600, (short)0),
      new AutoShapeImpBase$n5(8194, (short)328, (short)21600, (short)0)
   };
   private static final int[] n9v = new int[]{0, 0};
   private static final AutoShapeImp o8n = new AutoShapeImp(j2k, m3e, x9f, n9v, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] w0r = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483646),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483647, -2147483644),
      new com.aspose.slides.internal.o9b.j5(-2147483643, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483641, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483640, -2147483642),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483638),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483637),
      new com.aspose.slides.internal.o9b.j5(-2147483639, -2147483636),
      new com.aspose.slides.internal.o9b.j5(-2147483635, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 21600)
   };
   private static final int[] t7d = new int[]{8196, 32768};
   private static final AutoShapeImpBase$n5[] f1i = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8193, (short)327, (short)1, (short)2),
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8193, (short)328, (short)1, (short)4),
      new AutoShapeImpBase$n5(8193, (short)328, (short)1, (short)2),
      new AutoShapeImpBase$n5(8193, (short)328, (short)3, (short)4),
      new AutoShapeImpBase$n5(24578, (short)1031, (short)327, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(24578, (short)327, (short)329, (short)0),
      new AutoShapeImpBase$n5(24578, (short)1031, (short)329, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(24578, (short)328, (short)1035, (short)0),
      new AutoShapeImpBase$n5(8194, (short)328, (short)21600, (short)0),
      new AutoShapeImpBase$n5(8194, (short)1035, (short)21600, (short)0),
      new AutoShapeImpBase$n5(8194, (short)329, (short)21600, (short)0)
   };
   private static final int[] y8s = new int[]{0, 0, 0};
   private static final AutoShapeImp l9e = new AutoShapeImp(w0r, t7d, f1i, y8s, null, 21600, 21600, t9);
   private static final com.aspose.slides.internal.o9b.j5[] m0a = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 3600),
      new com.aspose.slides.internal.o9b.j5(0, 1800),
      new com.aspose.slides.internal.o9b.j5(1800, 0),
      new com.aspose.slides.internal.o9b.j5(3600, 0),
      new com.aspose.slides.internal.o9b.j5(18000, 0),
      new com.aspose.slides.internal.o9b.j5(19800, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 1800),
      new com.aspose.slides.internal.o9b.j5(21600, 3600),
      new com.aspose.slides.internal.o9b.j5(21600, 14400),
      new com.aspose.slides.internal.o9b.j5(21600, 16200),
      new com.aspose.slides.internal.o9b.j5(19800, 18000),
      new com.aspose.slides.internal.o9b.j5(18000, 18000),
      new com.aspose.slides.internal.o9b.j5(5400, 18000),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(3600, 18000),
      new com.aspose.slides.internal.o9b.j5(1800, 18000),
      new com.aspose.slides.internal.o9b.j5(0, 16200),
      new com.aspose.slides.internal.o9b.j5(0, 14400),
      new com.aspose.slides.internal.o9b.j5(0, 3600)
   };
   private static final int[] a1v = new int[]{8193, 1, 8193, 1, 8193, 3, 8193, 1, 24576, 32768};
   private static final AutoShapeImpBase$n5[] o3m = new AutoShapeImpBase$n5[]{new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0)};
   private static final AutoShapeImpBase$l6[] e5s = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(1400, 1400), new com.aspose.slides.internal.o9b.j5(20400, 16800))
   };
   private static final AutoShapeImp u4x = new AutoShapeImp(m0a, a1v, o3m, u3, e5s, 21600, 21600, null);
   private static final com.aspose.slides.internal.o9b.j5[] m1y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 16200),
      new com.aspose.slides.internal.o9b.j5(9600, 16200),
      new com.aspose.slides.internal.o9b.j5(4000, 14400),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, 21600),
      new com.aspose.slides.internal.o9b.j5(9600, 16200)
   };
   private static final int[] x0d = new int[]{41732, 2, 24576, 32768};
   private static final AutoShapeImpBase$l6[] x1i = new AutoShapeImpBase$l6[]{
      new AutoShapeImpBase$l6(new com.aspose.slides.internal.o9b.j5(3200, 2400), new com.aspose.slides.internal.o9b.j5(18400, 13800))
   };
   private static final AutoShapeImp x4t = new AutoShapeImp(m1y, x0d, o3m, u3, x1i, 21600, 21600, null);
   private static final com.aspose.slides.internal.o9b.j5[] d6z = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645)
   };
   private static final int[] r0s = new int[]{4, 24576, 32768, 1, 43520, 32768};
   private static final AutoShapeImpBase$n5[] a9k = new AutoShapeImpBase$n5[]{
      new AutoShapeImpBase$n5(8192, (short)327, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)328, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)329, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)330, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)331, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)332, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)333, (short)0, (short)0),
      new AutoShapeImpBase$n5(8192, (short)334, (short)0, (short)0)
   };
   private static final AutoShapeImpBase$l6[] p4u = new AutoShapeImpBase$l6[]{new AutoShapeImpBase$l6(0, 0, 21600, 21600)};
   private static final int[] i0c = new int[]{-1800, 24300, -1800, 4050};
   private static final com.aspose.slides.internal.o9b.j5[] k1i = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(10800, 0),
      new com.aspose.slides.internal.o9b.j5(0, 10800),
      new com.aspose.slides.internal.o9b.j5(10800, 21600),
      new com.aspose.slides.internal.o9b.j5(21600, 10800),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647)
   };
   private static final AutoShapeImp q8h = new AutoShapeImp(d6z, r0s, a9k, i0c, p4u, 21600, 21600, k1i);
   private static final int[] e8j = new int[]{-8280, 24300, -1800, 4050};
   private static final AutoShapeImp k1b = new AutoShapeImp(d6z, r0s, a9k, e8j, p4u, 21600, 21600, k1i);
   private static final com.aspose.slides.internal.o9b.j5[] t7b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643)
   };
   private static final int[] t2a = new int[]{4, 24576, 32768, 2, 43520, 32768};
   private static final int[] y8d = new int[]{-10080, 24300, -3600, 4050, -1800, 4050};
   private static final AutoShapeImp c7h = new AutoShapeImp(t7b, t2a, a9k, y8d, p4u, 21600, 21600, k1i);
   private static final com.aspose.slides.internal.o9b.j5[] j6b = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483641)
   };
   private static final int[] f9o = new int[]{4, 24576, 32768, 3, 43520, 32768};
   private static final int[] d4p = new int[]{23400, 24400, 25200, 21600, 25200, 4050, 23400, 4050};
   private static final AutoShapeImp v2p = new AutoShapeImp(j6b, f9o, a9k, d4p, p4u, 21600, 21600, k1i);
   private static final int[] u7o = new int[]{4, 24576, 32784, 1, 43520, 32768};
   private static final AutoShapeImp y3s = new AutoShapeImp(d6z, u7o, a9k, i0c, p4u, 21600, 21600, k1i);
   private static final com.aspose.slides.internal.o9b.j5[] m1c = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483646, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483646, 21600)
   };
   private static final int[] v6k = new int[]{4, 24576, 32784, 1, 43520, 32768, 1, 43520, 32803};
   private static final AutoShapeImp d1g = new AutoShapeImp(m1c, v6k, a9k, e8j, p4u, 21600, 21600, k1i);
   private static final com.aspose.slides.internal.o9b.j5[] v8y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483644, 21600)
   };
   private static final int[] f5m = new int[]{4, 24576, 32784, 2, 43520, 32768, 1, 43520, 32803};
   private static final AutoShapeImp f3r = new AutoShapeImp(v8y, f5m, a9k, y8d, p4u, 21600, 21600, k1i);
   private static final com.aspose.slides.internal.o9b.j5[] u3y = new com.aspose.slides.internal.o9b.j5[]{
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 0),
      new com.aspose.slides.internal.o9b.j5(21600, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 21600),
      new com.aspose.slides.internal.o9b.j5(0, 0),
      new com.aspose.slides.internal.o9b.j5(Integer.MIN_VALUE, -2147483647),
      new com.aspose.slides.internal.o9b.j5(-2147483646, -2147483645),
      new com.aspose.slides.internal.o9b.j5(-2147483644, -2147483643),
      new com.aspose.slides.internal.o9b.j5(-2147483642, -2147483641),
      new com.aspose.slides.internal.o9b.j5(-2147483642, 0),
      new com.aspose.slides.internal.o9b.j5(-2147483642, 21600)
   };
   private static final int[] n1u = new int[]{4, 24576, 32784, 3, 43520, 32768, 1, 43520, 32803};
   private static final AutoShapeImp v3w = new AutoShapeImp(u3y, n1u, a9k, d4p, p4u, 21600, 21600, k1i);
   private static final int[] w5y = new int[]{4, 24576, 32784, 1, 43520, 32768};
   private static final AutoShapeImp a4e = new AutoShapeImp(d6z, w5y, a9k, i0c, p4u, 21600, 21600, k1i);
   private static final AutoShapeImp q9l = new AutoShapeImp(d6z, w5y, a9k, e8j, p4u, 21600, 21600, k1i);
   private static final int[] b4j = new int[]{4, 24576, 32784, 2, 43520, 32768};
   private static final AutoShapeImp i5i = new AutoShapeImp(t7b, b4j, a9k, y8d, p4u, 21600, 21600, k1i);
   private static final int[] w6u = new int[]{4, 24576, 32784, 3, 43520, 32768};
   private static final AutoShapeImp f8i = new AutoShapeImp(j6b, w6u, a9k, d4p, p4u, 21600, 21600, k1i);
   private static final AutoShapeImp p5i = q8h;
   private static final int[] t1n = new int[]{4, 24576, 32768, 1, 43520, 32768, 1, 43520, 32803};
   private static final AutoShapeImp m9b = new AutoShapeImp(m1c, t1n, a9k, e8j, p4u, 21600, 21600, k1i);
   private static final int[] x8z = new int[]{4, 24576, 32768, 2, 43520, 32768, 1, 43520, 32803};
   private static final AutoShapeImp q5b = new AutoShapeImp(v8y, x8z, a9k, y8d, p4u, 21600, 21600, k1i);
   private static final int[] z6i = new int[]{4, 24576, 32768, 3, 43520, 32768, 1, 43520, 32803};
   private static final AutoShapeImp l6x = new AutoShapeImp(u3y, z6i, a9k, d4p, p4u, 21600, 21600, k1i);

   public final int[] n5() {
      return this.z0k;
   }

   final com.aspose.slides.internal.k0r.b2 l6() {
      if (this.x7n == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.b2 var1 = new com.aspose.slides.internal.k0r.b2(326, this.x7n.length & 65535, 2);

      for (int var2 = 0; var2 < this.x7n.length; var2++) {
         var1.n5(var2, com.aspose.slides.internal.v6g.k5.h0(this.x7n[var2], 8));
      }

      return var1;
   }

   final com.aspose.slides.internal.k0r.b2 k5() {
      return n5(325, this.g8v);
   }

   final com.aspose.slides.internal.k0r.b2 u3() {
      return n5(337, this.f1c);
   }

   private static com.aspose.slides.internal.k0r.b2 n5(int var0, com.aspose.slides.internal.o9b.j5[] var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.b2 var2 = new com.aspose.slides.internal.k0r.b2(var0, var1.length & 65535, 8);

      for (int var3 = 0; var3 < var1.length; var3++) {
         com.aspose.slides.internal.n8e.y2.l6(var2.l6(), 6 + var3 * 8, var1[var3].n5());
         com.aspose.slides.internal.n8e.y2.l6(var2.l6(), 6 + var3 * 8 + 4, var1[var3].l6());
      }

      return var2;
   }

   final com.aspose.slides.internal.k0r.b2 a6() {
      if (this.k1d == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.b2 var1 = new com.aspose.slides.internal.k0r.b2(342, this.k1d.length & 65535, 8);

      for (int var2 = 0; var2 < this.k1d.length; var2++) {
         AutoShapeImpBase$n5 var3 = this.k1d[var2].n5();
         com.aspose.slides.internal.n8e.y2.n5(var1.l6(), 6 + var2 * 8, var3.n5 & 65535);
         com.aspose.slides.internal.n8e.y2.n5(var1.l6(), 6 + var2 * 8 + 2, var3.l6);
         com.aspose.slides.internal.n8e.y2.n5(var1.l6(), 6 + var2 * 8 + 4, var3.k5);
         com.aspose.slides.internal.n8e.y2.n5(var1.l6(), 6 + var2 * 8 + 6, var3.u3);
      }

      return var1;
   }

   final com.aspose.slides.internal.k0r.b2 u9() {
      if (this.v2s == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.b2 var1 = new com.aspose.slides.internal.k0r.b2(343, this.v2s.length & 65535, 16);

      for (int var2 = 0; var2 < this.v2s.length; var2++) {
         AutoShapeImpBase$l6 var3 = this.v2s[var2].n5();
         com.aspose.slides.internal.n8e.y2.l6(var1.l6(), 6 + var2 * 16, var3.n5.n5());
         com.aspose.slides.internal.n8e.y2.l6(var1.l6(), 6 + var2 * 16 + 4, var3.n5.l6());
         com.aspose.slides.internal.n8e.y2.l6(var1.l6(), 6 + var2 * 16 + 8, var3.l6.n5());
         com.aspose.slides.internal.n8e.y2.l6(var1.l6(), 6 + var2 * 16 + 12, var3.l6.l6());
      }

      return var1;
   }

   AutoShapeImp(
      com.aspose.slides.internal.o9b.j5[] vertices,
      int[] elements,
      AutoShapeImpBase$n5[] calculationData,
      int[] defData,
      AutoShapeImpBase$l6[] textRects,
      int width,
      int height,
      com.aspose.slides.internal.o9b.j5[] connectionPoints
   ) {
      super(width, height);
      this.g8v = vertices;
      this.x7n = elements;
      this.k1d = calculationData;
      this.z0k = defData;
      if (textRects == null) {
         textRects = n5;
      }

      this.v2s = textRects;
      if (connectionPoints != null) {
         this.f1c = connectionPoints;
      } else {
         this.f1c = e2;
      }
   }

   AutoShapeImp(
      com.aspose.slides.internal.o9b.j5[] vertices,
      int[] elements,
      AutoShapeImpBase$n5[] calculationData,
      int[] defData,
      AutoShapeImpBase$l6[] textRects,
      int width,
      int height,
      com.aspose.slides.internal.o9b.j5[] connectionPoints,
      int[] connectionDirections
   ) {
      super(width, height);
      this.g8v = vertices;
      this.x7n = elements;
      this.k1d = calculationData;
      this.z0k = defData;
      if (textRects == null) {
         textRects = n5;
      }

      this.v2s = textRects;
      if (connectionPoints != null) {
         this.f1c = connectionPoints;
      } else {
         this.f1c = e2;
      }
   }

   static AutoShapeImp n5(int var0) {
      switch (var0) {
         case 2:
            return c4;
         case 3:
         case 14:
         case 18:
         case 20:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 75:
         case 100:
         case 129:
         case 136:
         case 137:
         case 138:
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
         case 145:
         case 146:
         case 147:
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
         case 159:
         case 160:
         case 161:
         case 162:
         case 163:
         case 164:
         case 165:
         case 166:
         case 167:
         case 168:
         case 169:
         case 170:
         case 171:
         case 172:
         case 173:
         case 174:
         case 175:
         default:
            return null;
         case 4:
            return h2;
         case 5:
            return i9;
         case 6:
            return d5;
         case 7:
            return v4;
         case 8:
            return y0;
         case 9:
            return s4;
         case 10:
            return w2;
         case 11:
            return k8;
         case 12:
            return t7p;
         case 13:
            return h5;
         case 15:
            return o9;
         case 16:
            return s1;
         case 17:
            return u4x;
         case 19:
            return k7;
         case 21:
            return y2o;
         case 22:
            return c2;
         case 23:
            return o6t;
         case 32:
            return f2z;
         case 33:
            return b9q;
         case 34:
            return z7r;
         case 35:
            return o3h;
         case 36:
            return w2z;
         case 37:
            return t4e;
         case 38:
            return f6a;
         case 39:
            return o8n;
         case 40:
            return l9e;
         case 41:
            return q9l;
         case 42:
            return i5i;
         case 43:
            return f8i;
         case 44:
            return d1g;
         case 45:
            return f3r;
         case 46:
            return v3w;
         case 47:
            return k1b;
         case 48:
            return c7h;
         case 49:
            return v2p;
         case 50:
            return m9b;
         case 51:
            return q5b;
         case 52:
            return l6x;
         case 53:
            return d9l;
         case 54:
            return o7p;
         case 55:
            return s5;
         case 56:
            return i6;
         case 57:
            return g2x;
         case 58:
            return t2d;
         case 59:
            return t6g;
         case 60:
            return r6o;
         case 61:
            return n8n;
         case 62:
            return w2p;
         case 63:
            return y8i;
         case 64:
            return c8q;
         case 65:
            return t8;
         case 66:
            return w3;
         case 67:
            return d6;
         case 68:
            return d9;
         case 69:
            return r6;
         case 70:
            return h1;
         case 71:
            return g3j;
         case 72:
            return b7s;
         case 73:
            return e4w;
         case 74:
            return g3y;
         case 76:
            return i2;
         case 77:
            return l7h;
         case 78:
            return u6p;
         case 79:
            return b8c;
         case 80:
            return r5d;
         case 81:
            return t5g;
         case 82:
            return z1n;
         case 83:
            return l8r;
         case 84:
            return v5;
         case 85:
            return f4l;
         case 86:
            return c4i;
         case 87:
            return t1h;
         case 88:
            return v7o;
         case 89:
            return o8;
         case 90:
            return d7;
         case 91:
            return x3;
         case 92:
            return d3v;
         case 93:
            return q7;
         case 94:
            return x6;
         case 95:
            return x4a;
         case 96:
            return c7f;
         case 97:
            return a4s;
         case 98:
            return f7v;
         case 99:
            return e6;
         case 101:
            return o7;
         case 102:
            return e8;
         case 103:
            return l8;
         case 104:
            return d3;
         case 105:
            return i7;
         case 106:
            return i4u;
         case 107:
            return t6q;
         case 108:
            return b8u;
         case 109:
            return s0c;
         case 110:
            return a9t;
         case 111:
            return n6d;
         case 112:
            return a0p;
         case 113:
            return p2n;
         case 114:
            return w9c;
         case 115:
            return m5k;
         case 116:
            return l6s;
         case 117:
            return v9l;
         case 118:
            return w2k;
         case 119:
            return t6w;
         case 120:
            return o1o;
         case 121:
            return b1m;
         case 122:
            return q2c;
         case 123:
            return g3x;
         case 124:
            return p4t;
         case 125:
            return o8x;
         case 126:
            return k0r;
         case 127:
            return n1n;
         case 128:
            return w9s;
         case 130:
            return b3z;
         case 131:
            return d8v;
         case 132:
            return p1s;
         case 133:
            return t6j;
         case 134:
            return w4s;
         case 135:
            return w5i;
         case 176:
            return y4g;
         case 177:
            return o6x;
         case 178:
            return a4e;
         case 179:
            return y3s;
         case 180:
            return q8h;
         case 181:
            return p5i;
         case 182:
            return l0;
         case 183:
            return y5s;
         case 184:
            return u7c;
         case 185:
            return a2w;
         case 186:
            return o9i;
         case 187:
            return j8o;
         case 188:
            return n9p;
         case 189:
            return g0;
         case 190:
            return g5;
         case 191:
            return w7;
         case 192:
            return y3;
         case 193:
            return c1;
         case 194:
            return h3;
         case 195:
            return e6r;
         case 196:
            return f1s;
         case 197:
            return i0e;
         case 198:
            return e5a;
         case 199:
            return o9b;
         case 200:
            return v7u;
      }
   }
}
