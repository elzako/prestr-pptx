package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.y4g.j9;
import com.aspose.slides.internal.y4g.o5;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.internal.y4g.x9;
import com.aspose.slides.ms.System.y4;

public class t2 extends com.aspose.slides.internal.n4m.n5 {
   private int n5;
   private byte[] l6;
   private byte[] k5;
   private x9 u3;

   public t2(v8 var1, byte[] var2) {
      super(var1, (byte)2, var2);
   }

   @Override
   public void c8() {
      super.c8();
      this.x8().n5(this.k5);
      this.x8().k5(this.l6);
      this.x8().p8().n5(this.u3);
      this.x8().l6(this.n5);
      this.x8().l6(true);
      int var1 = this.x8().k7().length;
      int var2 = this.x8().m3().length;
      int var3 = var1 + var2;
      byte[] var4 = new byte[var3];
      y4.n5(this.x8().k7(), 0, var4, 0, var1);
      y4.n5(this.x8().m3(), 0, var4, var1, var2);
      this.x8().u3(var4);
      byte[] var5 = new byte[var3];
      y4.n5(this.x8().m3(), 0, var5, 0, var2);
      y4.n5(this.x8().k7(), 0, var5, var2, var1);
      this.x8().a6(var5);
   }

   @Override
   protected void t2() {
      this.s7();
   }

   @Override
   protected void s7() {
      this.l6(this.k5());
      this.l6 = this.n5(32);
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.l6(), 6);
      if (var1 > 0) {
         this.k5 = this.n5(var1);
         o5.n5(this.x8().n3().n5(), this.k5);
         this.x8().n5(n5(this.k5, this.x8().t2()));
      } else {
         this.x8().n5(false);
      }

      short var2 = this.k5();
      if (this.x8().t4().l6(var2) == -1) {
         throw new com.aspose.slides.internal.y4g.n5((byte)71, "Invalid cipher suite received from server");
      }

      this.u3 = this.x8().t4().n5(var2);
      this.n5 = com.aspose.slides.internal.v6g.k5.u3(this.l6(), 6);
   }

   private void l6(short var1) {
      int var2 = this.x8().l6(var1);
      if ((var2 & this.x8().h0()) != var2 && (this.x8().h0() & -1073741824) != -1073741824) {
         throw new com.aspose.slides.internal.y4g.n5((byte)70, "Incorrect protocol version received from server");
      }

      this.x8().n5(var2);
      this.x8().n5(j9.n5(false, var2));
   }
}
