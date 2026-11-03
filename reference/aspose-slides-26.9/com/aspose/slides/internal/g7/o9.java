package com.aspose.slides.internal.g7;

public class o9 extends z1 {
   private u2 a6;
   private u2 u9;

   public o9(u7 var1, z1 var2) {
      super(var1, var2);
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("StartKernData")};
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("EndKernData\r\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("EndKernData\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("EndKernData\n")
      };
      super.n5(new t9[]{new a9(var1, this), new j3z(var1, this)});
   }

   public final u2 n5() {
      return this.a6;
   }

   public final u2 u3() {
      return this.u9;
   }

   @Override
   public void k5() {
      this.a6 = new u2();
      this.u9 = new u2();
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      a9 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, a9.class)) != null) {
         this.a6 = var2.n5();
      } else {
         j3z var3;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, j3z.class)) != null) {
            this.u9 = var3.n5();
         }
      }

      super.n5(var1);
   }
}
