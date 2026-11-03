package com.aspose.slides.internal.k0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.g4.s7;
import com.aspose.slides.internal.g4.y4;
import com.aspose.slides.internal.h7.x8;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class c8 implements u3 {
   private final List<x8> n5 = new List<>();
   private final List<com.aspose.slides.internal.r7c.c8> l6 = new List<>();
   private m1 k5;
   private m1 u3;
   private boolean a6;

   @Override
   public final List<x8> n5() {
      return this.n5;
   }

   @Override
   public final m1 l6() {
      return this.k5;
   }

   @Override
   public final void n5(m1 var1) {
      this.k5 = var1;
   }

   @Override
   public final m1 k5() {
      return this.u3;
   }

   @Override
   public final void l6(m1 var1) {
      this.u3 = var1;
   }

   @Override
   public final List<s7> u3() {
      return this.h0();
   }

   public c8() {
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^\\."));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^\\d+\\."));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^\\[\\d+\\]"));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^\\d+\\)"));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^[A-Z]\\."));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^[a-z]\\."));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^[A-Z]\\)"));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^[a-z]\\)"));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^[IVXL]+\\."));
      this.l6.addItem(new com.aspose.slides.internal.r7c.c8("^[ivxl]+\\."));
   }

   private boolean n5(x8 var1, x8 var2, x8 var3, float var4) {
      return this.l6(var1, var2, var3, var4);
   }

   private boolean l6(x8 var1, x8 var2, x8 var3, float var4) {
      boolean var5 = false;
      if (var3 == null) {
         var5 = true;
      } else {
         float var6 = q1.n5(var1.l6() - var2.l6());
         float var7 = this.n5(2.5F, var4);
         float var8 = var1.n5() - var3.n5();
         float var9 = this.n5(2.0F, var1.e2());
         float var10 = this.n5(0.25F, var1.u3());
         if (var6 > var7) {
            var5 = true;
         } else if (var8 > var9) {
            if (!var3.n3()) {
               var5 = true;
            } else {
               var1.l6(true);
            }
         } else if (var8 < -var1.e2()) {
            if (!var3.n3()) {
               var5 = true;
            }
         } else if (q1.n5(var8) < var10) {
            if (var3.y4()) {
               var1.l6(true);
            } else if (var3.n3()) {
               com.aspose.slides.internal.r7c.c8 var11 = this.l6(var3);
               if (var11 != null) {
                  com.aspose.slides.internal.r7c.c8 var12 = this.l6(var1);
                  if (var11 == var12) {
                     var5 = true;
                  }
               }
            }
         }
      }

      if (var5) {
         var1.n5(true);
      }

      return var5;
   }

   private com.aspose.slides.internal.r7c.c8 l6(x8 var1) {
      String var2 = var1.s7();
      return this.n5(var2, this.l6);
   }

   private com.aspose.slides.internal.r7c.c8 n5(String var1, List<com.aspose.slides.internal.r7c.c8> var2) {
      Object var3 = null;
      List$Enumerator var4 = var2.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.r7c.c8 var5 = (com.aspose.slides.internal.r7c.c8)var4.next();
            if (var5.l6(var1).u3()) {
               return var5;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return (com.aspose.slides.internal.r7c.c8)var3;
   }

   private float n5(float var1, float var2) {
      return (float)q1.u3((double)var1 * var2 * 1000.0) / 1000.0F;
   }

   private boolean n5(float var1, float var2, float var3, float var4) {
      return this.n5(var1, var3, 0.1F) || var3 <= var1 && var3 >= var1 - var2 || var1 <= var3 && var1 >= var3 - var4;
   }

   private boolean n5(float var1, float var2, float var3) {
      return var2 < var1 + var3 && var2 > var1 - var3;
   }

   private List<s7> h0() {
      List var1 = new List();
      s7 var2 = new s7();
      List var3 = new List();
      float var4 = -1.0F;
      float var5 = -1.0F;
      float var6 = -Float.MAX_VALUE;
      float var7 = -1.0F;
      float var8 = -1.0F;
      float var9 = 0.5F;
      float var10 = 0.3F;
      boolean var11 = true;
      x8 var12 = null;
      int var13 = 0;
      List$Enumerator var14 = this.n5.iterator();

      try {
         while (var14.hasNext()) {
            x8 var15 = (x8)var14.next();
            boolean var16 = false;
            int var17 = var15.s7().length();
            if (var17 != 0) {
               int var18 = com.aspose.slides.internal.n2d.u9.y4(var15.s7().charAt(0));
               float var19 = var15.e2();
               float var20 = 0.0F;
               if (var19 == 0.0F || var19 == Float.NaN) {
                  var20 = Float.MAX_VALUE;
               } else if (var5 < 0.0F) {
                  var20 = var19 * var9;
               } else {
                  var20 = (var19 + var5) / 2.0F * var9;
               }

               float var21 = -1.0F;
               if (var8 < 0.0F) {
                  var21 = var15.u3() / var17;
               } else {
                  var21 = (var8 + var15.u3() / var17) / 2.0F;
               }

               float var22 = var21 * var10;
               float var23 = -Float.MAX_VALUE;
               if (var4 != -1.0F) {
                  if (var22 > var20) {
                     var23 = var4 + var20;
                  } else {
                     var23 = var4 + var22;
                  }
               }

               if (var3.size() > 0) {
                  x8 var24 = (x8)var3.get_Item(var3.size() - 1);
                  if (!this.n5(var15.l6(), var15.k5(), var6, var7)) {
                     boolean var25 = this.n5(var24, var15, var12, var7);
                     var12 = var15;
                     if (var25) {
                        y4 var26 = new y4((x8[])var3.toArray(new x8[0]));
                        var2.n5(var26);
                        if (!d1.n5(var2.l6())) {
                           var1.addItem(var2);
                        }

                        var2 = new s7();
                        var16 = true;
                     }

                     if (!var16) {
                        var6 = -Float.MAX_VALUE;
                        var7 = -1.0F;
                     }
                  }

                  if (!var16) {
                     boolean var34 = n5(var24, var15);
                     if (!var34) {
                        y4 var36 = new y4((x8[])var3.toArray(new x8[0]));
                        var2.n5(var36);
                        if (!d1.n5(var2.l6())) {
                           var1.addItem(var2);
                        }

                        var2 = new s7();
                        var16 = true;
                     }
                  }

                  boolean var35 = var18 != 0 && var13 != 0 && var18 != var13;
                  if (!var16 && var23 != -Float.MAX_VALUE && var23 < var15.n5() && var24.s7() != null && !d1.k5(var24.s7(), " ")) {
                     x8 var37 = new x8(var24.n5(), var24.l6(), var24.u3(), var24.k5(), var24.a6(), " ", var24.c8(), var24.t2(), var24.x8().o8(), var24.e2());
                     if (!var35 || var18 == 1 && var3.size() <= 1) {
                        var3.addItem(var37);
                     } else {
                        var2.n5(new y4((x8[])var3.toArray(new x8[0])));
                        var2.n5(new y4(new x8[]{var37}));
                        var16 = true;
                     }
                  }

                  if (!var16) {
                     boolean var38 = this.l6(var24, var15);
                     if (var38) {
                        y4 var27 = new y4((x8[])var3.toArray(new x8[0]));
                        var2.n5(var27);
                        var16 = true;
                     }
                  }

                  if (!var16 && (var35 || var24.h0() != null && var15.h0() != null && !d1.a6(var24.h0(), var15.h0()))) {
                     var2.n5(new y4((x8[])var3.toArray(new x8[0])));
                     var16 = true;
                  }

                  if (var16) {
                     var3.clear();
                  }

                  if (var11) {
                     var12 = var24;
                     var11 = false;
                  }
               }

               if (var15.l6() >= var6) {
                  var6 = var15.l6();
               }

               var4 = var15.n5() + var15.u3();
               var7 = q1.n5(var7, var15.k5());
               var5 = var19;
               var8 = var21;
               var13 = var18;
               var3.addItem(var15);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (var3.size() > 0) {
         y4 var31 = new y4((x8[])var3.toArray(new x8[0]));
         var2.n5(var31);
         if (!d1.n5(var2.l6())) {
            var1.addItem(var2);
         }
      }

      return var1;
   }

   private static boolean n5(x8 var0, x8 var1) {
      float var2 = var0.n5() + var0.u3();
      float var3 = (var0.k5() + var1.k5()) * 0.5F;
      boolean var4 = var1.n5() >= var0.n5() - 0.25F && q1.n5(var1.n5() - var2) <= var0.e2() + 0.25F;
      boolean var5 = q1.n5(var1.l6() - var0.l6()) <= var3 * 0.5F;
      return var4 && var5;
   }

   @Override
   public final boolean a6() {
      return this.a6;
   }

   @Override
   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   @Override
   public final void n5(x8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("DecodedText instance for AddText method can not be null.");
      }

      this.n5.addItem(var1);
   }

   @Override
   public final void u9() {
      this.n5.clear();
   }

   private boolean l6(x8 var1, x8 var2) {
      return q1.n5(var1.t2() - var2.t2()) > 0.1 || !d1.a6(var1.c8().t9(), var2.c8().t9()) || com.aspose.slides.internal.o9b.c8.l6(var1.x8(), var2.x8());
   }
}
