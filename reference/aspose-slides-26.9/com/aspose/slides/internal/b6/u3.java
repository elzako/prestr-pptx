package com.aspose.slides.internal.b6;

import com.aspose.slides.ms.System.q1;

public abstract class u3 extends z1 {
   public final void n5(
      long var1,
      com.aspose.slides.internal.o9b.l6 var3,
      com.aspose.slides.internal.o9b.y2 var4,
      com.aspose.slides.internal.o9b.y2 var5,
      boolean var6,
      com.aspose.slides.internal.o9b.z1 var7,
      com.aspose.slides.internal.g1.u9 var8
   ) {
      boolean var9 = com.aspose.slides.internal.o4.w1.l6(var1);
      com.aspose.slides.internal.o9b.u3 var10 = var8.c8();
      if (var10 == null) {
         var10 = new com.aspose.slides.internal.o9b.i1(var8.e2().o8());
      }

      com.aspose.slides.internal.o9b.u3 var11 = var10;
      boolean var12 = com.aspose.slides.internal.v6g.k5.l6(var11, com.aspose.slides.internal.o9b.i1.class);
      switch ((int)var1) {
         case 0:
            var7.l6(new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.m3().o8()), var5.n3());
            break;
         case 170:
            return;
         case 204:
            com.aspose.slides.internal.x4g.x8 var85 = var7.l6();
            com.aspose.slides.internal.g1.h0.n5(var4.n3(), new com.aspose.slides.internal.o9b.y2(0, 0, var3.e2(), var3.h0())).u3(var4);
            com.aspose.slides.internal.j9e.t2 var87 = new com.aspose.slides.internal.j9e.t2();

            try {
               var87.l6(3);
               var7.a6(2);
               var7.k5(7);
               var7.n5(var3, var5.n3(), (float)var4.s7(), (float)var4.x8(), (float)var4.t2(), (float)var4.l6(), 2, var87);
            } finally {
               if (var87 != null) {
                  var87.dispose();
               }
            }

            var7.n5(var85);
            break;
         case 240:
            var7.l6(var11, var5.n3());
            break;
         case 255:
            var7.l6(new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.w4().o8()), var5.n3());
            break;
         default:
            com.aspose.slides.internal.o9b.a0 var13 = var7.u9();
            var13.l6(var7.m1());
            com.aspose.slides.internal.o9b.l6 var14 = null;
            if (var3.s7() == 2498570 && var4.s7() == 0 && var4.x8() == 0 && var4.t2() == var3.e2() && var4.l6() == var3.h0()) {
               var14 = var3;
            } else {
               com.aspose.slides.internal.o9b.y2 var15 = com.aspose.slides.internal.g1.h0.n5(
                     var4.n3(), new com.aspose.slides.internal.o9b.y2(0, 0, var3.e2(), var3.h0())
                  )
                  .n3();
               var14 = new com.aspose.slides.internal.o9b.l6(var4.t2(), var4.l6(), 2498570);
               com.aspose.slides.internal.o9b.z1 var16 = com.aspose.slides.internal.o9b.z1.n5(var14);

               try {
                  com.aspose.slides.internal.j9e.t2 var17 = new com.aspose.slides.internal.j9e.t2();

                  try {
                     var17.l6(3);
                     var16.n5(var3, new com.aspose.slides.internal.o9b.y2(0, 0, var4.t2(), var4.l6()), var15.s7(), var15.x8(), var15.t2(), var15.l6(), 2, var17);
                  } finally {
                     if (var17 != null) {
                        var17.dispose();
                     }
                  }
               } finally {
                  if (var16 != null) {
                     var16.dispose();
                  }
               }
            }

