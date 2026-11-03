package com.aspose.slides.internal.x7u;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.w1;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.util.ArrayList;

public class h0 {
   private static float n5(com.aspose.slides.internal.t9z.h0 var0, boolean var1) {
      return var1 ? var0.k5() / 2.0F : var0.n5().q0() / 2.0F;
   }

   public static u9 n5(com.aspose.slides.internal.t9z.h0 var0, com.aspose.slides.internal.x4g.s7 var1) {
      return n5(var0, var1, false);
   }

   private static u9 n5(com.aspose.slides.internal.t9z.h0 var0, com.aspose.slides.internal.x4g.s7 var1, boolean var2) {
      return n5(var0.n5()) ? l6(var0, var2) : l6(var0, var1, var2);
   }

   private static u9 l6(com.aspose.slides.internal.t9z.h0 var0, boolean var1) {
      float var2 = n5(var0, var1);
      AffineTransform var3 = var0.n5().t4().t2();
      float var4 = (float)var3.getScaleX();
      float var5 = (float)var3.getScaleY();
      float var6 = (float)var3.getShearX();
      float var7 = (float)var3.getShearY();
      boolean var8 = false;
      boolean var9 = false;
      com.aspose.slides.internal.e3j.h0 var10 = null;
      if (var4 == 1.0F && var5 == 1.0F && var6 == 0.0F && var7 == 0.0F) {
         var8 = true;
      } else if (var6 == 0.0F && var7 == 0.0F) {
         var9 = true;
      } else {
         var10 = com.aspose.slides.internal.e3j.h0.n5(var2, var4, var6, var7, var5);
      }

      ArrayList var11 = new ArrayList();
      float[] var12 = var0.n5().a6();

      for (int var13 = 0; var13 < var12.length - 1; var13++) {
         if (var13 % 2 == 0) {
            float var14 = var12[var13];
            float var15 = var12[var13 + 1];
            Object var16 = null;
            if (var8) {
               var16 = new u3(var2, var14, var15);
            } else if (var9) {
               var16 = new t2(var2, var14, var15, var4, var5);
            } else {
               var16 = new n3(var14, var15, var10);
            }

            var11.add(var16);
         }
      }

      return new k5(n5(var0), var11);
   }

   public static u9 l6(com.aspose.slides.internal.t9z.h0 var0, com.aspose.slides.internal.x4g.s7 var1) {
      return n5(var0, var0.n5().n3(), true, var1);
   }

   public static u9 k5(com.aspose.slides.internal.t9z.h0 var0, com.aspose.slides.internal.x4g.s7 var1) {
      return n5(var0, var0.n5().y4(), false, var1);
   }

   private static u9 n5(com.aspose.slides.internal.t9z.h0 var0, int var1, boolean var2, com.aspose.slides.internal.x4g.s7 var3) {
      if ((var1 & 240) == 0) {
         boolean var8 = false;
         return var1 == 1 ? n5(var0, var3, var8) : l6(var0, var3, var8);
      }

      boolean var4 = true;
      if (var1 == 255) {
         try {
            com.aspose.slides.internal.x4g.u9 var5 = var2 ? var0.n5().h0() : var0.n5().u9();
            var4 = !var5.x8();
         } catch (ArgumentException var7) {
         }
      }

      float var9 = n5(var0, var4);
      if (n5(var0.n5(), var3)) {
         boolean var6 = n5(var3);
         return new a6(var9, var6);
      } else {
         return new l6(var9);
      }
   }

   public static u9 u3(com.aspose.slides.internal.t9z.h0 var0, com.aspose.slides.internal.x4g.s7 var1) {
      return l6(var0, var1, false);
   }

   private static u9 l6(com.aspose.slides.internal.t9z.h0 var0, com.aspose.slides.internal.x4g.s7 var1, boolean var2) {
      if (n5(var0.n5(), var1)) {
         boolean var3 = n5(var1);
         return n5(var0, var3, var2);
      } else {
         return k5(var0, var2);
      }
   }

   private static u9 n5(com.aspose.slides.internal.t9z.h0 var0, boolean var1, boolean var2) {
      float var3 = n5(var0, var2);
      AffineTransform var4 = var0.n5().t4().t2();
      float var5 = (float)var4.getScaleX();
      float var6 = (float)var4.getScaleY();
      float var7 = (float)var4.getShearX();
      float var8 = (float)var4.getShearY();
      if (var5 == 1.0F && var6 == 1.0F && var7 == 0.0F && var8 == 0.0F) {
         return new a6(var3, var1);
      } else {
         return var7 == 0.0F && var8 == 0.0F
            ? new s7(var3, var1, var5, var6)
            : new y4(var1, com.aspose.slides.internal.e3j.h0.n5(var3, var5, var7, var8, var6));
      }
   }

