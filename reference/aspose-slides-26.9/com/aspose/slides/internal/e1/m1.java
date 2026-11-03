package com.aspose.slides.internal.e1;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class m1 {
   private final com.aspose.slides.internal.o9b.y1 n5;
   private final boolean l6;
   private String k5;
   private final int u3;
   private final int a6;
   private final int u9;
   private final String h0;

   protected final boolean n5(m1 var1) {
      new m1(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, 20.0F, 20.0F), "test", "test");
      return this.n5.equals(var1.n5.y4())
         && com.aspose.slides.ms.System.n3.l6(this.l6, var1.l6)
         && d1.a6(this.k5, var1.k5)
         && this.u3 == var1.u3
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && d1.a6(this.h0, var1.h0);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((m1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5.hashCode();
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n3.n5(this.l6);
      var1 = var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
      var1 = var1 * 397 ^ (this.h0 != null ? this.h0.hashCode() : 0);
      var1 = var1 * 397 ^ this.u3;
      var1 = var1 * 397 ^ this.a6;
      return var1 * 397 ^ this.u9;
   }

   public m1(com.aspose.slides.internal.o9b.y1 var1, String var2, String var3) {
      this.n5 = com.aspose.slides.internal.o9b.y1.n5.y4();
      var1.a6(this.n5);
      this.h0 = var3;
      if (com.aspose.slides.internal.b8.x8.u3(var2)) {
         this.l6 = true;
         this.k5 = d1.k5(var2, 1);
      } else {
         this.l6 = false;
         this.k5 = var2;
      }

      this.u3 = 0;
      this.a6 = 0;
      this.u9 = -1;
   }

   public m1(int var1, com.aspose.slides.internal.o9b.y1 var2, String var3) {
      this.n5 = com.aspose.slides.internal.o9b.y1.n5.y4();
      this.h0 = var3;
      this.u3 = 1;
      this.a6 = var1;
      var2.a6(this.n5);
      this.l6 = true;
      this.u9 = -1;
   }

   public m1(com.aspose.slides.internal.o9b.y1 var1, int var2, String var3) {
      this.n5 = com.aspose.slides.internal.o9b.y1.n5.y4();
      this.h0 = var3;
      this.u3 = 1;
      this.a6 = 7;
      var1.a6(this.n5);
      this.l6 = true;
      this.u9 = var2;
   }

   public final com.aspose.slides.internal.o9b.y1 n5() {
      return this.n5;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final int u3() {
      return this.u3;
   }

   public final int a6() {
      return this.a6;
   }

   public final int u9() {
      return this.u9;
   }

   public final String h0() {
      return this.h0;
   }
}