            com.aspose.slides.internal.o9b.y1 var88 = n5(var5.n3(), var8, var7).y4();
            com.aspose.slides.internal.o9b.y1 var89 = com.aspose.slides.internal.o9b.y1.n5(
                  var88.y4(), new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var8.z3().e2(), var8.z3().h0())
               )
               .y4();
            com.aspose.slides.internal.j9e.n5 var90 = var8.z3().n5(new com.aspose.slides.internal.o9b.y2(0, 0, var8.z3().e2(), var8.z3().h0()), 3, 2498570);
            int var18 = var4.t2();
            int var19 = var4.l6();
            com.aspose.slides.internal.j9e.n5 var20 = null;
            int[] var22;
            if (var14 != null) {
               var18 = var14.e2();
               var19 = var14.h0();
               var20 = var14.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var18, var19), 1, 2498570);
               com.aspose.slides.ms.System.x9 var21 = var20.u3();
               var22 = new int[var18 * var19];
               com.aspose.slides.internal.e3m.n5.n5(var21, var22, 0, var22.length);
            } else {
               var22 = null;
            }

            com.aspose.slides.ms.System.x9 var91 = var90.u3();
            int[] var23 = new int[var90.l6() * var90.n5()];
            int[] var24 = new int[0];
            com.aspose.slides.internal.e3m.n5.n5(var91, var23, 0, var23.length);
            int[] var25 = (int[])var23.clone();
            if (var9 && !var12) {
               com.aspose.slides.internal.o9b.l6 var26 = new com.aspose.slides.internal.o9b.l6(var18, var19, 2498570);
               com.aspose.slides.internal.o9b.z1 var27 = com.aspose.slides.internal.o9b.z1.n5(var26);

               try {
                  var27.l6(var11, new com.aspose.slides.internal.o9b.y2(0, 0, var18, var19));
               } finally {
                  if (var27 != null) {
                     var27.dispose();
                  }
               }

               com.aspose.slides.internal.j9e.n5 var28 = var26.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var18, var19), 1, 2498570);
               var24 = new int[var28.l6() * var28.n5()];
               com.aspose.slides.internal.e3m.n5.n5(var28.u3(), var24, 0, var24.length);
               var26.n5(var28);
            }

            com.aspose.slides.internal.x4g.m1 var92 = new com.aspose.slides.internal.x4g.m1(
               var88.s7() / var18, 0.0F, 0.0F, var88.k5() / var19, var88.u9().l6(), var88.u9().k5()
            );
            com.aspose.slides.internal.x4g.m1 var93 = var92.u9();
            var93.h0();
            float[] var94 = var92.n5();
            float[] var29 = var93.n5();
            int var30 = var8.z3().h0();
            int var31 = var8.z3().e2();
            float var32 = var89.n3();
            float var33 = var89.x8();
            float var34 = var89.h0();
            float var35 = var89.l6();
            float var36 = var89.k5();
            float var37 = var89.s7();
            long var38 = var8.e2().h0() & 4294967295L;

            for (int var40 = 0; var40 < q1.n5((float)(var36), (float)(var19)); var40++) {
               int var41;
               int var42;
               if (var36 > var19) {
                  if (var40 >= var30) {
                     continue;
                  }

                  var41 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var40 + var32), 14);
                  var42 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(0.0F, var41, var29)[1]), 14);
               } else {
                  if (var40 >= var19) {
                     continue;
                  }

                  var42 = var40;
                  var41 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(0.0F, var42, var94)[1]), 14);
               }

               for (int var43 = 0; var43 < q1.n5((float)(var37), (float)(var18)); var43++) {
                  int var44;
                  int var45;
                  if (var37 > var18) {
                     if (var43 >= var31) {
                        continue;
                     }

                     var44 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var43 + var33), 14);
                     var45 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(var44, 0.0F, var29)[0]), 14);
                  } else {
                     if (var43 >= var18) {
                        continue;
                     }

                     var45 = var43;
                     var44 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(var45, 0.0F, var94)[0]), 14);
                  }

                  if (var13.n5(var44, var41)) {
                     var45 = q1.l6(var45, var18 - 1);
                     var42 = q1.l6(var42, var19 - 1);
                     var44 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var44, var34 - 1.0F), 13);
                     var41 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var41, var35 - 1.0F), 13);
                     int var46 = var42 * var18 + var45;
                     long var47 = n5(var1, var8, var89.y4(), var18, var44, var29, var46, var45, var42, var19, var41, var22);
                     long var49 = var9
                        ? (var12 ? com.aspose.slides.internal.v6g.k5.n5(var11, com.aspose.slides.internal.o9b.i1.class).h0().h0() : var24[var46]) & 4294967295L
                        : 4278190080L;
                     int var51 = var41 * var90.l6() + var44;
                     if (var51 < var23.length && var51 >= 0) {
                        long var52 = var23[var51] & 4294967295L & 4294967295L & 4294967295L;
                        byte var54 = (byte)((var52 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
                        if ((var54 & 255) > 0 && (var54 & 255) < 255) {
                           var52 = com.aspose.slides.internal.y6.c8.n5(var52, var38, var54);
                        }

                        long var55 = com.aspose.slides.internal.r6.l6.n5(var47, var52, var49, var1);
                        if (var25[var51] != var23[var51]) {
                           long var57 = var25[var51] & 4294967295L;
                           byte var59 = com.aspose.slides.internal.v6g.k5.n5(
                              (Object)((((byte)((var57 & 4294967295L) >> 24 & 4294967295L) & 255) + ((byte)((var55 & 4294967295L) >> 24 & 4294967295L) & 255)) / 2.0F),
                              (int)(13
                           ));
                           byte var60 = com.aspose.slides.internal.v6g.k5.n5(
                              (Object)((((byte)((var57 & 4294967295L) >> 16 & 4294967295L) & 255) + ((byte)((var55 & 4294967295L) >> 16 & 4294967295L) & 255)) / 2.0F),
                              (int)(13
                           ));
                           byte var61 = com.aspose.slides.internal.v6g.k5.n5(
                              (Object)((((byte)((var57 & 4294967295L) >> 8 & 4294967295L) & 255) + ((byte)((var55 & 4294967295L) >> 8 & 4294967295L) & 255)) / 2.0F), (int)(13
                           ));
                           byte var62 = com.aspose.slides.internal.v6g.k5.n5(
                              (Object)((((byte)((var57 & 4294967295L) >> 0 & 4294967295L) & 255) + ((byte)((var55 & 4294967295L) >> 0 & 4294967295L) & 255)) / 2.0F), (int)(13
                           ));
                           long var63 = (
                                 (var59 & 255) << 24 & 4294967295L & 4278190080L & 4294967295L
                                    | (var60 & 255) << 16 & 0xFF0000
                                    | (var61 & 255) << 8 & 0xFF00
                                    | (var62 & 255) << 0 & 0xFF
                              )
                              & 4294967295L;
                           var25[var51] = (int)var63;
                        } else {
                           var25[var51] = (int)var55;
                        }
                     }
                  }
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var25, 0, var91, var25.length);
            var8.z3().n5(var90);
            if (var14 != null) {
               var14.n5(var20);
            }
      }
   }

   private static long n5(
      long var0,
      com.aspose.slides.internal.g1.u9 var2,
      com.aspose.slides.internal.o9b.y1 var3,
      int var4,
      int var5,
      float[] var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int[] var12
   ) {
      if (var12 == null) {
         return 4278190080L;
      }

      long var13 = var12[var7] & 4294967295L;
      if (var0 == 204L) {
         if (var3.s7() > var4) {
            float var15 = n5(var5, 0.0F, var6)[0];
            long var16 = var12[var7] & 4294967295L;
            float var18 = q1.n5(var15 - var8);
            if (var15 > var8) {
               int var19 = var9 * var4 + var8 + 1;
               if (var19 < var12.length && var19 >= 0) {
                  var16 = var12[var19] & 4294967295L;
                  byte var20 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * (1.0F - var18)
                        + ((byte)((var16 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * var18),
                     13
                  );
                  byte var21 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * (1.0F - var18)
                        + ((byte)((var16 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * var18),
                     13
                  );
                  byte var22 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * (1.0F - var18)
                        + ((byte)((var16 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * var18),
                     13
                  );
                  var13 = (var13 & 4278190080L & 4294967295L | (var20 & 255) << 16 & 0xFF0000 | (var21 & 255) << 8 & 0xFF00 | (var22 & 255) << 0 & 0xFF)
                     & 4294967295L;
               }
            } else if (var15 < var8) {
               int var30 = var9 * var4 + var8 - 1;
               if (var30 < var12.length && var30 >= 0) {
                  var16 = var12[var30] & 4294967295L;
                  byte var33 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * (1.0F - var18)
                        + ((byte)((var16 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * var18),
                     13
                  );
                  byte var36 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * (1.0F - var18)
                        + ((byte)((var16 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * var18),
                     13
                  );
                  byte var39 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * (1.0F - var18)
                        + ((byte)((var16 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * var18),
                     13
                  );
                  var13 = (var13 & 4278190080L & 4294967295L | (var33 & 255) << 16 & 0xFF0000 | (var36 & 255) << 8 & 0xFF00 | (var39 & 255) << 0 & 0xFF)
                     & 4294967295L;
               }
            }
         } else if (var3.s7() < var4 && var2.w1() == 4) {
         }

         if (var3.k5() > var10) {
            float var23 = n5(0.0F, var11, var6)[1];
            long var26 = var12[var7] & 4294967295L;
            float var29 = q1.n5(var23 - var9);
            if (var23 > var9) {
               int var31 = (var9 + 1) * var4 + var8;
               if (var31 < var12.length && var31 >= 0) {
                  var26 = var12[var31] & 4294967295L;
                  byte var34 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * (1.0F - var29)
                        + ((byte)((var26 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * var29),
                     13
                  );
                  byte var37 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * (1.0F - var29)
                        + ((byte)((var26 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * var29),
                     13
                  );
                  byte var40 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * (1.0F - var29)
                        + ((byte)((var26 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * var29),
                     13
                  );
                  var13 = (var13 & 4278190080L & 4294967295L | (var34 & 255) << 16 & 0xFF0000 | (var37 & 255) << 8 & 0xFF00 | (var40 & 255) << 0 & 0xFF)
                     & 4294967295L;
               }
            } else if (var23 < var9) {
               int var32 = (var9 - 1) * var4 + var8;
               if (var32 < var12.length && var32 >= 0) {
                  var26 = var12[var32] & 4294967295L;
                  byte var35 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * (1.0F - var29)
                        + ((byte)((var26 & 4294967295L) >> 16 & 4294967295L) & 0xFF) * var29),
                     13
                  );
                  byte var38 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * (1.0F - var29)
                        + ((byte)((var26 & 4294967295L) >> 8 & 4294967295L) & 0xFF) * var29),
                     13
                  );
                  byte var41 = com.aspose.slides.internal.v6g.k5.n5(
                     (Object)(((byte)((var13 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * (1.0F - var29)
                        + ((byte)((var26 & 4294967295L) >> 0 & 4294967295L) & 0xFF) * var29),
                     13
                  );
                  var13 = (var13 & 4278190080L & 4294967295L | (var35 & 255) << 16 & 0xFF0000 | (var38 & 255) << 8 & 0xFF00 | (var41 & 255) << 0 & 0xFF)
                     & 4294967295L;
               }
            }
         }
      }

      return var13;
   }

   public static float[] n5(float var0, float var1, float[] var2) {
      float var3 = var2[0] * var0 + var2[1] * var1 + var2[4];
      float var4 = var2[2] * var0 + var2[3] * var1 + var2[5];
      return new float[]{var3, var4};
   }

   public static com.aspose.slides.internal.o9b.y1 n5(
      com.aspose.slides.internal.o9b.y2 var0, com.aspose.slides.internal.g1.u9 var1, com.aspose.slides.internal.o9b.z1 var2
   ) {
      com.aspose.slides.internal.o9b.a0 var3 = new com.aspose.slides.internal.o9b.a0(var0.n3());
      var3.l6(var1.p8());
      return var3.n5(var2);
   }

   protected final com.aspose.slides.internal.o9b.l6 n5(boolean var1, com.aspose.slides.internal.k1.l6 var2, com.aspose.slides.internal.g1.u9 var3) {
      if (var1) {
         return var2.t2();
      }

      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var3.y1(), var3.a0());
      com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var4);

      try {
         var5.a6(1);
         var5.k5(7);
         var5.n5(var3.z3(), new com.aspose.slides.internal.o9b.y2(0, 0, var3.y1(), var3.a0()));
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var4;
   }
}
