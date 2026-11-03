package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.o8m.j4;
import com.aspose.slides.internal.y4g.h2;
import com.aspose.slides.internal.y4g.v8;

public class x8 extends com.aspose.slides.internal.n4m.n5 {
   private j4 n5 = new j4();
   private byte[] l6;

   public x8(v8 var1, byte[] var2) {
      super(var1, (byte)12, var2);
      this.h0();
   }

   @Override
   public void c8() {
      super.c8();
      this.x8().x8().n5(true);
      this.x8().x8().n5(this.n5.n5());
      this.x8().x8().n5(this.l6);
   }

   @Override
   protected void t2() {
      this.s7();
   }

   @Override
   protected void s7() {
      this.n5 = new j4();
      this.n5.h0 = this.n5((int)this.k5());
      this.n5.c8 = this.n5((int)this.k5());
      this.l6 = this.n5((int)this.k5());
   }

   private void h0() {
      com.aspose.slides.internal.x8w.a6 var1 = new com.aspose.slides.internal.x8w.a6();
      int var2 = this.n5.h0.length + this.n5.c8.length + 4;
      h2 var3 = new h2();
      var3.n5(this.x8().z8());
      var3.write(this.u9(), 0, var2);
      var1.l6(var3.u9());
      var3.a6();
      boolean var4 = var1.n5(this.x8().x8().k5(), this.l6);
      if (!var4) {
         throw new com.aspose.slides.internal.y4g.n5((byte)50, "Data was not signed with the server certificate.");
      }
   }
}
