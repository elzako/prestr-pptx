package com.aspose.slides.internal.k0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.g4.n3;
import com.aspose.slides.internal.g4.t2;
import com.aspose.slides.internal.g4.x8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z8;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.q1;

public class h0 implements k5 {
   private final l6 n5;
   private x8 l6;
   private List<x8> k5;

   @Override
   public final List<x8> n5() {
      return this.k5;
   }

   private void n5(List<x8> var1) {
      this.k5 = var1;
   }

   @Override
   public final x8 l6() {
      return this.l6;
   }

   public h0(l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("IOrderer instance can not be null.");
      }

      this.n5 = var1;
      this.n5(new List<>());
   }

   @Override
   public final void n5(w1 var1) {
      if (this.l6 == null) {
         int var2 = this.n5.n5();
         this.l6 = new x8(var1.u3(), var2);
      }

      this.l6.n5(var1.u3());
   }

   @Override
   public final void l6(w1 var1) {
      if (this.l6 != null) {
         this.l6.l6(var1.u3());
      }
   }

   @Override
   public final void n5(w1 var1, float var2, float var3, float var4) {
      if (this.l6 == null) {
         int var5 = this.n5.n5();
         this.l6 = new x8(var1.u3(), var2, var3, var5, var4);
      } else {
         this.l6.n5(var1.u3(), var2, var3, var4);
      }
   }

   @Override
   public final void n5(w1 var1, w1 var2, w1 var3) {
      if (this.l6 != null) {
         this.l6.n5(var1.u3(), var2.u3(), var3.u3());
      }
   }

   @Override
   public final void k5() {
      if (this.l6 != null) {
         this.l6.k7();
      }
   }

   @Override
   public final void n5(o5<Integer> var1, boolean var2, com.aspose.slides.internal.t8.a6 var3, com.aspose.slides.internal.t8.a6 var4) {
      if (this.l6 != null) {
         if (o5.l6(var1, null)) {
            this.l6.n5(var3.a0().o8(), (Integer)var1.n5(), var3.d2(), var3.d5(), var3.s3(), var3.n5(), var4);
         }

         if (var2) {
            this.l6.n5(var3.p8().o8(), var3.s7(), var3.x8(), var3.n3(), var3.h0(), var3.y4(), var3.c8(), var3.n5(), var4);
         }

         this.n5().addItem(this.l6);
         this.l6 = null;
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.m5.h0 var1, t2 var2, n3 var3, m1 var4, com.aspose.slides.internal.t8.a6 var5, float var6) {
      if (this.l6 == null && var5.l6() != null && var5.l6().n5() != null) {
         s7 var7 = var5.l6().n5();
         if (var7.h0() > 0) {
            s7 var8 = (s7)var7.deepClone();
            y1 var9 = var8.n5(new m1(), z8.n5()).y4();
            int var10 = this.n5.n5();
            this.l6 = new x8(new w1(var9.x8(), var9.n3()), var9.s7(), var9.k5(), var10, var6);
            this.l6.n5(var8);
         }
      }

      if (this.l6 == null) {
         y1 var11 = this.n5(var2, var3).y4();
         if (var11.s7() < 0.1F) {
            var11.n5(100.0F, 0.0F);
         }

         if (var11.k5() < 0.1F) {
            var11.n5(0.0F, 100.0F);
         }

         if (!var11.u3()) {
            int var13 = this.n5.n5();
            this.l6 = new x8(new w1(var11.x8(), var11.n3()), var11.s7(), var11.k5(), var13, var6);
         }
      }

      if (this.l6 != null) {
         if (var5.l6() != null && var5.l6().n5() != null && var5.l6() != this.l6) {
            boolean var12 = com.aspose.slides.internal.s1.n5.n5(this.l6, var5.l6());
            if (!var12) {
               this.l6 = null;
               return;
            }
         }

         this.l6.n5(com.aspose.slides.internal.o9b.c8.e2().o8(), 1, var2, var3, null, var4, var5);
         this.n5().addItem(this.l6);
         this.l6 = null;
      }
   }

   private y1 n5(t2 var1, n3 var2) {
      if (var1 != null) {
         float var7 = q1.l6(var1.n5().l6(), var1.l6().l6());
         float var8 = q1.l6(var1.n5().k5(), var1.l6().k5());
         float var9 = q1.n5(var1.n5().l6(), var1.l6().l6());
         float var6 = q1.n5(var1.n5().k5(), var1.l6().k5());
         return y1.n5(var7, var8, var9, var6);
      } else if (var2 != null) {
         float var3 = q1.n5(var2.l6(), var2.u3());
         float var4 = (var2.n5().l6() + var2.k5().l6()) / 2.0F;
         float var5 = (var2.n5().k5() + var2.k5().k5()) / 2.0F;
         return new y1(var4 - var3, var5 - var3, var3 * 2.0F, var3 * 2.0F);
      } else {
         return y1.n5;
      }
   }

   @Override
   public final void n5(com.aspose.slides.internal.t8.a6 var1) {
      if (this.l6 != null) {
         this.l6.n5(true);
         this.n5().addItem(this.l6);
         if (var1.l6() != null && var1.l6().n5() != null && this.l6.n5() != null) {
            boolean var2 = com.aspose.slides.internal.s1.n5.n5(this.l6, var1.l6());
            if (!var2) {
               this.l6 = null;
               return;
            }
         }

         var1.n5(this.l6);
         this.l6 = null;
      }
   }

   @Override
   public final void u3() {
      this.l6 = null;
      this.n5().clear();
   }
}
