package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import java.awt.Color;

public abstract class n3 extends t2 {
   private n3 n5;
   private boolean l6 = true;
   private com.aspose.slides.internal.j3b.u3 k5;

   protected n3() {
   }

   protected n3(com.aspose.slides.internal.j3b.u3 var1) {
      this.k5 = var1;
   }

   public j5 s7() {
      this.t2();
      return new j5(z3.n5().u3(), this.e2().k5());
   }

   public n3 x8() {
      return this.n5;
   }

   public abstract int n3();

   public com.aspose.slides.internal.j3b.u3 y4() {
      return this.k5;
   }

   public void n5(com.aspose.slides.internal.j3b.u3 var1) {
      if (this.k5 != var1) {
         com.aspose.slides.internal.j3b.u3 var2 = this.k5;
         this.l6(var2, var1);
         this.k5 = var1;
         this.n5(var2, var1);
      }
   }

   public y2 e2() {
      this.t2();
      return new y2(this.t9(), this.n3());
   }

   public abstract int t9();

   public boolean z1() {
      return false;
   }

   public int t4() {
      return Color.WHITE.getRGB();
   }

   public static j5 n5(j5 var0, int var1, int var2) {
      j5 var3 = j5.n5(var0.n3(), new j5(new z3(), new y2(q1.n5(var1), q1.n5(var2)))).n3();
      if (var3.a6() > 0 && var3.u9() > 0) {
         return var3;
      } else {
         throw new ArgumentException("The rectangle has no common processing area. Cannot proceed.");
      }
   }

   public static j5 n5(j5 var0, int[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("pixels");
      } else {
         j5 var4 = n5(var0.n3(), var2, var3).n3();
         if (var1.length < var4.a6() * var4.u9()) {
            String var5 = d1.n5(
               "The passed rectangle does not correspond to pixels array size. Expected: {0} pixels, passed: {1} pixels.",new Object[]{ var4.a6() * var4.u9(), var1.length
            });
            throw new ArgumentException(var5);
         } else {
            return var4;
         }
      }
   }

   public void n5(n3 var1) {
      this.n5 = var1;
   }

   protected j5 n5(j5 var1) {
      return n5(var1.n3(), this.t9(), this.n3());
   }

   protected void n5(com.aspose.slides.internal.j3b.u3 var1, com.aspose.slides.internal.j3b.u3 var2) {
   }

   protected void l6(com.aspose.slides.internal.j3b.u3 var1, com.aspose.slides.internal.j3b.u3 var2) {
   }

   @Override
   protected void u9() {
      this.n5 = null;
      this.k5 = null;
      super.u9();
   }
}
