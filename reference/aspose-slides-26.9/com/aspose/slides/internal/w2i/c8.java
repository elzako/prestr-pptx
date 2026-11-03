package com.aspose.slides.internal.w2i;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s3;

public class c8 extends com.aspose.slides.internal.v6g.h0<c8> {
   public long n5;
   public long l6;
   public long k5;
   public long u3;
   public long a6;
   public long u9;
   public a6 h0 = new a6();
   public long c8;
   public long t2;
   public long s7;
   public long x8;
   public long n3;
   public long y4;
   public int e2;
   public z3 t9 = new z3();
   public long z1;
   public byte[] t4;
   public byte[] q0;

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("[Size={0};",new Object[]{ this.n5});
      var1.n5(" CmmId={0};",new Object[]{ this.l6});
      byte[] var2 = com.aspose.slides.ms.System.x8.n5(this.k5);
      var1.n5(" Version={0:x}.{1:x}.{2:x}.{3:x};",new Object[]{ var2[3], var2[2], var2[1], var2[0]});
      var1.n5(" DeviceClass={0};",new Object[]{ com.aspose.slides.internal.g7i.k5.u3(this.u3)});
      var1.n5(" ColorSpace={0};",new Object[]{ s3.n5(k5.class, this.a6)});
      var1.n5(" Pcs={0};",new Object[]{ s3.n5(k5.class, this.u9)});
      var1.n5(" Date={0};",new Object[]{ this.h0.n5()});
      var2 = com.aspose.slides.ms.System.x8.n5(this.c8);
      var1.n5(" Magic={0}{1}{2}{3};",new Object[]{ (char)(var2[3] & 0xFF), (char)(var2[2] & 0xFF), (char)(var2[1] & 0xFF), (char)(var2[0] & 0xFF)});
      var1.n5(" Platform={0};",new Object[]{ s3.n5(n3.class, this.t2)});
      var1.n5(" Flags={0};",new Object[]{ s3.n5(u9.class, this.s7)});
      var1.n5(" Manufacturer={0};",new Object[]{ this.x8});
      var1.n5(" Model={0};",new Object[]{ this.n3});
      var1.n5(" Attributes={0};",new Object[]{ s3.n5(n5.class, this.y4)});
      var1.n5(" RenderingIntent={0};",new Object[]{ s3.n5(e2.class, this.e2)});
      var1.n5(" Illuminant={0};",new Object[]{ this.t9.n5()});
      var1.n5(" Creator={0};",new Object[]{ this.z1});
      a5 var3 = new a5();

      for (byte var7 : this.t4) {
         var3.n5("{0:x}",new Object[]{ var7});
      }

      var1.n5(" ProfileID={0};",new Object[]{ var3});
      var1.n5(" Reserved={0}]",new Object[]{ this.q0[0]});
      return var1.toString();
   }

   public void n5(c8 var1) {
      var1 = var1 == null ? new c8() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      this.h0.n5(var1.h0);
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
      var1.n3 = this.n3;
      var1.y4 = this.y4;
      var1.e2 = this.e2;
      this.t9.n5(var1.t9);
      var1.z1 = this.z1;
      var1.t4 = this.t4;
      var1.q0 = this.q0;
   }

   public c8 n5() {
      c8 var1 = new c8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(c8 var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && j8.n5(var1.h0, this.h0)
         && var1.c8 == this.c8
         && var1.t2 == this.t2
         && var1.s7 == this.s7
         && var1.x8 == this.x8
         && var1.n3 == this.n3
         && var1.y4 == this.y4
         && var1.e2 == this.e2
         && j8.n5(var1.t9, this.t9)
         && var1.z1 == this.z1
         && j8.n5(var1.t4, this.t4)
         && j8.n5(var1.q0, this.q0);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c8) ? false : this.l6((c8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c8 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c8 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
