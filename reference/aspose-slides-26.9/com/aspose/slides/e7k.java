package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class e7k {
   static final Dictionary<String, u2t> n5 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());
   private final Presentation l6;
   private e3 k5 = null;

   public e7k(Presentation var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, e4z var2, TextParam var3, boolean var4, int var5, k8x[] var6) {
      u8b var7 = null;
      List var8 = new List();
      List var9 = new List();
      float var10 = 0.0F;
      String var11 = var2.n5().l6().a6();
      var1 = j5u.n5(var1, var11);
      if (var1.length() > 0 && var11.equalsIgnoreCase("Futura Medium")) {
         var1 = var1.replaceAll("…", "...");
      }

      int var12 = var1.length();
      int var13 = 0;
      int var14 = 0;
      TextParam var15 = var3;
      boolean var16 = false;

      while (var13 < var12) {
         boolean var17 = com.aspose.slides.ms.System.t9.a6(var1, var13);
         int var18 = var17 ? com.aspose.slides.ms.System.t9.n5(var1.charAt(var13), var1.charAt(var13 + 1)) : var1.charAt(var13);
         TextParam var19 = var3;
         boolean var20 = false;
         boolean var21 = com.aspose.slides.internal.n2d.u9.n5.containsItem((char)var18);
         if (var21) {
            switch (var18 & 3) {
               case 1:
                  var20 = var8.size() == 0;
                  var16 |= var20;
                  var8.addItem((byte)1);
                  break;
               case 2:
                  var20 = var8.size() == 0;
                  var16 |= var20;
                  if (var13 + 1 < var12 && var1.charAt(var13 + 1) == 8237) {
                     var8.addItem((byte)0);
                     var13++;
                     break;
                  }

                  var8.addItem((byte)-1);
                  break;
               default:
                  int var22 = var8.size();
                  if (var22 > 0) {
                     if (--var22 == 0) {
                        var20 = true;
                     }

                     var8.removeAt(var22);
                  }
            }

            if (!var20) {
               var13 += var17 ? 2 : 1;
               continue;
            }
         } else {
            if (this.n5(var2, var3, var18)) {
               if (var7 == null) {
                  var7 = new u8b(this.l6, var3);
               }

               var19 = var7.n5(var18);
            }

            if (var16) {
               var15 = var19;
               var16 = false;
            }
         }

         var20 |= var15 != var19;
         if (var20) {
            int var39 = var13 + (var18 == 8236 ? 1 : 0);
            if (var14 < var39) {
               String var23 = "";
               if (var9.size() > 0) {
                  List$Enumerator var24 = var9.iterator();

                  try {
                     while (var24.hasNext()) {
                        byte var25 = com.aspose.slides.internal.v6g.k5.u3(var24.next(), byte.class);
                        if (var25 <= 0) {
                           var23 = com.aspose.slides.ms.System.d1.l6(var23, '\u202e');
                        }

                        if (var25 >= 0) {
                           var23 = com.aspose.slides.ms.System.d1.l6(var23, '\u202d');
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
                        var24.dispose();
                     }
                  }

                  var9.clear();
               }

               var23 = com.aspose.slides.ms.System.d1.n5(var23, com.aspose.slides.ms.System.d1.l6(var1, var14, var39 - var14));
               if (var8.size() > 0) {
                  var9.addRange(var8);
                  var23 = com.aspose.slides.ms.System.d1.n5(var23, com.aspose.slides.ms.System.d1.n5('\u202c', var8.size()));
               }

               e3 var41 = this.l6();
               com.aspose.slides.internal.o9b.f2 var42 = n5(var41, var23, var15.d2(), var15, var4, var5).a6();
               var10 += var42.l6();
               var14 = var39;
            }

            var15 = var19;
         }

         var13 += var17 ? 2 : 1;
      }

      if (var14 < var13) {
         String var30 = com.aspose.slides.ms.System.d1.l6(var1, var14, var13 - var14);
         e3 var33 = this.l6();
         com.aspose.slides.internal.o9b.f2 var35 = n5(var33, var30, var15.d2(), var15, var4, var5).a6();
         var10 += var35.l6();
      }

      if (var7 != null) {
         e4z var31 = null;
         e4z[] var34 = new e4z[]{var31};
         boolean var36 = var7.n5(var34);
         var31 = var34[0];
         if (var36) {
            n5(var31).n5(var6[0]);
            return new com.aspose.slides.internal.o9b.f2(var10, var6[0].n5);
         }
      }

      n5(var3.d2()).n5(var6[0]);
      return new com.aspose.slides.internal.o9b.f2(var10, var6[0].n5);
   }

   public final boolean n5(e4z var1, TextParam var2, int var3) {
      boolean var4 = true;
      boolean var5 = !var1.n5(var3);
      if (var1.u3() || com.aspose.slides.ms.System.d1.t2(var2.z3(), var1.n5().h0())) {
         if (var3 < 32) {
            var4 = false;
         } else {
            var4 = var5 && !var1.n5((char)var3);
         }
      }

      return var4;
   }

   public final float n5(
      e2n var1, y6e var2, y6e var3, e4z var4, TextParam var5, int var6, boolean var7, com.aspose.slides.internal.f3.u3<y6e, TextParam> var8, k8x[] var9
   ) {
      k8x.u3.n5(var9[0]);
      float var10 = 0.0F;
      if (var2.h0() == 57346 && var2.a6() != null) {
         var9[0] = new k8x();
         var9[0].l6 = var2.a6().u3.l6().l6.l6;
         var9[0].n5 = var2.a6().u3.l6().l6.n5();
         return var2.a6().u3.l6().n5;
      }

      while (true) {
         d4n var11 = new d4n(var1, var2, var4, var7);
         int var12 = var2.n5().l6() + var2.c8() != var6 && var6 != Integer.MIN_VALUE ? var2.s7().u3() : Integer.MIN_VALUE;
         c9g var13 = var2.s7().n5().n5;
         c9g var14 = var2.n5().n5;
         if (var2.s7().c8() > 0
            && com.aspose.slides.internal.n2d.u9.z1(var2.u3())
            && var14.h0() == var13.h0()
            && var14.getEscapement() == var13.getEscapement()
            && var14.getSpacing() == var13.getSpacing()
            && com.aspose.slides.ms.System.d1.a6(var14.getLatinFont().getFontName(), var13.getLatinFont().getFontName())
            && var2.k5() == var2.s7().k5()) {
            var12 = var2.s7().u3();
         }

         y6e[] var15 = new y6e[]{var2};
         b4o var16 = e5a.n5(var1, var15, var3, var11).k5();
         var2 = var15[0];
         if (var5.e2() == 2) {
            var16.l6().n5(var16);
         }

         k8x var17 = new k8x();
         k8x[] var18 = new k8x[]{var17};
         com.aspose.slides.internal.o9b.f2 var19 = this.n5(var16.k5, var4, var5, true, var12, var18).a6();
         var18[0].n5(var17);
         k8x.n5(var9[0].n5(), var17.n5()).n5(var9[0]);
         var10 += var19.l6();
         if (!var2.n5(var3)) {
            return var10;
         }

         var5 = (TextParam)var8.invoke(var2);
      }
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, e4z var2, TextParam var3, float[] var4) {
      k8x var5 = new k8x();
      k8x[] var6 = new k8x[]{var5};
      com.aspose.slides.internal.o9b.f2 var7 = this.n5(var1, var2, var3, true, Integer.MIN_VALUE, var6).a6();
      var6[0].n5(var5);
      var4[0] = var5.l6;
      return var7;
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, e4z var2, TextParam var3) {
      k8x var4 = new k8x();
      k8x[] var5 = new k8x[]{var4};
      com.aspose.slides.internal.o9b.f2 var6 = this.n5(var1, var2, var3, true, Integer.MIN_VALUE, var5).a6();
      var5[0].n5(var4);
      return var6;
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, TextParam var2, boolean var3) {
      e4z var4 = var2.d2();
      k8x var5 = new k8x();
      k8x[] var6 = new k8x[]{var5};
      com.aspose.slides.internal.o9b.f2 var7 = this.n5(var1, var4, var2, var3, Integer.MIN_VALUE, var6).a6();
      var6[0].n5(var5);
      return var7;
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, TextParam var2) {
      e4z var3 = var2.d2();
      k8x var4 = new k8x();
      k8x[] var5 = new k8x[]{var4};
      com.aspose.slides.internal.o9b.f2 var6 = this.n5(var1, var3, var2, true, Integer.MIN_VALUE, var5).a6();
      var5[0].n5(var4);
      return var6;
   }

   public final void n5(e3 var1, String var2, com.aspose.slides.internal.o9b.y1 var3, TextParam var4) {
      u2t var5 = null;
      u2t[] var6 = new u2t[]{var5};
      n5.tryGetValue(var4.z3(), var6);
      var5 = var6[0];
      float var7 = var3.x8();
      if (var5 != null) {
         int var8 = 0;

         while (var8 < var2.length()) {
            int[] var9 = new int[]{var8};
            String var10 = var5.n5(var2, var9);
            var8 = var9[0];
            float var11 = var5.n5(var10.charAt(0)) * var4.t4();
            TextParam var12 = var4;
            if (!com.aspose.slides.ms.System.n1.k5(var11)) {
               var12 = var4.r4();
               var12.k5(var11);
            }

            e3 var13 = this.l6();
            com.aspose.slides.internal.o9b.f2 var14 = var13.n5(var10, var12).a6();
            var1.n5(var10, new com.aspose.slides.internal.o9b.y1(var7, var3.n3(), var14.l6(), var3.k5()), var12);
            var7 += var14.l6();
         }
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)
            && var2.length() > 1
            && !var4.a6().u9()
            && com.aspose.slides.internal.n2d.u9.n5(com.aspose.slides.internal.n2d.u9.n5(var2, 0))) {
            com.aspose.slides.internal.e1x.i1 var16 = var4.d2().l6().n5();
            if (var16 != null && var16.e5()) {
               this.l6(var1, var2, var3.y4(), var4);
               return;
            }
         }

         var1.n5(var2, var3.y4(), var4);
      }
   }

   private void l6(e3 var1, String var2, com.aspose.slides.internal.o9b.y1 var3, TextParam var4) {
      com.aspose.slides.internal.p1s.l6 var5 = var4.d2().l6();
      com.aspose.slides.internal.o9b.w1 var6 = var3.u9().u3();
      List var7 = new List();
      boolean var8 = false;
      byte var9 = 0;
      int var10 = 0;
      float var11 = 0.0F;

      while (var10 < var2.length()) {
         int var12 = var2.charAt(var10);
         var8 = com.aspose.slides.internal.n2d.u9.m1((char)var12);
         if (var8) {
            var12 = com.aspose.slides.ms.System.t9.n5((char)var12, var2.charAt(var10 + 1));
            var10++;
         }

         if (com.aspose.slides.internal.n2d.u9.l6(var12) || var12 == 8205 || com.aspose.slides.internal.n2d.u9.k5(var12)) {
            var7.addItem(var12);
         } else if (com.aspose.slides.internal.n2d.u9.n5(var12)) {
            if (var7.size() > 0) {
               float[] var13 = new float[]{var11};
               boolean var14 = !this.n5(var1, var7, var6.u3(), var3.k5(), var5, var13);
               var11 = var13[0];
               if (var14) {
                  var13[0] = var11;
                  this.n5(var1, com.aspose.slides.ms.System.d1.l6(var2, var9, var10 - var9 - (var8 ? 0 : 1)), var6.u3(), var3.k5(), var4, var13);
                  var11 = var13[0];
               }

               var6.n5(var6.l6() + var11);
               var7.clear();
            }

            var7.addItem(var12);
            var9 = (byte)(var8 ? var10 - 1 : var10);
         }

         var10++;
      }

      float[] var17 = new float[]{var11};
      boolean var18 = var7.size() > 0 && !this.n5(var1, var7, var6.u3(), var3.k5(), var5, var17);
      var11 = var17[0];
      if (var18) {
         var17[0] = var11;
         this.n5(var1, com.aspose.slides.ms.System.d1.l6(var2, var9, var10 - var9 - (var8 ? 0 : 1)), var6.u3(), var3.k5(), var4, var17);
         var11 = var17[0];
      }
   }

   private boolean n5(e3 var1, List<Integer> var2, com.aspose.slides.internal.o9b.w1 var3, float var4, com.aspose.slides.internal.p1s.l6 var5, float[] var6) {
      com.aspose.slides.internal.o9b.l6 var7 = var5.n5().n5(var2, var5.c8());

      try {
         if (var7 == null) {
            var6[0] = 0.0F;
            return false;
         } else {
            float var8 = var5.x8() - var4;
            float var9 = var7.h0() / (var4 + var8);
            var6[0] = var7.e2() / var9;
            var1.n5(var7, var3.l6(), var3.k5() - var5.t2() + var8 / 2.0F, var6[0], var7.h0() / var9);
            return true;
         }
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   private void n5(e3 var1, String var2, com.aspose.slides.internal.o9b.w1 var3, float var4, TextParam var5, float[] var6) {
      var6[0] = var1.n5(var2, var5).l6();
      var1.n5(var2, new com.aspose.slides.internal.o9b.y1(var3.u3(), new com.aspose.slides.internal.o9b.f2(var6[0], var4)), var5);
   }

   public final com.aspose.slides.internal.o9b.f2 n5(String var1, e4z var2, TextParam var3, int var4) {
      e3 var5 = this.l6();
      return n5(var5, var1, var2, var3, true, var4);
   }

   private static com.aspose.slides.internal.o9b.f2 n5(e3 var0, String var1, e4z var2, TextParam var3, boolean var4, int var5) {
      u2t var6 = null;
      if (var3.z3() != null) {
         u2t[] var7 = new u2t[]{var6};
         n5.tryGetValue(var3.z3(), var7);
         var6 = var7[0];
      }

      if (var6 != null && var4) {
         com.aspose.slides.internal.o9b.f2 var14 = new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
         int var8 = 0;

         while (var8 < var1.length()) {
            int[] var9 = new int[]{var8};
            String var10 = var6.n5(var1, var9);
            var8 = var9[0];
            float var11 = var6.n5(var10.charAt(0)) * var3.t4();
            TextParam var12 = var3;
            if (!com.aspose.slides.ms.System.n1.k5(var11)) {
               var12 = var3.r4();
               var12.k5(var11);
            }

            com.aspose.slides.internal.o9b.f2 var13 = var0.n5(var10, var2, var12, var5).a6();
            var14.n5(var14.l6() + var13.l6());
            var14.l6(com.aspose.slides.ms.System.q1.n5((float)(var14.k5()), (float)(var13.k5())));
         }

         return var14;
      } else {
         return var0.n5(var1, var2, var3, var5);
      }
   }

   public static k8x n5(e4z var0) {
      try {
         com.aspose.slides.internal.o9b.n3 var1 = var0.n5();
         k8x var2 = new k8x();
         if (var1.t2() < 1.245F) {
            var2.n5 = 2.0F;
         } else {
            var2.n5 = var1.t2() * 1.6F;
         }

         com.aspose.slides.internal.o9b.y4 var3 = var1.l6();
         float var4 = var3.k5(var1.x8());
         float var5 = var3.a6(var1.x8());
         float var6 = var4 + var5;
         float var7 = var3.h0(var1.x8());
         var2.l6 = var2.n5 * var5 / var6;
         var2.k5 = var2.n5 * (var7 - var6) / var7;
         return var2;
      } catch (ArgumentException var8) {
         return l6(var0);
      }
   }

   private static k8x l6(e4z var0) {
      k8x var1 = new k8x();
      if (var0.h0() < 1.245F) {
         var1.n5 = 2.0F;
      } else {
         var1.n5 = var0.h0() * 1.6F;
      }

      com.aspose.slides.internal.e1x.i1 var2 = var0.l6().n5();
      boolean var3 = (var2.e2() & 128) != 0;
      float var4 = var3 ? var2.t9() : var2.s7();
      float var5 = var3 ? com.aspose.slides.ms.System.q1.n5(var2.z1()) : com.aspose.slides.ms.System.q1.n5(var2.x8());
      float var6 = var3 ? var2.t4() : var2.y4();
      float var7 = var4 + var5;
      var1.l6 = var1.n5 * var5 / var7;
      var1.k5 = var1.n5 * (var6 - var7) / var6;
      return var1;
   }

   public static float n5(e2n var0, float var1, int[] var2) {
      t3x var3 = var0.n5;
      var2[0] = 0;
      float var4 = var3.getDefaultTabSize() <= 0.0F ? 1.0E-5F : var3.getDefaultTabSize();
      float var5 = var1;
      if (var1 % var4 > 1.0E-5 && var4 - var1 % var4 > 0.1 && !v6o.n5(var0)) {
         var5 = (float)com.aspose.slides.ms.System.q1.u3(var1 - 1.0E-4F);
      }

      int var6 = 0;
      ITabEffectiveData[] var7 = var3.getTabs();
      if (var7.length > 0) {
         if (var7[0].getPosition() != 0.0 || var1 != 0.0F) {
            while (var6 < var7.length && (float)var7[var6].getPosition() <= var1 + 1.0E-5F) {
               var6++;
            }
         }

         if (var6 < var7.length) {
            ITabEffectiveData var9 = var7[var6];
            if (var1 < var3.getMarginLeft() && var9.getPosition() > var3.getMarginLeft()) {
               return var3.getMarginLeft() - var1;
            }

            var2[0] = var9.getAlignment();
            if (var9.getPosition() == 0.0 && var1 == 0.0F) {
               return Float.MIN_VALUE;
            }

            return (float)(var9.getPosition() - var1);
         }

         if (var6 == var7.length) {
            ITabEffectiveData var8 = var7[var6 - 1];
            if (var8.getPosition() - var1 >= 0.001
               || com.aspose.slides.ms.System.q1.n5(var8.getPosition() - var1) > 0.001
                  && com.aspose.slides.ms.System.q1.u3(var8.getPosition()) >= com.aspose.slides.ms.System.q1.u3(var1)) {
               return (float)(var8.getPosition() - var1);
            }
         }
      }

      return var1 < var3.getMarginLeft() ? var3.getMarginLeft() - var1 : (float)com.aspose.slides.ms.System.q1.k5(1.0F + var5 / var4) * var4 - var1;
   }

   public void n5() {
      if (this.k5 != null) {
         this.k5.k5(true);
         this.k5 = null;
      }
   }

   private e3 l6() {
      if (this.k5 == null) {
         this.k5 = new r1c(new com.aspose.slides.internal.o9b.l6(32, 32), 32.0F, 32.0F, true);
      }

      return this.k5;
   }

   static {
      n5.addItem("wingdings", new u2t(new int[]{0, 128, 256}, new float[]{Float.NaN, 0.5F, Float.NaN}));
      n5.addItem("wingdings 2", new u2t(new int[]{0, 128, 256}, new float[]{Float.NaN, 0.5F, Float.NaN}));
      n5.addItem("wingdings 3", new u2t(new int[]{0, 128, 256}, new float[]{Float.NaN, 0.5F, Float.NaN}));
   }
}
