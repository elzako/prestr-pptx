package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public final class e5 {
   private s3 n5;
   private v8 l6 = new v8();
   private byte[] k5;
   private float[] u3;
   private short[] a6;
   private float u9 = 0.0078125F;
   private boolean h0;

   public e5(int var1, int var2) {
      this(var1, var2, false);
   }

   public e5(int var1, int var2, boolean var3) {
      this.l6.n5(var1);
      this.l6.l6(var2);
      this.h0 = var3;
      int var4 = this.l6.n5() * this.l6.l6();
      this.k5 = new byte[var4 * 4];
      if (!this.h0) {
         this.u3 = new float[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            this.u3[var5] = -Float.MAX_VALUE;
         }
      } else {
         this.a6 = new short[var4];

         for (int var6 = 0; var6 < var4; var6++) {
            this.a6[var6] = -1;
         }
      }

      this.n5(4278190080L);
   }

   public final byte[] n5() {
      return this.k5;
   }

   final void n5(byte[] var1) {
      this.k5 = var1;
   }

   public final v8 l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      byte var3 = (byte)(var1 & 4294967295L & 255L & 4294967295L);
      byte var4 = (byte)((var1 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
      byte var5 = (byte)((var1 & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
      byte var6 = (byte)((var1 & 4294967295L) >> 24 & 4294967295L & 255L & 4294967295L);
      int var7 = 0;

      for (int var8 = this.l6.n5() * this.l6.l6(); var8-- > 0; this.k5[var7++] = var6) {
         this.k5[var7++] = var3;
         this.k5[var7++] = var4;
         this.k5[var7++] = var5;
      }
   }

   public final void n5(y2 var1, o0... var2) {
      for (o0 var6 : var2) {
         if (var6 != null) {
            var6.l6();
         }
      }

      IGenericEnumerator var12 = var1.iterator();

      try {
         while (var12.hasNext()) {
            c4 var13 = (c4)var12.next();

            for (o0 var8 : var2) {
               if (var8 != null && (var8.u9() & var13.u3()) != 0) {
                  this.n5(var13, var8);
                  break;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      for (o0 var19 : var2) {
         if (var19 != null) {
            var19.k5();
         }
      }

      if (this.k5() != null) {
         this.k5().l6(this);
      }
   }

   private void n5(c4 var1, o0 var2) {
      b3 var3 = var2.u3();
      boolean var4 = var3.l6().h0() != 0.0F;
      v3 var5 = new v3();
      v3 var6 = new v3();
      v3 var7 = new v3();
      v3 var8 = new v3();
      v3 var9 = new v3();
      v3 var10 = new v3(0.0F);
      var10.l6(var9);
      var10.l6(var8);
      var10.l6(var7);
      var10.l6(var6);
      var10.l6(var5);
      IGenericEnumerator var11 = var1.iterator();

      try {
         while (var11.hasNext()) {
            o0$n5 var12 = (o0$n5)var11.next();
            o0$k5 var13 = var2.n5(var12.n5.n5()).n5();
            o0$k5 var14 = var2.n5(var12.l6.n5()).n5();
            o0$k5 var15 = var2.n5(var12.k5.n5()).n5();
            if (!(var13.n5.k5() < 0.0F) && !(var14.n5.k5() < 0.0F) && !(var15.n5.k5() < 0.0F)) {
               v8 var16 = w2.n5(g7.l6(var13.n5, var13.n5.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
               v8 var17 = w2.n5(g7.l6(var14.n5, var14.n5.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
               v8 var18 = w2.n5(g7.l6(var15.n5, var15.n5.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
               if (var3.u3() == 2) {
                  float var19 = (var17.n5() - var16.n5()) * (var17.l6() + var16.l6())
                     + (float)(var18.n5() - var17.n5()) * (var18.l6() + var17.l6())
                     + (float)(var16.n5() - var18.n5()) * (var16.l6() + var18.l6());
                  if (var19 > 0.0F) {
                     continue;
                  }
               } else if (var3.u3() == 1) {
                  float var64 = (var17.n5() - var16.n5()) * (var17.l6() + var16.l6())
                     + (float)(var18.n5() - var17.n5()) * (var18.l6() + var17.l6())
                     + (float)(var16.n5() - var18.n5()) * (var16.l6() + var18.l6());
                  if (var64 < 0.0F) {
                     continue;
                  }
               }

               float var65 = s0.l6(var14.k5, var13.k5).k5();
               float var20 = s0.l6(var15.k5, var14.k5).k5();
               float var21 = s0.l6(var13.k5, var15.k5).k5();
               float var22 = var65 != 0.0F ? v8.n5(var17, var16).k5() / var65 : Float.MAX_VALUE;
               float var23 = var20 != 0.0F ? v8.n5(var18, var17).k5() / var20 : Float.MAX_VALUE;
               float var24 = var21 != 0.0F ? v8.n5(var16, var18).k5() / var21 : Float.MAX_VALUE;
               float var25 = w2.n5(var22, new float[]{var23, var24});
               var2.a6().updateCurrentLevel(var25);
               if (var17.l6() < var16.l6()) {
                  v8[] var26 = new v8[]{var17};
                  v8[] var27 = new v8[]{var16};
                  w2.n5(var26, var27);
                  var26[0].l6(var17);
                  var27[0].l6(var16);
                  o0$k5[] var28 = new o0$k5[]{var14};
                  o0$k5[] var29 = new o0$k5[]{var13};
                  w2.n5(var28, var29);
                  var28[0].n5(var14);
                  var29[0].n5(var13);
               }

               if (var18.l6() < var16.l6()) {
                  v8[] var66 = new v8[]{var18};
                  v8[] var69 = new v8[]{var16};
                  w2.n5(var66, var69);
                  var66[0].l6(var18);
                  var69[0].l6(var16);
                  o0$k5[] var72 = new o0$k5[]{var15};
                  o0$k5[] var75 = new o0$k5[]{var13};
                  w2.n5(var72, var75);
                  var72[0].n5(var15);
                  var75[0].n5(var13);
               }

               if (var18.l6() < var17.l6()) {
                  v8[] var67 = new v8[]{var18};
                  v8[] var70 = new v8[]{var17};
                  w2.n5(var67, var70);
                  var67[0].l6(var18);
                  var70[0].l6(var17);
                  o0$k5[] var73 = new o0$k5[]{var15};
                  o0$k5[] var76 = new o0$k5[]{var14};
                  w2.n5(var73, var76);
                  var73[0].n5(var15);
                  var76[0].n5(var14);
               }

               if (var4) {
                  var5 = new v3(var13.k5.n5() / var13.n5.u3(), var13.k5.l6() / var13.n5.u3(), 1.0F / var13.n5.u3());
                  var6 = new v3(var14.k5.n5() / var14.n5.u3(), var14.k5.l6() / var14.n5.u3(), 1.0F / var14.n5.u3());
                  var7 = new v3(var15.k5.n5() / var15.n5.u3(), var15.k5.l6() / var15.n5.u3(), 1.0F / var15.n5.u3());
               }

               int var68 = var18.l6() - var16.l6();

               for (int var71 = var16.l6(); var71 <= var18.l6(); var71++) {
                  if (var71 >= 0 && var71 < this.l6.l6()) {
                     boolean var74 = var71 > var17.l6() || var17.l6() == var16.l6();
                     int var77 = var74 ? var18.l6() - var17.l6() : var17.l6() - var16.l6();
                     float var30 = (float)(var71 - var16.l6()) / var68;
                     float var31 = (float)(var71 - (var74 ? var17.l6() : var16.l6())) / var77;
                     float var32 = var16.n5() + (var18.n5() - var16.n5()) * var30;
                     float var33 = var74 ? var17.n5() + (var18.n5() - var17.n5()) * var31 : var16.n5() + (var17.n5() - var16.n5()) * var31;
                     g7 var34 = g7.n5(var13.n5, g7.n5(g7.l6(var15.n5, var13.n5), var30)).u9();
                     g7 var35 = (var74 ? g7.n5(var14.n5, g7.n5(g7.l6(var15.n5, var14.n5), var31)) : g7.n5(var13.n5, g7.n5(g7.l6(var14.n5, var13.n5), var31)))
                        .u9();
                     v3 var36 = v3.n5(var13.l6, v3.n5(v3.l6(var15.l6, var13.l6), var30)).h0();
                     v3 var37 = (var74 ? v3.n5(var14.l6, v3.n5(v3.l6(var15.l6, var14.l6), var31)) : v3.n5(var13.l6, v3.n5(v3.l6(var14.l6, var13.l6), var31)))
                        .h0();
                     s0 var38 = s0.n5(var13.k5, s0.n5(s0.l6(var15.k5, var13.k5), var30)).a6();
                     s0 var39 = (var74 ? s0.n5(var14.k5, s0.n5(s0.l6(var15.k5, var14.k5), var31)) : s0.n5(var13.k5, s0.n5(s0.l6(var14.k5, var13.k5), var31)))
                        .a6();
                     v3 var40 = v3.n5(var13.u3, v3.n5(v3.l6(var15.u3, var13.u3), var30)).h0();
                     v3 var41 = (var74 ? v3.n5(var14.u3, v3.n5(v3.l6(var15.u3, var14.u3), var31)) : v3.n5(var13.u3, v3.n5(v3.l6(var14.u3, var13.u3), var31)))
                        .h0();
                     if (var4) {
                        v3.n5(var5, v3.n5(v3.l6(var7, var5), var30)).l6(var8);
                        (var74 ? v3.n5(var6, v3.n5(v3.l6(var7, var6), var31)) : v3.n5(var5, v3.n5(v3.l6(var6, var5), var31))).l6(var9);
                     }

                     if (var32 > var33) {
                        Float[] var42 = new Float[]{var32};
                        Float[] var43 = new Float[]{var33};
                        w2.n5(var42, var43);
                        var32 = var42[0];
                        var33 = var43[0];
                        g7[] var44 = new g7[]{var34};
                        g7[] var45 = new g7[]{var35};
                        w2.n5(var44, var45);
                        var44[0].n5(var34);
                        var45[0].n5(var35);
                        v3[] var46 = new v3[]{var36};
                        v3[] var47 = new v3[]{var37};
                        w2.n5(var46, var47);
                        var46[0].l6(var36);
                        var47[0].l6(var37);
                        s0[] var48 = new s0[]{var38};
                        s0[] var49 = new s0[]{var39};
                        w2.n5(var48, var49);
                        var48[0].n5(var38);
                        var49[0].n5(var39);
                        v3[] var50 = new v3[]{var40};
                        v3[] var51 = new v3[]{var41};
                        w2.n5(var50, var51);
                        var50[0].l6(var40);
                        var51[0].l6(var41);
                        v3[] var52 = new v3[]{var8};
                        v3[] var53 = new v3[]{var9};
                        w2.n5(var52, var53);
                        var52[0].l6(var8);
                        var53[0].l6(var9);
                     }

                     int var78 = com.aspose.slides.internal.v6g.k5.u3(var32, 13);
                     int var79 = com.aspose.slides.internal.v6g.k5.u3(var33, 13);

                     for (int var80 = var78; var80 <= var79; var80++) {
                        if (var80 >= 0 && var80 < this.l6.n5()) {
                           float var81 = var78 == var79 ? 1.0F : (var80 - var32) / (var33 - var32);
                           g7 var82 = g7.n5(var34, g7.n5(g7.l6(var35, var34), var81)).u9();
                           v3 var83 = v3.n5(var36, v3.n5(v3.l6(var37, var36), var81)).h0();
                           s0 var84 = s0.n5(var38, s0.n5(s0.l6(var39, var38), var81)).a6();
                           v3 var85 = v3.n5(var40, v3.n5(v3.l6(var41, var40), var81)).h0();
                           float var86;
                           if (var4) {
                              v3 var87 = v3.n5(var8, v3.n5(v3.l6(var9, var8), var81)).h0();
                              var84.n5(var87.n5() / var87.k5());
                              var84.l6(var87.l6() / var87.k5());
                              var86 = var87.k5();
                           } else {
                              var86 = -var82.k5();
                           }

                           int var88 = var80 + var71 * this.l6.n5();
                           if (this.h0 || !(var86 <= this.u3[var88])) {
                              int var89 = var88 * 4;
                              o0$k5 var90 = new o0$k5();
                              var82.n5(var90.n5);
                              var83.l6(var90.l6);
                              var84.n5(var90.k5);
                              var85.l6(var90.u3);
                              g7 var54 = var2.n5(var90.n5()).u9();
                              if (!(var54.u3() < this.u9)) {
                                 if (!this.h0) {
                                    w2.n5(var54.u9(), this.k5, var89);
                                    this.u3[var88] = var86;
                                 } else {
                                    short var55 = this.a6[var88];
                                    if (var55 == -1) {
                                       w2.n5(var54.u9(), this.k5, var89);
                                       this.a6[var88] = var1.a6();
                                    } else if (var55 != var1.a6()) {
                                       float var56 = (this.k5[var89] & 0xFF) / 255.0F;
                                       float var57 = (this.k5[var89 + 1] & 0xFF) / 255.0F;
                                       float var58 = (this.k5[var89 + 2] & 0xFF) / 255.0F;
                                       float var59 = (this.k5[var89 + 3] & 0xFF) / 255.0F;
                                       float var60 = var54.u3();
                                       var54.n5(var54.n5() * var60 + var56 * (1.0F - var60));
                                       var54.l6(var54.l6() * var60 + var57 * (1.0F - var60));
                                       var54.k5(var54.k5() * var60 + var58 * (1.0F - var60));
                                       var54.u3(var60 + var59 * (1.0F - var60));
                                       w2.n5(var54.u9(), this.k5, var89);
                                       this.a6[var88] = var1.a6();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }
   }

   public final void n5(y2 var1, o0 var2, long var3, float var5) {
      var2.l6();
      IGenericEnumerator var6 = var1.iterator();

      try {
         while (var6.hasNext()) {
            c4 var7 = (c4)var6.next();
            this.n5(var7, var2, var3, var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var2.k5();
   }

   private void n5(c4 var1, o0 var2, long var3, float var5) {
      b3 var6 = var2.u3();
      b3 var7 = var2.u3();
      r4 var8 = r4.n5(r4.n5(var6.k5(), var6.n5()), var6.l6()).c8();
      IGenericEnumerator var9 = var1.iterator();

      try {
         while (var9.hasNext()) {
            o0$n5 var10 = (o0$n5)var9.next();
            g7 var11 = var8.k5(var10.n5.n5.h0()).u9();
            g7 var12 = var8.k5(var10.l6.n5.h0()).u9();
            g7 var13 = var8.k5(var10.k5.n5.h0()).u9();
            if (!(var11.k5() < 0.0F) && !(var12.k5() < 0.0F) && !(var13.k5() < 0.0F)) {
               v8 var14 = w2.n5(g7.l6(var11, var11.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
               v8 var15 = w2.n5(g7.l6(var12, var12.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
               v8 var16 = w2.n5(g7.l6(var13, var13.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
               this.n5(var14.n5(), var14.l6(), var15.n5(), var15.l6(), var3);
               this.n5(var15.n5(), var15.l6(), var16.n5(), var16.l6(), var3);
               this.n5(var16.n5(), var16.l6(), var14.n5(), var14.l6(), var3);
               if (var5 > 0.0F) {
                  g7 var17 = var8.k5(v3.n5(var10.n5.n5, v3.n5(var10.n5.l6, var5)).h0()).u9();
                  g7 var18 = var8.k5(v3.n5(var10.l6.n5, v3.n5(var10.l6.l6, var5)).h0()).u9();
                  g7 var19 = var8.k5(v3.n5(var10.k5.n5, v3.n5(var10.k5.l6, var5)).h0()).u9();
                  if (!(var17.k5() < 0.0F) && !(var18.k5() < 0.0F) && !(var19.k5() < 0.0F)) {
                     v8 var20 = w2.n5(g7.l6(var17, var17.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
                     v8 var21 = w2.n5(g7.l6(var18, var18.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
                     v8 var22 = w2.n5(g7.l6(var19, var19.u3()).u9(), this.l6.n5(), this.l6.l6()).u3();
                     this.n5(var14.n5(), var14.l6(), var20.n5(), var20.l6(), 4294901760L);
                     this.n5(var15.n5(), var15.l6(), var21.n5(), var21.l6(), 4294901760L);
                     this.n5(var16.n5(), var16.l6(), var22.n5(), var22.l6(), 4294901760L);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }
   }

   public final void n5(int var1, int var2, long var3) {
      if (var1 >= 0 && var2 >= 0 && var1 < this.l6.n5() && var2 < this.l6.l6()) {
         int var5 = 4 * (var1 + var2 * this.l6.n5());
         this.k5[var5] = (byte)(var3 & 4294967295L & 255L & 4294967295L);
         this.k5[var5 + 1] = (byte)((var3 & 4294967295L) >> 8 & 4294967295L & 255L & 4294967295L);
         this.k5[var5 + 2] = (byte)((var3 & 4294967295L) >> 16 & 4294967295L & 255L & 4294967295L);
         this.k5[var5 + 3] = -1;
      }
   }

   private void n5(int var1, int var2, int var3, int var4, long var5) {
      if (q1.n5(var1 - var3) >= q1.n5(var2 - var4)) {
         if (var1 > var3) {
            Integer[] var7 = new Integer[]{var1};
            Integer[] var8 = new Integer[]{var3};
            w2.n5(var7, var8);
            var1 = var7[0];
            var3 = var8[0];
            Integer[] var9 = new Integer[]{var2};
            Integer[] var10 = new Integer[]{var4};
            w2.n5(var9, var10);
            var2 = var9[0];
            var4 = var10[0];
         }

         for (int var11 = var1; var11 <= var3; var11++) {
            float var14 = (float)(var11 - var1) / (var3 - var1);
            int var17 = com.aspose.slides.internal.v6g.k5.u3(var2 * (1.0F - var14) + var4 * var14, 13);
            this.n5(var11, var17, var5);
         }
      } else {
         if (var2 > var4) {
            Integer[] var12 = new Integer[]{var1};
            Integer[] var15 = new Integer[]{var3};
            w2.n5(var12, var15);
            var1 = var12[0];
            var3 = var15[0];
            Integer[] var18 = new Integer[]{var2};
            Integer[] var20 = new Integer[]{var4};
            w2.n5(var18, var20);
            var2 = var18[0];
            var4 = var20[0];
         }

         for (int var13 = var2; var13 <= var4; var13++) {
            float var16 = (float)(var13 - var2) / (var4 - var2);
            int var19 = com.aspose.slides.internal.v6g.k5.u3(var1 * (1.0F - var16) + var3 * var16, 13);
            this.n5(var19, var13, var5);
         }
      }
   }

   public final s3 k5() {
      return this.n5;
   }

   public final void n5(s3 var1) {
      this.n5 = var1;
   }
}
