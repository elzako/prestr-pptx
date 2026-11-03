package com.aspose.slides.internal.r5;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.o4.w1;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.x9;

public abstract class n5 extends com.aspose.slides.internal.r6.u3 {
   public final com.aspose.slides.internal.h9.n5 n5;

   protected n5(com.aspose.slides.internal.h9.n5 var1) {
      this.n5 = var1;
   }

   @Override
   protected void l6(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      this.n5.n5(var1, var2);
   }

   @Override
   protected void k5(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      this.n5.l6(var1, var2);
   }

   @Override
   protected final void u3(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      this.n5.n5(var1, this, var2);
   }

   public abstract void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2);

   public final void n5(
      long var1,
      com.aspose.slides.internal.o9b.l6 var3,
      y2 var4,
      y2 var5,
      com.aspose.slides.internal.o9b.c8 var6,
      m1 var7,
      com.aspose.slides.internal.r6.u9 var8
   ) {
      boolean var9 = w1.l6(var1);
      com.aspose.slides.internal.o9b.u3 var10 = var8.t2();
      if (var10 == null) {
         var10 = new i1(var8.q0().o8());
      }

      com.aspose.slides.internal.o9b.u3 var11 = var10;
      boolean var12 = com.aspose.slides.internal.v6g.k5.l6(var11, i1.class);
      a0 var13 = new a0(var4.n3());
      var13.l6(var7);
      y2 var14 = y2.l6(y1.n5(this.n5.n5(var13, var8)).y4()).n3();
      if (y2.u3(var14, y2.n5)) {
         var14.u3(var4);
      }

      if (var1 != 170L) {
         if (var1 == 90L && var8.z7() != null) {
            this.n5(var5.n3(), var11, var12, var8);
         } else if (var1 == 160L && var8.z7() != null) {
            this.l6(var5.n3(), var11, var12, var8);
         } else if (var1 == 240L) {
            if (com.aspose.slides.internal.v6g.k5.l6(var11, u6.class) && com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.r7.t2.class)) {
               m1 var56 = var8.<z1>n5().m1();
               ((u6)var11)
                  .k5(
                     new m1(
                        1.0F / var56.n5()[0] * var8.p3().n5().l6(),
                        var56.n5()[1],
                        var56.n5()[2],
                        1.0F / var56.n5()[3] * var8.p3().n5().k5(),
                        var56.n5()[4],
                        var56.n5()[5]
                     )
                  );
            }

            this.n5.n5(var11, this.n5(var5.n3(), var8), var8);
         } else if (var1 == 255L) {
            this.n5.n5(new i1(com.aspose.slides.internal.o9b.c8.w4().o8()), this.n5(var5.n3(), var8), var8);
         } else if (var1 == 0L) {
            this.n5.n5(new i1(com.aspose.slides.internal.o9b.c8.m3().o8()), this.n5(var5.n3(), var8), var8);
         } else if (var1 == 204L || var8.z7().h0() <= 1) {
            com.aspose.slides.internal.x4g.x8 var55 = this.n5.n5(var8);
            com.aspose.slides.internal.j9e.t2 var57 = new com.aspose.slides.internal.j9e.t2();

            try {
               if (var7.n5()[0] == -1.0F) {
                  if (var7.n5()[3] == -1.0F) {
                     var3.u3(2);
                  } else {
                     var3.u3(4);
                  }
               } else if (var7.n5()[3] == -1.0F) {
                  var3.u3(6);
               } else {
                  var57.l6(3);
               }

               this.n5.n5(var3, var5.n3(), var4.n3(), var57, var8);
            } finally {
               if (var57 != null) {
                  var57.dispose();
               }
            }

            this.n5.n5(var55, var8);
         } else if (var8.z7() != null && var3 != null) {
            a0 var15 = this.n5.l6(var8);
            y1 var16 = this.n5.n5(var5.n3(), var8).y4();
            if (var16.k5() > 0.0F && var16.k5() < 1.0F) {
               var16.n5(1.0F);
            }

            if (var16.s7() > 0.0F && var16.s7() < 1.0F) {
               var16.l6(1.0F);
            }

            y2 var17 = y2.l6(var16.y4());
            if (var17.t2() == 0 || var17.l6() == 0) {
               return;
            }

            if (var17.s7() < 0) {
               var17.k5(0);
            }

            if (var17.x8() < 0) {
               var17.u3(0);
            }

            if (var8.z7().e2() < var17.s7() + var17.t2() || var8.z7().h0() < var17.x8() + var17.l6()) {
               return;
            }

            com.aspose.slides.internal.o9b.l6 var18 = new com.aspose.slides.internal.o9b.l6(var17.t2(), var17.l6(), 2498570);
            z1 var19 = z1.n5(var18);

            try {
               com.aspose.slides.internal.j9e.t2 var20 = new com.aspose.slides.internal.j9e.t2();

               try {
                  var20.l6(3);
                  var19.n5(var3, new y2(0, 0, var17.t2(), var17.l6()), 0, 0, var3.e2(), var3.h0(), 2, var20);
               } finally {
                  if (var20 != null) {
                     var20.dispose();
                  }
               }
            } finally {
               if (var19 != null) {
                  var19.dispose();
               }
            }

            int[] var58 = new int[0];
            if (var9 && !var12) {
               com.aspose.slides.internal.o9b.l6 var21 = new com.aspose.slides.internal.o9b.l6(var18.e2(), var18.h0(), 2498570);
               z1 var22 = z1.n5(var21);

               try {
                  var22.l6(var11, new y2(0, 0, var18.e2(), var18.h0()));
               } finally {
                  if (var22 != null) {
                     var22.dispose();
                  }
               }

               com.aspose.slides.internal.j9e.n5 var23 = var21.n5(new y2(0, 0, var18.e2(), var18.h0()), 1, 2498570);
               var58 = new int[var23.l6() * var23.n5()];
               com.aspose.slides.internal.e3m.n5.n5(var23.u3(), var58, 0, var58.length);
               var21.n5(var23);
            }

            com.aspose.slides.internal.o9b.l6 var60 = var8.z7();
            z1 var61 = z1.n5(var60);

            try {
               var61.n5(var18, var17, new y2(0, 0, var18.e2(), var18.h0()), 2);
            } finally {
               if (var61 != null) {
                  var61.dispose();
               }
            }
         }
      }
   }

   private y2 n5(y2 var1, com.aspose.slides.internal.r6.u9 var2) {
      float var3 = 0.0F;
      float var4 = 0.0F;
      y2 var5 = var1.n3();

      while (var3 < 1.0F || var4 < 1.0F) {
         y1 var6 = this.n5.n5(var5.n3(), var2).y4();
         var3 = var6.s7();
         var4 = var6.k5();
         if (var3 < 1.0F) {
            var5.l6(var5.t2() + 1);
         }

         if (var4 < 1.0F) {
            var5.n5(var5.l6() + 1);
         }
      }

      return var5;
   }

   public final void l6(
      long var1,
      com.aspose.slides.internal.o9b.l6 var3,
      y2 var4,
      y2 var5,
      com.aspose.slides.internal.o9b.c8 var6,
      m1 var7,
      com.aspose.slides.internal.r6.u9 var8
   ) {
      boolean var9 = w1.l6(var1);
      com.aspose.slides.internal.o9b.u3 var10 = var8.t2();
      if (var10 == null) {
         var10 = new i1(var8.q0().o8());
      }

      com.aspose.slides.internal.o9b.u3 var11 = var10;
      boolean var12 = com.aspose.slides.internal.v6g.k5.l6(var11, i1.class);
      a0 var13 = new a0(var4.n3());
      var13.l6(var7);
      y2 var14 = y2.l6(y1.n5(this.n5.n5(var13, var8)).y4()).n3();
      if (y2.u3(var14, y2.n5)) {
         var14.u3(var4);
      }

      if (var1 != 170L) {
         if (var1 == 240L) {
            if (com.aspose.slides.internal.v6g.k5.l6(var11, u6.class)) {
               m1 var63 = var8.<z1>n5().m1();
               ((u6)var11)
                  .k5(
                     new m1(
                        1.0F / var63.n5()[0] * var8.p3().n5().l6(),
                        var63.n5()[1],
                        var63.n5()[2],
                        1.0F / var63.n5()[3] * var8.p3().n5().k5(),
                        var63.n5()[4],
                        var63.n5()[5]
                     )
                  );
            }

            this.n5.n5(var11, var5.n3(), var8);
         } else if (var1 == 255L) {
            this.n5.n5(new i1(com.aspose.slides.internal.o9b.c8.w4().o8()), var5.n3(), var8);
         } else if (var1 == 0L) {
            this.n5.n5(new i1(com.aspose.slides.internal.o9b.c8.m3().o8()), var5.n3(), var8);
         } else if (var1 == 204L || var8.z7().h0() <= 1) {
            com.aspose.slides.internal.x4g.x8 var62 = this.n5.n5(var8);
            com.aspose.slides.internal.j9e.t2 var64 = new com.aspose.slides.internal.j9e.t2();

            try {
               if (var7.n5()[0] == -1.0F) {
                  if (var7.n5()[3] == -1.0F) {
                     var3.u3(2);
                  } else {
                     var3.u3(4);
                  }
               } else if (var7.n5()[3] == -1.0F) {
                  var3.u3(6);
               } else {
                  var64.l6(3);
               }

               this.n5.n5(var3, var5.n3(), var4.n3(), var64, var8);
            } finally {
               if (var64 != null) {
                  var64.dispose();
               }
            }

            this.n5.n5(var62, var8);
         } else if (var8.z7() != null && var3 != null) {
            a0 var15 = this.n5.l6(var8);
            y2 var16 = y2.l6(this.n5.n5(var5.n3(), var8).y4()).n3();
            if (var16.t2() == 0 || var16.l6() == 0) {
               return;
            }

            if (var16.s7() < 0) {
               var16.k5(0);
            }

            if (var16.x8() < 0) {
               var16.u3(0);
            }

            if (var8.z7().e2() < var16.s7() + var16.t2() || var8.z7().h0() < var16.x8() + var16.l6()) {
               return;
            }

            com.aspose.slides.internal.o9b.l6 var17 = new com.aspose.slides.internal.o9b.l6(var16.t2(), var16.l6(), 2498570);
            z1 var18 = z1.n5(var17);

            try {
               com.aspose.slides.internal.j9e.t2 var19 = new com.aspose.slides.internal.j9e.t2();

               try {
                  var19.l6(3);
                  var18.n5(var3, new y2(0, 0, var16.t2(), var16.l6()), 0, 0, var3.e2(), var3.h0(), 2, var19);
               } finally {
                  if (var19 != null) {
                     var19.dispose();
                  }
               }
            } finally {
               if (var18 != null) {
                  var18.dispose();
               }
            }

            int[] var65 = new int[0];
            if (var9 && !var12) {
               com.aspose.slides.internal.o9b.l6 var20 = new com.aspose.slides.internal.o9b.l6(var17.e2(), var17.h0(), 2498570);
               z1 var21 = z1.n5(var20);

               try {
                  var21.l6(var11, new y2(0, 0, var17.e2(), var17.h0()));
               } finally {
                  if (var21 != null) {
                     var21.dispose();
                  }
               }

               com.aspose.slides.internal.j9e.n5 var22 = var20.n5(new y2(0, 0, var17.e2(), var17.h0()), 1, 2498570);
               var65 = new int[var22.l6() * var22.n5()];
               com.aspose.slides.internal.e3m.n5.n5(var22.u3(), var65, 0, var65.length);
               var20.n5(var22);
            }

            com.aspose.slides.internal.j9e.n5 var66 = var17.n5(new y2(0, 0, var17.e2(), var17.h0()), 1, 2498570);
            x9 var67 = var66.u3();
            int[] var68 = new int[var17.e2() * var17.h0()];
            com.aspose.slides.internal.e3m.n5.n5(var67, var68, 0, var68.length);
            com.aspose.slides.internal.j9e.n5 var23 = var8.z7().n5(new y2(0, 0, var8.z7().e2(), var8.z7().h0()), 3, 2498570);
            x9 var24 = var23.u3();
            int[] var25 = new int[var8.z7().e2() * var8.z7().h0()];
            com.aspose.slides.internal.e3m.n5.n5(var24, var25, 0, var25.length);
            long var26 = var8.q0().h0() & 4294967295L;
            z1 var28 = var8.n5();
            m1 var29 = com.aspose.slides.internal.n2d.y4.n5(var15, var28);
            var15.l6(var29);

            for (int var30 = 0; var30 < var66.n5(); var30++) {
               for (int var31 = 0; var31 < var66.l6(); var31++) {
                  if (var15.n5(var31 * var29.n5()[0], var30 * var29.n5()[3])) {
                     int var32 = (var30 + var16.x8()) * var23.l6() + var31 + var16.s7();
                     long var33 = var68[var30 * var66.l6() + var31] & 4294967295L;
                     long var35 = var9
                        ? (var12 ? com.aspose.slides.internal.v6g.k5.n5(var11, i1.class).h0().h0() : var65[var30 * var66.l6() + var31]) & 4294967295L
                        : 4278190080L;
                     long var37 = var25[var32] & 4294967295L & 4294967295L & 4294967295L;
                     byte var39 = (byte)((var37 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
                     if ((var39 & 255) > 0 && (var39 & 255) < 255) {
                        var37 = com.aspose.slides.internal.y6.c8.n5(var37, var26, var39);
                     }

                     long var40 = com.aspose.slides.internal.r6.l6.n5(var33, var37, var35, var1);
                     var25[var32] = (int)var40;
                  }
               }
            }

            Object var69 = null;
            com.aspose.slides.internal.e3m.n5.n5(var25, 0, var24, var25.length);
            Object var70 = null;
            var8.z7().n5(var23);
            var17.n5(var66);
         }
      }
   }

   private void n5(y2 var1, com.aspose.slides.internal.o9b.u3 var2, boolean var3, com.aspose.slides.internal.r6.u9 var4) {
      com.aspose.slides.internal.o9b.l6 var5 = var4.z7();
      if (var5 != null) {
         a0 var6 = this.n5.l6(var4);
         y1 var7 = var6.n5((com.aspose.slides.internal.o9b.z1)(var4.n5())).y4();
         y1 var8 = this.n5.n5(var1.n3(), var4).y4();
         y2 var9 = y2.l6(y1.n5(var8.y4(), var7.y4()).y4()).n3();
         if (!var9.k5()) {
            int var10 = 0;
            com.aspose.slides.internal.o9b.l6 var11 = null;
            com.aspose.slides.internal.j9e.n5 var12 = null;
            int[] var13 = null;
            int var14 = 0;
            if (var3) {
               var10 = ((i1)var2).h0().h0();
            } else {
               var11 = new com.aspose.slides.internal.o9b.l6(var9.t2(), var9.l6(), 2498570);
               com.aspose.slides.internal.o9b.u3 var15 = (com.aspose.slides.internal.o9b.u3)var2.deepClone();

               try {
                  z1 var16 = z1.n5(var11);

                  try {
                     if (com.aspose.slides.internal.v6g.k5.l6(var15, u6.class)) {
                        ((u6)var15).k5(new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
                     }

                     var16.l6(var15, new y2(0, 0, var9.t2(), var9.l6()));
                  } finally {
                     if (var16 != null) {
                        var16.dispose();
                     }
                  }
               } finally {
                  if (var15 != null) {
                     var15.dispose();
                  }
               }

               var12 = var11.n5(new y2(0, 0, var11.e2(), var11.h0()), 1, 2498570);
               var13 = new int[var11.e2() * var11.h0()];
               com.aspose.slides.internal.e3m.n5.n5(var12.u3(), var13, 0, var13.length);
               var14 = var12.a6() / 4;
            }

            com.aspose.slides.internal.j9e.n5 var51 = var5.n5(new y2(0, 0, var5.e2(), var5.h0()), 3, 2498570);

            try {
               int[] var52 = new int[var5.e2() * var5.h0()];
               com.aspose.slides.internal.e3m.n5.n5(var51.u3(), var52, 0, var52.length);
               int var17 = var51.a6() / 4;

               for (int var18 = 0; var18 < var9.l6(); var18++) {
                  int var19 = var18 + var9.x8();
                  if (var19 >= 0 && var19 < var5.h0()) {
                     for (int var20 = 0; var20 < var9.t2(); var20++) {
                        int var21 = var20 + var9.s7();
                        if (var21 >= 0 && var21 < var5.e2() && var6.n5(var21, var19)) {
                           int var22;
                           if (var3) {
                              var22 = var10;
                           } else {
                              int var23 = var18 * var14 + var20;
                              var22 = var13[var23];
                           }

                           int var54 = var19 * var17 + var21;
                           long var24 = var52[var54] & 4294967295L;
                           byte var26 = (byte)((var24 & 4294967295L) >> 24 & 4294967295L);
                           if ((var26 & 255) == 0) {
                              var52[var54] = var22;
                           } else {
                              long var27 = var22 & 4294967295L;
                              if (var27 == var24) {
                                 var52[var54] = 0;
                              } else {
                                 long var29 = (4278190080L | var27 & 16777215L) & 4294967295L;
                                 long var31 = (4278190080L | var24 & 16777215L) & 4294967295L;
                                 long var33 = (var31 ^ var29) & 4294967295L;
                                 long var35 = ((var26 & 255) << 24 | var33 & 16777215L) & 4294967295L;
                                 var52[var54] = (int)var35;
                              }
                           }
                        }
                     }
                  }
               }

               com.aspose.slides.internal.e3m.n5.n5(var52, 0, var51.u3(), var52.length);
               Object var53 = null;
            } finally {
               var5.n5(var51);
               if (var12 != null && var11 != null) {
                  com.aspose.slides.internal.e3m.n5.n5(var13, 0, var12.u3(), var13.length);
                  Object var50 = null;
                  var11.n5(var12);
               }

               if (var11 != null) {
                  var11.dispose();
               }
            }
         }
      }
   }

   private void l6(y2 var1, com.aspose.slides.internal.o9b.u3 var2, boolean var3, com.aspose.slides.internal.r6.u9 var4) {
      com.aspose.slides.internal.o9b.l6 var5 = var4.z7();
      if (var5 != null) {
         a0 var6 = this.n5.l6(var4);
         y1 var7 = var6.n5((com.aspose.slides.internal.o9b.z1)(var4.n5())).y4();
         y1 var8 = this.n5.n5(var1.n3(), var4).y4();
         y2 var9 = y2.l6(y1.n5(var8.y4(), var7.y4()).y4()).n3();
         if (!var9.k5()) {
            int var10 = 0;
            com.aspose.slides.internal.o9b.l6 var11 = null;
            com.aspose.slides.internal.j9e.n5 var12 = null;
            int[] var13 = null;
            int var14 = 0;
            if (var3) {
               var10 = ((i1)var2).h0().h0();
            } else {
               var11 = new com.aspose.slides.internal.o9b.l6(var9.t2(), var9.l6(), 2498570);
               com.aspose.slides.internal.o9b.u3 var15 = (com.aspose.slides.internal.o9b.u3)var2.deepClone();

               try {
                  z1 var16 = z1.n5(var11);

                  try {
                     if (com.aspose.slides.internal.v6g.k5.l6(var15, u6.class)) {
                        ((u6)var15).k5(new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
                     }

                     var16.l6(var15, new y2(0, 0, var9.t2(), var9.l6()));
                  } finally {
                     if (var16 != null) {
                        var16.dispose();
                     }
                  }
               } finally {
                  if (var15 != null) {
                     var15.dispose();
                  }
               }

               var12 = var11.n5(new y2(0, 0, var11.e2(), var11.h0()), 1, 2498570);
               var13 = new int[var11.e2() * var11.h0()];
               com.aspose.slides.internal.e3m.n5.n5(var12.u3(), var13, 0, var13.length);
               var14 = var12.a6() / 4;
            }

            com.aspose.slides.internal.j9e.n5 var53 = var5.n5(new y2(0, 0, var5.e2(), var5.h0()), 3, 2498570);

            try {
               int[] var54 = new int[var5.e2() * var5.h0()];
               com.aspose.slides.internal.e3m.n5.n5(var53.u3(), var54, 0, var54.length);
               int var17 = var53.a6() / 4;

               for (int var18 = 0; var18 < var9.l6(); var18++) {
                  int var19 = var18 + var9.x8();
                  if (var19 >= 0 && var19 < var5.h0()) {
                     for (int var20 = 0; var20 < var9.t2(); var20++) {
                        int var21 = var20 + var9.s7();
                        if (var21 >= 0 && var21 < var5.e2() && var6.n5(var21, var19)) {
                           int var22;
                           if (var3) {
                              var22 = var10;
                           } else {
                              int var23 = var18 * var14 + var20;
                              var22 = var13[var23];
                           }

                           int var56 = var19 * var17 + var21;
                           long var24 = var54[var56] & 4294967295L;
                           byte var26 = (byte)((var24 & 4294967295L) >> 24 & 4294967295L);
                           long var27 = var22 & 4294967295L;
                           byte var29 = (byte)((var27 & 4294967295L) >> 24 & 4294967295L);
                           byte var30 = (var26 & 255) == 0 ? var29 : var26;
                           long var31 = (4278190080L | var27 & 16777215L) & 4294967295L;
                           long var33 = (4278190080L | var24 & 16777215L) & 4294967295L;
                           long var35 = var31 & var33 & 4294967295L;
                           long var37 = ((var30 & 255) << 24 | var35 & 16777215L) & 4294967295L;
                           var54[var56] = (int)var37;
                        }
                     }
                  }
               }

               com.aspose.slides.internal.e3m.n5.n5(var54, 0, var53.u3(), var54.length);
               Object var55 = null;
            } finally {
               var5.n5(var53);
               if (var12 != null && var11 != null) {
                  com.aspose.slides.internal.e3m.n5.n5(var13, 0, var12.u3(), var13.length);
                  Object var52 = null;
                  var11.n5(var12);
               }

               if (var11 != null) {
                  var11.dispose();
               }
            }
         }
      }
   }

   public static float[] n5(float var0, float var1, float[] var2) {
      float var3 = var2[0] * var0 + var2[1] * var1 + var2[4];
      float var4 = var2[2] * var0 + var2[3] * var1 + var2[5];
      return new float[]{var3, var4};
   }

   @Deprecated
   public static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, m1 var1) {
      float[] var2 = var1.n5();
      float var3 = var2[0] * var0.l6() + var2[1] * var0.k5() + var2[4];
      float var4 = var2[2] * var0.l6() + var2[3] * var0.k5() + var2[5];
      return new com.aspose.slides.internal.o9b.w1(var3, var4);
   }
}
