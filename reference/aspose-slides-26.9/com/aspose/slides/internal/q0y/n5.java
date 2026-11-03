package com.aspose.slides.internal.q0y;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.u7q.y4;
import com.aspose.slides.internal.w2i.t2;
import com.aspose.slides.internal.w2i.z3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public abstract class n5 {
   private t2 k5;
   private boolean u3;
   private int a6;
   private boolean u9 = false;
   protected boolean n5 = true;
   private float[] h0 = null;
   private com.aspose.slides.internal.w2v.n5 c8;
   private final float[] t2 = new float[3];
   private final float[] s7 = new float[3];
   protected float[] l6 = new float[3];

   public static n5 n5(t2 var0, boolean var1, int var2, boolean var3, boolean var4) {
      n5 var5 = null;
      int var6 = var2;
      if (var6 == 3) {
         var6 = 1;
      }

      com.aspose.slides.internal.u7q.k5 var7 = var4 ? var0.n5(1919510320) : null;
      com.aspose.slides.internal.u7q.k5 var8;
      if (var1) {
         var8 = var0.n5((int)(1093812784L + (var6 & 4294967295L)));
         if (var8 == null) {
            var8 = var0.n5(1093812784);
         }

         if (var8 != null) {
            switch ((int)var0.l6().a6) {
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
                  var5 = com.aspose.slides.internal.q0y.l6.n5(1, var8, var7);
                  break;
               case 876825682:
               case 1129142603:
                  var5 = com.aspose.slides.internal.q0y.l6.n5(2, var8, var7);
                  break;
               default:
                  throw new NotSupportedException(
                     d1.n5("Not supported ColorSpace: {0}", new Object[]{s3.n5(com.aspose.slides.internal.w2i.k5.class, var0.l6().a6)})
                  );
            }
         }
      } else {
         var8 = var0.n5((int)(1110589744L + (var6 & 4294967295L)));
         if (var8 == null) {
            var8 = var0.n5(1110589744);
         }

         if (var8 != null) {
            switch ((int)var0.l6().u9) {
               case 1281450528:
               case 1482250784:
                  var5 = com.aspose.slides.internal.q0y.l6.n5(1, var8, var7);
                  break;
               default:
                  throw new NotSupportedException(d1.n5("Wrong ColorSpace: {0}", new Object[]{s3.n5(com.aspose.slides.internal.w2i.k5.class, var0.l6().u9)}));
            }
         }
      }

      if (var8 == null) {
         switch ((int)var0.l6().a6) {
            case 1196573017:
               var5 = com.aspose.slides.internal.q0y.l6.n5(6, null, var7);
               break;
            case 1380401696:
               var5 = com.aspose.slides.internal.q0y.l6.n5(0, null, var7);
               break;
            default:
               throw new com.aspose.slides.internal.d3l.h0();
         }
      }

      if (var5 == null) {
         throw new com.aspose.slides.internal.d3l.l6();
      }

      var5.n5(var0, var1, var2, var3);
      return var5;
   }

   public void n5() {
      switch (this.a6) {
         case 0:
            if ((this.k5.l6().k5 & 4294967295L) < 67108864L && com.aspose.slides.internal.g7i.k5.n5(this.k5.l6().u9) && this.k5.l6().u3 != 1633842036L) {
               this.u9 = true;
               this.t2[0] = 0.9965153F;
               this.t2[1] = 0.9965269F;
               this.t2[2] = 0.9965208F;
               this.s7[0] = 0.0016800256F;
               this.s7[1] = 0.0017365766F;
               this.s7[2] = 0.0014350219F;
               if (!this.u3) {
                  this.t2[0] = 1.0F / this.t2[0];
                  this.t2[1] = 1.0F / this.t2[1];
                  this.t2[2] = 1.0F / this.t2[2];
                  this.s7[0] = -this.s7[0] * this.t2[0];
                  this.s7[1] = -this.s7[1] * this.t2[1];
                  this.s7[2] = -this.s7[2] * this.t2[2];
               }
            }
            break;
         case 3:
            com.aspose.slides.internal.u7q.k5 var1 = this.k5.n5(2004119668);
            if (var1 == null || !com.aspose.slides.internal.v6g.k5.l6(var1, y4.class)) {
               throw new com.aspose.slides.internal.d3l.c8();
            }

            y4 var2 = (y4)var1;
            if (z3.l6(var2.e2(), this.k5.l6().t9) && com.aspose.slides.internal.g7i.k5.n5(this.k5.l6().u9)) {
               this.u9 = true;
               this.t2[0] = var2.e2().n5 / this.k5.l6().t9.n5;
               this.t2[1] = var2.e2().l6 / this.k5.l6().t9.l6;
               this.t2[2] = var2.e2().k5 / this.k5.l6().t9.k5;
               if (!this.u3) {
                  this.t2[0] = 1.0F / this.t2[0];
                  this.t2[1] = 1.0F / this.t2[1];
                  this.t2[2] = 1.0F / this.t2[2];
               }

               this.s7[0] = 0.0F;
               this.s7[1] = 0.0F;
               this.s7[2] = 0.0F;
            }
      }

      if (this.c8 != null) {
         this.c8.n5(this.t2, this.s7);
         this.c8 = null;
         this.u9 = true;
      }
   }

   public abstract void n5(float[] var1);

   public final long l6() {
      return this.u3 ? this.k5.l6().a6 : this.k5.l6().u9;
   }

   public final long k5() {
      return this.u3 ? this.k5.l6().u9 : this.k5.l6().a6;
   }

   public final com.aspose.slides.internal.u7q.n5 n5(int var1) {
      com.aspose.slides.internal.u7q.k5 var2 = this.k5.n5(var1);
      if (var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.u7q.n5.class)) {
         return (com.aspose.slides.internal.u7q.n5)var2;
      } else {
         throw new com.aspose.slides.internal.d3l.c8();
      }
   }

   public final com.aspose.slides.internal.u7q.n5 l6(int var1) {
      com.aspose.slides.internal.u7q.n5 var2 = this.n5(var1);
      var2.n5();
      com.aspose.slides.internal.u7q.u9 var3 = new com.aspose.slides.internal.u7q.u9();
      var3.n5(new float[2048]);

      for (int var4 = 0; var4 < 2048; var4++) {
         var3.k5()[var4] = var2.l6(var4 / 2047.0F);
      }

      return var3;
   }

   private void n5(t2 var1, boolean var2, int var3, boolean var4) {
      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var3;
      this.n5 = var4;
      this.h0 = this.n5(var1);
      if (var4) {
         this.c8 = new com.aspose.slides.internal.w2v.l6(this.k5, this);
      }
   }

   private void u3(float[] var1) {
      boolean var2 = true;
      if (this.k5.l6().u9 == 1281450528L) {
         if (this.c8()) {
            com.aspose.slides.internal.g7i.l6.k5(var1, var2, this.h0());
         } else {
            com.aspose.slides.internal.g7i.l6.n5(var1, var2, this.h0());
         }
      }

      var1[0] = com.aspose.slides.internal.g7i.k5.l6(var1[0] * this.t2[0] + this.s7[0]);
      var1[1] = com.aspose.slides.internal.g7i.k5.l6(var1[1] * this.t2[1] + this.s7[1]);
      var1[2] = com.aspose.slides.internal.g7i.k5.l6(var1[2] * this.t2[2] + this.s7[2]);
      if (this.k5.l6().u9 == 1281450528L) {
         if (this.c8()) {
            com.aspose.slides.internal.g7i.l6.u3(var1, var2, this.h0());
         } else {
            com.aspose.slides.internal.g7i.l6.l6(var1, var2, this.h0());
         }
      }
   }

   private float[] n5(t2 var1) {
      return new float[]{0.9642F, 1.0F, 0.8249F};
   }

   protected final void l6(float[] var1) {
      if (this.u9 && !this.u3) {
         this.u3(var1);
      }
   }

   protected final void k5(float[] var1) {
      if (this.u9 && this.u3) {
         this.u3(var1);
      }
   }

   public final t2 u3() {
      return this.k5;
   }

   public final boolean a6() {
      return this.u3;
   }

   public final int u9() {
      return this.a6;
   }

   public final float[] h0() {
      return this.h0;
   }

   public boolean c8() {
      return false;
   }
}
