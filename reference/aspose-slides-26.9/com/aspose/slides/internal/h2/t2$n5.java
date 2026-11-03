package com.aspose.slides.internal.h2;

public class t2$n5 {
   public l6 n5 = null;
   public int l6;
   private com.aspose.slides.internal.o9b.c8 u3 = new com.aspose.slides.internal.o9b.c8();
   public q0 k5;
   private int a6 = -1;

   private t2$n5(int var1, q0 var2, com.aspose.slides.internal.o9b.c8 var3) {
      this.l6 = var1;
      this.k5 = var2;
      var3.n5(this.u3);
   }

   public static t2$n5 n5(int var0, q0 var1, com.aspose.slides.internal.o9b.c8 var2) {
      return new t2$n5(var0, var1, var2.o8());
   }

   public final int n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.u3;
   }

   public final q0 k5() {
      return this.k5;
   }

   public final int u3() {
      return this.l6 != 95 && this.l6 != 57 ? this.k5.t2() : 0;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5("BorderInfo");
      var1.n5(" {");
      var1.k5(this.l6);
      var1.n5(", ");
      var1.n5(this.u3.o8());
      var1.n5(", ");
      var1.n5(this.k5);
      var1.n5("}");
      return var1.toString();
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      t2$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, t2$n5.class);
      return var2 == null
         ? false
         : com.aspose.slides.internal.v3.u3.n5(this.u3.o8(), var2.u3.o8()) && this.l6 == var2.l6 && com.aspose.slides.internal.v3.u3.n5(this.k5, var2.k5);
   }

   @Override
   public int hashCode() {
      if (this.a6 == -1) {
         int var1 = 17;
         var1 = 37 * var1 + (this.u3.t2() ? 0 : this.u3.hashCode());
         var1 = 37 * var1 + this.l6;
         var1 = 37 * var1 + (this.k5 == null ? 0 : this.k5.hashCode());
         this.a6 = var1;
      }

      return this.a6;
   }
}