   public static u9 n5(com.aspose.slides.internal.t9z.h0 var0) {
      return k5(var0, false);
   }

   private static u9 k5(com.aspose.slides.internal.t9z.h0 var0, boolean var1) {
      float var2 = n5(var0, var1);
      AffineTransform var3 = var0.n5().t4().t2();
      float var4 = (float)var3.getScaleX();
      float var5 = (float)var3.getScaleY();
      float var6 = (float)var3.getShearX();
      float var7 = (float)var3.getShearY();
      if (Math.abs(var4) == 1.0F && Math.abs(var5) == 1.0F && var6 == 0.0F && var7 == 0.0F) {
         return new l6(var2);
      } else {
         return var6 == 0.0F && var7 == 0.0F ? new c8(var2, var4, var5) : new x8(com.aspose.slides.internal.e3j.h0.n5(var2, var4, var6, var7, var5));
      }
   }

   private static boolean n5(m3 var0, com.aspose.slides.internal.x4g.s7 var1) {
      return var0.n5() != 1 || n5(var0) ? false : !var1.z1();
   }

   public static boolean n5(m3 var0) {
      float[] var1 = var0.a6();
      return var1 != null && var1.length > 1 && var1.length % 2 != 1 && (var1.length != 2 || var1[0] != 0.0F || var1[1] != 1.0F);
   }

   private static boolean n5(com.aspose.slides.internal.x4g.s7 var0) {
      PathIterator var1 = var0.getPathIterator(null);
      float[] var2 = new float[6];
      w1 var3 = null;
      w1 var4 = null;
      float var5 = 0.0F;
      float var6 = 0.0F;

      while (!var1.isDone()) {
         label72: {
            switch (var1.currentSegment(var2)) {
               case 0:
                  var5 = var2[0];
                  var6 = var2[1];
                  break;
               case 1:
                  float var18 = var2[0] - var5;
                  float var20 = var2[1] - var6;
                  if (var3 == null) {
                     var3 = new w1(var18, var20);
                  } else {
                     var4 = new w1(var18, var20);
                  }

                  var5 = var2[0];
                  var6 = var2[1];
                  break;
               case 2:
                  float var17 = var2[0];
                  float var19 = var2[1];
                  float var21 = var2[2];
                  float var22 = var2[3];
                  float var23 = var17 - var5;
                  float var24 = var19 - var6;
                  if (var23 == 0.0F && var24 == 0.0F) {
                     var23 = var21 - var5;
                     var24 = var22 - var5;
                  }

                  float var25 = var21 - var17;
                  float var26 = var22 - var19;
                  if (var25 == 0.0F && var26 == 0.0F) {
                     var25 = var21 - var5;
                     var26 = var22 - var6;
                  }

                  if (var3 == null) {
                     var3 = new w1(var23, var24);
                     var4 = new w1(var25, var26);
                  } else {
                     var4 = new w1(var25, var26);
                  }

                  var5 = var21;
                  var6 = var22;
                  break;
               case 3:
                  float var7 = var2[0];
                  float var8 = var2[1];
                  float var9 = var2[2];
                  float var10 = var2[3];
                  float var11 = var2[4];
                  float var12 = var2[5];
                  float var13 = var7 - var5;
                  float var14 = var8 - var6;
                  if (var13 == 0.0F && var14 == 0.0F) {
                     var13 = var9 - var5;
                     var14 = var10 - var5;
                     if (var13 == 0.0F && var14 == 0.0F) {
                        var13 = var11 - var5;
                        var14 = var12 - var5;
                     }
                  }

                  float var15 = var11 - var9;
                  float var16 = var12 - var10;
                  if (var15 == 0.0F && var16 == 0.0F) {
                     var15 = var11 - var7;
                     var16 = var12 - var8;
                     if (var15 == 0.0F && var16 == 0.0F) {
                        var15 = var11 - var5;
                        var16 = var12 - var6;
                     }
                  }

                  if (var3 == null) {
                     var3 = new w1(var13, var14);
                     var4 = new w1(var15, var16);
                  } else {
                     var4 = new w1(var15, var16);
                  }

                  var5 = var11;
                  var6 = var12;
                  break;
               case 4:
                  break label72;
            }

            if (var3 != null && var4 != null) {
               break;
            }
         }

         var1.next();
      }

      return com.aspose.slides.internal.e3j.u9.n5(var3.l6(), var3.k5(), var4.l6(), var4.k5());
   }
}
