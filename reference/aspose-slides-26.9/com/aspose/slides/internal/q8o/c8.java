package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.y4g.i1;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.internal.y4g.x9;

public class c8 extends com.aspose.slides.internal.n4m.n5 {
   private static byte[] n5 = new byte[]{83, 82, 86, 82};

   public c8(v8 var1, byte[] var2) {
      super(var1, (byte)20, var2);
   }

   @Override
   public void c8() {
      super.c8();
      this.x8().k5(2);
   }

   @Override
   protected void t2() {
      i1 var1 = new i1(this.x8().w1());
      byte[] var2 = this.x8().q0().u9();
      var1.n5(var2, 0, var2.length, var2, 0);
      var1.n5(n5, 0, n5.length, n5, 0);
      var1.n5(x9.n5, 0, 0);
      byte[] var3 = this.n5(com.aspose.slides.internal.v6g.k5.u3(this.getLength(), 11));
      byte[] var4 = var1.n3();
      if (!n5(var4, var3)) {
         throw new com.aspose.slides.internal.y4g.n5((byte)71, "Invalid ServerFinished message received.");
      }
   }

   @Override
   protected void s7() {
      byte[] var1 = this.n5(com.aspose.slides.internal.v6g.k5.u3(this.getLength(), 11));
      com.aspose.slides.internal.x8w.a6 var2 = new com.aspose.slides.internal.x8w.a6();
      byte[] var3 = this.x8().q0().u9();
      byte[] var4 = var2.k5(var3, 0, var3.length);
      byte[] var5 = this.x8().s3().n5().n5(this.x8().w1(), "server finished", var4, 12);
      if (!n5(var5, var1)) {
         throw new com.aspose.slides.internal.y4g.n5("Invalid ServerFinished message received.");
      }
   }
}
