package com.aspose.slides.internal.s7k;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

abstract class d5 {
   private q0 n5;
   private boolean l6;
   private int k5;
   private boolean u3 = false;
   private float[] a6 = new float[3];
   private float[] u9 = new float[3];

   public static d5 n5(q0 var0, boolean var1, int var2) {
      d5 var3 = null;
      int var4 = var2;
      if (var4 == 3) {
         var4 = 1;
      }

      k7 var5;
      if (var1) {
         var5 = var0.n5(
            com.aspose.slides.internal.v6g.k5.u3(
               com.aspose.slides.internal.v6g.k5.a6(1093812784L, 10) + com.aspose.slides.internal.v6g.k5.a6((long)var4, 10), 10
            )
         );
         if (var5 == null) {
            var5 = var0.n5(1093812784);
         }

         if (var5 != null) {
            switch (var0.l6().a6) {
               case 860048466:
               case 1129142560:
               case 1212961568:
               case 1213421088:
               case 1281450528:
               case 1282766368:
               case 1380401696:
               case 1482250784:
               case 1497588338:
               case 1501067552:
                  var3 = s3.n5(1, var5);
                  break;
               case 876825682:
               case 1129142603:
                  var3 = s3.n5(2, var5);
                  break;
               default:
                  throw new NotSupportedException(d1.n5("Not supported ColorSpace: {0}", new Object[]{com.aspose.slides.internal.v6g.k5.l6(var0.l6().a6)}));
            }
         }
      } else {
         var5 = var0.n5(
            com.aspose.slides.internal.v6g.k5.u3(
               com.aspose.slides.internal.v6g.k5.a6(1110589744L, 10) + com.aspose.slides.internal.v6g.k5.a6((long)var4, 10), 10
            )
         );
         if (var5 == null) {
            var5 = var0.n5(1110589744);
         }

         if (var5 != null) {
            switch (var0.l6().u9) {
               case 1281450528:
               case 1482250784:
                  var3 = s3.n5(1, var5);
                  break;
               default:
                  throw new NotSupportedException(d1.n5("Wrong ColorSpace: {0}", new Object[]{com.aspose.slides.internal.v6g.k5.l6(var0.l6().u9)}));
            }
         }
      }

      if (var5 == null) {
         switch (var0.l6().a6) {
            case 1196573017:
               var3 = s3.n5(6, null);
               break;
            case 1380401696:
               var3 = s3.n5(0, null);
               break;
            default:
               throw new e2();
         }
      }

      if (var3 == null) {
         throw new a6();
      }

      var3.l6(var0, var1, var2);
      return var3;
   }

   public void n5() {
      switch (this.k5) {
         case 0:
            if (com.aspose.slides.internal.v6g.k5.a6(this.n5.l6().k5, 10) < 67108864L) {
               this.u3 = true;
               this.a6[0] = 0.9965153F;
               this.a6[1] = 0.9965269F;
               this.a6[2] = 0.9965208F;
               this.u9[0] = 0.0016800256F;
               this.u9[1] = 0.0017365766F;
               this.u9[2] = 0.0014350219F;
               if (!this.l6) {
                  this.a6[0] = 1.0F / this.a6[0];
                  this.a6[1] = 1.0F / this.a6[1];
                  this.a6[2] = 1.0F / this.a6[2];
                  this.u9[0] = -this.u9[0] * this.a6[0];
                  this.u9[1] = -this.u9[1] * this.a6[1];
                  this.u9[2] = -this.u9[2] * this.a6[2];
               }
            }
            break;
         case 3:
            k7 var1 = this.n5.n5(2004119668);
            if (var1 == null || !com.aspose.slides.internal.v6g.k5.l6(var1, a0.class)) {
               throw new z3();
            }

            a0 var2 = (a0)var1;
            if (b3.l6(var2.y4(), this.n5.l6().t9)) {
               this.u3 = true;
               this.a6[0] = var2.y4().n5 / this.n5.l6().t9.n5;
               this.a6[1] = var2.y4().l6 / this.n5.l6().t9.l6;
               this.a6[2] = var2.y4().k5 / this.n5.l6().t9.k5;
               if (!this.l6) {
                  this.a6[0] = 1.0F / this.a6[0];
                  this.a6[1] = 1.0F / this.a6[1];
                  this.a6[2] = 1.0F / this.a6[2];
               }

               this.u9[0] = 0.0F;
               this.u9[1] = 0.0F;
               this.u9[2] = 0.0F;
            }
      }
   }

   public abstract void n5(float[] var1);

   private void l6(q0 var1, boolean var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   protected void l6(float[] var1) {
      if (this.u3 && !this.l6) {
         this.u3(var1);
      }
   }

   protected void k5(float[] var1) {
      if (this.u3 && this.l6) {
         this.u3(var1);
      }
   }

   private void u3(float[] var1) {
      boolean var2 = false;
      if (this.n5.l6().u9 == 1281450528) {
         if (this.u9()) {
            t4.k5(var1, var2);
         } else {
            t4.n5(var1, var2);
         }
      }

      var1[0] = d2.l6(var1[0] * this.a6[0] + this.u9[0]);
      var1[1] = d2.l6(var1[1] * this.a6[1] + this.u9[1]);
      var1[2] = d2.l6(var1[2] * this.a6[2] + this.u9[2]);
      if (this.n5.l6().u9 == 1281450528) {
         if (this.u9()) {
            t4.u3(var1, var2);
         } else {
            t4.l6(var1, var2);
         }
      }
   }

   public int l6() {
      return this.l6 ? this.n5.l6().a6 : this.n5.l6().u9;
   }

   public int k5() {
      return this.l6 ? this.n5.l6().u9 : this.n5.l6().a6;
   }

   public s7 n5(int var1) {
      k7 var2 = this.n5.n5(var1);
      if (var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2, s7.class)) {
         return (s7)var2;
      } else {
         throw new z3();
      }
   }

   public s7 l6(int var1) {
      s7 var2 = this.n5(var1);
      var2.n5();
      z8 var3 = new z8();
      var3.n5(new float[2048]);

      for (int var4 = 0; var4 < 2048; var4++) {
         var3.k5()[var4] = var2.l6(var4 / 2047.0F);
      }

      return var3;
   }

   public q0 u3() {
      return this.n5;
   }

   public boolean a6() {
      return this.l6;
   }

   public boolean u9() {
      return false;
   }
}
