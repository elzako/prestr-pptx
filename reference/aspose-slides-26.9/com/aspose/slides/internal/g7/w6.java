package com.aspose.slides.internal.g7;

public class w6 extends z1 implements m9 {
   private byte[] a6;
   private k7 u9;
   private j6 h0;
   private int c8;
   private int t2;

   public w6(u7 var1, z1 var2) {
      super(var1, var2);
      this.u3(true);
      super.l6 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3("RD "),
         com.aspose.slides.internal.l7h.j5.e2().u3("-| "),
         com.aspose.slides.internal.l7h.j5.e2().u3("RD"),
         com.aspose.slides.internal.l7h.j5.e2().u3("-|")
      };
      super.n5 = new byte[][]{
         com.aspose.slides.internal.l7h.j5.e2().u3(" NP\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" NP\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" |\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" |\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("NP\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("NP\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|\n"),
         com.aspose.slides.internal.l7h.j5.e2().u3("|\r"),
         com.aspose.slides.internal.l7h.j5.e2().u3(" noaccess put"),
         com.aspose.slides.internal.l7h.j5.e2().u3("noaccess put")
      };
   }

   public final byte[] t4() {
      return this.a6;
   }

   @Override
   public final int u3() {
      return this.t2;
   }

   @Override
   public final void k5(int var1) {
      this.t2 = var1;
   }

   @Override
   public final int n5() {
      return this.c8;
   }

   @Override
   public final void l6(int var1) {
      this.c8 = var1;
   }

   @Override
   public void k5() {
      this.a6 = null;
      this.u9 = null;
      this.h0 = new j6(1);
      super.k5();
   }

   @Override
   protected void n5(int var1) {
      byte var2 = this.h0.n5(this.u3[var1]);
      this.u9.n5(var2);
      super.n5(var1);
   }

   @Override
   protected void t9() {
      super.t9();
      this.u9 = new k7(this.n5());
   }

   @Override
   protected void z_() {
      this.a6 = new byte[this.u9.l6() - this.z1().l6()];
      com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(this.u9.n5())), this.z1().l6(), com.aspose.slides.ms.System.u3.n5((Object)(this.a6)), 0, this.u9.l6() - this.z1().l6()
      );
      super.z_();
   }
}
