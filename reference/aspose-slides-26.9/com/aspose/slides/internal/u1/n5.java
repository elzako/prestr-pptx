package com.aspose.slides.internal.u1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public abstract class n5 extends t2 {
   private Dictionary<Integer, Float> a6;
   private long u9 = 0L;

   public final long n5() {
      if (this.u9 == 0L) {
         com.aspose.slides.internal.v2.t2 var1 = (com.aspose.slides.internal.v2.t2)this.n5.u9(com.aspose.slides.internal.v2.c8.r7);
         if (var1 != null) {
            this.u9 = var1.k5();
         } else {
            this.u9 = 1000L;
         }
      }

      return this.u9;
   }

   public n5() {
   }

   public n5(com.aspose.slides.internal.v2.k5 var1) {
      super(var1);
      this.r4();
      this.j5();
   }

   @Override
   public float n5(byte[] var1, int var2, int var3) {
      float var4 = (float)this.n5();
      int var5 = this.a6(var1, var2, var3);
      if (this.a6.containsKey(var5)) {
         var4 = this.a6.get_Item(var5);
      }

      return var4;
   }

   private void j5() {
      if (this.a6 == null) {
         this.a6 = new Dictionary<>();
         com.aspose.slides.internal.v2.n5 var1 = (com.aspose.slides.internal.v2.n5)this.n5.u9(com.aspose.slides.internal.v2.c8.p6r);
         if (var1 != null) {
            int var2 = var1.n5();
            int var3 = 0;

            while (var3 < var2) {
               com.aspose.slides.internal.v2.t2 var4 = (com.aspose.slides.internal.v2.t2)var1.l6(var3++);
               com.aspose.slides.internal.v2.s7 var5 = var1.l6(var3++);
               if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.n5.class)) {
                  com.aspose.slides.internal.v2.n5 var13 = (com.aspose.slides.internal.v2.n5)var5;
                  int var14 = var4.k5();
                  int var15 = var13.n5();

                  for (int var16 = 0; var16 < var15; var16++) {
                     com.aspose.slides.internal.v2.t2 var17 = (com.aspose.slides.internal.v2.t2)var13.k5(var16);
                     int var18 = var14 + var16;
                     if (!this.a6.containsKey(var18)) {
                        this.a6.addItem(var14 + var16, var17.u3());
                     }
                  }
               } else {
                  com.aspose.slides.internal.v2.t2 var6 = (com.aspose.slides.internal.v2.t2)var5;
                  com.aspose.slides.internal.v2.t2 var7 = (com.aspose.slides.internal.v2.t2)var1.l6(var3++);
                  int var8 = var4.k5();
                  int var9 = var6.k5();
                  float var10 = var7.u3();

                  for (int var11 = var8; var11 <= var9; var11++) {
                     if (!this.a6.containsKey(var11)) {
                        this.a6.addItem(var11, var10);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public float l6(byte[] var1, int var2, int var3) {
      float var4 = 0.0F;
      a6 var5 = this.t4();
      float var6 = var5.l6();
      float var7 = var5.n5();
      if (var6 != 0.0F && var7 != 0.0F) {
         var4 = (var6 + var7) / 2.0F;
      } else if (var6 != 0.0F) {
         var4 = var6;
      } else if (var7 != 0.0F) {
         var4 = var7;
      } else {
         var4 = 0.0F;
      }

      if (var4 == 0.0F) {
         var4 = var5.k5();
      }

      return var4;
   }

   @Override
   public float l6() {
      float var1 = 0.0F;
      float var2 = 0.0F;
      float var3 = (float)this.n5();
      com.aspose.slides.internal.v2.n5 var4 = (com.aspose.slides.internal.v2.n5)this.n5.u9(com.aspose.slides.internal.v2.c8.p6r);
      if (var4 != null) {
         for (int var5 = 1; var5 < var4.n5(); var5 += 2) {
            com.aspose.slides.internal.v2.s7 var6 = var4.l6(var5);
            if (com.aspose.slides.internal.v6g.k5.l6(var6, com.aspose.slides.internal.v2.n5.class)) {
               com.aspose.slides.internal.v2.n5 var11 = (com.aspose.slides.internal.v2.n5)var6;

               for (int var8 = 0; var8 < var11.n5(); var8++) {
                  com.aspose.slides.internal.v2.t2 var9 = (com.aspose.slides.internal.v2.t2)var11.k5(var8);
                  var1 += var9.u3();
                  var2++;
               }
            } else {
               com.aspose.slides.internal.v2.t2 var7 = (com.aspose.slides.internal.v2.t2)var4.l6(++var5);
               if (var7.u3() > 0.0F) {
                  var1 += var7.u3();
                  var2++;
               }
            }
         }
      }

      float var10 = var1 / var2;
      if (var10 <= 0.0F) {
         var10 = var3;
      }

      return var10;
   }

   @Override
   public float n5(int var1) {
      float var2 = (float)this.n5();
      if (this.a6.containsKey(var1)) {
         var2 = this.a6.get_Item(var1);
      }

      return var2;
   }

   private String w1() {
      String var1 = null;
      com.aspose.slides.internal.v2.k5 var2 = (com.aspose.slides.internal.v2.k5)this.n5.u9(com.aspose.slides.internal.v2.c8.v3);
      if (var2 != null) {
         String var3 = var2.u3(com.aspose.slides.internal.v2.c8.c0);
         String var4 = var2.u3(com.aspose.slides.internal.v2.c8.h3d);
         int var5 = var2.t2(com.aspose.slides.internal.v2.c8.k2p);
         var1 = d1.n5(new String[]{var4, "-", var3, "-", a3.l6(var5)});
      }

      return var1;
   }

   private void r4() {
      String var1 = this.w1();
      if (var1 != null) {
         if (d1.t2(var1, "Identity")) {
            var1 = "Identity-H";
         } else if (d1.l6(var1, "Adobe-UCS-")) {
            var1 = "Adobe-Identity-UCS";
         } else {
            var1 = d1.n5(new String[]{d1.l6(var1, 0, d1.u3(var1, "-")), "-UCS2"});
         }
      }
   }
}
