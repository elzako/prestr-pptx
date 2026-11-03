package com.aspose.slides.internal.h2;

public class e2 {
   private int n5 = -1;
   private final int l6;
   private final com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private final com.aspose.slides.internal.f2.k5 u3;

   private e2(int var1, com.aspose.slides.internal.f2.k5 var2, com.aspose.slides.internal.o9b.c8 var3) {
      this.l6 = var1;
      this.u3 = var2;
      var3.n5(this.k5);
   }

   public static e2 n5(com.aspose.slides.internal.e5.w1 var0) {
      com.aspose.slides.internal.y1.u3 var1 = var0.n5().q_();
      return n5(var0.u3(279).a6(), var0.u3(278).c8(), var0.u3(280).n5(var1).o8());
   }

   private static e2 n5(int var0, com.aspose.slides.internal.f2.k5 var1, com.aspose.slides.internal.o9b.c8 var2) {
      return new e2(var0, var1, var2.o8());
   }

   public final int n5() {
      return this.l6;
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.k5;
   }

   public final int k5() {
      return this.l6 != 95 && this.l6 != 57 ? this.u3.u3() : 0;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5("Outline");
      var1.n5(" {");
      var1.k5(this.l6);
      var1.n5(", ");
      var1.n5(this.k5.o8());
      var1.n5(", ");
      var1.n5(this.u3);
      var1.n5("}");
      return var1.toString();
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      e2 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, e2.class);
      return var2 == null
         ? false
         : com.aspose.slides.internal.v3.u3.n5(this.k5.o8(), var2.k5.o8()) && this.l6 == var2.l6 && com.aspose.slides.internal.v3.u3.n5(this.u3, var2.u3);
   }

   @Override
   public int hashCode() {
      if (this.n5 == -1) {
         int var1 = 17;
         var1 = 37 * var1 + (this.k5.t2() ? 0 : this.k5.hashCode());
         var1 = 37 * var1 + this.l6;
         var1 = 37 * var1 + (this.u3 == null ? 0 : this.u3.hashCode());
         this.n5 = var1;
      }

      return this.n5;
   }
}
