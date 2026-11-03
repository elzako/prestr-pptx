package com.aspose.slides.internal.g7;

public class i5 extends z1 implements m9 {
   private int a6;
   private int u9;
   private byte[] h0;
   private k7 c8;
   private j6 t2;

   public i5(u7 var1, z1 var2) {
      super(var1, var2);
      this.u3(true);
      super.l6 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("RD "),
         com.aspose.slides.internal.l7h.j5.e2().u3("-| "),
         com.aspose.slides.internal.l7h.j5.e2().u3("RD"),
         com.aspose.slides.internal.l7h.j5.e2().u3("-|")
      };
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3(" ND\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" ND\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" |-\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" |-\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("ND\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("ND\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|-\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|-\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" noaccess def"),
         com.aspose.slides.internal.l7h.j5.e2().u3("noaccess def")
      };
   }

   public final byte[] t4() {
      return this.h0;
   }

   @Override
   public final int u3() {
      return this.u9;
   }

   @Override
   public final void k5(int var1) {
      this.u9 = var1;
   }

   @Override
   public final int n5() {
      return this.a6;
   }

   @Override
   public final void l6(int var1) {
      this.a6 = var1;
   }

   @Override
   public void k5() {
      this.h0 = null;
      this.c8 = null;
      this.t2 = new j6(1);
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      byte var2 = this.t2.n5(this.u3[var1]);
      this.c8.n5(var2);
      super.n5(var1);
   }

   @Override
   protected void t9() {
      super.t9();
      this.c8 = new k7(this.n5());
   }

   @Override
   protected void z_() {
      this.h0 = new byte[this.c8.l6() - this.z1().l6()];
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(this.c8.n5())), this.z1().l6(), com.aspose.slides.ms.System.u3.n5((Object)(this.h0)), 0, this.c8.l6() - this.z1().l6()
      );
      super.z_();
   }
}
