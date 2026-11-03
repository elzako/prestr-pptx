package com.aspose.slides.internal.i4;

public abstract class g7 {
   private int n5;
   private z6 l6;
   public static final g7[] k5 = new g7[0];

   public abstract Object C_();

   public final int y1() {
      return this.n5;
   }

   public final void u3(int var1) {
      this.n5 = var1;
   }

   public final z6 a0() {
      return this.l6;
   }

   public final void n5(z6 var1) {
      this.l6 = var1;
   }

   public g7 u3(g7 var1) {
      return null;
   }

   public g7 l6(j9 var1) {
      return l5.n5;
   }

   public boolean n5() {
      return true;
   }

   public double l6() {
      return 0.0;
   }

   public int d2() {
      return com.aspose.slides.internal.v6g.k5.u3(this.l6(), 14);
   }

   public Object D_() {
      return this.C_();
   }

   public String d5() {
      return this.toString();
   }

   @Override
   public String toString() {
      return (this.C_() == null ? this.u3() : this.C_()).toString();
   }

   @Override
   public int hashCode() {
      return this.C_() != null ? this.C_().hashCode() : super.hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      g7 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, g7.class);
      if (com.aspose.slides.ms.System.j8.l6(null, var2)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, var2)) {
         return true;
      } else if (!com.aspose.slides.ms.System.d1.a6(this.c8(), var2.c8())) {
         return false;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, l5.class)) {
         return true;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var2, y5.class) ? true : this.D_().equals(var2.D_());
      }
   }

   public abstract String u3();

   public abstract String c8();
}
