package com.aspose.slides.internal.v7y;

public abstract class k8 extends j9 {
   public j9 n5;
   private boolean a6;
   private String u9;
   private String h0;
   private String c8;
   private int t2;
   protected com.aspose.slides.internal.x6s.a6 l6;
   protected int u3;

   protected k8(j9 var1) {
      this.u9 = com.aspose.slides.ms.System.d1.n5;
      this.h0 = com.aspose.slides.ms.System.d1.n5;
      this.c8 = com.aspose.slides.ms.System.d1.n5;
      this.n5 = var1;
   }

   protected k8(j9 var1, String var2, String var3, int var4) {
      this.n5 = var1;
      this.u9 = var2;
      this.h0 = var3;
      this.t2 = var4;
      this.a6 = var3.length() != 0 || var2.length() != 0;
      this.c8 = com.aspose.slides.ms.System.d1.n5;
   }

   protected k8(k8 var1) {
      super(var1);
      this.n5 = n5(var1.n5);
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
      this.t2 = var1.t2;
      this.a6 = var1.a6;
      this.u3 = var1.u3;
      this.l6 = var1.l6;
   }

   @Override
   public void t2() {
      this.u3 = 0;
      this.l6 = null;
      this.n5.t2();
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      this.c8 = var1.n5(this.h0);
      this.n5.n5(var1);
   }

   protected final String n3() {
      return this.u9;
   }

   protected final String y4() {
      return this.c8;
   }

   protected final boolean e2() {
      return this.a6;
   }

   protected final int t9() {
      return this.t2;
   }

   @Override
   public int u3() {
      return this.u3;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.l6;
   }

   public boolean l6(com.aspose.slides.internal.x6s.a6 var1) {
      if (this.t9() == var1.k5() || this.t9() == 9 || this.t9() == 4 && (var1.k5() == 6 || var1.k5() == 5)) {
         if (!this.e2()) {
            return true;
         }

         if ((com.aspose.slides.ms.System.d1.a6(this.u9, var1.u3()) || this.u9.length() == 0) && com.aspose.slides.ms.System.d1.a6(this.c8, var1.a6())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      this.x8();
      this.t2();
      this.n5.n5(var1);
      return this;
   }

   @Override
   public double s7() {
      if (com.aspose.slides.ms.System.j8.n5(this.n5) != com.aspose.slides.internal.v6g.k5.n5(u4.class)) {
         return 0.5;
      } else if (this.u9.length() != 0) {
         return 0.0;
      } else {
         return this.h0.length() != 0 ? -0.25 : -0.5;
      }
   }

   @Override
   public int u9() {
      return 3;
   }
}
