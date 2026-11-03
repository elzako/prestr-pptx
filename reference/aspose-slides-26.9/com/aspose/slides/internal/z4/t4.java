package com.aspose.slides.internal.z4;

public class t4 extends s3 {
   private final com.aspose.slides.internal.n2d.k7 n5 = new com.aspose.slides.internal.n2d.k7();

   public t4(com.aspose.slides.internal.z0k.t4 var1) {
      super(var1);
      this.n5.n5(0, 0);
   }

   public final int n5() {
      return this.n5.n5();
   }

   public final void n5(z1 var1) {
      this.n5.n5(var1.c8(), (int)this.u3().getPosition());
      this.l6("{0} 0 obj", com.aspose.slides.internal.t6j.u3.n5(var1.c8()));
   }

   public final void l6() {
      this.h0();
      this.k5("endobj");
   }

   public final int k5() {
      int var1 = (int)this.u3().getPosition();
      this.k5("xref");
      this.l6("0 {0}", com.aspose.slides.internal.t6j.u3.n5(this.n5.n5()));
      this.k5("0000000000 65535 f");

      for (int var2 = 1; var2 < this.n5.n5(); var2++) {
         this.l6("{0} 00000 n", com.aspose.slides.internal.t6j.u3.l6(com.aspose.slides.internal.v6g.k5.u3(this.n5.k5(var2), int.class)));
      }

      return var1;
   }
}
