package com.aspose.slides.internal.v0v;

import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.t9;
import com.aspose.slides.internal.b7s.u3;
import com.aspose.slides.internal.j8o.l6$n5;
import com.aspose.slides.internal.n5p.u9;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.IDisposable;

public class n5 extends com.aspose.slides.internal.j8o.l6 {
   private final u3[] u3;
   private final u3[] a6;
   private int u9;
   private l6$n5 h0;
   private boolean c8 = false;

   public n5(t9 var1) {
      super(var1);
      this.k5 = var1;
      this.a6 = new u3[10];
      this.u3 = new u3[10];
      this.u9 = this.k5.e2();
      this.h0 = new l6$n5();
   }

   @Override
   public int n5(short[][] var1) {
      if (this.k5.e2() != 0 && this.u9 == 0) {
         this.k5();
      }

      int[] var2 = this.k5.u9().k5();
      int var3 = this.k5.u9().u9();
      int[] var4 = com.aspose.slides.internal.n5p.u9.n5();
      l6$n5 var5 = this.h0.n5();
      if (!this.c8) {
         for (int var6 = 0; var6 < var3; var6++) {
            short[] var7 = var1[var6];
            int var8 = 0;
            int[] var9 = new int[]{0};
            l6$n5[] var10 = new l6$n5[]{var5};
            boolean var11 = !this.n5(this.a6[var6], var9, var10);
            var8 = var9[0];
            var10[0].n5(var5);
            if (var11) {
               var5.n5(this.h0);
               return -1;
            }

            if (var8 != 0) {
               var10[0] = var5;
               boolean var12 = !this.l6(var8, var10);
               var10[0].n5(var5);
               if (var12) {
                  var5.n5(this.h0);
                  return -1;
               }

               var10[0] = var5;
               int var13 = n5(var8, var10);
               var10[0].n5(var5);
               var8 = n5(var13, var8);
            }

            int var20 = var2[var6];
            var8 += this.l6[var20];
            this.l6[var20] = var8;
            var7[0] = (short)var8;

            for (int var22 = 1; var22 < 64; var22++) {
               var9[0] = var8;
               var10[0] = var5;
               boolean var14 = !this.n5(this.u3[var6], var9, var10);
               var8 = var9[0];
               var10[0].n5(var5);
               if (var14) {
                  var5.n5(this.h0);
                  return -1;
               }

               int var15 = var8 >> 4;
               var8 &= 15;
               if (var8 != 0) {
                  var22 += var15;
                  var10[0] = var5;
                  boolean var16 = !this.l6(var8, var10);
                  var10[0].n5(var5);
                  if (var16) {
                     var5.n5(this.h0);
                     return -1;
                  }

                  var10[0] = var5;
                  var15 = n5(var8, var10);
                  var10[0].n5(var5);
                  var8 = n5(var15, var8);
                  var7[var4[var22]] = (short)var8;
               } else {
                  if (var15 != 15) {
                     break;
                  }

                  var22 += 15;
               }
            }
         }
      }

      var5.n5(this.h0);
      this.u9--;
      return var3;
   }

   @Override
   public void l6() {
      for (int var1 = 0; var1 < this.k5.u9().u9(); var1++) {
         int var2 = this.n5().u9().k5()[var1];
         n3 var3 = this.k5.u3().l6()[var2];
         Dictionary$ValueCollection$Enumerator var4 = this.k5.n5().getValues().iterator();

         try {
            while (var4.hasNext()) {
               u3 var5 = (u3)var4.next();
               if ((var5.s7() & 255) == 1) {
                  if (var5.n5() == var3.n5()) {
                     this.u3[var1] = var5;
                  }
               } else if (var5.n5() == var3.l6()) {
                  this.a6[var1] = var5;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      this.u9 = this.k5.e2();
      this.h0 = new l6$n5();
   }

   private void k5() {
      this.h0.l6 = 0;
      this.u9 = this.k5.e2();
      byte var1 = this.n5.u9();
      if ((var1 & 255) < 208 || (var1 & 255) > 215) {
         this.c8 = true;
      } else if (this.n5.k5() == 0) {
         this.c8 = false;
      }

      for (int var2 = 0; var2 < this.l6.length; var2++) {
         this.l6[var2] = 0;
      }
   }
}
