package com.aspose.slides.internal.g7;

public class r8 extends z1 {
   private u2 a6;

   public r8(u7 var1, z1 var2) {
      super(var1, var2);
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("StartCharMetrics")};
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("EndCharMetrics\r\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("EndCharMetrics\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("EndCharMetrics\n")
      };
      super.n5(new t9[]{new a7(var1, this)});
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
      a7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, a7.class);
      if (var2 != null) {
         a1 var3 = new a1();
         var3.n5((Object)var2.n5());
         var3.n5(0);
         this.n5().n5().n5(var3);
      }

      super.n5(var1);
   }
}
