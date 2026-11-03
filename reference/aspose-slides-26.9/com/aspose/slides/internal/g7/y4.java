package com.aspose.slides.internal.g7;

public class y4 extends z1 {
   private s5r a6;

   public y4(u7 var1, z1 var2) {
      super(var1, var2);
      this.u3(true);
      super.l6 = new byte[][]{com.aspose.slides.internal.l7h.j5.e2().u3("array")};
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("def"),
         com.aspose.slides.internal.l7h.j5.e2().u3("readonly def"),
         com.aspose.slides.internal.l7h.j5.e2().u3("ND\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("ND\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|-\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|-\n")
      };
      super.n5(new t9[]{new c8(var1, this), new n3(var1, this)});
   }

   public final s5r n5() {
      return this.a6;
   }

   @Override
   public void k5() {
      this.a6 = new s5r();
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      super.n5(var1);
   }

   @Override
   public void n5(Object var1) {
      n3 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, n3.class)) != null) {
         ((c8)super.c8()[0]).n5(false);
         this.a6.n5().n5(var2.n5());
      } else {
         c8 var3;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, c8.class)) != null) {
            this.a6.n5().n5(var3.n5());
         }
      }

      super.n5(var1);
   }
}
