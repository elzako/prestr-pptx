package com.aspose.slides.internal.g7;

public class d9 extends z1 {
   private u2 a6;

   public d9(u7 var1, z1 var2, boolean var3) {
      super(var1, var2);
      this.u3(true);
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("dict begin"), com.aspose.slides.internal.l7h.j5.e2().u3("dict dup begin")};
      super.n5 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("end")};
      super.n5(new t9[]{new p4(var1, this, var3, false)});
   }

   public final u2 n5() {
      return this.a6;
   }

   @Override
   public void k5() {
      this.a6 = new u2();
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      p4 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, p4.class)) != null) {
         this.a6.n5().n5(var2.n5());
      }

      super.n5(var1);
   }
}
